<html>

<head>
	<style>
	</style>
</head>

<body>
	<h1> TEST FOR STOODENT 2 </h1>
	<button onclick = "testFunction()"> SUBMIT </button>
	<input type = "text" placeholder = "PLACEHOLDER" class = "inputTest" id = "inputID">
	<h4> TESTING INPUT </h4>

	<script>
		function testFunction()
		{

			var test = document.getElementeById("inputID").value;
			var newTest = <% = "quiz" %>;
			console.log(test + "HOLA YALL");
			alert(test + "JUST TESTING" + newTest);
			console.log(newTest);
		}
	</script>
</body>

</html>