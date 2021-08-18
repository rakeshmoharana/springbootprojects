package com.springboot.springsecurityservice;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecurityController {

	@RequestMapping("/message")
	public String getMessage() {
		return "Hello";
	}
}
