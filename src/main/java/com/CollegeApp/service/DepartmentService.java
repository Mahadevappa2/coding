package com.CollegeApp.service;

import java.sql.SQLException;
import java.util.Scanner;

import com.CollegeApp.dao.DepartmentDaoImp;
import com.CollegeApp.entity.Department;

public class DepartmentService {
	public static Scanner sc=new Scanner(System.in);

	public static void createDepartment() throws SQLException {
		// TODO Auto-generated method stub
		System.out.println("enter the department id");
		int deptId=sc.nextInt();
		System.out.println("enter the dept name");
		String dName=sc.next();
		System.out.println("enter the limit of an dept");
		int dLimit=sc.nextInt();
		Department dept=new Department(deptId,dName,dLimit);
		DepartmentDaoImp.creatDempartment(dept);

	}


}