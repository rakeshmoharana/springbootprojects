package com.springboot.training.boottransaction.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="EMPLOYEE_HEALTH_INSURANCE")
public class HealthInsuranceEntity {
	
	@Id
	@Column(name="EMPID")
	private String empId;
	
	@Column(name="HEALTHINSURANCESCHEMENAME")
	private String healthInsuranceSheme;
	
	@Column(name="COVERAGEAMOUNT")
	private String coverageAmt;

	public HealthInsuranceEntity() {
		super();
		// TODO Auto-generated constructor stub
	}

	public HealthInsuranceEntity(String empId, String healthInsuranceSheme, String coverageAmt) {
		super();
		this.empId = empId;
		this.healthInsuranceSheme = healthInsuranceSheme;
		this.coverageAmt = coverageAmt;
	}

	@Override
	public String toString() {
		return "HealthInsuranceEntity [empId=" + empId + ", healthInsuranceSheme=" + healthInsuranceSheme
				+ ", coverageAmt=" + coverageAmt + "]";
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
	 * @return the healthInsuranceSheme
	 */
	public String getHealthInsuranceSheme() {
		return healthInsuranceSheme;
	}

	/**
	 * @param healthInsuranceSheme the healthInsuranceSheme to set
	 */
	public void setHealthInsuranceSheme(String healthInsuranceSheme) {
		this.healthInsuranceSheme = healthInsuranceSheme;
	}

	/**
	 * @return the coverageAmt
	 */
	public String getCoverageAmt() {
		return coverageAmt;
	}

	/**
	 * @param coverageAmt the coverageAmt to set
	 */
	public void setCoverageAmt(String coverageAmt) {
		this.coverageAmt = coverageAmt;
	}
}
