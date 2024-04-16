package com.spring.jdbc.springJdbcSelect.dao;

import java.util.List;

import com.spring.jdbc.springJdbcSelect.dto.Employee;

public interface EmployeeDao {
	
	public List<Employee> findAllEmployees();
	
	public List<Employee> findByEmpId(Employee emp);

}
