
package com.sto;

import java.sql.*;
import java.util.*;

public class DB_Connection 
{
	public static void main(String[] args) throws Exception
	{
		try {
			DB_Connection obj_DB_Connection = new DB_Connection();
			Connection connection = null;
			
			connection = obj_DB_Connection.getCon();
			System.out.println(connection);
		}
		catch(Throwable t) {
			System.out.println("FAILURE");
			throw t;
			
		}
		
		System.out.println("Passes");
	}
	
	public Connection getCon()
	{
		Connection conn = null;
		
		try
		{
			
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "MMB3189@A");
		
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
		
		
		return conn;
		
	}
}
