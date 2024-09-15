<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Course Page</title>
</head>
<body>
	<h2>books Details are:</h2>
	<table>
		<tr>
			<td>Book Name :</td>
			<td>${book.bname}</td>
		</tr>
		<tr>
			<td>Author Name :</td>
			<td>${book.authorname}</td>
		</tr>
		<tr>
			<td>Book price :</td>
			<td>${book.bprice}</td>
		</tr>
	</table>
	<a href="loading">RE LOAD FORM</a>
</body>
</html>