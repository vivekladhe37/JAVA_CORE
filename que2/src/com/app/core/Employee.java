package com.app.core;

import java.time.LocalDate;

public class Employee {

	/*
	 * id(unique), name, dob, hireDate, salary and department
	 */
	private String id;
	private String name,department;
	private double salary;
	private LocalDate dob,hireDate;
	public Employee(String id, String name, String department, double salary, LocalDate dob, LocalDate hireDate) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.salary = salary;
		this.dob = dob;
		this.hireDate = hireDate;
	}
	public Employee() {
		super();
	}
	
	public Employee(String id) {
		super();
		this.id = id;
	}
	@Override
	public String toString() {
		return "EmpService [id=" + id + ", name=" + name + ", department=" + department + ", salary=" + salary
				+ ", dob=" + dob + ", hireDate=" + hireDate + "]";
	}
	public String getId() {
		return id;
	}
	public String getName() {
		return name;
	}
	public String getDepartment() {
		return department;
	}
	public double getSalary() {
		return salary;
	}
	public LocalDate getDob() {
		return dob;
	}
	public LocalDate getHireDate() {
		return hireDate;
	}
	
	
	
	
}
