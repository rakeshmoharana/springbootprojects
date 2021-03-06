package com.springboot.jpaonetomaymanytooone;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {
	
	@Autowired
	private DepartmentRepository departmentRepo;
	
	@RequestMapping("/getDepartments")
	public ResponseEntity<List<DepartmentEntity>> getDepartments(){
		return new ResponseEntity<List<DepartmentEntity>>(departmentRepo.findAll(),HttpStatus.OK);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/deleteDepartment/{deptId}")
	public void deleteDepartment(@PathVariable ("deptId") Integer deptId){
	departmentRepo.deleteById(deptId);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/createDepartment/{deptId}")
	public ResponseEntity<DepartmentEntity> createDepartment(@PathVariable ("deptId") Integer deptId, @RequestBody DepartmentEntity department){
		System.out.println("deptId >> "+deptId);
		System.out.println("department >> "+department);
		department.getEmployees().forEach(e -> e.setHireDate(new Date()));
		departmentRepo.save(department);
		return new ResponseEntity<DepartmentEntity>(departmentRepo.findById(deptId).get(),HttpStatus.OK);
	}
}
