package com.shahaf.jsp;


import java.util.*;

import org.apache.jasper.JasperException;

import java.sql.*;
public class database 
{
	public static int n = 0;
	public static String t = "";
	public static void ct(String title) throws Exception, SQLException, JasperException
	{
		t = title;
	}
	public static void cnp(int num) throws Exception, SQLException, JasperException
	{
		n = num;
	}
	public static int getNum() throws Exception, SQLException
	{
		return n;
		
	}
	public static String getT() throws Exception, SQLException
	{
		return t;
	}
	public static void editEvent(String title, int numPartic) throws Exception, SQLException
	{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/javaHonors?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "MMB3189@A");
		Statement st = c.createStatement();
	}
	public static void addEvent(String title, String date, String org, String numP) throws SQLException, Exception, JasperException
	{
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/javaHonors?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "MMB3189@A");
		Statement st = c.createStatement();
		
		String sql = "INSERT INTO events (title, date, organization, numParticipants) VALUES ('" + title + "', '" + date + "', '" + org + "', '" + numP + "')";
		st.executeUpdate(sql);
		
		st.close();
		c.close();
		
	}
	public static void createEvent(String title) throws SQLException, Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/javaHonors?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "MMB3189@A");
		Statement st = c.createStatement();
		if(title != null)
		{
			String sql2 = "CREATE TABLE " + title + " (member varchar(255), item varchar(255), contactInfo varchar(255))";
			st.executeUpdate(sql2);
		}
		
		st.close();
	}
	public static ArrayList<ArrayList<String>> showEvents() throws Exception, SQLException
	{
		// rely on th efact that there are no null values from the create event form
		// create an arrayLIst of arraylists - kinda risky tho
		//ArrayList<ArrayList<String>> events = new ArrayList<ArrayList<String>>();
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost/javaHonors?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "MMB3189@A");
		Statement st = c.createStatement();
		
		// create arraylist of the titles
		ArrayList<String> event = new ArrayList <String>();
		ArrayList<ArrayList<String>> events = new ArrayList <ArrayList<String>>();
		String sql = "SELECT * FROM events";
		ResultSet rs = st.executeQuery(sql);
		String title ="";
		String date = "";
		String group = "";
		String amount = "";
		
			
		while(rs.next())
		{
			
				title = rs.getString("title");
				event.add(title);
				
				date = rs.getString("date");
				event.add(date);
				
				group = rs.getString("organization");
				event.add(group);
				
				amount = rs.getString("numParticipants");
				event.add(amount);
				
			if(title != null)
			{
				events.add(event);

			}
			
			
		}
		
		return events;
		
	}
	public Connection getCon() throws SQLException, Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/javaHonors", "root", "MMB3189@A");
		return con;
	}
	public Statement getStt() throws SQLException, Exception
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection c = this.getCon();
		Statement st = c.createStatement();
		return st;
	}

	
}
