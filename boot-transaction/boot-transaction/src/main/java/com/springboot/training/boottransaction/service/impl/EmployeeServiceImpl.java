package com.springboot.training.boottransaction.service.impl;

import javax.transaction.Transactional;
import javax.transaction.Transactional.TxType;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.training.boottransaction.entity.EmployeeEntity;
import com.springboot.training.boottransaction.model.EmployeeModel;
import com.springboot.training.boottransaction.repository.EmployeeRepository;
import com.springboot.training.boottransaction.service.EmployeeService;

@Service
//@Transactional
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository empRepo;
	
	@Override
	@Transactional(rollbackOn = {ArithmeticException.class}, dontRollbackOn = {NullPointerException.class})
	public void insertEmployee(EmployeeModel empModel) {
		EmployeeEntity empEntity = new EmployeeEntity();
		System.out.println("--empModel---"+empModel);
		BeanUtils.copyProperties(empModel, empEntity);
		System.out.println("-----"+empEntity);
		EmployeeEntity e =empRepo.save(empEntity );
		String a= null;
		a.toString();
		
	}
}
