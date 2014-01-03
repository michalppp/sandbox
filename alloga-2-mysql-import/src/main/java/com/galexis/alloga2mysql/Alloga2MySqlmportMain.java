package com.galexis.alloga2mysql;

import java.beans.PropertyDescriptor;
import java.text.MessageFormat;
import java.util.Date;
import java.util.List;

import org.apache.commons.beanutils.PropertyUtils;
import org.apache.commons.collections.Closure;
import org.apache.commons.collections.CollectionUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.galexis.alloga2mysql.model.Algpvsexg;
import com.galexis.alloga2mysql.model.TaskLock;
import com.galexis.alloga2mysql.model.Timedate;
import com.galexis.alloga2mysql.service.AllogaService;
import com.galexis.alloga2mysql.service.MySqlService;
import com.galexis.alloga2mysql.spring.AllogaConfig;
import com.galexis.alloga2mysql.spring.MySqlConfig;
import com.galexis.search.common.util.GaxApplicationContextUtils;
import com.galexis.search.common.util.GaxBeanUtils;
import com.galexis.search.common.util.GaxMathUtils;

public class Alloga2MySqlmportMain {

	private static final Logger logger = LoggerFactory.getLogger(Alloga2MySqlmportMain.class);

	private static final int TIMEDATE_PAGE_SIZE = 10;

	private static final int TASKLOCK_PAGE_SIZE = 10;

	private static final Closure dateProcessor = new Closure() {
		@Override
		public void execute(Object entity) {
			try {
				if (entity != null) {
					PropertyDescriptor[] propertyDescriptors = PropertyUtils.getPropertyDescriptors(entity.getClass());
					for (PropertyDescriptor propertyDescriptor : propertyDescriptors) {
						if (Date.class.isAssignableFrom(propertyDescriptor.getPropertyType())) {
							String propertyName = propertyDescriptor.getName();
							Date currentValue = (Date) PropertyUtils.getProperty(entity, propertyName);
							Date acceptedValue = acceptedDateValue(currentValue);
							PropertyUtils.setProperty(entity, propertyName, acceptedValue);
						}
					}
				}
			} catch (Exception e) {
				String message = MessageFormat.format("Cannot process Date handling for instance of {0}", GaxBeanUtils.objClassSimpleName(entity));
				logger.error(message, e);
				throw new IllegalArgumentException(message, e);
			}

		}

		private Date acceptedDateValue(Date value) {
			if (value == null) {
				return null;
			}
			final long minAllowedDate = 1000 * 60 * 60 * 24;
			final long maxAllowedDate = (2038 - 1970) * 365 * 24 * 60 * 60 * 1000L;

			long valueTime = value.getTime();
			if (valueTime < minAllowedDate) {
				return null;
			} else if (valueTime > maxAllowedDate) {
				return new Date(maxAllowedDate);
			} else {
				return value;
			}
		}
	};

	private static final int DEFAULT_PAGE_SIZE = 1000;

	private final String[] incrementalInsertsTables = { "Bizparaddr", "Bizparmail", "Bizpconaut", "Bizpmaster", "Consordhdr", "Consordldt", "Consordlin", "Contrdef", "Contrpgrp",
	        "Ctrbizpcls", "Custexg", "Custopohdr", "Custopolin", "Custordhdr", "Custordlin", "Custordtxt", "Delannhdr", "Delannlin", "Delconf", "Delhdr", "Dellin", "Dellinbtc",
	        "Dellinpck", "Grehdr", "Grelin", "Grelinbtc", "Invhdr", "Invlin", "Invlinbtc", "Invmovmap", "Invmovmnt", "Itembtcd", "Itembtcm", "Psihdr", "Psilin", "Psilincnf",
	        "Rethdr", "Retlin", "Retlinbtc", "Stockrcbtc", "Stockrclop", "Stockrcmap", "Stockrebtc", "Tourexg", "TrLgData", "TrLgProc", "Trstatinf" };

	private final String[] incrementalUpdatesTables = { "Bizparaddr", "Bizparmail", "Bizpconaut", "Bizpmaster", "Consordhdr", "Consordldt", "Consordlin", "Contrdef", "Contrpgrp",
	        "Custexg", "Ctrbizpcls", "Custopohdr", "Custopolin", "Custordhdr", "Custordlin", "Custordtxt", "Delannhdr", "Delannlin", "Delconf", "Delhdr", "Dellin", "Dellinbtc",
	        "Dellinpck", "Grehdr", "Grelin", "Grelinbtc", "Invhdr", "Invlin", "Invlinbtc", "Invmovmap", "Invmovmnt", "Itembtcd", "Itembtcm", "Psihdr", "Psilin", "Psilincnf",
	        "Rethdr", "Retlin", "Retlinbtc", "Stockrcbtc", "Stockrclop", "Stockrcmap", "Stockrebtc", "Tourexg" };

