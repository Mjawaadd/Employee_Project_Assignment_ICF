<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ page import="java.util.Date" %>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2> update Employee details</h2>
<form action="updateEmployee" method="post">

Id<input type="text" name="id" value="${employee.id }" readonly/><br/>
First Name:<input type="text" name="firstName" value="${employee.firstName }"/><br/>
Last Name:<input type="text" name="lastName" value="${employee.lastName }"/><br/>
Employment Id:<input type="text" name="employementId" value="${employee.employementId }" ><br/>

Start Date:<input type="text"  name="startDate" value="${employee.startDate }" /><br/>
Designation<input type="text" name="designation" value="${employee.designation }" /><br/>
Department<input type="text" name="department" value="${employee.department }"/><br/>
End Date:<input type="text" name="endDate" value="${employee.endDate }" readonly/><br/>
E_Status<input type="text" name="eStatus" value="${employee.eStatus }"/><br/>
DOB<input type="text" name="DOB" value="${employee.DOB }" readonly/><br/>
Reporting Manager<input type="text" name="reportingManager" value="${employee.reportingManager }"/><br/>
Gender:
	Male<input type="radio" name="gender" value="Male"/><br/>
	Female<input type="radio" name="gender" value="Female"/><br/>



Blood Group:<input type="text" name="bloodGroup" value="${employee.bloodGroup }" readonly/><br/>
Address<input type="text" name="address" value="${employee.address }"/><br/>
<input type="submit" value="update"/>

</form>


${msg }



<a href="displayEmployee">Click here to see all employee</a>

</body>
</html>