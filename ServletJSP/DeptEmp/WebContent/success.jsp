<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html xmlns:c="http://java.sun.com/jsp/jstl/core"
    xmlns:fn="http://java.sun.com/jsp/jstl/functions" >
    <head><title>Hello ${userName}</title></head>
    <body style="text-align: center;">
   <c:choose>
   	<c:when test="${not empty invalidUser and !invalidUser}">
	    <h2>Welcome ${userName} </h2>
		<a href="/DeptEmp/logout" >Log out</a>
	    <table align="center">
		    <tr><td>
	   		<a href="/DeptEmp/addDepartment.jsp">Add Department</a>
		    </td></tr>
		    <tr><td>
	   		<a href="/DeptEmp/addEmployee.jsp">Add Employee</a>
		    </td></tr>
	    </table>
 	</c:when>
   	<c:otherwise>
   		Please Log in first.<a href="/DeptEmp" >Log in</a>
   	</c:otherwise>
   	</c:choose>
   </body>
</html>