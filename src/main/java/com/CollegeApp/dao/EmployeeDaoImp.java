package com.CollegeApp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.CollegeApp.entity.Employee;
import com.CollegeApp.util.DatabaseConnection;


import Exception.InvalidException;


public class EmployeeDaoImp {
	public static Scanner sc=new Scanner(System.in);

	public static void assignDept(Employee emp) throws SQLException, InvalidException {
		// TODO Auto-generated method stub
		String query="insert into database.emp(ename,salary,city,deptId) values (?,?,?,?)";
		Connection con = getConnection();
		PreparedStatement ptmt=con.prepareStatement(query);
		

		DepartmentDaoImp.disaplayId();
		System.out.println("select the department id");
		int deptId1=sc.nextInt();

		int count=exe(deptId1);
		int dLimit=limit(deptId1);
		System.out.println(dLimit);
		
		if(count<=dLimit)
		{
			ptmt.setString(1,Employee.getEname());
			ptmt.setInt(2,Employee.getSalary());
			ptmt.setString(3,Employee.getCity());

			


				ptmt.setInt(4,deptId1);
			
			ptmt.executeUpdate();	
			System.out.println("data is addedd successfully");
		}
		else
		{
			throw new InvalidException("dept limit exced");
		}















	}

	private static int exe(int deptId1) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		String query="select count(*)  from database.emp where deptId=?";
		PreparedStatement st=con.prepareStatement( query);
		st.setInt(1,deptId1);
		ResultSet rst=st.executeQuery();
		int limit=0;
		
        while(rst.next()) {

			limit=rst.getInt(1);


		}

		return limit;
		
	}

	private static int limit(int deptId) throws SQLException {
		// TODO Auto-generated method stub
		Connection con = getConnection();
		String query="select dLimit from database.department where deptId=?";
		PreparedStatement st=con.prepareStatement( query);
		st.setInt(1,deptId);
		ResultSet rst=st.executeQuery();
		int limit=0;
		
        while(rst.next()) {

			limit=rst.getInt(1);


		}

		return limit;
	}

	private static Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		con=DatabaseConnection.getInstance().getConnection();
		return con;
	}

	public static void sort(int Id) throws SQLException {


		try
		{
			Connection con = getConnection();
			PreparedStatement st=con.prepareStatement("select * from database.emp where deptId=? order by salary desc, ename ");
			st.setInt(1,Id);
			ResultSet rst=st.executeQuery();
			 
			while(rst.next())
			{
				System.out.print("Employee name :"  +rst.getString(1));
				System.out.print("Employee salary:"  + rst.getInt(2));
				System.out.print("  city : "  +rst.getString(3));
				System.out.print("  department Id: "  +rst.getInt(4));
				System.out.println();


			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}






	}


}


