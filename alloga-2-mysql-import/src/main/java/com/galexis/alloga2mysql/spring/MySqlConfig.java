package com.galexis.alloga2mysql.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.galexis.alloga2mysql.service.DefaultMySqlService;
import com.galexis.alloga2mysql.service.MySqlService;

@Configuration
@Import({ PropertyResolverConfig.class, MySqlPersistenceConfig.class })
public class MySqlConfig {

	@Bean
	public MySqlService mySqlService() {
		return new DefaultMySqlService();
	}
}
