package com.spring.jdbc.resultSetExtractor.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.resultSetExtractor.dto.Employee;
import com.spring.jdbc.resultSetExtractor.service.EmpResultSetExtactor;
@Repository
public class EmployeeDaoIml implements EmployeeDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public List<Employee> fetchAllEmployees() {
		String sql = "Select * from Employee";
		
		return jdbcTemplate.query(sql,new EmpResultSetExtactor());
	}

}
