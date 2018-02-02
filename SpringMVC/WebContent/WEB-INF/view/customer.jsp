<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>
	.error{color:red}
</style>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Customer form</title>
</head>
<body>
<!-- no need /customer/processForm ?? -->
<form:form action="processForm" modelAttribute="customer">
	First Name:<form:input path="firstName"/>
	<br><br>
	
	Last Name(*):<form:input path="lastName"/>
	<form:errors path="lastName" cssClass="error"/>
	<br><br>
	
	Free passes:<form:input path="freePass"/>
	<form:errors path="freePass" cssClass="error"/>
	<br><br>
	
	PostCode:<form:input path="postCode"/>
	<form:errors path="postCode" cssClass="error"/>

	<br><br>
	<input type="submit" value="Submit"/>
</form:form>
</body>
</html>