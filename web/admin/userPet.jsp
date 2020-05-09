<%-- 
    Document   : userPet
    Created on : Mar 31, 2019, 1:07:00 AM
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
         <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="css/simple-sidebar.css" rel="stylesheet">
  <style>
.first{
width:900px;
height:400px;
margin:50px auto;
padding:50px;
background-color:#f7f7f7;
color:#333;
border:2px solid blue;
border-radius:40px 40px 40px 40px;

.back{
    float:right;
    padding-right:50px;
    
}
  </style>
    </head>
    <body>
        <div class="first">
            <div class="model modal-body">
          <div class="d-flex" id="wrapper">
       <%
              
        
            Connection con = null;
            PreparedStatement pr = null;
            ResultSet rs = null;
            String sql= null;
            int uid  = Integer.parseInt(request.getParameter("id"));
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
                <th>Sex</th> 
                <th>Color</th>
                <th>Veterinarian</th>
                
                
            </tr>
       
          
             <% while(rs.next()) { %>
            <tr>
                <td><img class="rounded" src="getPetImage.jsp?id=<%=rs.getInt("pid") %>" alt="" height="100px" width="150px"/></td>     
                <td><%=rs.getString("name") %></td>
                <td><%=rs.getString("type") %></td>
                <td><%=rs.getString("breed") %></td>
                <td><%=rs.getString("sex") %></td>
                <td><%=rs.getString("color") %></td>
                <td><%=rs.getString("veterinarian") %></td>
            </tr>
            <% } %>
        </table>   
          </div>     
        </div> 
        </div>
       
         <div style="position:absolute; left:250px; margin-top:-20px;">
            <a class="btn btn-primary" style="width:80px" href="listUser.jsp">Back</a>  
            
         </div>

    </body>
</html>
