<%@page import="java.sql.*" %>

<%
try
{	
	Class.forName("com.mysql.jdbc.Driver"); 
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pet","root","root");
	
		int vid=Integer.parseInt(request.getParameter("id"));
		
		PreparedStatement pstmt=null;
		
		pstmt=con.prepareStatement("delete from vaccine where vid=?"); 
		pstmt.setInt(1,vid);
		pstmt.executeUpdate(); 
		
		con.close();
	
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
            
            body {
               
            }
            
            #items {
                font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
                border-collapse: collapse;
                width: 100%;
            }

            #items td, #items th {
                border: 1px solid #ddd;
                padding: 8px;
            }

            #items tr:nth-child(even){background-color: #f2f2f2;}

            #items tr:hover {background-color: #ddd;}

            #items th {
                padding-top: 12px;
                padding-bottom: 12px;
                text-align: left;
                background-color: #4CAF50;
                color: white;
            }
            
            #container {
                margin: auto;
                width: 800px;
                font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
                font-size:14px;
            }
            
            #controls {
                
            }
            
            </style>
        
    </head>
    <body>
        
        <div id="container">
            
            <h2 style="text-align:center;">Vaccine Details</h2>
            
            <div id="control">
                <a href="addVaccine.jsp">+ Add New vaccine</a>
            </div>
        <br />
        <table id="items">
            <tr>
				<th width="50">ID</th>
				<th width="300">Name</th>
				
                                <th width="150">description</th>
                                <th width="50">last date</th>
                                <th width="50">next date</th>
                                
                               
				<th width="50"></th>
				<th width="50"></th>
			</tr>
		<%
		
		try
		{	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pet","root","root");
			PreparedStatement pstmt=null;
			pstmt=con.prepareStatement("select * from vaccine"); 
			ResultSet rs=pstmt.executeQuery(); 
		
			while(rs.next())
			{	
		%>
				<tr>
					<td><%=rs.getInt(1)%></td>
					
					<td><%=rs.getString(3)%></td>
                                        <td><%=rs.getString(4)%></td>
                                        <td><%=rs.getString(5)%></td>
                                        <td><%=rs.getString(6)%></td>
					
					
                                        
					
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
    </body>
</html>
