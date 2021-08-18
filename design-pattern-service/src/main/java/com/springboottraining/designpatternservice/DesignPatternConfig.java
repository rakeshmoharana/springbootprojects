package com.springboottraining.designpatternservice;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;

@Configuration
public class DesignPatternConfig {

	@Bean
	@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) 
	public RestTemplate getRestTemplate() {
		System.out.println("Config");
		return new RestTemplate();
	}
}
