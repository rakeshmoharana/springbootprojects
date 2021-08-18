package com.springboot.training.boottransaction.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.training.boottransaction.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity, String> {

}
