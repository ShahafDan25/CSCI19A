<%@ page import = "com.shahaf.jsp.*" %>
<%@ page import = "java.sql.*" %>

<html>
	<head>
		<title> Stoodent Manager </title>
		<style>
		.container
		{
		
			text-align: center !important;
			
			padding: 7px;
			background-color: rgba(255, 255, 255, 80);
		}
			.button
			{
				background-color: blue !important;
				color: white;
				padding: 7px;
				margin: 5px;
				border-1px solid black;
				border-radius: 7px;
				text-align: center !important;
				width: 25%;
			}
			.underline
			{
				text-decoration: underline;
			}
			.center
			{
				text-align: center;
			}
			
		</style>
	</head>
	<body class = "body">
		<div class = container>
			<h2 class = "underline fonty center"><strong> Welcome to your events application! </strong></h2>
			<button class = "button" id = "manageEvent" onclick = "goToAdder()"><strong> Create Event </strong></button>
			<br>
			<button class = "button" id = "manageEvent" onclick = "goToManager()"><strong> Manage Your Events </strong> </button>
			<br>
			<h3 class = "underline fonty center"><strong> Upcoming Events </strong></h3>
		</div>
		
		
		<script type = "text/javascript">
			
			function goToManager()
			{
				window.open("manageEvents.jsp");
			}
			function goToAdder()
			{
				window.open("addEventForm.jsp");
			}
		</script>
	</body>
</html> 