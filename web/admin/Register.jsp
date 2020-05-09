<%-- 
    Document   : Register
    Created on : Mar 18, 2019, 9:35:03 PM
    Author     : Zahrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>register</h1>
        <form method="post" action="User_Controller"  enctype="multipart/form-data" >
            <table border="1">
                 <tr>
                    <td> User ID </td>
                    <td><input type="text" readonly="readonly" name="id" value="<c:out value="${User.userid}" />" /> </td> 
                </tr>
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="name" value="<c:out value='${User.userName}' />" ></td>
                </tr>
                <tr>
                    <td>Address </td>
                    <td><input type="text"  name="address" value="<c:out value='${User.address}' />" ></td>
                </tr>
                 <tr>
                    <td>Phone Number</td>
                    <td><input type="text" name="phoneNo" value="<c:out value='${User.phoneNo}' />"></td>
                </tr>
                <tr>
                    <td>Email </td>
                    <td><input type="text"  name="email" value="<c:out value='${User.email}' />" ></td>
                </tr>
                 <tr>
                    <td>Password </td>
                    <td><input type="text" name="password" value="<c:out value='${User.password}' />" ></td>
                </tr>
                <tr>
                    <td>Image </td>
                    <td><input type="file"  name="file" value="<c:out value='${User.image}' />" ></td>
                </tr>
                
                  <input type="submit" value="Register" />
            </table>            
        </form>
    </body>
</html>
