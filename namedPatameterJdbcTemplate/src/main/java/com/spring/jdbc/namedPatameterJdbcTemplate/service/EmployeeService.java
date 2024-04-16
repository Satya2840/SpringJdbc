package com.spring.jdbc.namedPatameterJdbcTemplate.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jdbc.namedPatameterJdbcTemplate.dao.EmployeeDao;
import com.spring.jdbc.namedPatameterJdbcTemplate.dto.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao dao;
	
	public void insertRecords(){
		Employee emp = new Employee();
		emp.setEmpid(8);
		emp.setName("xyz");
		emp.setSalary(20000);
		emp.setDeptid(1);
		emp.setJobId(2);
		dao.insertRecord(emp);
		
	}
	

}
