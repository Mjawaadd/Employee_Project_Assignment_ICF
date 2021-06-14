<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Add Dependant Details</h2>
	
	
	
	<form action="saveDependants" method="post">
	
	Employement id:<input type="text" name="employementId"/><br/>
	
	
	
	First Name:<input type="text" name="firstName"/><br/>
	Last Name:<input type="text" name="lastName"/><br/>
	
	Gender:<br/>
	Male<input type="radio" name="gender" value="Male"/><br/>
	Female<input type="radio" name="gender" value="Female"/><br/>
	
	DOB:<input type="text" name="DOB"/><br/>
	Relationship:<input type="text" name="relationship"/><br/>
	<input type="submit" value="save"/><br/>
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
</form>




</body>
</html>