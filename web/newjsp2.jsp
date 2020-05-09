<%-- 
    Document   : customer
    Created on : Mar 23, 2019, 12:10:06 AM
    Author     : Zahrana
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Show All Users</title>
</head>
<body>
    <table border=1>
        <thead>
            <tr>
                <th>User Name</th>
                <th>Pet Name</th>
                <th>Veterinarian</th>
                <th>Vaccine Name</th>
                <th>Vaccine Description</th>
                <th>Last Vaccine Date</th>
                <th>Email</th>
               
            </tr>
        </thead>
        
        <tbody>
        <form action="sendEmail" method="GET">
            <c:forEach items="${user}" var="user">
                <tr>
                    <td><input type="text" name="userName" value="<c:out value="${user.username}" />"/></td>
                    <td><input type="text" name="petName${counter.index}" value="<c:out value="${user.petName}" />" /></td>
                    <td><input type="text" name="veterinarian" value="<c:out value="${user.veterinarian}" />" /></td>
                    <td><input type="text" name="vaccineName" value="<c:out value="${user.vaccineName}" />" /></td>
                    <td><input type="text" name="description" value="<c:out value="${user.description}" />" /></td>
                    <td><input type="text" name="lastDate" value="<c:out value="${user.lastDate}" />" /></td>
                    <td><input type="text" name="email" value="<c:out value="${user.email}" />" /></td>
                    <td><input type="checkbox" name="checkBox" value="<c:out value="${user.vaccineId}" />"  /></td>             
                   
                </tr>
            </c:forEach>
       
                                 <tr>
                     <td><input type="submit" value="submit" name="submit"/></td>
                </tr>
            </form>
        </tbody>
    </table>
   
</body>
</html>