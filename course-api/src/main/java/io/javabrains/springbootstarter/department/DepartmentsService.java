/**
 * 
 */
package io.javabrains.springbootstarter.department;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import io.javabrains.springbootstarter.topic.Topic;

/**
 * @author Rakesh
 *
 */
@Service
public class DepartmentsService {
	
	public DepartmentsService() {
		
	}
	@Autowired
	private DepartmentsRepository departmentsRepository;
	
	
	public List<Departments> getAllDepartments(){
		System.out.println(""+departmentsRepository.getClass().getName());
		List<Departments> departments=new ArrayList<Departments>();
		departmentsRepository.findAll().forEach(departments::add);
		return departments;
	}

	public List<Departments> getAllDepartments(Integer minId) {
		// TODO Auto-generated method stub
		return departmentsRepository.getDepartmentsById(minId );
	}
	
	
	
	
}
