package com.CollegeApp.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {
	String driver="com.mysql.cj.jdbc.Driver";
	String url="jdbc:mysql://localhost:3306/database";
	String user="root";
	String pwd="Mahadeva@123";
	private static DatabaseConnection con=null;
	private DatabaseConnection()
	{
		try
		{
			Class.forName(driver);

		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
	public java.sql.Connection getConnection() throws SQLException
	{
		Connection conn=null;
		conn=DriverManager.getConnection(url,user,pwd);
		return conn;

	}
	public static DatabaseConnection getInstance()
	{
		if(con==null)
		{
			con=new DatabaseConnection();
		}
		return con;
	}


}
