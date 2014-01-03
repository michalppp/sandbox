package com.galexis.alloga2mysql.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.galexis.alloga2mysql.service.AllogaService;
import com.galexis.alloga2mysql.service.DefaultAllogaService;

@Configuration
@Import({ PropertyResolverConfig.class, AllogaPersistenceConfig.class })
public class AllogaConfig {

	@Bean
	public AllogaService allogaService() {
		return new DefaultAllogaService();
	}

}
