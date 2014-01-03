package com.galexis.alloga2mysql.spring;

import java.io.IOException;

import javax.annotation.Resource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.env.PropertyResolver;
import org.springframework.core.env.PropertySources;
import org.springframework.core.env.PropertySourcesPropertyResolver;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.support.ResourcePropertySource;

@Configuration
public class PropertyResolverConfig {

	@Resource
	private Environment environment;

	@Bean
	public PropertyResolver propertyResolver() throws IOException {
		StandardEnvironment environment = new StandardEnvironment();
		return new PropertySourcesPropertyResolver(createPropertySources());
	}

	private PropertySources createPropertySources() throws IOException {
		MutablePropertySources mutablePropertySources = new MutablePropertySources();
		mutablePropertySources.addFirst(new ResourcePropertySource("alloga-2-mysql-import.properties", "classpath:/alloga-2-mysql-import.properties"));
		return mutablePropertySources;
	}
}
