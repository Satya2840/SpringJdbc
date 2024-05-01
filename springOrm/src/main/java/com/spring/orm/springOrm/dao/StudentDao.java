package com.spring.orm.springOrm.dao;

import java.util.List;

import javax.transaction.Transactional;

import com.spring.orm.springOrm.entity.Student;

public interface StudentDao {
	

	public void insert(Student s);
	
	public Student getStudentDetailsById(Integer id);
	
	public void deleteById(Integer id);
	
	public List<Student> getStudentDetails();

	

}
