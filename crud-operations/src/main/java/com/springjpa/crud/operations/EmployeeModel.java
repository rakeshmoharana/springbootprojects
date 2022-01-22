package com.springjpa.crud.operations;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;

public class EmployeeModel {
private Integer employeeId;
 private String firstName;
 private String lastName;
 private String email;
 private String phoneNumber;
 private Date hireDate;
private String jobId;
private BigDecimal salary;
private Integer comissionPct;
 private Integer managerId;
private Integer departmentId;
private Integer homeLOcId;

/**
 * @return the employeeId
 */
public Integer getEmployeeId() {
	return employeeId;
}

/**
 * @param employeeId the employeeId to set
 */
public void setEmployeeId(Integer employeeId) {
	this.employeeId = employeeId;
}

/**
 * @return the firstName
 */
public String getFirstName() {
	return firstName;
}

/**
 * @param firstName the firstName to set
 */
public void setFirstName(String firstName) {
	this.firstName = firstName;
}

/**
 * @return the lastName
 */
public String getLastName() {
	return lastName;
}

/**
 * @param lastName the lastName to set
 */
public void setLastName(String lastName) {
	this.lastName = lastName;
}

/**
 * @return the email
 */
public String getEmail() {
	return email;
}

/**
 * @param email the email to set
 */
public void setEmail(String email) {
	this.email = email;
}

/**
 * @return the phoneNumber
 */
public String getPhoneNumber() {
	return phoneNumber;
}

/**
 * @param phoneNumber the phoneNumber to set
 */
public void setPhoneNumber(String phoneNumber) {
	this.phoneNumber = phoneNumber;
}

/**
 * @return the hireDate
 */
public Date getHireDate() {
	return hireDate;
}

/**
 * @param hireDate the hireDate to set
 */
public void setHireDate(Date hireDate) {
	this.hireDate = hireDate;
}

/**
 * @return the jobId
 */
public String getJobId() {
	return jobId;
}

/**
 * @param jobId the jobId to set
 */
public void setJobId(String jobId) {
	this.jobId = jobId;
}

/**
 * @return the salary
 */
public BigDecimal getSalary() {
	return salary;
}

/**
 * @param salary the salary to set
 */
public void setSalary(BigDecimal salary) {
	this.salary = salary;
}

/**
 * @return the comissionPct
 */
public Integer getComissionPct() {
	return comissionPct;
}

/**
 * @param comissionPct the comissionPct to set
 */
public void setComissionPct(Integer comissionPct) {
	this.comissionPct = comissionPct;
}

/**
 * @return the managerId
 */
public Integer getManagerId() {
	return managerId;
}

/**
 * @param managerId the managerId to set
 */
public void setManagerId(Integer managerId) {
	this.managerId = managerId;
}

/**
 * @return the departmentId
 */
public Integer getDepartmentId() {
	return departmentId;
}

/**
 * @param departmentId the departmentId to set
 */
public void setDepartmentId(Integer departmentId) {
	this.departmentId = departmentId;
}

/**
 * @return the homeLOcId
 */
public Integer getHomeLOcId() {
	return homeLOcId;
}

/**
 * @param homeLOcId the homeLOcId to set
 */
public void setHomeLOcId(Integer homeLOcId) {
	this.homeLOcId = homeLOcId;
}

public EmployeeModel() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "EmployeeModel [employeeId=" + employeeId + ", firstName=" + firstName + ", lastName=" + lastName
			+ ", email=" + email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId
			+ ", salary=" + salary + ", comissionPct=" + comissionPct + ", managerId=" + managerId + ", departmentId="
			+ departmentId + ", homeLOcId=" + homeLOcId + "]";
}


}
