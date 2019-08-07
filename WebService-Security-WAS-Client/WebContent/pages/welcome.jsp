<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>WebService Client</title>
</head>
<body>
	<font style="color: red; speak: normal;">${requestScope.message }</font>
	<h2>Say Hello to....</h2>
	<form action="" method="post">
		<input type="text" name="user" />
		<input type="hidden" name="flag" value="hello"/>
		<br><br>
		<input type="submit" value="Say Hello" />
	</form>
	
	<hr align="left" width="400px" size="2px" color="black"/>
	
	<h2>Say GoodBye to....</h2>
	<form action="" method="post">
		<input type="text" name="user" />
		<input type="hidden" name="flag" value="bye"/>
		<br><br>
		<input type="submit" value="Say Hello" />
	</form>
	
</body>
</html>