package com.demo.employee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.demo.employee.model.Employee;

public class EmployeeRepositoryTest {

	
private static Map<Long , Employee> empMap  = null;
	
	static
	{
		empMap = new HashMap<>();
		empMap.put(1L, new Employee("1", "Smith", "abc@yahoo.com", "Mumbai"));
		empMap.put(2L, new Employee("2", "John", "xyz@gmail.com", "Pune"));
		empMap.put(3L, new Employee("3", "Smith", "abc@yahoo.com", "Kolkata"));
		empMap.put(4L, new Employee("4", "John", "xyz@gmail.com", "Chennai"));
		empMap.put(5L, new Employee("5", "Smith", "abc@yahoo.com", "Kolhapur"));
		empMap.put(6L, new Employee("6", "John", "xyz@gmail.com", "Orissa"));
	}
	
	public List<Employee> getEmployeeByName(String empployeeName)
	{
		/*List<Employee> list = new ArrayList<>();
		
		for(Map.Entry<Long, Employee> map : empMap.entrySet())
		{
			if(empployeeName.equalsIgnoreCase(map.getValue().getEmployeeName()))
			{
				list.add(map.getValue());
			}
		}*/
		
		return empMap.values().stream().filter( e -> e.getEmployeeName() == empployeeName).collect(Collectors.toList());
	}
	
	public static void main(String[] args) {
		
		EmployeeRepositoryTest obj = new EmployeeRepositoryTest();
		
		System.out.println(obj.getEmployeeByName("Smith").toString());
		System.out.print(obj.getEmployeeByName("John").size());
		
	}

}
