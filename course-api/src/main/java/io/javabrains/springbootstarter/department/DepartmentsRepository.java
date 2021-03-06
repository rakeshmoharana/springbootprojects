/**
 * 
 */
package io.javabrains.springbootstarter.department;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Rakesh
 *
 */
public interface DepartmentsRepository extends CrudRepository<Departments,Integer> {

	@Query("select a from Departments a where a.departmentId > ?1")
	List<Departments> getDepartmentsById(Integer departmentId);
	
	
	
}
