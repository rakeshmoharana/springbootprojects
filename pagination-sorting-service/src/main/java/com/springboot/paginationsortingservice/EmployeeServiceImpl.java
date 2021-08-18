package com.springboot.paginationsortingservice;

//import java.awt.print.Pageable;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;
@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
//		return  (List<Employee>)Lists.newArrayList(empRepo.findAll());
//		
//		return empRepo.findAll();
		List<Employee> empList=new ArrayList<Employee>();
//		 empRepo.findAll().forEach(a -> {
//			 if(empList==null) {
//				 empList = new ArrayList<Employee>();
//			 }
//			 empList.add(a);
//			});
		Pageable firstPageWithTwoElements = PageRequest.of(5, 4,Sort.by("firstName").descending().and(Sort.by("employeeId")));
		 empRepo.findAll(firstPageWithTwoElements).forEach(empList::add);
		 empList.forEach(System.out::println);
		return empList;
	}

}
