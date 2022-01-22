package com.springjpa.crud.operations;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmployeeRepository extends CrudRepository<EntityEmployee, Integer> {

}
