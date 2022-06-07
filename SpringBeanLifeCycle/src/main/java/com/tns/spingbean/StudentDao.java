package com.tns.spingbean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class StudentDao
{
	private String driver;
	private String URL;
	private String username;
	private String password;
	
	
	public void setDriver(String driver) {
		this.driver = driver;
	}


	public void setURL(String uRL) {
		URL = uRL;
	}


	public void setUsername(String username) {
		this.username = username;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	public void selectAllRows() throws SQLException, ClassNotFoundException
	{
		//load driver
		Class.forName(driver);
		
		//get Connection
		Connection con=DriverManager.getConnection(URL, username, password);
		
		//execute a query
		Statement s=con.createStatement();
		ResultSet r=s.executeQuery("SELECT * FROM capgemini1.enggstud1");
		
		while(r.next())
		{
			int userid=r.getInt(1);
			String username=r.getString(2);
			System.out.println("Student ID: "+userid+ " And Name is: "+username);
		}
		
		
	}
}
