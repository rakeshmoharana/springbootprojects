package com.springboot.training.boottransaction.isolation;

//import javax.transaction.Transactional;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.springboot.training.boottransaction.entity.EmployeeEntity;
import com.springboot.training.boottransaction.model.EmployeeModel;
import com.springboot.training.boottransaction.repository.EmployeeRepository;
import com.springboot.training.boottransaction.service.EmployeeService;

@Service
public class EmployeeIsolationServiceImpl {

	@Autowired
	private EmployeeRepository empRepo;
	
//	@Override
	@Transactional(isolation=Isolation.SERIALIZABLE, propagation=Propagation.REQUIRES_NEW ,rollbackFor = {ArithmeticException.class}, noRollbackFor = {NullPointerException.class})
	public void insertEmployee(EmployeeModel empModel) {
		
		
//		empRepo.findAll().stream()
//		.forEach(System.out::println);
		
		EmployeeEntity empEntity = new EmployeeEntity();
		empEntity.setEmpId("1001");
		empEntity.setEmpName("kjsdhkdcsd");
		System.out.println("--empEntity---"+empEntity);
//		BeanUtils.copyProperties(empModel, empEntity);
		System.out.println("-----"+empEntity);
		EmployeeEntity e =empRepo.save(empEntity );
		empRepo.findAll().stream()
		.forEach(System.out::println);
		String a= null;
////		a.toString();
		
	}
	
	
}
