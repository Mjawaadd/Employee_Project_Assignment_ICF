<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Employee Details</h2>
	
	
      
  
   Id:${employee.id }<br/>
   First Name:${employee.firstName }<br/>
   Last Name:${employee.lastName }<br/>
   Employement_ID:${employee.employementId }<br/><br/>
  
    <h2>Enter Dependant Details</h2>
   <form action="saveDepAndEdu" method="post">
    Employement <input type="text" name="employementId"/><br/>
	First Name:<input type="text" name="firstName"/><br/>
	Last Name:<input type="text" name="lastName"/><br/>
	
	Gender:<br/>
	Male<input type="radio" name="gender" value="Male"/><br/>
	Female<input type="radio" name="gender" value="Female"/><br/>
	
	DOB:<input type="text" name="DOB"/><br/>
	Relationship:<input type="text" name="relationship"/><br/>
	
	
	<h2>Enter Education Details</h2>
	
	Type of Course:<input type="text" name="typeCourse"/><br/>
	Start Date:<input type="text" name="startDate"/><br/>
	End Date:<input type="text" name="endDate"/><br/>
	Type of Education:<input type="text" name="typeEducation"/><br/>	
	Institution:<input type="text" name="institution"/><br/>
	Address:<input type="text" name="address"/><br/>
	Percentage:<input type="text" name="percentage"/><br/>
	<input type="submit" value="save"/><br/>
	
	
	
	
	
	
	
	
</form>


   
    
     
    

</body>
</html>