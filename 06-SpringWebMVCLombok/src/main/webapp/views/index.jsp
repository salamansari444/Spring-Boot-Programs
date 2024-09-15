<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Message</title>
</head>
<body>
<h1 style="text-align:center";>Welcome to Books Store</h1>
	<form action="/save" method="post">
		<table border='1' align='center'>
			<tr>
			<td>Book Name :</td>
			<td><input type='text' name='bname'></td>
			</tr>
			<tr>
			<td>Author Name :</td>
			<td><input type='text' name='authorname'></td>
			</tr>
			<tr>
			<td>Book Price :</td>
			<td><input type='text' name='bprice'></td>
			</tr>
			<tr>
			<td></td>		
			<td><input type='submit' value='submit'></td>
			</tr>
		</table>
	</form>

</table>
</body>
</html>