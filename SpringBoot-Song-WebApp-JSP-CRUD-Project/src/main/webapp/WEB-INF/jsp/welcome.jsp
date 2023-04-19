<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Home Page</title>
</head>
<body>

	<div class="container">
		<%@ include file="header.jspf"%>
		<%@ include file="navigation.jspf"%>
		<div class="panel panel-primary">
			<div class="panel-heading">Home Page</div>
			<div class="panel-body">
				Welcome ${name} <br> <a href="/list-songs">Click here</a> to
				manage your Songs.
			</div>
		</div>
	</div>
	<%@ include file="footer.jspf"%>
</body>
</html>