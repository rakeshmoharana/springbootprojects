package com.springboot.training.boottransaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.training.boottransaction.isolation.IsolationTutorialService;
import com.springboot.training.boottransaction.model.EmployeeModel;
import com.springboot.training.boottransaction.service.EmployeeService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empServ;
	
	@Autowired
//	@Qualifier("IsolationTutorialService")
	private IsolationTutorialService empServIsolationImpl;
	
	@RequestMapping(method = RequestMethod.POST, consumes={"application/JSON"},value = "/create")
	public void createEmployee(@RequestBody EmployeeModel em) {
		empServ.insertEmployee(em);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes={"application/JSON"},value = "/createEmployeeInIsolation")
	public void createEmployeeInIsolation(@RequestBody EmployeeModel em) {
		empServIsolationImpl.insertEmployee(em);
	}
	
	@RequestMapping(method = RequestMethod.POST, consumes={"application/JSON"},value = "/validateAndCreate")
	public void validateAndCreateEmployee(@Validated @RequestBody EmployeeModel em) {
		empServ.insertEmployee(em);
	}
	
}
