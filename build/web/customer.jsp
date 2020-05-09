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
         <link href="vendor/bootstrap/css/style.css" rel="stylesheet">
         <link href="css/small-business.css" rel="stylesheet">
        <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script> 

    </head>
    <body>
  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand"  href="#"><span style="font-size: 25px !important; color:greenyellow">My</span>Pet</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
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
            <a class="nav-link" href="photoGalleryForUser.jsp">Photo Gallery</a>
          </li>
          
          <li class="nav-item dropdown active">
              <a class="nav-link dropdown-toggle" href="customer.jsp" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Pet Info
              </a>
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
                 <a class="dropdown-item" href="pet.jsp">Add Pet</a>
                 <a class="dropdown-item" href="vaccine.jsp">Vaccine Details</a>
              </div>
          </li>
            <li class="nav-item dropdown">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Profile
              </a>
              <div class="dropdown-menu dropdown-menu-left" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="viewProfile.jsp">View Profile</a>
                 <a class="dropdown-item" href="logOut">Sign Out</a>
              </div
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <div class="clearfix"></div>
<div class="card-body">
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
        
      
       
          
  <% while(rs.next()) { %>
 
     <div class="col-md-5 mb-5">
        <div class="card h-100">
        <div class="card-body">   
        <div class="row align-items-center my-5"> 
             <div class="col-lg-6">
               <img src="getPetImage.jsp?id=<%=rs.getInt("pid") %>" alt=""  width="200px" height="150px">
             </div>
             <div class="col-lg-5">
               <h2 class="card-title" align="center"><%=rs.getString("name") %></h2>
             </div>
        </div>
        </div>
          <div class="card-footer">
              <div class="card-body">      
            <a href="viewDetails.jsp?id=<%=rs.getInt("pid") %>" class="btn btn-outline-primary btn-sm">More Info</a>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a class="btn btn-outline-success btn-sm" href="addVaccine.jsp" >Add Vaccine</a>   
              </div>
          </div>
          </div>
        </div>
            
    <% } %>
<div class="clearfix"></div>

  <div class="col-lg-8"> 
       <div class="card-body">       
              <a class="btn btn-success" href="petController?action=insert" >Add Pet</a>
  </div>
     </div>
  </div>
 </div>
 </div>
          
            <% 
                }else 
                    response.sendRedirect("signUp.jsp");
            %>
            
<div class="clearfix"></div>          
 <footer class="py-4 bg-dark"style="position:fixed; bottom: 0;width: 100%; height: 4rem;">
     
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; MyPet 2019</p>
    </div>
  </footer>

<div class="clearfix"></div>
    </body>
</html>
