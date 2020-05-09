<%@page import="java.sql.SQLException"%>
<%@page import="Database.database"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.Statement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@ page import="java.io.*"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<html>
    <head>
         <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
           <link href="css/small-business.css" rel="stylesheet">
           <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    <style>
      #footer {
  position: absolute;
  bottom: 0;
  width: 100%;
  height: 2.5rem;            /* Footer height */
}
  </style>
    </head>
    <body>
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
          <li class="nav-item ">
            <a class="nav-link" href="aboutUs.jsp">About</a>
          </li>
          <li class="nav-item ">
            <a class="nav-link" href="contactUs.jsp">Contact</a>
          </li>
          <li class="nav-item active">
            <a class="nav-link" href="photoGalleryForUser.jsp">Photo Gallery</a>
          </li>
          <li class="nav-item dropdown">
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
              <div class="dropdown-menu dropdown-menu-right" aria-labelledby="navbarDropdown">
               <a class="dropdown-item" href="viewProfile.jsp">View Profile</a>
                <a class="dropdown-item" href="logOut">Sign Out</a>
              </div>
            </li>
        </ul>
      </div>
    </div>
  </nav>
        
        <%
         if(session.getAttribute("username")!= null){
          
            int uid = Integer.parseInt(session.getAttribute("uid").toString());
            Connection con = null;
            PreparedStatement pr,p = null;
            ResultSet rs = null;
            ResultSet r = null;
            String sql,sql1= null;
            
            try{
                con = database.getConnection();
                sql = "select * from photogallery where userId=?";
                pr = con.prepareStatement(sql);
                pr.setInt(1, uid);
              
                rs = pr.executeQuery();
            
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        %>
  <div class="card-body">  
    <% while(rs.next()) { %>
        <img class="img-fluid rounded mb-4 img-thumbnail m1" src="getImageById.jsp?id=<%=rs.getInt("imId") %>" alt="" height="200px" width="300px"/>
    <% } %>
  </div>
  
  <div class="row">
      <div class=" col"></div>
  <div class="col-lg-4">    
        <form name="image" action="imageUpload" method="post" enctype="multipart/form-data">
          
            <div class=" card-body">
                <span style="font-size: 25px !important; color:peru">Add Image</span>
                <br>
                <input type="file"  name="file" required="required">
            </div>
            <input type="hidden" value="<%= session.getAttribute("uid")%>" name="username" />
           
            <div class="card-body">
                <input type="submit"  class="btn btn-success" value="upload">
            </div>
        </form>
    </div>
  </div>
            <div class="clearfix"></div>
            
        <% }
         else
             response.sendRedirect("signUp.jsp");
        %>
             
        <div class="clearfix"></div>
  <!-- Footer -->
  <footer class="py-4 bg-dark" style="bottom: 0;width: 100%; height: 4rem;">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; MyPet 2019</p>
    </div>
  </footer>

    </body>

</html>