/**
 * 
 */
package io.javabrains.springbootstarter.department;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Rakesh
 *
 */
@RestController
public class DepartmentsController {

	/**
	 * 
	 */
	public DepartmentsController() {
		// TODO Auto-generated constructor stub
	}
	@Autowired
	private DepartmentsService departmentsService;
	
	@RequestMapping(value="/departments")
	public List<Departments> getAllDepartments(){
		return departmentsService.getAllDepartments();
	}
	
	@RequestMapping(value="/departments/{minId}")
	public List<Departments> getAllDepartments(@PathVariable("minId") String minId){
		System.out.println(minId+"---");
		return departmentsService.getAllDepartments(new Integer(minId));
	}

}
