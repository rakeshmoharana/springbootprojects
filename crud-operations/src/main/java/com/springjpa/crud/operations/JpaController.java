package com.springjpa.crud.operations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JpaController {
	
@Autowired
JpaService jpserv;

	@RequestMapping("/getEmployee")
	public List<EmployeeModel> getEmp(){
		return jpserv.findAllEmp();
		
	}

}
