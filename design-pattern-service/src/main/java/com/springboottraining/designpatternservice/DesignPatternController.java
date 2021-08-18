package com.springboottraining.designpatternservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class DesignPatternController {

	@Autowired
	private RestTemplate restTemplate;
	@Autowired
	private DesignPatternService dps;
	
	@RequestMapping("/test1")
	public String test1() {
		System.out.println("RestTemplate in cnt1 >> "+restTemplate);
	System.out.println("Designpatter in cnt1 >> "+dps);
		return dps.test1Service();
	}
}
