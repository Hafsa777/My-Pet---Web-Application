<%@page import="java.sql.SQLException"%>
<%@page import="Database.database"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
    <title>Pet management Application</title>
     <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="css/simple-sidebar.css" rel="stylesheet">
</head>
<body>
     <div class="d-flex" id="wrapper">

    <!-- Sidebar -->
    <div class="bg-light border-right" id="sidebar-wrapper">
      <div class="sidebar-heading">My Pet </div>
      <div class="list-group list-group-flush">
        <a href="listUser.jsp" class="list-group-item list-group-item-action bg-light">User Management</a>
        <a href="listPet.jsp" class="list-group-item list-group-item-action bg-light">Pet Management</a>
        <a href="trackingVaccince" class="list-group-item list-group-item-action bg-light">Tracking Vaccine</a>
      </div>
    </div>
    <!-- /#sidebar-wrapper -->

    <!-- Page Content -->
    <div id="page-content-wrapper">

      <nav class="navbar navbar-expand-lg navbar-light bg-light border-bottom">
        <button class="btn btn-primary" id="menu-toggle">Toggle Menu</button>

        <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
          <span class="navbar-toggler-icon"></span>
        </button>

        <div class="collapse navbar-collapse" id="navbarSupportedContent">
          <ul class="navbar-nav ml-auto mt-2 mt-lg-0">
            <li class="nav-item active">
              <a class="nav-link" href="main.jsp">Home <span class="sr-only">(current)</span></a>
            </li>
            <li class="nav-item dropdown">
              <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Action
              </a>
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="viewProfile.jsp">View Profile</a>
                <a class="dropdown-item" href="logOut.jsp">Sign Out</a>
            </li>
          </ul>
        </div>
      </nav>


    
     <%
              
        //if(session.getAttribute("username")!= null){
          
            //int uid = Integer.parseInt(session.getAttribute("uid").toString());
            Connection con = null;
            PreparedStatement pr = null;
            ResultSet rs = null;
            String sql= null;
            
            try{
                con = database.getConnection();
                sql = "select * from pet p ,photogallery ph where p.imId=ph.imId";
                pr = con.prepareStatement(sql);
                rs = pr.executeQuery();
            
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        %>
  
         <div class="container-fluid">
        <table class="table table-hover">
            <tr>
                <th>Image</th>
                <th>Pet Name</th>
                <th>Type</th>
                <th>breed</th>
               <th>Color</th>
                <th>Sex</th>
                <th>Veterinarian</th>
                
            </tr>
              <% while(rs.next()) { %>
            <tr>
                <td><img class="rounded " src="getAllPetImage.jsp?id=<%=rs.getInt("imId") %>" alt="" height="100px" width="150px"/></a></td>     
                <td><%=rs.getString("name") %></a></td>
                <td><%=rs.getString("type") %></td>
                <td><%=rs.getString("breed") %></td>
                <td><%=rs.getString("color") %></td>
                <td><%=rs.getString("sex") %></td>
                <td><%=rs.getString("veterinarian") %></td>
            </tr>
            <% } %>
          
        </table>
         
  </div>
 </div>
    </div>
          
        <div class="clearfix"></div>         
          
   <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Menu Toggle Script -->
  <script>
    $("#menu-toggle").click(function(e) {
      e.preventDefault();
      $("#wrapper").toggleClass("toggled");
    });
  </script>  
    
</body>
</html>