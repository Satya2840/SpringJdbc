package com.spring.jdbc.springJdbcTemplateUpdate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.springJdbcTemplateUpdate.dao.EmployeeDaoImpl;
import com.spring.jdbc.springJdbcTemplateUpdate.dao.StudentDaoImpl;
import com.spring.jdbc.springJdbcTemplateUpdate.dto.Employee;
import com.spring.jdbc.springJdbcTemplateUpdate.dto.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springJdbcTemplateUpdate/beans.xml");
    
       EmployeeDaoImpl empdao= context.getBean("employeeDaoImpl",EmployeeDaoImpl.class);
       
       Employee emp = new Employee();
       emp.setEmpid(3);
       emp.setEname("Lakshmi");
       emp.setSalary(10000);
       int noOfRecords = empdao.insert(emp);
       System.out.println(noOfRecords);
       StudentDaoImpl studentDao = context.getBean("studentDaoImpl",StudentDaoImpl.class);
       
       Student student = new Student();
       student.setRollNo(1);
       student.setName("xyz");
       student.setFees(10000);
       studentDao.insert(student);
       
       studentDao.deleteRecord(1);
       
       
       
    }
}
