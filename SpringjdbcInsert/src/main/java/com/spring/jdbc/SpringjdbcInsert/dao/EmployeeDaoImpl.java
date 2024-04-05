package com.spring.jdbc.SpringjdbcInsert.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.SpringjdbcInsert.dto.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insertRecords(List<Employee> empList) {

		String query = "insert into Employee values(?,?,?)";
		ArrayList<Object[]> list = new ArrayList<Object[]>();
		for (Employee emp : empList) {
			Object[] obj = { emp.getEmpid(), emp.getEname(), emp.getSalary() };
			list.add(obj);
		}
		jdbcTemplate.batchUpdate(query, list);

	}

}
