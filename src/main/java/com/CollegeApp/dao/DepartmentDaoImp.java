package com.CollegeApp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.CollegeApp.entity.Department;
import com.CollegeApp.util.DatabaseConnection;




public class DepartmentDaoImp {


	public static void creatDempartment(Department dept) throws SQLException {
		// TODO Auto-generated method stub
		String query="insert into database.department(deptId,dName,dLimit) values (?,?,?)";
		Connection con = getConnection();
		PreparedStatement ptmt=con.prepareStatement(query);
		ptmt.setInt(1,Department.getdeptId());
		ptmt.setString(2,Department.getdName());
		ptmt.setInt(3,Department.getdLimit());

		ptmt.executeUpdate();	
		System.out.println("data is addedd successfully");

	}

	public static void disaplayId() {
		// TODO Auto-generated method stub
		try
		{
			Connection con = getConnection();
			Statement st=con.createStatement();
			ResultSet rst=st.executeQuery("select *from database.department   ; ");
			while(rst.next())
			{
				System.out.print("deptId  :"  +  rst.getInt(1));
				System.out.print("dName is:" +  rst.getString(2));
				System.out.print("dLimit : "  + rst.getInt(3));

				System.out.println();


			}

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}


	}

	private static Connection getConnection() throws SQLException {
		// TODO Auto-generated method stub
		Connection con=null;
		con=DatabaseConnection.getInstance().getConnection();
		return con;
	}





}
