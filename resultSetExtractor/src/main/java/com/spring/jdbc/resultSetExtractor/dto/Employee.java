package com.spring.jdbc.resultSetExtractor.dto;

public class Employee {
	 private Integer empid;
	 private String ename;
	 private Integer salary;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", ename=" + ename + ", salary=" + salary + "]";
	}
	 
	 
	

}
