package com.example.demo.dao;

import java.util.List;

import com.example.demo.modal.Employee;

public interface EmployeeDAO {
	
	List<Employee> getAllEmployees();

	Employee getEmployeeById(String id);

	Employee addNewEmployee(Employee employee);
	
	Employee editEmployee(Employee employee);
	
	void deleteEmployee(Integer employeeId);

}
