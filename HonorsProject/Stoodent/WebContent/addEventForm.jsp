<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import = "com.shahaf.jsp.*" %>
<%@ page import = "java.sql.*" %>
<%@ page import = "java.io.*" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>add Event Form</title>
	<style>
		.form
		{
			text-align: center;
			width: 70%;
			border: 1px solid black;
			padding: 10px;
			margin: 5px;
			border-radius: 7px;
		}
		.input
		{
			width: 85%;
			height: 20%;
			border: 1.5px solid black;
			border-radius: 7px;
			align: center;
		}
		.btn
		{
			border: 1px solid black;
			border-radius: 10px;
			color: white;
			height: 10%;
			width: 35%;
			background-color: blue;
		}
		.button
		{
			border: 1px sollis black;
			border-radius: 8px;
			color: white;
			background-color: blue;
			
		}
		
		
	</style>

	<!--  ICOM LINK HERE -->
	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
	
	<!--  BOOTSTRAP LINK HERE -->
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>


<body>
	<button class = "button fa fa-home" id = "goBack" onclick = "goBack()"> Home </button>
	<form class = "form" id = "addNew">
	
		<h2> Create a new event! </h2> <br>
		<a> Enter Title </a> <input type = "text" id = "titleInput" name = "titleInput" class = "input"><br>
		<br>
		<a> Pick Date </a> <input type = "date" id = "dateInput" name = "dateInput" class = "input"><br>
		<br>
	
		<a> For what organization? </a> <input type = "text" id = "orgaInput" name = "orgaInput" class = "input"><br>
		<br>
		<a> How many participants? </a> <input type = "text" id = "numParticipants" name = "numParticipants" class = "input"><br>
		<br>
		<button onclick = "submitNeW()" class = "button" id = "submitNew" name = "submitNew">Submit </button>
	
	</form>

	
	<script>
		function submitNew()
		{
			var i1 = document.getElementById("titleInput").length == 0;
			var i2 = document.getElementById("dateInput").length ==0;
			var i3 = document.getElementById("orgaInput").length ==0;
			var i4 = document.getElementById("numParticipants").length ==0;
			if(!i1 || !i2 || !i3 || !i4)
			{
				alert("Please Fill in all the input fields");
				<% System.out.println("SOrry, fill out all the input fields"); %>
				console.log("Please fill in all the input field before submitting the form");
			}
			else
			{
				<%
				
				// 1. create variables
				// 2. call the function addEvent() in the database class
				String name = request.getParameter("titleInput");
				String date = request.getParameter("dateInput");
				String organization = request.getParameter("orgaInput");
				String numP = request.getParameter("numParticipants");
				com.shahaf.jsp.database.addEvent(name, date, organization, numP);
 		//		com.shahaf.jsp.database.createEvent(name);
				
				%>
				alert("New Event Submitted, Thank You!");
				
			}
			
		}
		function goBack()
		{
			window.open("home.jsp");
		}
	</script>
		
	
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
</body>
</html>