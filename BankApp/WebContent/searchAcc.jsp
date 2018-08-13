<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Window</title>
</head>
<div>
	<jsp:include page="header.jsp"></jsp:include>
</div>
<body>
<div id="check" align="center">
		<form id="search" action="searchAcc.app">
		<table>
		<tr><td>Enter Account Number:</td><td><input type ="number" id="accNo" name="accNo" required="required"></td></tr>
		<tr><td><input type="submit" value="Search"></td></tr>
		</table>
		</form>
	</div>
<div>
	<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>