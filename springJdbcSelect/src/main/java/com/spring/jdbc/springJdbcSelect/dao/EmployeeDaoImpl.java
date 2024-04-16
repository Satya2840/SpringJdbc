package com.spring.jdbc.springJdbcSelect.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.springJdbcSelect.dto.Employee;
import com.spring.jdbc.springJdbcSelect.rowmapper.EmployeeRowMapper;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	


	@Override
	public List<Employee> findAllEmployees() {
		String query = "Select * from Employee";

		return jdbcTemplate.query(query, new EmployeeRowMapper());

	}


	@Override
	public Employee findByEmpId(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

}
