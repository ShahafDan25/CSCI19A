<DOCTYPE! html>
<html> 
<head>
	<title> JSP form to call javascript </title>
</head>

<body class = "body">
	


	<!-- SCRIPTING BEGINS HERE -->

	



	<!-- JAVA CODE -->
	<%@page import = "com.Admin"%>
	<% 
		Admin a = new Admin();
		Admin.insertStudent(09871234, "test", "numberThree", "TESTING");

	%>
	<h3><b> the first name is:</b> <%= request.getParameter("first")%></h3>
</body>

</html>
