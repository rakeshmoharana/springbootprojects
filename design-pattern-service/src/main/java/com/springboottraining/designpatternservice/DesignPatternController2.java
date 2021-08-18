package com.springboottraining.designpatternservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DesignPatternController2 {
	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private DesignPatternService dps;
		
	@RequestMapping("/test2")
	public String test2() {
		System.out.println("RestTemplate in cnt2 >> "+restTemplate);
		System.out.println("Designpatter in cnt2 >> "+dps);
		return dps.test1Service();
	}
}
