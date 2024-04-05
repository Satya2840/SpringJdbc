package com.spring.jdbc.springJdbcTemplateUpdate.dao;

import com.spring.jdbc.springJdbcTemplateUpdate.dto.Student;

public interface StudentDao {
	public int insert(Student student);
	
	public int deleteRecord(int rollNo);
	
	public int updateRecord(String name);
	
	
}
