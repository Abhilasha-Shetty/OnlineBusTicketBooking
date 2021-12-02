<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<style>
	table,td{
	border:1px solid black;
	border-collapse:collapse;
	
	}
	table.center{
	margin-left:auto;
	margin-right:auto;
	}

</style>
</head>
<body  style="background-color:#92a8d1;">
<h1>Welcome to customer portal</h1>
<hr/>

<c:out value="${msg}"></c:out>


<table class="center">
			<tr>
				
				<td>cid</td>
				<td>name</td>
				<td>gender</td>
				<td>email</td>
				
				<td>date</td>
				<td>busname</td>
				<td>fromplace</td>
				<td>toplace</td>
				<td>edit</td>
				<td>delete</td>
			
	<c:forEach var="p" items="${list}">		

	<tr>
		<td><c:out value="${p.cid}"></c:out></td>
		<td><c:out value="${p.name}"></c:out></td>
		<td><c:out value="${p.gender}"></c:out> </td>
		<td><c:out value="${p.email}"></c:out> </td>
		
		<td><c:out value="${p.date}"></c:out> </td>
			<td><c:out value="${p.busname}"></c:out> </td>
		<td><c:out value="${p.fromplace}"></c:out> </td>
		<td><c:out value="${p.toplace}"></c:out> </td>
		
		<td><a href="EditcustomerServlet?cid=${p.cid}">Edit</a></td>
		<td><a href="DeleteServlet?cid=${p.cid}">Delete</a></td>
	</tr>
    </c:forEach>

		
		</table>
		<a href="Adminlog.jsp"><input type="submit" value="BACK"></a>
		<a href="busindex.jsp"><input type="submit" value="Logout"></a>

</body>
</html>