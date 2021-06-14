<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%> 
    <%@ page import="java.util.Date" %> 
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
     <%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>display page</title>
</head>
<body>
<h1>Displaying All the emp details</h1>

     
      <table border='1'>
      <tr>
          <th>ID</th>
          <th>FIRST NAME</th>
          <th>LAST NAME</th>
          <th>Employment ID</th>
          <th>START DATE</th>
          <th>DESIGNATION</th>
          <th>DEPARTMENT</th>
          <th>END DATE</th>
          <th>STATUS</th>
          <th>DOB</th>
          <th>REPORTING MANAGER</th>
          <th>GENDER</th>
          <th>BLOOD GROUP</th>
          <th>ADDRESS</th>
          <th>Add Details</th>
          <th>Delete</th>
          <th>Edit</th>
          
          
        
     </tr>
     <c:forEach items="${employee}" var="employee">
   <tr>
    <td>${employee.id }</td>
    <td>${employee.firstName }</td>
    <td>${employee.lastName }</td>
     <td>${employee.employementId }</td>
    <td><fmt:formatDate value="${employee.startDate}" pattern="yyyy-MM-dd"/></td>
    <td>${employee.designation }</td>
    <td>${employee.department }</td>
    <td>
   <fmt:formatDate value="${employee.endDate}" pattern="yyyy-MM-dd"/> 
       </td>
    <td>${employee.eStatus }</td>
    <td><fmt:formatDate value="${employee.DOB}" pattern="yyyy-MM-dd"/></td>
    <td>${employee.reportingManager }</td>
    <td>${employee.gender }</td>
    <td>${employee.bloodGroup }</td>
    <td>${employee.address }</td>
    
    <td><a href="addDetails?id=${employee.id }">Add DependantANDEducation Details</a></td>
    <td><a href="delEmployee?id=${employee.id}">Delete Employee</a></td>
    <td><a href="editEmployee?id=${employee.id}">Edit Employee</a></td>
   
    
     </tr>
    </c:forEach>
       
      </table>

</body>
</html>