package com.springjpa.crud.operations;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@AllArgsConstructor
@Builder

public class EntityDept {

	@Id
	private Integer deptId;
	private String deptName;
	private Integer managerId;
	private Integer locId;
	
}
