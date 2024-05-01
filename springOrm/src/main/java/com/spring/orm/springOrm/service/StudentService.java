package com.spring.orm.springOrm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spring.orm.springOrm.dao.StudentDao;
import com.spring.orm.springOrm.entity.Student;

@Service
public class StudentService {
	
	@Autowired
	private StudentDao dao;
	
	public void insert(Student s) {
		dao.insert(s);
	}
	
	public Student getStudentDetailsById(Integer id) {
		return dao.getStudentDetailsById(id);
	}
	
	public void deleteById(Integer id) {
		dao.deleteById(id);
	}
	
	public List<Student> getStudentDetails(){
		return dao.getStudentDetails();
	}
	

}
