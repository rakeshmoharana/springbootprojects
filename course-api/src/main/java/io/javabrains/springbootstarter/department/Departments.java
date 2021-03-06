/**
 * 
 */
package io.javabrains.springbootstarter.department;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

import io.javabrains.springbootstarter.location.Locations;

/**
 * @author Rakesh
 *
 */
@Entity
public class Departments implements Serializable{
	
	public Departments() {
		
	}
	@Id
	private Integer departmentId;
//	/**
//	 * @return the locations
//	 */
//	public List<Locations> getLocations() {
//		return locations;
//	}
//	/**
//	 * @param locations the locations to set
//	 */
//	public void setLocations(List<Locations> locations) {
//		this.locations = locations;
//	}

	private String departmentName;
	private Integer managerId;
	private Integer locationId;
//	@OneToMany(targetEntity = Locations.class, cascade = CascadeType.ALL)
//	@JoinColumn(referencedColumnName = "locationId")
//	private List<Locations> locations;
	
	
	public Integer getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(Integer departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public Integer getManagerId() {
		return managerId;
	}
	public void setManagerId(Integer managerId) {
		this.managerId = managerId;
	}
	public Integer getLocationId() {
		return locationId;
	}
	public void setLocationId(Integer locationId) {
		this.locationId = locationId;
	}

}
