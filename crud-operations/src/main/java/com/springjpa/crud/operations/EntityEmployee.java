package com.springjpa.crud.operations;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Table(name="EMPLOYEES")
@Entity
@Getter @Setter @NoArgsConstructor @AllArgsConstructor @ToString //@Data can be used for getter and setter
@Builder
public class EntityEmployee {

	 @Id
	 @Column(name="EMPLOYEE_ID")
	 @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "EMP_SEQ")
	 @SequenceGenerator(sequenceName = "EMPLOYEES_SEQ", allocationSize = 1, name = "EMP_SEQ")
	private Integer employeeId;
	 @Column(name="FIRST_NAME")
	 private String firstName;
	 
	 @Column(name="LAST_NAME")
	 private String lastName;
	 
	 @Column(name="EMAIL")
	 private String email;
	 
	 @Column(name="PHONE_NUMBER")
	 private String phoneNumber;
	 
	 @Column(name="HIRE_DATE")
	 private Date hireDate;
	 
	 @Column(name="JOB_ID")
	 private String jobId;
	 
	 @Column(name="SALARY")
	 private BigDecimal salary;
	 
	 @Column(name="COMMISSION_PCT")
	 private Integer comissionPct;
	 
	 @Column(name="MANAGER_ID")
	 private Integer managerId;
	 
	 @Column(name="DEPARTMENT_ID")
	 private Integer departmentId;
	 
	 @Column(name="HOME_LOCATION_ID")
	 private Integer homeLOcId;



	
}
