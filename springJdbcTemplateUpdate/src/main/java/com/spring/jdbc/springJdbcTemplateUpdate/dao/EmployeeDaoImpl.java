package com.spring.jdbc.springJdbcTemplateUpdate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.springJdbcTemplateUpdate.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao{

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Employee emp) {
		String query ="insert into Employee values(?,?,?)";
		Object[] obj = {emp.getEmpid(),emp.getEname(),emp.getSalary()};
				return jdbcTemplate.update(query,obj);
	}

}
