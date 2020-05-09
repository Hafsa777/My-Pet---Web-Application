<%-- 
    Document   : getPetImage
    Created on : Mar 31, 2019, 1:19:22 AM
    Author     : Zahrana
--%>

<%@page import="java.sql.Blob"%>
<%@page import="java.io.OutputStream"%>
<%@page import="Database.database"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
            int pid = Integer.parseInt(request.getParameter("id"));
            byte arr[] = null;
            OutputStream ot = null;
            
            try{
                
                pr=con.prepareStatement("select ph.image from pet p, photogallery ph where p.imId=ph.imId and pid=?");
                pr.setInt(1, pid);
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
