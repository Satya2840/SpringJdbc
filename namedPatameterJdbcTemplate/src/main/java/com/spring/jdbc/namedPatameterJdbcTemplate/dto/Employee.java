package com.spring.jdbc.namedPatameterJdbcTemplate.dto;

public class Employee {
	
	private Integer empid;
	private String name;
	private Integer salary;
	private Integer deptid;
	private Integer jobId;
	public Integer getEmpid() {
		return empid;
	}
	public void setEmpid(Integer empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getSalary() {
		return salary;
	}
	public void setSalary(Integer salary) {
		this.salary = salary;
	}
	public Integer getDeptid() {
		return deptid;
	}
	public void setDeptid(Integer deptid) {
		this.deptid = deptid;
	}
	public Integer getJobId() {
		return jobId;
	}
	public void setJobId(Integer jobId) {
		this.jobId = jobId;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", name=" + name + ", salary=" + salary + ", deptid=" + deptid + ", jobId="
				+ jobId + "]";
	}
	
	

}
