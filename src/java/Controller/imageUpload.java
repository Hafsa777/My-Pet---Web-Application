/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;


import Database.database;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;


/**
 *
 * @author Zahrana
 */

@MultipartConfig(maxFileSize = 1024 * 1024 * 1)
@WebServlet(name = "imageUpload", urlPatterns = {"/imageUpload"})
public class imageUpload extends HttpServlet {
    
 private Connection con = database.getConnection();

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        
        Part p = request.getPart("file");
        String imageName = p.getSubmittedFileName();
        int uid = Integer.parseInt(request.getParameter("username")); 
        
        InputStream in = p.getInputStream();
        
        
        try{
            PreparedStatement pr = con.prepareStatement("insert into photogallery(imageName,image,userId) values(?,?,?)");
            pr.setString(1, imageName);
            pr.setBlob(2, in);
            pr.setInt(3, uid);
            pr.executeUpdate();
            
        }catch(Exception e){
            e.printStackTrace();
        }
       
         RequestDispatcher view = request.getRequestDispatcher("/photoGalleryForUser.jsp");
         view.forward(request, response);    }
}    