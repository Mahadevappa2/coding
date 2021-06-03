package com.CollegeApp.entity;

import java.util.List;

public class Employee {

	private static String ename;
	private static int salary;
	private static String city;
	private Department dept;
	public Department getDept() {
		return dept;
	}
	public void setDept(Department dept) {
		this.dept = dept;
	}
	public static String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public static int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public static String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(String ename, int salary, String city) {
		super();
		this.ename = ename;
		this.salary = salary;
		this.city = city;
	}



}
