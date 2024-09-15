<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>show_report</title>
</head>
<body>
	<center>
		<h1>Welcome to Report Page</h1>
		<br>
		<h1 style='color: green'>Name is: ${name }</h1>
		<h1 style='color: green'>Age is: ${age }</h1>
		<h1 style='color: green'>Address is: ${address }</h1>

		<c:forEach var="country" items="${countryNames}">
			${country}<br />
		</c:forEach>

		<hr />
		<h1 style='color: red; text-align: center;'>Displaying List
			values</h1>
		<b>SubjectNames</b><br />
		<c:forEach var="subject" items="${subjectList}">
			${subject}<br />
		</c:forEach>
		<hr />
		<h1 style='color: red; text-align: center;'>Displaying Set values</h1>
		<b>MobileNumbers</b><br />
		<c:forEach var="mobile" items="${mobileSet}">
			${mobile}<br />
		</c:forEach>

		<hr />
		<h1 style='color: red; text-align: center;'>Displaying Set values</h1>
		<b>IDInfo</b><br />
		<c:forEach var="id" items="${idsMap}">
			${id.key} ======> ${id.value }<br />
		</c:forEach>
		--%>

	</center>
</body>
</html>