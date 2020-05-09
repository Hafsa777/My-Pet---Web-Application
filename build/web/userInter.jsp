<%-- 
    Document   : userInter
    Created on : Mar 30, 2019, 4:04:01 PM
    Author     : Zahrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
        <link href="css/small-business.css" rel="stylesheet">
        <script src="vendor/jquery/jquery.min.js"></script>
        <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
    </head>
    <body>
     <% if(session.getAttribute("username")!= null){ %>
        
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand"  href="#"><span style="font-size: 25px !important; color:greenyellow">My</span>Pet</a>
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
          <li class="nav-item ">
            <a class="nav-link" href="aboutUs.jsp">About</a>
          </li>
          <li class="nav-item ">
            <a class="nav-link" href="contactUs.jsp">Contact</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="photoGallery.jsp">Photo Gallery</a>
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
<div class="clearfix"></div>
<div class="container">
   <div class="row align-items-center my-5">
       <div class="col-lg-12">
            <img class="img-fluid rounded mb-4 mb-lg-0" src="pet1.jpg" alt="" width="1000px">
      </div>
    </div>
 <div class="clearfix"></div>   
<div class="row">
      <div class="col-md-4 mb-5">
        <div class="card h-100">
          <div class="card-body">
            <h2 class="card-title">Pet Info</h2>
             <img class="img-fluid rounded mb-4 mb-lg-0" src="1.jpg" alt="" width="200px" height="150px">
          </div>
          <div class="card-footer">
            <a href="pet.jsp" class="btn btn-primary btn-sm">Store Pet Info</a>
          </div>
        </div>
      </div>
    <div class="col-md-4 mb-5">
        <div class="card h-100">
          <div class="card-body">
            <h2 class="card-title">Vaccine Info</h2>
             <img class="img-fluid rounded mb-4 mb-lg-0" src="3.jpg" alt="" width="200px" height="150px">
          </div>
          <div class="card-footer">
            <a href="vaccine.jsp" class="btn btn-primary btn-sm">Store Vaccine Info</a>
          </div>
        </div>
      </div>
    <div class="col-md-4 mb-5">
        <div class="card h-100">
          <div class="card-body">
            <h2 class="card-title">Photo Gallery</h2>
             <img class="img-fluid rounded mb-4 mb-lg-0" src="6.jpg" alt="" width="200px" height="150px">
          </div>
          <div class="card-footer">
            <a href="photoGalleryForUser.jsp" class="btn btn-primary btn-sm">Add Photo</a>
          </div>
        </div>
      </div>
</div>
</div>
        
<div class="clearfix"></div>
 <footer class="py-4 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; MyPet 2019</p>
    </div>
  </footer>
 <% }else
         response.sendRedirect("signUp.jsp");
%>
    </body>
</html>
