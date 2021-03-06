package com.springboot.training.boottransaction.isolation;

//import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.training.boottransaction.entity.EmployeeEntity;
import com.springboot.training.boottransaction.model.EmployeeModel;
import com.springboot.training.boottransaction.repository.EmployeeRepository;
import com.springboot.training.boottransaction.service.EmployeeService;

@Service
public class IsolationTutorialService {

	@Autowired
	private EmployeeRepository empRepo;
	
	@Autowired
	EmployeeIsolationServiceImpl empIsolationSvcImpl;
	
//	@Override
	@Transactional(isolation=Isolation.READ_COMMITTED, rollbackFor = {ArithmeticException.class}, noRollbackFor = {NullPointerException.class})
	public void insertEmployee(EmployeeModel empModel) {

		System.out.println("LAst >> ");
		empRepo.findAll().stream()
		.forEach(System.out::println);
		
		EmployeeEntity empEntity = new EmployeeEntity();
		System.out.println("--empModel---"+empModel);
		BeanUtils.copyProperties(empModel, empEntity);
		System.out.println("-----"+empEntity);
		EmployeeEntity e =empRepo.save(empEntity );
		
		empIsolationSvcImpl.insertEmployee(empModel);
		String a= null;
		System.out.println("LAst >> ");
		empRepo.findAll().stream()
		.forEach(System.out::println);
//		a.toString();
		
	}
	
}
