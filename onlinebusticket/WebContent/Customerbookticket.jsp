<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
label{
width:100px;
display:inline-block;
}

</style>
</head>
<body style="background-color:#92a8d1;">
<h1 >Welcome To Customer Book Ticket Page</h1>
<hr>
<form action="customerBookticketservlet">
<label for="cid">Customer ID:</label>
<input type="text" id="cid" name="cid" required><br><br>
<label for="name">Name:</label>
<input type="text" id="name" name="name" required><br><br>
<label for="Gender">Gender:</label>
<input type="radio" name="gender" value="Male">Male
<input type="radio" name="gender" value="Famale">Female<br>

<label for="email">Email:</label>
<input type="text" id="email" name="email" required><br><br>

<label for="date">Date:</label>
<input type="text" id="date" name="date" required><br><br>
<label for="busname">BusName:</label>
<input type="text" id="busname" name="busname" required><br><br>

<label for="fromplace">FromPlace:</label>
<input type="text" id="fromplace" name="fromplace" required><br><br>
<label for="toplace">ToPlace:</label>
<input type="text" id="toplace" name="toplace" required><br><br>
<input type="submit" value="Submit">
</form><br>
<a href="busindex.jsp"><input type="submit" value="BACK"></a>

</body>
</html>