	private final String[] completeImportsTables = { "Algpvsexg", "Dayend", "Dayendext", "Delconfexg", "Identnrf", "Itemmaster", "Jobdef", "Phaselog", "Pod", "Selstcattr",
	        "Selstcelem", "TaskLock", "Timedate" };

	//TODO: do "Sale102agg", "Sale1023agg" manually
	// TODO: problem: "Az103agg"

	private AllogaService allogaService;

	private MySqlService mySqlService;

	private Class<?> clazz4SimpleName(String name) throws ClassNotFoundException {
		String className = Algpvsexg.class.getPackage().getName() + "." + name;
		return Class.forName(className);
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void processIncrementalInserts() throws ClassNotFoundException {
		for (String tableName : incrementalInsertsTables) {
			Class tableClazz = clazz4SimpleName(tableName);

			Date lastCreated = mySqlService.lastCreated(tableClazz);
			int createdCount = allogaService.newlyCreatedCount(tableClazz, lastCreated);
			long pagesCount = GaxMathUtils.roundedUpDivide(createdCount, pageSize(tableClazz));

			for (int index = 0; index < pagesCount; index++) {
				List<?> newlyCreated = allogaService.newlyCreated(tableClazz, lastCreated, index * pageSize(tableClazz), pageSize(tableClazz));
				CollectionUtils.forAllDo(newlyCreated, dateProcessor);
				mySqlService.insert(tableClazz, newlyCreated);
				logger.debug("processIncrementalInserts() processed {} with {} records from total {}", new Object[] { tableName, processedCount(index, createdCount, tableClazz),
				        createdCount });
			}

			logger.info("processIncrementalInserts() processed {} with {} records", tableName, createdCount);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void processIncrementalUpdates() throws ClassNotFoundException {
		for (String tableName : incrementalUpdatesTables) {
			Class tableClazz = clazz4SimpleName(tableName);

			Date lastChanged = mySqlService.lastChanged(tableClazz);
			int changedCount = allogaService.changedCount(tableClazz, lastChanged);
			long pagesCount = GaxMathUtils.roundedUpDivide(changedCount, pageSize(tableClazz));

			for (int index = 0; index < pagesCount; index++) {
				List<?> changed = allogaService.changed(tableClazz, lastChanged, index * pageSize(tableClazz), pageSize(tableClazz));
				CollectionUtils.forAllDo(changed, dateProcessor);
				mySqlService.insert(tableClazz, changed);
				logger.debug("processIncrementalUpdates() processed {} with {} records from total {}", new Object[] { tableName, processedCount(index, changedCount, tableClazz),
				        changedCount });
			}

			logger.info("processIncrementalUpdates() processed {} with {} records", tableName, changedCount);
		}
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void processCompleteImports() throws ClassNotFoundException {
		for (String tableName : completeImportsTables) {
			Class tableClazz = clazz4SimpleName(tableName);

			mySqlService.deleteAll(tableClazz);

			int allCount = allogaService.allCount(tableClazz);
			long pagesCount = GaxMathUtils.roundedUpDivide(allCount, pageSize(tableClazz));

			for (int index = 0; index < pagesCount; index++) {
				List<?> data = allogaService.all(tableClazz, index * pageSize(tableClazz), pageSize(tableClazz));
				CollectionUtils.forAllDo(data, dateProcessor);
				mySqlService.insert(tableClazz, data);
				logger.debug("processCompleteImports() processed {} with {} records from total {}",
				        new Object[] { tableName, processedCount(index, allCount, tableClazz), allCount });
			}

			logger.info("processCompleteImports() processed {} with {} records", new Object[] { tableName, allCount });
		}
	}

	private int pageSize(Class tableClazz) {
		if (TaskLock.class.equals(tableClazz)) {
			return TASKLOCK_PAGE_SIZE;
		} else if (Timedate.class.equals(tableClazz)) {
			return TIMEDATE_PAGE_SIZE;
		} else {
			return DEFAULT_PAGE_SIZE;
		}
	}

	private int processedCount(int index, int totalCount, Class tableClazz) {
		int currentPageSize = (index * pageSize(tableClazz) + pageSize(tableClazz)) < totalCount ? pageSize(tableClazz) : totalCount - index * pageSize(tableClazz);
		return index * pageSize(tableClazz) + currentPageSize;
	}

	private void init() {
		allogaService = GaxApplicationContextUtils.applicationContext4MainConfiguration(AllogaConfig.class).getBean(AllogaService.class);
		mySqlService = GaxApplicationContextUtils.applicationContext4MainConfiguration(MySqlConfig.class).getBean(MySqlService.class);
	}

	public static void main(String[] argv) throws ClassNotFoundException {
		Alloga2MySqlmportMain importer = new Alloga2MySqlmportMain();
		importer.init();
		importer.processIncrementalInserts();
		importer.processIncrementalUpdates();
		importer.processCompleteImports();
	}
}
