package com.spring.jdbc.springJdbcSelect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.jdbc.springJdbcSelect.dto.Employee;
import com.spring.jdbc.springJdbcSelect.service.EmployeeService;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/jdbc/springJdbcSelect/beans.xml");

		EmployeeService service = context.getBean("employeeService", EmployeeService.class);

		//service.fetchAllEmployees();
		
		service.findByid();
		
		
	}
}
