package com.example.demo.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.modal.Employee;
import com.example.demo.service.EmployeeService;

@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
@RestController
public class EmployeeController {
  
	
	@Autowired
	private EmployeeService employeeService;
	
	
	
	@GetMapping("/employees")
	public List<Employee> retrieveCoursesForStudent() {
		return employeeService.getAllEmployees();
	}
	
	
	@PutMapping("/employees/{employeeId}")
	public Employee editEmployee(@PathVariable("employeeId")Integer employeeId , @RequestBody Employee employee) {
		return employeeService.editEmployee(employee);
	}
	
	
	
	@PostMapping("/employees")
	public ResponseEntity<Void> addNewEmployee(@RequestBody Employee employee) {
		Employee emp=employeeService.addNewEmployee(employee);
		if (emp == null)
			return ResponseEntity.noContent().build();

		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path(
				"/{employeeId}").buildAndExpand(emp.getEmployeeId()).toUri();

		return ResponseEntity.created(location).build();
	}
	
	
	@DeleteMapping("/employees/{employeeId}")
	public void deleteEmployee(@PathVariable("employeeId")Integer employeeId) {
		 employeeService.deleteEmployee(employeeId);
	}
}
