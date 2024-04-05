package com.spring.jdbc.SpringjdbcInsert.dao;

import java.util.List;

import com.spring.jdbc.SpringjdbcInsert.dto.Employee;

public interface EmployeeDao {
	
	public void insertRecords(List<Employee> empList);

}
