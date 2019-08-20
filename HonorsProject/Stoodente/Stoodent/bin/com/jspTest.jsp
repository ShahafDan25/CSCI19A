<html>
    <head>
        <title> Hello World Java Test</title>
    </head>

    <body>
        <button onclick = "helloWorld()"> Submit BUtton </button>
        <h1> Hello Java's World</h1>
        <input type = "text" placeholder="This is an input fiedl in html">
        <h3> Hello World of Java </h3>
        The time on the server is <%= new java.util.Date() %> 



        <script type = "text/javascript">
            function helloWorld()
            {
                //var cname = package.com.Admin.getString();
                console.log("This is a test");
                //console.log(cname);
            }
            
        </script>
    </body>
</html>