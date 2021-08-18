package com.springboot.training.boottransaction.model;

import com.sun.istack.NotNull;

//import javax.persistence.Column;

public class EmployeeModel {
	
	private String empId;
//	@Column(name = "empName")
	@NotNull
	private String empName;
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
	public EmployeeModel() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EmployeeModel(String empId, String empName) {
	super();
	this.empId = empId;
	this.empName = empName;
}
	@Override
	public String toString() {
		return "EmployeeModel [empId=" + empId + ", empName=" + empName + "]";
	}
}
