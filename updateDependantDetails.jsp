<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2> update Employee details</h2>
<form action="updateDependant" method="post">

Id<input type="text" name="id" value="${dependants.id }" readonly/><br/>
Employment Id:<input type="text" name="employementId" value="${dependants.employementId }" readonly ><br/>
First Name:<input type="text" name="firstName" value="${dependants.firstName }"/><br/>
Last Name:<input type="text" name="lastName" value="${dependants.lastName }"/><br/>
Gender:
	Male<input type="radio" name="gender" value="Male"/><br/>
	Female<input type="radio" name="gender" value="Female"/><br/>
DOB<input type="text" name="DOB" value="${dependants.DOB }" readonly/><br/>
Relationship<input type="text" name="relationship" value="${dependants.relationship }"/><br/>

<input type="submit" value="update"/>

</form>


${msg }



<a href="displayDependant">Click here to see all employee</a>
	
</body>
</html>