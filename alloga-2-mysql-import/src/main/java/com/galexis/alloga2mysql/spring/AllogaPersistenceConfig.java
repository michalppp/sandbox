package com.galexis.alloga2mysql.spring;

import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.galexis.alloga2mysql.model.Algpvsexg;
import com.galexis.search.common.spring.persistence.AbstractPersistenceConfig;

@Configuration
@EnableTransactionManagement(proxyTargetClass = true)
public class AllogaPersistenceConfig extends AbstractPersistenceConfig {
	private static final String CONFIGURATION_PREFIX = "alloga.";

	private static final String PERSISTENCE_UNIT = "allogaPersistenceUnit";

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

}
