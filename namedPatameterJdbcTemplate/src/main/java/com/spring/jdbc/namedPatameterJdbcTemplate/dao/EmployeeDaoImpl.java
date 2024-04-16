package com.spring.jdbc.namedPatameterJdbcTemplate.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.namedPatameterJdbcTemplate.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	
	
	@Autowired
	private NamedParameterJdbcTemplate template;
	@Override
	public void insertRecord(Employee emp) {
		String sql = "insert into Employee(empid,ename,salary,dept_id,job_id) values(:id,:name,:salary,:deptId,:jobId)";
		Map<String,Object> map = new HashMap<String, Object>();
		map.put("id",emp.getEmpid());
		map.put("name", emp.getName());
		map.put("salary", emp.getSalary());
		map.put("jobId", emp.getJobId());
		map.put("deptId", emp.getDeptid());	
		template.update(sql,map);	
	}
}
