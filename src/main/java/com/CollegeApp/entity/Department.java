package com.CollegeApp.entity;

import java.util.List;

public class Department {

	private static int deptId;
	private static String dName;
	private static int dLimit;
	private List<Employee> employee;
	public static int getdeptId() {
		return deptId;
	}
	public void setdeptId(int deptId) {
		this.deptId = deptId;
	}
	public static String getdName() {
		return dName;
	}
	public void setdName(String dName) {
		this.dName = dName;
	}
	public static int getdLimit() {
		return dLimit;
	}
	public void setdLimit(int dLimit) {
		this.dLimit = dLimit;
	}
	public List<Employee> getEmployee() {
		return employee;
	}
	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", dName=" + dName + ", dLimit=" + dLimit + "]";
	}
	public void setEmployee(List<Employee> employee) {
		this.employee = employee;
	}
	public Department(int deptId, String dName, int dLimit) {
		super();
		this.deptId = deptId;
		this.dName = dName;
		this.dLimit = dLimit;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}


}
