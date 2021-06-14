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

<h2>Display Dependants Details</h2>
	 <table border='1'>
      <tr>
          <th>ID</th>
          <th>Employment ID</th>
          <th>FIRST NAME</th>
          <th>LAST NAME</th>
          <th>GENDER</th>
           <th>DOB</th>
          <th>Relationship</th>
          
          
          <th>DELETE</th>
          <th>UPDATE</th> 
          
        
     </tr>
     <c:forEach items="${dependants}" var="dependants">
   <tr>
    <td>${dependants.id }</td>
    <td>${dependants.employementId }</td>
    <td>${dependants.firstName }</td>
     <td>${dependants.lastName }</td>
     <td>${dependants.gender }</td>
    <td><fmt:formatDate value="${dependants.DOB}" pattern="yyyy-MM-dd"/></td>
    <td>${dependants.relationship }</td>
    
    
   
   <td><a href="delDependant?id=${dependants.id }">Delete</a></td>
	<td><a href="editDependant?id=${dependants.id }">Edit</a></td>
    
     </tr>
    </c:forEach>
       
      </table>

</body>
</html>