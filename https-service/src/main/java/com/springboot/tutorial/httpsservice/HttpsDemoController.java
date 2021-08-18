package com.springboot.tutorial.httpsservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HttpsDemoController {

	@RequestMapping("/hello")
	public String getHello() {
		return "Hello";
	}
	
}
