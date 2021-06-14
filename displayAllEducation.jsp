<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
      <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
      
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>Display Education  Details</h2>
	 <table border='1'>
      <tr>
          <th>ID</th>
          <th>Employment ID</th>
          <th>typeCourse</th>
          <th>startDate</th>
          <th>endDate</th>
           <th>typeEducation</th>
          <th>institution</th>
          <th>address</th>
          <th>percentage</th>
          
          
          <th>DELETE</th>
          <th>UPDATE</th> 
          
        
     </tr>
     <c:forEach items="${education}" var="education">
   <tr>
    <td>${education.id }</td>
    <td>${education.employementId }</td>
    <td>${education.typeCourse }</td>
    <td><fmt:formatDate value="${education.startDate}" pattern="yyyy-MM-dd"/></td>
    <td><fmt:formatDate value="${education.endDate}" pattern="yyyy-MM-dd"/></td>
      <td>${education.typeEducation }</td>
       <td>${education.institution }</td>
    <td>${education.address }</td>
    <td>${education.percentage }</td>
    
    
   
   <td><a href="delEducation?id=${education.id }">Delete</a></td>
	<td><a href="editEducation?id=${education.id }">Edit</a></td>
    
     </tr>
    </c:forEach>
       
      </table>

</body>
</html>