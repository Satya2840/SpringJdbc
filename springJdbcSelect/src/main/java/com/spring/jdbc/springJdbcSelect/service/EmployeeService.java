package com.spring.jdbc.springJdbcSelect.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jdbc.springJdbcSelect.dao.EmployeeDao;
import com.spring.jdbc.springJdbcSelect.dto.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao empDao;
	
	
	
	public void fetchAllEmployees() {
		
		List<Employee> empDetails =empDao.findAllEmployees();
		for(Employee emp:empDetails) {
			System.out.println(emp);
		}
		
		
	}
	
	public void findByid(Integer id) {
		Employee emp = empDao.findByEmpId(id);
		System.out.println(emp);
	}

	

}
