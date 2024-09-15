<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>list Customer</title>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css" />
</head>
<body>
	<div id="wrapper">
		<div id="header">
			<h2>CRM - Customer Relationship Manager</h2>
		</div>
	</div>
	<div id="container">
		<div id="content">
		<!-- put new button:: Add Customer -->
			<input type='button' value='Add Customer'
				onclick="window.location.href='showForm'; return false;"
				class="add-button" />

			<table>
				<tr>
					<th>First Name</th>
					<th>Last Name</th>
					<th>Email</th>
					<th>Action</th>
				</tr>
				<c:forEach  var="customer" items="${customers}">
				<c:url var="updateLink" value="/customer/showFormForUpdate">
					<c:param name="customerId" value="${customer.id }"></c:param>
				</c:url>
				
				<c:url var="deleteLink" value="/customer/showFormForDelete">
					<c:param name="customerId" value="${customer.id }"></c:param>
				</c:url>
					<tr>
						<td>${customer.firstName }</td>
						<td>${customer.lastName}</td>
						<td>${customer.email}</td>
						<td>
							<a style="text-decoration: none" href='${updateLink }'>Update</a> | 
							<a style="text-decoration: none" href='${deleteLink }' 
							onclick="if(!(confirm('Are you sure you want to delete this Customer ?'))) return false;"
							>Delete</a>
						</td>
					</tr>
				</c:forEach>
				</div>
				</div>
</body>
</html>