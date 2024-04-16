package com.spring.jdbc.resultSetExtractor.service;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.ResultSetExtractor;

import com.spring.jdbc.resultSetExtractor.dto.Employee;

public class EmpResultSetExtactor implements ResultSetExtractor<List<Employee>> {

	@Override
	public List<Employee> extractData(ResultSet rs) throws SQLException, DataAccessException {
		
		List<Employee> empList = new ArrayList<>();
		//Employee emp = new Employee();
		System.out.println("inside the extractData method");
		while(rs.next()) {
			
		Employee emp = new Employee();
		emp.setEmpid(rs.getInt("EMPID"));
		emp.setEname(rs.getString("ENAME"));
		emp.setSalary(rs.getInt("SALARY"));
		empList.add(emp);
		}
		return empList;
		
	}

}
