<%@page import="java.sql.*" %>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">   
        <link href="css/small-business.css" rel="stylesheet">
         <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
<head>
    
<%
try
{	
	Class.forName("com.mysql.jdbc.Driver"); 
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pet","root","root");
	if(request.getParameter("delete")!=null)
	{
		int vid=Integer.parseInt(request.getParameter("delete"));
		
		PreparedStatement pstmt=null;
		
		pstmt=con.prepareStatement("delete from vaccine where vid=? "); 
		pstmt.setInt(1,vid);
		pstmt.executeUpdate(); 
		
		con.close();
	}
}
catch(Exception e)
{
	out.println(e);
}
%>



<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome</title>
        <style>
             #footer {
  position: absolute;
  bottom: 0;
  width: 100%;
  height: 4rem;  
        </style>  
        
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

           
        <div class="container">
            <br><br>
            
            <h3 style="text-align:center;">Vaccine Details</h3>
            
            <div id="control">
                <a href="addVaccine.jsp">+ Add New vaccine</a>
            </div>
        <br />
        <table class="table table-hover">
            <tr>
				<th>ID</th>
				<th>Name</th>
				
                                <th>Description</th>
                                <th>Last Date</th>
                                <th>Next Date</th>
                                
                               
				<th></th>
                                <th></th>
			</tr>
		<%
		
		try
		{	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pet","root","root");
			PreparedStatement pstmt=null;
			pstmt=con.prepareStatement("select * from pet.vaccine1"); 
			ResultSet rs=pstmt.executeQuery(); 
		
			while(rs.next())
			{	
		%>
				<tr>
					<td><%=rs.getInt(1)%></td>
					<td><%=rs.getString(2)%></td>
					<td><%=rs.getString(3)%></td>
                                        <td><%=rs.getString(4)%></td>
                                        <td><%=rs.getString(5)%></td>
					
					
                                        
					
					<td><a href="update.jsp?edit=<%=rs.getInt(1)%> ">Edit</a></td>
					<td><a href="?delete=<%=rs.getInt(1)%> ">Delete</a></td>
					
				</tr>
		<%
			}
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
		%>
        </table>
        
              </div>
        <div class="clearfix"></div>  
          

  <footer class="py-4 bg-dark" id="footer">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; MyPet 2019</p>
    </div>
    <!-- /.container -->
  </footer>

        
    </body>
</html>
