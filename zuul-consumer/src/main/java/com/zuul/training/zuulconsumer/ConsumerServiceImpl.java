package com.zuul.training.zuulconsumer;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ConsumerServiceImpl implements ConsumerService{

	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private DiscoveryClient discoveryClient;
	
	@Override
	public Employee getEmployee() {
		List<ServiceInstance> servInstances = discoveryClient.getInstances("producer-app");
		String baseurl= servInstances.get(0).getUri().toString()+"/employee";
		System.out.println("baseurl >>>> "+baseurl);
		return restTemplate.getForObject("http://employee-zuul-producer/producer/employee",Employee.class);
	}
	
//	private static HttpEntity<?> getHeaders() throws IOException{
//		HttpHeaders headers = new HttpHeaders();
//		headers.set("Accept", MediaType.APPLICATION_JSON_VALUE);
//		return new HttpEntity<?>(headers);
//	}

}
