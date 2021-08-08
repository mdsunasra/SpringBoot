package com.demo.employee.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;import java.util.stream.Collector;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.demo.employee.model.Employee;

/**
 * @author lcsuser
 *
 */
@Repository
public class EmployeeRepository 
{

	
	
	private static Map<Long , Employee> empMap  = null;
	
	static
	{
		empMap = new HashMap<>();
		empMap.put(1L, new Employee("1", "Smith", "Smith@yahoo.com", "Mumbai"));
		empMap.put(2L, new Employee("2", "John", "John@gmail.com", "Pune"));
		empMap.put(3L, new Employee("3", "Thomas", "Thomas@yahoo.com", "Kolkata"));
		empMap.put(4L, new Employee("4", "Ronaldo", "Ronaldo@gmail.com", "Chennai"));
		empMap.put(5L, new Employee("5", "Arnav", "Arnav@yahoo.com", "Kolhapur"));
		empMap.put(6L, new Employee("6", "Joe", "Joe@gmail.com", "Orissa"));
	}
	
	
	/**
	 * method return the list of employee Details
	 * @return list of Employee Object
	 */
	public List<Employee> getEmployeeList()
	{
		
		
		if(null != empMap)
		{
			return empMap.values().stream().collect(Collectors.toList());
		}
		return null;
	}
	
	
	/**
	 * method return the list of Employee object by employee name
	 * @param empployeeName , name of the employee
	 * @return list of Employee Object
	 */
	public List<Employee> getEmployeeByName(String empployeeName)
	{
		
		
		return empMap.values().stream().filter( emp -> emp.getEmployeeName() == empployeeName).collect(Collectors.toList());
	}
	
	
	/**
	 * Update Employee based on Employee Id.
	 * @param id of the employee
	 * @param emp Employee Object
	 */
	public void updateEmployee(Long id , Employee emp)
	{
		if( id != null && null != emp)
		{
			for(Entry<Long, Employee> map : empMap.entrySet())
			{
				if(map.getKey() == id)
				{
					empMap.put(id, emp);
				}
			}
		}
	}
	
}
