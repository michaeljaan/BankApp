<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Transfer Window </title>
</head>
<div>
	<jsp:include page="header.jsp"></jsp:include>
</div>
<body>
<div align="center">
<form action="transfer.app">
<h4 align="center">Tranfer amount</h4>
<table>
<tr><td>Enter Your Account Number :</td><td><input type="number" min="101" name="sender" required="required"></td></tr>
<tr><td>Enter receiver account no:</td><td><input type="number" min="101" name="reciever" required="required"></td></tr>
<tr><td>Enter amount:</td><td><input type="number"  name="amount" min="1" required="required"></td></tr>
<tr><td><input type="submit" value="Transfer"></td></tr>
</table>
</form>
</div>
<div>
	<jsp:include page="footer.jsp"></jsp:include>
</div>
</body>
</html>