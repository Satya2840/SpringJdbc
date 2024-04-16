package com.spring.jdbc.resultSetExtractor.dao;

import java.util.List;

import com.spring.jdbc.resultSetExtractor.dto.Employee;

public interface EmployeeDao {
	
	public List<Employee> fetchAllEmployees();

}
