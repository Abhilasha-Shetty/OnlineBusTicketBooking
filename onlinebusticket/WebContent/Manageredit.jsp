<%@page import="com.service.CustomerServiceimpl"%>
<%@page import="com.service.CustomerService"%>
<%@page import="com.bean.CustomerBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
	String cid=request.getParameter("cid");
	String name=request.getParameter("name");
	String gender=request.getParameter("gender");
	String email=request.getParameter("email");
	
	
	String date=request.getParameter("date");
	String busname=request.getParameter("busname");
	
	String fromplace=request.getParameter("fromplace");
	String toplace=request.getParameter("toplace");
	CustomerBean customerbean = new CustomerBean(cid,name,gender,email,date,busname,fromplace,toplace);
	CustomerService customerservice =new CustomerServiceimpl();
	customerservice.updatecustom(customerbean);
	response.sendRedirect("AlldatacustomerServlet");
%>

</body>
</html>