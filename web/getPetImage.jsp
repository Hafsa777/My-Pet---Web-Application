<%-- 
    Document   : getPetImage
    Created on : Mar 25, 2019, 12:27:21 AM
    Author     : Zahrana
--%>

<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.Blob"%>
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
    </head>
    <body>
        <%
          int uid = Integer.parseInt(session.getAttribute("uid").toString());
          int pid = Integer.parseInt(request.getParameter("id"));
            Connection con = null;
            PreparedStatement pr = null;
            ResultSet rs = null;
            String sql= null;
            
            try{
                con = database.getConnection();
                sql = "select ph.image from pet p,photogallery ph where ph.imId=p.imId and p.pid =? and p.uid=?";
                pr = con.prepareStatement(sql);
                pr.setInt(1, pid);
                pr.setInt(2, uid);
                rs = pr.executeQuery();
            
                if(rs.next()){
                
                Blob blob = rs.getBlob("image");
                byte byteArray[] = blob.getBytes(1, (int)blob.length());
                
                response.setContentType("image/gif");
                OutputStream os  = response.getOutputStream();
                os.write(byteArray);
                os.flush();
                os.close();
                
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            
            %>
    </body>
</html>
