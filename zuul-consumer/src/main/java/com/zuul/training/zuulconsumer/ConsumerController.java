package com.zuul.training.zuulconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConsumerController {
	
	@Autowired
	private ConsumerService consumerService;
	
	
	@RequestMapping("/getemployee")
	public Employee getEmployee()  {
		
		return consumerService.getEmployee();
		
	}
}
