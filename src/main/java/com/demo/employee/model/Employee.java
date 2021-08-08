package com.demo.employee.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Employee implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	private String employeeId;
	
	private String employeeName;
	
	private String employeeEmail;
	
	private String employeeLocation;

	public Employee(String employeeId, String employeeName, String empEmail, String empLocation) {
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.employeeEmail = empEmail;
		this.employeeLocation = empLocation;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeEmail="
				+ employeeEmail + ", employeeLocation=" + employeeLocation + "]";
	}
	
	
	

}
