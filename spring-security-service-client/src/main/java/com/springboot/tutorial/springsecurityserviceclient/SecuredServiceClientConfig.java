package com.springboot.tutorial.springsecurityserviceclient;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class SecuredServiceClientConfig {

	
	@Bean
	public RestTemplate getRestTemplate(RestTemplateBuilder builder) {
		System.out.println("INside getRestTemplate");
		return builder.build();
	}
	
}
