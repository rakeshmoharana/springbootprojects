package com.springboot.paginationsortingservice;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaginationAndSortingController {
	
	@Autowired
	private EmployeeService empService;
	
	@RequestMapping("/getEmployees")
	public ResponseEntity<List<Employee>> getEmployees(){
//		return new ResponseEntity<List<Employee>>(empService.getEmployees(),HttpStatus.OK);
		HttpHeaders responseHeaders = new HttpHeaders();
	    responseHeaders.set("Baeldung-Example-Header", 
	      "Value-ResponseEntityBuilderWithHttpHeaders");

	    responseHeaders.set("Baeldung", 
	      "Value-");
		return ResponseEntity.ok().headers(responseHeaders).body(empService.getEmployees());
	}
	
}
