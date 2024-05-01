package com.spring.orm.springOrm.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import com.spring.orm.springOrm.entity.Student;

@Repository("dao")
public class StudentDaoImpl implements StudentDao {

	private HibernateTemplate template;

	public HibernateTemplate getTemplate() {
		return template;
	}

	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}

	@Transactional
	public void insert(Student s) {
		template.save(s);
	}

	@Override
	public Student getStudentDetailsById(Integer id) {
		return template.get(Student.class, id);
	}
	
	@Transactional
	public void deleteById(Integer id) {
		Student s = template.get(Student.class, id);
		template.delete(s);
		
	}

	@Transactional
	public List<Student> getStudentDetails() {
		return template.loadAll(Student.class);
	}
}
