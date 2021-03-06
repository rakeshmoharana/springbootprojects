package com.springboottraining.designpatternservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE) 
public class DesignPatternService {
	@Autowired
	private RestTemplate restTemplate;
	public String test1Service() {
		System.out.println("RestTemplate in svc >> "+restTemplate);
		return "test1";
	}
	
}
