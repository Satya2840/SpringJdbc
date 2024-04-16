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
	
	public void findByid() {
		Employee emp = new Employee();
		emp.setEmpid(3);
		List<Employee> emp1 = empDao.findByEmpId(emp);
		System.out.println(emp1);
	}

	

}
