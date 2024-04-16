package com.spring.jdbc.springJdbcSelect.dto;

public class Employee {
	
	private int empid;
	private String ename;
	private int salary;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	
	
	

}
