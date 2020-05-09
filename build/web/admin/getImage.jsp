<%-- 
    Document   : getImage
    Created on : Mar 28, 2019, 10:32:29 AM
    Author     : Zahrana
--%>

<%@page import="java.util.ArrayList"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.Blob"%>
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
    </head>
    <body>
        
        <%
          
            
            PreparedStatement pr= null;
            ResultSet rs=null;
            Connection con = database.getConnection();
            int uid = Integer.parseInt(request.getParameter("id"));
            byte arr[] = null;
            OutputStream ot = null;
            
            try{
                
                pr=con.prepareStatement("select image from user where uid=?");
                pr.setInt(1, uid);
                rs = pr.executeQuery();
            
                if(rs.next()){  
              
                    Blob b1= rs.getBlob("image");
                    arr = b1.getBytes(1,(int)b1.length());
               
              }
                    response.setContentType("image/gif");
                    ot = response.getOutputStream();
                    ot.write(arr);
                    ot.flush();
                    ot.close();
                   
            }catch(Exception e){
                e.getMessage();
            }
               
                  
        %>
  
        
    </body>
</html>
