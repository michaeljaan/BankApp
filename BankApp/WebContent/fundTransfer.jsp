<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Fund Transfer</title>
</head>
<div>
	<jsp:include page="header.jsp"></jsp:include>
</div>
<body>
<div align= "center">
<p>${requestScope.reciever}</p><p> received </p><p>${requestScope.amount}</p><p>from</p><p>${requestScope.sender}successfully.</p>
</div>
<div>
	<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>