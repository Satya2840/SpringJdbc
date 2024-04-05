package com.spring.jdbc.SpringjdbcInsert.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.jdbc.SpringjdbcInsert.dao.EmployeeDaoImpl;
import com.spring.jdbc.SpringjdbcInsert.dto.Employee;

@Service
public class EmployeeService {
	

	@Autowired
	private EmployeeDaoImpl daoImpl;
	
	public void insert() {
		
		Employee emp = new Employee();
		emp.setEmpid(1);
		emp.setEname("Venkat");
		emp.setSalary(100000);
		
		Employee emp1 = new Employee();
		emp1.setEmpid(2);
		emp1.setEname("Suraj");
		emp1.setSalary(200000);
		
		Employee emp2 = new Employee();
		emp2.setEmpid(3);
		emp2.setEname("Lakshmi");
		emp2.setSalary(300000);
		
		Employee emp3 = new Employee();
		emp3.setEmpid(4);
		emp3.setEname("Sandhya");
		emp3.setSalary(400000);
		
		Employee emp4 = new Employee();
		emp4.setEmpid(5);
		emp4.setEname("Satwika");
		emp4.setSalary(500000);
		
		ArrayList<Employee> list = new ArrayList<Employee>();
		list.add(emp);
		list.add(emp1);
		list.add(emp2);
		list.add(emp3);
		list.add(emp4);
		
		daoImpl.insertRecords(list);
		
	}
}
