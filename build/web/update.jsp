
<%@page import="java.sql.*" %>

<%
try
{	
	Class.forName("com.mysql.jdbc.Driver");   
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pet","root","root");

	if(request.getParameter("btn_add")!=null)
	{
		String vid,name,description,last_date,next_date;
		
                vid=request.getParameter("txt_vid");
                //pid=request.getParameter("txt_pid");
		name=request.getParameter("txt_name"); 
		description=request.getParameter("txt_description");
                last_date=request.getParameter("txt_last");
                next_date=request.getParameter("txt_next");
                
              
		
		PreparedStatement pstmt=null;
		
		pstmt=con.prepareStatement("update vaccine set vname=?,description=?,last_date=?,next_date=? WHERE vid=?");
		pstmt.setString(1,name); 
		//pstmt.setString(2,pid);
                pstmt.setString(2,description);
                pstmt.setString(3,last_date);
                pstmt.setString(4,next_date);
                
                 pstmt.setString(5,vid);
                
		pstmt.executeUpdate();
		
		con.close();
		
		out.println("Update Successfully...! Click view link.");
		
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
        <title>Update details</title>
        
          <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">   
        <link href="css/small-business.css" rel="stylesheet">
         <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
        
      <style type="text/css">
 body{
        text-align: center;
 }
#first{
width:600px;
height:700px;
margin:50px auto ;
padding:50px;
background-color:white;
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
        <script>
		
			function validate()
			{
				var name = document.myform.txt_name;
				var description = document.myform.txt_description;
                                var last_date = document.myform.txt_last;
                                var next_date = document.myform.txt_next;
				
				if (name.value == "")
				{
					window.alert("please enter name !");
					name.focus();
					return false;
				}
				if (description.value == "")
				{
					window.alert("please enter description !");
					owner.focus();
					return false;
				}
                                if (last_date.value == "")
				{
					window.alert("please enter stock !");
					owner.focus();
					return false;
				}
                                if (next_date.value == "")
				{
					window.alert("please enter next_date !");
					owner.focus();
					return false;
				}
			}
			
        </script>
        
        
        
                    
           <%
		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pet","root","root"); 
	
			if(request.getParameter("edit")!=null) 
			{
				int id=Integer.parseInt(request.getParameter("edit"));
		
                                
				String name,des,last,next;
		
				PreparedStatement pstmt=null; 
				
				pstmt=con.prepareStatement("select * from vaccine where vid=?"); 
				pstmt.setInt(1,id);
				ResultSet rs=pstmt.executeQuery(); 
				
				while(rs.next()) 
				{
					id=rs.getInt(1);
                                       // pid=rs.getString(2);
					name=rs.getString(3);
					des=rs.getString(4);
                                        last=rs.getString(5);
                                        next=rs.getString(6);
                                        
			%>
                    
                   <div class="container">
    <div id="first">
            <h3 style="text-align:center;">Update Details</h3>
       
            <br />
            
            <form method="post" name="myform"  onsubmit="return validate();">
                <table>
                    <tr><td><label>ID</label></td></tr>
                    <tr><td><input type="text" name="txt_vid" size="10" value="<%=id%>" readonly /></td> </tr>
                   
                    
                    <tr><td><label>vaccine Name</label></td></tr>
                    <tr><td><input type="text" id="fname" name="txt_name" size="50"value="<%=name%>" ></td></tr>
                   
                    <tr><td><label>description</label></td></tr>
                     <tr><td><input type="text" id="fname" name="txt_description" size="50" value="<%=des%>"></td></tr>
                  
                     <tr><td><label>last vaccine date</label></td></tr>
                     <tr><td><input type="text" id="fname" name="txt_last"value="<%=last%>" ></td></tr>
                   
                    <tr><td><label>next vaccine date</td></label></td></tr>
                    <tr><td><input type="text" id="fname" name="txt_next"  value="<%=next%>" ></td></tr>
                         <tr><td>
                             <div class="card-body">
                                 <input class="btn btn-success" type="submit" name="btn_add" value="Update"></div></td>
                                 &nbsp;
                         <td><a href="index1.jsp" class="btn btn-outline-primary">View vaccine details</a></td></tr>
           
                </table>
                            <%
				}
			}
		}
		catch(Exception e)
		{
			out.println(e);
		}
		%>	
            </form>
         </div>
  </div>
                          <div class="clearfix"></div>  
          

  <footer class="py-4 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; MyPet 2019</p>
    </div>
    <!-- /.container -->
  </footer>
    </body>
</html>
