package com.spring.jdbc.springJdbcTemplateUpdate.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.spring.jdbc.springJdbcTemplateUpdate.dto.Student;

@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public int insert(Student student) {
		String query ="insert into Student values(?,?,?)";
		Object[] objArgs = {student.getRollNo(),student.getName(),student.getFees()};
		
		return jdbcTemplate.update(query,objArgs);
	}
	
	public int deleteRecord(int rollNo) {
		String query = "delete from student where rollNo=?";
		return jdbcTemplate.update(query,rollNo);
	
	// String query = "delete from student where rollNo=1";
	}

	@Override
	public int updateRecord(String name) {
		String query = "update Student set name=? where rollno=2";
		return jdbcTemplate.update(query,name);
		
	}
	
	
}
