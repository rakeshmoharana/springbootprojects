package com.springboot.tutorial.springsecurityserviceclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class SecuredClientService {

	@Autowired
	private RestTemplate restTemplate;
	
	public String getSecuredMessage() {
		HttpHeaders headers = new HttpHeaders();
		headers.setBasicAuth("sergey", "sergey");
		HttpEntity<String> request = new HttpEntity<String>(headers);
		System.out.println("restTemplate > "+restTemplate);
		ResponseEntity<String> response = restTemplate.exchange("http://localhost:8060/message", HttpMethod.GET, 
		request, String.class);
		String body = response.getBody();
		System.out.println("body >>> "+body);
		System.out.println("response >>> "+response);
		return body;
	}
}
