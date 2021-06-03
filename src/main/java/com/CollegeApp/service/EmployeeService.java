package com.CollegeApp.service;

import java.sql.SQLException;
import java.util.Scanner;

import com.CollegeApp.dao.DepartmentDaoImp;
import com.CollegeApp.dao.EmployeeDaoImp;
import com.CollegeApp.entity.Employee;

import Exception.InvalidException;

public class EmployeeService {
	public static Scanner sc=new Scanner(System.in);

	public static void createEmployee() throws SQLException, InvalidException {
		// TODO Auto-generated method stub
		System.out.println("enter the employee name");
		String ename=sc.next();
		System.out.println("enter the employee salary");
		int salary=sc.nextInt();
		System.out.println("enter the city of an employee");
		String city=sc.next();
		Employee  emp=new Employee(ename,salary,city);
		EmployeeDaoImp.assignDept(emp);




	}

	public static void sort() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("enter the dept id");
		int deptId=sc.nextInt();
		EmployeeDaoImp.sort(deptId);
	}

}
