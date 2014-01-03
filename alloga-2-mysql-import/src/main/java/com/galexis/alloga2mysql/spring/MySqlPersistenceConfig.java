package com.galexis.alloga2mysql.spring;

import java.sql.SQLException;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.galexis.alloga2mysql.model.Algpvsexg;
import com.galexis.search.common.spring.persistence.AbstractPersistenceConfig;

@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
public class MySqlPersistenceConfig extends AbstractPersistenceConfig {

	private static final String CONFIGURATION_PREFIX = "mysql.";

	private static final String PERSISTENCE_UNIT = "mysqlPersistenceUnit";

	@Override
	protected String[] getPackagesToScan() {
		return new String[] { Algpvsexg.class.getPackage().getName() };
	}

	@Override
	protected String getPersistenceUnitName() {
		return PERSISTENCE_UNIT;
	}

	@Override
	protected String getPrefix() {
		return CONFIGURATION_PREFIX;
	}

	@Override
	@Bean(name = BEAN_DATA_SOURCE)
	public DataSource dataSource() {
		DataSource ds = new org.apache.tomcat.jdbc.pool.DataSource() {

			@PostConstruct
			public void init() {
				setDriverClassName(getPropertyValue(DATASOURCE_DRIVER_CLASS_PROPERTY));
				setUrl(getPropertyValue(DATASOURCE_URL_PROPERTY));
				setUsername(getPropertyValue(PERSISTENCE_DB_USERNAME_PROPERTY));
				setPassword(getPropertyValue(PERSISTENCE_DB_PASSWORD_PROPERTY));
				setTestOnBorrow(true);
				setTestOnReturn(false);
				setValidationInterval(VALIDATION_INTERVAL);
				setMaxActive(1);
				setInitialSize(1);
			}

			@PreDestroy
			public void destroy() throws SQLException {
				close();
			}

		};
		return ds;

	}

}
