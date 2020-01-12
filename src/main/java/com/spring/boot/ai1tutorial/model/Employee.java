package com.spring.boot.ai1tutorial.model;

public class Employee{
	
	String empName;
	String empId;
	
	
	
	public Employee(String empName, String empId) {
		super();
		this.empName = empName;
		this.empId = empId;
	}
	
	
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	
	
}