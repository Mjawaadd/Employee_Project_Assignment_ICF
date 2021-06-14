<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h2> update Education details</h2> <br/>
<form action="updateEducation" method="post">

Id<input type="text" name="id" value="${education.id }" readonly/><br/>
Employment Id:<input type="text" name="employementId" value="${education.employementId }" readonly ><br/>
Type Of Course:<input type="text" name="typeCourse" value="${education.typeCourse }"/><br/>
Start Date:<input type="text" name="startDate" value="${education.startDate }"/><br/>
End Date:<input type="text" name="endDate" value="${education.endDate }"/><br/>
Type Of Education:<input type="text" name="typeEducation" value="${education.typeEducation }"/><br/>
	
Institution:<input type="text" name="institution" value="${education.institution }" readonly/><br/>
Address:<input type="text" name="address" value="${education.address }"/><br/>
Percentage:<input type="text" name="percentage" value="${education.percentage }" readonly/><br/>
<input type="submit" value="update"/>

</form>


${msg }



<a href="displayEducation">Click here to see all Education</a>

</body>
</html>