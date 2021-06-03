package com.CollegeApp.client;

import java.sql.SQLException;
import java.util.Scanner;

import com.CollegeApp.service.DepartmentService;
import com.CollegeApp.service.EmployeeService;

import Exception.InvalidException;


public class ClientTest {

	public static void main(String[] args) throws SQLException, InvalidException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		displayMenuDetailes();
		System.out.println("enter your choice");
		byte choice=sc.nextByte();
		switch(choice)
		{
		case 1:DepartmentService.createDepartment();
				System.out.println();
		      break;

		case 2:EmployeeService.createEmployee();
		     break;

		case 3:EmployeeService.sort(); 
		     break;

		}



	}

	private static void displayMenuDetailes() {
		// TODO Auto-generated method stub
		System.out.println("1 : adding the detailes of an department");
		System.out.println("2 : adding the detailes of an employee");
		System.out.println("3 : sorting the detailes of an employee based on deptId");

	}

}
