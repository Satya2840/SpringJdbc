package com.spring.jdbc.springJdbcSelect.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.springJdbcSelect.dto.Employee;

public class EmployeeRowMapper implements RowMapper<Employee>{

	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Employee emp = new Employee();
		
		emp.setEmpid(rs.getInt("EMPID"));
		emp.setEname(rs.getString("ENAME"));
		emp.setSalary(rs.getInt("Salary"));
		
		System.out.println("mapRow method called");
		return emp;
	}

}
