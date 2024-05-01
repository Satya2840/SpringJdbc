package com.spring.orm.springOrm;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.orm.springOrm.dao.StudentDaoImpl;
import com.spring.orm.springOrm.entity.Student;
import com.spring.orm.springOrm.service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/orm/springOrm/beans.xml"); 
       StudentService dao = context.getBean("studentService",StudentService.class);
       Student s = new Student();
       s.setName("Satya");
       s.setPhNo(1344567);
       //dao.insert(s);
       //Student student = dao.getStudentDetailsById(19);
       
       //dao.deleteById(19);
       
       List<Student> students = dao.getStudentDetails();
       for(Student student:students) {
    	   System.out.println(student);
       }
       
       System.out.println("Student details ");
    }
}
