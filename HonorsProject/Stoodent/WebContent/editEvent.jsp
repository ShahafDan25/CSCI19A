<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
         <%@ page import = "com.shahaf.jsp.*" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "java.util.*" %>
    
<!DOCTYPE html>
<html>
	<head>
	<meta charset="UTF-8">
	<title>Manage your events!</title>
	
		<style>
			.table
			{	
				border: 1px solid black;
				border-radius: 10px;
				padding: 5px;
				margin: 5px;
				
				
			}
		</style>
	</head>
	<body>
		<h2> Here the event you chose, you are more than welcome to edit it]</h2>
		<table class = "table" id = "event">
		<tr>
		<th> # </th>
		<th> Name </th>
		<th> Item </th>
		</tr>
			<% for(int i = 0; i < com.shahaf.jsp.database.getNum(); i++)
				{
					%> <tr><td> <% 
					out.print(i +":  "); %> 
					</td> <td> <input type = "text" class = "input" id = "nameInput"> </td>
					<td> <input type = "text" class = "input" id = "itemInput"> </td>
					<br>
					<%} %>
				
				
				
				</table>
		
	</body>
</html>