package com.demo.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.employee.dao.EmployeeRepository;
import com.demo.employee.model.Employee;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class EmployeeController 
{
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employees")
	public List<Employee> getAllEmployees()
	{
		
		return	employeeRepository.getEmployeeList();
		
	}
	
	@PutMapping("/employees/{empId}")
	public void updateEmployee(@PathVariable("empId") Long empId , @RequestBody Employee emp)
	{
		
		employeeRepository.updateEmployee(empId, emp);
	}
	
	
	
	
	

}
