<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@ page import = "com.shahaf.jsp.*" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
	<title>Manage all of your events here!</title>
	<style>
		.table
		{
			border: 1px solid black;
		}
		.button
		{
			background-color: blue;
			color: white;
			border-radius: 10px;
			border: 1px solid black;
			padding: 5px;
			margin: 1px;
			
		}
	</style>
	
	<!--  ICON LINK HERE -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>
	<body>
		<h2> Manage your events here!</h2>
			<table id = "events" class = "table" name = "events"><thead>
				<tr>
					<th> Event </th>
					<th> Date </th>
					<th> Group </th>
					<th> Participants </th>
					<th> Edit </th>
				</tr>
				</thead>
				<tbody>
				<%
				
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection c = DriverManager.getConnection("jdbc:mysql://localhost/javaHonors?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC", "root", "MMB3189@A");
				Statement st = c.createStatement();
				String sql = "SELECT * FROM events";
				ResultSet rs = st.executeQuery(sql);
				String title = "";
				String date = "";
				String group = "";
				String amount = "";
				int count = 0;
				while(rs.next())
				{
					/* if(rs.getString("title") == "null")
					{
						rs.next();	
					} */
					title = rs.getString("title");
					date = rs.getString("date");
					group = rs.getString("organization");
					amount = rs.getString("numParticipants");
					%>
					<tr>
						<td><%out.println(title); %></td>
						<td><%out.println(date); %></td>
						<td><%out.println(group); %></td>
						<td><%out.println(amount); %></td>
						<td>
						<button class = "button" onclick = "editEvent()" > Edit </button>
						</td>
						
						
					</tr>
					<%} c.close(); st.close();%>
				</tbody>
			</table>
		<script type = "text/javascript" src = " newEvent.js"> </script>
		<script type = "text/javascript">
	
		
		
			function editEvent(title, amount)
			{
				
				
				window.open("manageEvent.jsp");
			} 
			
			
			
			</script>
	</body>
</html>