package com.springboot.training.boottransaction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

@Entity
@Table(name = "employee_sprngboot_tx_tutorial")
public class EmployeeEntity {
	
	@Id
	@Column(name = "EMPID")
	private String empId;
	
	@Column(name = "EMPNAME")
	@NotNull
	private String empName;
	
	public EmployeeEntity(String empId, String empName) {
		super();
		this.empId = empId;
		this.empName = empName;
	}
	public EmployeeEntity() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "EmployeeEntity [empId=" + empId + ", empName=" + empName + "]";
	}
	/**
	 * @return the empId
	 */
	public String getEmpId() {
		return empId;
	}
	/**
	 * @param empId the empId to set
	 */
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	/**
	 * @return the empName
	 */
	public String getEmpName() {
		return empName;
	}
	/**
	 * @param empName the empName to set
	 */
	public void setEmpName(String empName) {
		this.empName = empName;
	}
}
