/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import DAOImple.userDaoIm;
import DAOInterfaces.userDao;
import Database.database;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;
import model.User;

/**
 *
 //* @author Zahrana
 */
@MultipartConfig(maxFileSize = 1024 * 1024 * 1)
public class User_Controller extends HttpServlet {
      String name,pass,email,mode= null;
    int uid=0; 
 private Connection con = database.getConnection();
   private static final long serialVersionUID = 1l;
   private static String list_user = "admin/listUser.jsp";
   private static String insert = "admin/Register.jsp";
   userDao u2 = new userDaoIm();
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
       String action = request.getParameter("action");
       String forward="";
       
       if(action.equalsIgnoreCase("delete")){
            int id = Integer.parseInt(request.getParameter("id"));
            u2.deleteUser(id);
            forward = list_user;
            request.setAttribute("users", u2.getAllUser());
            
       }else if(action.equalsIgnoreCase("edit")){
           forward = insert;
            int id = Integer.parseInt(request.getParameter("id"));
            User u = u2.findById(id);
            request.setAttribute("user", u);
            
       }else if(action.equalsIgnoreCase("list")){
           forward = list_user;
           //List<User> u3 = u2.getAllUser();
           request.setAttribute("users",u2.getAllUser());
       }
       else{
           forward = insert;
       }
       
       RequestDispatcher view = request.getRequestDispatcher(forward);
       view.forward(request, response);
    }   

   
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
     User u1= new User();
  
        
        String id = request.getParameter("id");
       
        u1.setUserName(request.getParameter("name"));
        u1.setAddress(request.getParameter("address"));
        u1.setPhoneNo(request.getParameter("phoneNo"));
        u1.setEmail(request.getParameter("email"));
        u1.setPassword(request.getParameter("password"));
        Part p = request.getPart("file");
        
            
           InputStream in = p.getInputStream();
        
        if(id == null ||id.isEmpty())
            u2.addUser(u1,in);
        else{
             u1.setUserId(Integer.parseInt(request.getParameter("id")));
             u2.updateUser(u1, in);
        }
        
         String sql = "select uid,uname,password,email,mode from user where password=? and email=?";
            try{
                PreparedStatement pr = con.prepareStatement(sql);
                pr.setString(1, u1.getPassword());
                pr.setString(2, u1.getEmail());
                
                ResultSet rs = pr.executeQuery();
                while(rs.next()){
                    uid = rs.getInt("uid");
                    email = rs.getString("email");
                    pass = rs.getString("password");
                    name = rs.getString("uname");
                    mode = rs.getString("mode"); 
                }
            
                if((pass.equalsIgnoreCase(u1.getPassword()) && (email.equalsIgnoreCase(u1.getEmail())) && (mode.equalsIgnoreCase("User")))){
            
                 HttpSession session = request.getSession();
                 session.setAttribute("username", name);
                 session.setAttribute("uid", uid);
                 session.setAttribute("log", "Logout");
                    
   
      RequestDispatcher view = request.getRequestDispatcher("/userInter.jsp");
      //request.setAttribute("users",u2.getAllUser());
      view.forward(request, response);
    }
            }catch(SQLException e){
                e.printStackTrace();
            }}
 
}

    
    
