package com.springboot.jpaonetomaymanytooone;

import java.io.Serializable;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "DEPARTMENTS")
public class DepartmentEntity implements Serializable {
/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

public DepartmentEntity() {
		
	}
	@Id
	@Column(name = "department_id")
//	@GeneratedValue(strategy = GenerationType.IDENTITY)
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
	@Column(name = "department_name")
	private String departmentName;
	@Column(name = "manager_id")
	private Integer managerId;
	@Column(name = "location_id")
	private Integer locationId;
//	@OneToMany(targetEntity = Locations.class, cascade = CascadeType.ALL)
//	@JoinColumn(referencedColumnName = "locationId")
//	private List<Locations> locations;
	
	@OneToMany(cascade = CascadeType.ALL,targetEntity = EmployeeEntity.class)
	@JoinColumn(name="department_id", referencedColumnName = "department_id")
	private List<EmployeeEntity> employees;
	
	
	@Override
	public String toString() {
		return "DepartmentEntity [departmentId=" + departmentId + ", departmentName=" + departmentName + ", managerId="
				+ managerId + ", locationId=" + locationId + ", employees=" + employees + "]";
	}
	/**
	 * @return the employees
	 */
	public List<EmployeeEntity> getEmployees() {
		return employees;
	}
	/**
	 * @param employees the employees to set
	 */
	public void setEmployees(List<EmployeeEntity> employees) {
		this.employees = employees;
	}
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
