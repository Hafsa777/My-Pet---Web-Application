<%-- 
    Document   : viewDetails
    Created on : Mar 25, 2019, 3:34:23 PM
    Author     : Zahrana
--%>

<%@page import="java.sql.SQLException"%>
<%@page import="Database.database"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">   
        <link href="css/small-business.css" rel="stylesheet">
         <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script type="text/javascript">  
  function deletePost() {
    var ask = window.confirm("Are you sure you want to delete?");
    if (ask == true) {
        window.alert("successfully deleted.");
        window.location.href = "viewDetails.jsp";

    }
    else{
        window.location.href="viewDetails.jsp"
    }
}
function alterDetails() {
    var ask = window.confirm("Do you want to change Details?");
}

</script>
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

           
     <%
              
        if(session.getAttribute("username")!= null){
          
            int uid = Integer.parseInt(session.getAttribute("uid").toString());
             int pid = Integer.parseInt(request.getParameter("id"));
            Connection con = null;
            PreparedStatement pr,p = null;
            ResultSet rs = null;
            ResultSet r = null;
            String sql,sql1= null;
            
            try{
                con = database.getConnection();
                sql = "select * from pet where uid=? and  pid=?";
                pr = con.prepareStatement(sql);
                pr.setInt(1, uid);
                pr.setInt(2, pid);
                rs = pr.executeQuery();
            
                sql1 = "select * from vaccine where   pid=?";
                p = con.prepareStatement(sql1);
                //p.setInt(1, uid);
                p.setInt(1, pid);
                r = p.executeQuery();
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        %>
 
 <div class="container">
     
     <% if(!r.next()){
        while(rs.next()) { %>
          <div class="row align-items-center my-5">
             <h2 align="center"><span style="font-size: 40px !important; color:rosybrown"> Info Of <%=rs.getString("pname") %></span></h2>
          </div>
          <div class="row my-5">
            <div class="col-lg-4">
                <img class="img-fluid rounded mb-4 mb-lg-0" src="getPetImage.jsp?id=<%=rs.getInt("pid") %>" alt=""  />
            </div>
      
      <div class="col-lg-7">
          <h2 class="h4"><span style="font-size: 30px !important; color:blueviolet">Primary Details</span></h2>&nbsp;
         <table class="table table-striped">
            
            <tr>
                <th>Type</th>
                <td><%=rs.getString("type") %></td>
            </tr>
            <tr>
                <th>Breed</th>
                <td><%=rs.getString("breed") %></td>
            </tr>
            <tr>
                <th>Age</th>
                <td><%=rs.getString("age") %></td>
            </tr>
              <tr>
                <th>Sex</th>
                <td><%=rs.getString("sex") %></td>
              </tr>
              <tr>
                <th>Color</th>
                <td><%=rs.getString("color") %></td>
              </tr>
              <tr>
                <th>Veterinarian</th>
                <td><%=rs.getString("veterinarian") %></td>
             </tr>
         
        </table>
            
      
          <a class="btn btn-primary" href="petController?action=edit&id=<%=rs.getInt("pid") %>" onclick="alterDetails()">Alter Details?</a> 
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <a class="btn btn-danger" href="petController?action=delete&id=<%=rs.getInt("pid") %>" onclick="deletePost()">Delete</a>
        
  </div>
</div>
 </div>
    <%}}else {
         while(rs.next()) { %>
          <div class="row align-items-center my-5">
             <h2 align="center"><span style="font-size: 40px !important; color:rosybrown"> Info Of <%=rs.getString("pname") %></span></h2>
          </div>
          <div class="row my-5">
            <div class="col-lg-4">
                <img class="img-fluid rounded mb-4 mb-lg-0" src="getPetImage.jsp?id=<%=rs.getInt("pid") %>" alt=""  />
            </div>
      
      <div class="col-lg-4">
          <h2 class="h4"><span style="font-size: 30px !important; color:blueviolet">Primary Details</span></h2>&nbsp;
         <table class="table table-striped">
            
            <tr>
                <th>Type</th>
                <td><%=rs.getString("type") %></td>
            </tr>
            <tr>
                <th>Breed</th>
                <td><%=rs.getString("breed") %></td>
            </tr>
            <tr>
                <th>Age</th>
                <td><%=rs.getString("age") %></td>
            </tr>
              <tr>
                <th>Sex</th>
                <td><%=rs.getString("sex") %></td>
              </tr>
              <tr>
                <th>Color</th>
                <td><%=rs.getString("color") %></td>
              </tr>
              <tr>
                <th>Veterinarian</th>
                <td><%=rs.getString("veterinarian") %></td>
             </tr>
         
        </table>
            
      
          <a class="btn btn-primary" href="petController?action=edit&id=<%=rs.getInt("pid") %>" onclick="alterDetails()">Alter Details?</a> 
           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <a class="btn btn-danger" href="petController?action=delete&id=<%=rs.getInt("pid") %>" onclick="deletePost()">Delete</a>
         
  </div>
         
             <div class="col-lg-4">
                 <h2> <span style="font-size: 25px !important; color:palevioletred">Vaccine Details</span></h2>&nbsp;
                  <table class="table table-striped">
            
                   <tr>
                        <th>Vaccine Name</th>
                        <td><%=r.getString("vname") %></td>
                   </tr>
                   <tr>
                        <th>Description</th>
                        <td><%=r.getString("description") %></td>
                   </tr>
                    <tr>
                        <th>Last Vaccine Date</th>
                        <td><%=r.getDate("last_date") %></td>
                   </tr>
                    <tr>
                        <th>Next Vaccine Date</th>
                        <td><%=r.getDate("next_date") %></td>
                   </tr>
                  
                  </table>
    
     
         <a class="btn btn-primary" href="update.jsp&id=<%=r.getInt("pid") %>" onclick="alterDetails()">Alter Details?</a> 
         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
         <a class="btn btn-danger" href="vaccDelete.jsp&id=<%=r.getInt("pid") %>" onclick="deletePost()">Delete</a>
        
     <% }}}%>
    </div>
    
    </div>
 </div>
 <div class="row align-items-center my-5">
         <div style="position:absolute; left:200px; margin-top:-85px;">
            <a class="btn btn-warning" style="width:100px" href="customer.jsp">Back</a>  
            
         </div>
 </div> 
    <div class="clearfix"></div>  
          

  <footer class="py-4 bg-dark" style="bottom: 0;width: 100%; height: 4rem;   ">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; MyPet 2019</p>
    </div>
    <!-- /.container -->
  </footer>

        
    </body>
</html>
