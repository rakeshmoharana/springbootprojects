package com.springjpa.crud.operations;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JpaService {

	@Autowired
	private EmployeeRepository emprepo;
	
	public List<EmployeeModel> findAllEmp() {
		List <EntityEmployee> emplist= (List<EntityEmployee>) emprepo.findAll();
		
		 List<EmployeeModel> emmodellist = new ArrayList<>();
		for (EntityEmployee emp: emplist)
		{
			EmployeeModel emmodel=new EmployeeModel();
			//emmodel.setFirstName(emp.getFirstName());
			BeanUtils.copyProperties(emp,emmodel);
			emmodellist.add(emmodel);
			
		}
		return emmodellist;
	}
	
	public void saveEmp() {
		EntityEmployee employee= EntityEmployee.builder().firstName("Payal")
				.lastName("Lohiya")
				.comissionPct(10)
				.email("payal.lohiya2702@gmail.com")
				.hireDate(new Date("2016-03-26"))
				.homeLOcId(12)
				.departmentId(200)
				.build();
		
		emprepo.save(employee);
				
	}
	
}
