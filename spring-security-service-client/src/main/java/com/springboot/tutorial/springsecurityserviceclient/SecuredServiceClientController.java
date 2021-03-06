package com.springboot.tutorial.springsecurityserviceclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecuredServiceClientController {
 @Autowired
	private SecuredClientService securedClientService;
	
	@RequestMapping("/getSecuredMessage")
	public String getSecuredMessage() {
		return securedClientService.getSecuredMessage();
	}
}
