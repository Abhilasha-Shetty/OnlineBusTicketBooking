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
<h1>Admin</h1>
<hr>
<form action="Adminlog.jsp" method="post">
<label for="email">Email:</label>
<input type="text" id="email" name="email" required><br><br>
<label for="password">Password:</label>
<input type="password" id="password" name="password" required pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z]).{8,}" title="Must contain at least one number and one uppercase and lowercase letter, and at least 5 or more characters" required><br><br>
<input type="submit" value="Submit">
</form><br>
<a href="busindex.jsp"><input type="submit" value="BACK"></a>
</body>
</html>