package com.example.demo.service;

import java.util.List;

import com.example.demo.modal.Employee;

public interface EmployeeService {
   
	List<Employee> getAllEmployees();

	Employee getEmployeeById(String id);

	Employee addNewEmployee(Employee employee);
	
    Employee editEmployee(Employee employee);
	
	void deleteEmployee(Integer employeeId);

	
}
