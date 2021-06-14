<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Create Employee</h2>
	
	<form action="saveEmployee" method="post">
	
	
	First Name:<input type="text" name="firstName"/><br/>
	Last Name:<input type="text" name="lastName"/><br/>
	Employment Id:<input type="text" name="employementId"/><br/>
	Start Date:<input type="text" name="startDate"/><br/>
	Designation:<input type="text" name="designation"/><br/>
	Department:<input type="text" name="department"/><br/>
	End Date:<input type="text" name="endDate"/><br/>
	Status:<input type="text" name="eStatus"/><br/>
	DOB:<input type="text" name="DOB"/><br/>
	Reporting Manager:<input type="text" name="reportingManager"/><br/>
	
	Gender:
	Male<input type="radio" name="gender" value="Male"/><br/>
	Female<input type="radio" name="gender" value="Female"/><br/>
	
	Blood Group:<input type="text" name="bloodGroup"/><br/>
	Address:<input type="text" name="address"/><br/><br/><br/>

	<input type="submit"  value="save Employee"/>
	</form>
	
	${msg}
	
	<a href="displayEmployee">Click here to see all locations</a>

</body>
</html>