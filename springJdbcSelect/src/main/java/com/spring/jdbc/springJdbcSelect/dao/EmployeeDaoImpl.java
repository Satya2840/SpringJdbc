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
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	
	@Override
	public List<Employee> findAllEmployees() {
		String query = "Select * from Employee";

		return jdbcTemplate.query(query, new EmployeeRowMapper());

	}


	@Override
	public List<Employee> findByEmpId(Employee emp) {
		
		String sql = "select * from employee where empid=:id";
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("id", emp.getEmpid());
		return template.query(sql, map, new EmployeeRowMapper());
		
	}

}
