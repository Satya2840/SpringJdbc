package com.spring.jdbc.resultSetExtractor.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jdbc.resultSetExtractor.dao.EmployeeDao;
import com.spring.jdbc.resultSetExtractor.dto.Employee;

@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeDao dao;
	
	public void fetchEmployees() {
		
		List<Employee> empDetails =dao.fetchAllEmployees();
		for(Employee emp:empDetails) {
			System.out.println(emp);
		}
		//return dao.fetchAllEmployees();
		
	}

}
