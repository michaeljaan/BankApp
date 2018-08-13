<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>MM Banking</title>
</head>
<div>
	<jsp:include page="header.jsp"></jsp:include>
</div>
<body>
<div align="center">
<table>
	<tr>
	<td><a href="addNewAccount.app">Add New Account</a></td>
	<td><a href="viewAllCustomers.app">View All Customers</a></td>
	</tr>
	<tr>
	<td><a href="searchAccount.app">Search Account</a></td>
	<td><a href="withdrawAmount.app">Withdraw Amount</a></td>
	</tr>
	<tr>
	<td><a href="depositAmount.app">Deposit Amount</a></td>
	<td><a href="fundTransfer.app">Fund Transfer</a></td>
	</tr>
</table>
</div>
</body>
</html>