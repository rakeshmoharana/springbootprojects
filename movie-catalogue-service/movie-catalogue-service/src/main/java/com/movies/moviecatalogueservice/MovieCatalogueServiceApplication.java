package com.movies.moviecatalogueservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Primary;
import org.springframework.http.client.HttpComponentsClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient // was mandatory upto a certain but not mandatory in the current version
@EnableCircuitBreaker
public class MovieCatalogueServiceApplication {

	
	@Bean
	@LoadBalanced
	public RestTemplate getRestTemplate() {
		System.out.println("getRestTemplate >> ");
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		factory.setConnectTimeout(3000);
		return new RestTemplate(factory);
	}
	
	@Bean
	@LoadBalanced
	@Primary
	public RestTemplate getRestTemplateWith5000TimeOut() {
		System.out.println("getRestTemplateWith5000TimeOut >> ");
		HttpComponentsClientHttpRequestFactory factory = new HttpComponentsClientHttpRequestFactory();
		factory.setConnectTimeout(5000);
		return new RestTemplate(factory);
	}
	
	
	public static void main(String[] args) {
		SpringApplication.run(MovieCatalogueServiceApplication.class, args);
	}

}
