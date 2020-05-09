<%-- 
    Document   : customer
    Created on : Mar 23, 2019, 12:10:06 AM
    Author     : Zahrana
--%>

<%@page import="Database.database"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
         <link href="css/small-business.css" rel="stylesheet">
       
        <title>ClientView</title>
        <style>
            #footer{
                padding-bottom:0;
                margin-bottom: 0;
            }
        </style>       
    </head>
    <body>
  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="index.jsp">My Pet</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="index.jsp">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="aboutUs.jsp">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="contactUs.jsp">Contact</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="photoGallery1.jsp">Photo Gallery</a>
          </li>
           <li class="nav-item">
            <a class="nav-link" href="logOut.jsp">LogOut</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>

 <div class="container">
 <div class="row align-items-center my-5">
     
     <%
              
        if(session.getAttribute("username")!= null){
          
            int uid = Integer.parseInt(session.getAttribute("uid").toString());
            Connection con = null;
            PreparedStatement pr = null;
            ResultSet rs = null;
            String sql= null;
            
            try{
                con = database.getConnection();
                sql = "select * from pet where uid=?";
                pr = con.prepareStatement(sql);
                pr.setInt(1, uid);
                rs = pr.executeQuery();
            
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        %>
        
        <table align="center" class="table table-hover">
            
            <tr>
                <th>Image</th> 
                <th>Name</th>
                <th>Type</th>
                <th>Breed</th>
                <th>Action</th>
            </tr>
       
          
             <% while(rs.next()) { %>
            <tr>
                <td><img src="getPetImage.jsp?id=<%=rs.getInt("pid") %>" alt="" width="75px" height="50px"></td>
                <td><%=rs.getString("name") %></td>
                <td><%=rs.getString("type") %></td>
                <td><%=rs.getString("breed") %></td>
                <td><a class="btn btn-outline-info" href="viewDetails.jsp?id=<%=rs.getInt("pid") %>">View Details</a>
                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                    <a class="btn btn-outline-warning" href="petController?action=edit&id=<%=rs.getInt("pid") %>">Edit</a>
                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
                        <a class="btn btn-outline-danger" href="petController?action=delete&id=<%=rs.getInt("pid") %>">Delete</a>  </td>
               
            </tr>
            <% } %>
        </table>
           
          <div class="card-body">
            <a class="btn btn-success" href="petController?action=insert" >Add Pet</a>
        </div>
   
  </div>
 </div>
          
            <% 
                }else 
                    response.sendRedirect("Client.jsp");
            %>
            
<div class="clearfix"></div>

  <footer class="py- bg-dark" >
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; MyPet 2019</p>
    </div>
  </footer> 
   
    </body>
</html>
