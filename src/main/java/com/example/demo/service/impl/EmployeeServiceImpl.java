package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.modal.Employee;
import com.example.demo.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeDAO employeeDAO;

	
	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

	@Override
	public Employee getEmployeeById(String id) {
		return employeeDAO.getEmployeeById(id);
	}

	@Override
	public Employee addNewEmployee(Employee employee) {
		return employeeDAO.addNewEmployee(employee);
	}

	
	@Override
	public Employee editEmployee(Employee employee) {
		return employeeDAO.editEmployee(employee);
	}

	
	@Override
	public void deleteEmployee(Integer employeeId) {
		employeeDAO.deleteEmployee(employeeId);
		
	}

}
