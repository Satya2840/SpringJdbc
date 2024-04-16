package com.spring.jdbc.namedPatameterJdbcTemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.namedPatameterJdbcTemplate.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/namedPatameterJdbcTemplate/beans.xml");
        EmployeeService service =context.getBean("employeeService",EmployeeService.class);
        service.insertRecords();
    }
}
