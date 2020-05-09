<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
<link href="vendor/bootstrap/css/style.css" rel="stylesheet">
  <link href="css/small-business.css" rel="stylesheet">
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<style type="text/css">
 body{
        text-align: center;
 }
#first{
width:600px;
height:850px;
margin:50px auto ;
padding:50px;
background-color:whitesmoke;
color:#333;
border:2px solid #C2D6FF;
border-radius:40px 0 40px 0;
}
label{
font-size:15px;
font-weight:700;
float:left;
}
input#fname{
background-image:url(../images/icon_name.png);
background-repeat:no-repeat;
background-position:6px;
border:1px solid #DADADA;
margin-top:10px;
margin-bottom:10px;
padding-left:35px;
width:310px;
height:30px;
font-size:14px;
box-shadow:0 0 10px;
-webkit-box-shadow:0 0 10px;
/* For I.E */
-moz-box-shadow:0 0 10px;
/* For Mozilla Web Browser */
border-radius:5px;
-webkit-border-radius:5px;
/* For I.E */
-moz-border-radius:5px
/* For Mozilla Web Browser */
}
#sub{
    float:left;  
}
#footer {
position: absolute;
bottom: 0;
width: 100%;
}
  
</style>
  <script type="text/javascript">
      function update(){
          alert("Changed successfully");
      }
  </script>
</head>
<body>
    <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="index.jsp"><span style="font-size: 25px !important; color:greenyellow">My</span>Pet</a>
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

    
    <% 
        if(session.getAttribute("username")!= null){
          
    
    %>
  <div class="container">
    <div id="first">
    <form action="petController" method="post" name="pet" enctype="multipart/form-data">
       
        <table>
         
                <input type="hidden"  name="id" value="<c:out value="${pet.pid}" />" >
            
            <tr><td><label>Pet Name:</label></td></tr>
            <tr><td><input id="fname" type="text" name="name" value="<c:out value='${pet.name}' />" required></td></tr>
            
            <tr><td><label>Breed :</label></td></tr>
            <tr><td><input id="fname" type="text"  name="breed" value="<c:out value='${pet.breed}' />" required></td></tr>
            
            <tr><td><label> Type</label> </td></tr>
            <tr><td><select name="type">   
                <option selected><c:out value='${pet.type}' /></option>       
                <option>Cat</option>
                <option>Dog</option>
                </select></td></tr>
            
            <tr><td><label>Age :</label></td></tr>
            <tr><td><input id="fname" type="text" name="age" value="<c:out value='${pet.age}' />" required></td></tr>
            
            <tr><td><label>Sex :</label></td></tr>
            <tr><td><input id="fname" type="text" name="sex" value="<c:out value='${pet.sex}' />" required></td></tr>
           
            <tr><td><label>Color:</label></td></tr>
            <tr><td><input id="fname" type="text"  name="color" value="<c:out value='${pet.color}' />" required></td></tr>
            
            <tr><td><label>Veterinarian:</label></td></tr>
            <tr><td><input id="fname" type="text"  name="veterinarian" value="<c:out value='${pet.veterinarian}' />" required></td></tr>
           
            <tr><td><label>Image</label> </td><tr>
           <tr><td><img src="getPetImage.jsp?id=<c:out value="${pet.pid}" />" alt=""   width="150px" height="100px">
            <tr><td><input type="file"  name="file"></td></tr>
           
            <input type="hidden" value="<%= session.getAttribute("uid")%>" name="username" />
            <tr><td>
            <div class="card-body">
                <input type="submit" id="sub" class="btn btn-success" value="Update" onclick="update()">
            </div></td></tr>
        </table>
    </form>
   </div>
  </div>
  <div class="clearfix"></div>
    <% }else
            response.sendRedirect("signUp.jsp");%>
            
  <footer class="py-4 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; MyPet 2019</p>
    </div>
    <!-- /.container -->
  </footer> 
   
 
</body>
</html>