package com.example.demo.dao.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.data.mongodb.core.query.Update;
import org.springframework.stereotype.Repository;

import com.example.demo.dao.EmployeeDAO;
import com.example.demo.modal.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDAO {
	
	@Autowired
	private MongoTemplate mongoTemplate;
     

	@Override
	public List<Employee> getAllEmployees() {
		return mongoTemplate.findAll(Employee.class);
	}

	@Override
	public Employee getEmployeeById(String id) {
		Query query = new Query();
		query.addCriteria(Criteria.where("id").is(id));
		return mongoTemplate.findOne(query, Employee.class);
	}

	@Override
	public Employee addNewEmployee(Employee employee) {
		mongoTemplate.save(employee);
		return employee;
	}
	
	@Override
	public Employee editEmployee(Employee employee) {
		mongoTemplate.updateFirst(new Query(Criteria.where("id").is(employee.getEmployeeId())),Update.update("name", employee.getName()), Employee.class);
		return employee;
	}
	
	
	@Override
	public void deleteEmployee(Integer employeeId) {
		 mongoTemplate.remove(new Query(Criteria.where("employeeId").is(employeeId)), Employee.class);
	}

}
