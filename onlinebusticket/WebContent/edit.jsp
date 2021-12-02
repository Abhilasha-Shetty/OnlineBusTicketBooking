<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body style="background-color:#92a8d1;">
	<h1>Edit User</h1><hr>
	<form action="Manageredit.jsp">
	<input type="text" name="cid" value="<c:out value="${customerbean.getCid()}"></c:out>"><br>
	<input type="text" name="name" value="<c:out value="${customerbean.getName()}"></c:out>"><br>
	<input type="text" name="gender" value="<c:out value="${customerbean.getGender()}"></c:out>"><br>
	<input type="text" name="email" value="<c:out value="${customerbean.getEmail()}"></c:out>"><br>
	
	<input type="text" name="date" value="<c:out value="${customerbean.getDate()}"></c:out>"><br>
	<input type="text" name="busname" value="<c:out value="${customerbean.getBusname()}"></c:out>"><br>
	<input type="text" name="fromplace" value="<c:out value="${customerbean.getFromplace()}"></c:out>"><br>
	<input type="text" name="toplace" value="<c:out value="${customerbean.getToplace()}"></c:out>"><br>
	<input type="submit" value="Edit USER">
	</form>
	<a href="Adminlog.jsp"><input type="submit" value="BACK"></a>

</body>
</html>