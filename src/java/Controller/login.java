/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Database.database;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author Zahrana
 */
@WebServlet(name = "login", urlPatterns = {"/login"})
public class login extends HttpServlet {
    private Connection con = database.getConnection();
    String name,pass,email,mode= null;
    int uid=0;
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
           
            String username = request.getParameter("username");
            String password = request.getParameter("password");
            
            String sql = "select uid,uname,password,email,mode from user where password=? and email=?";
            try{
                PreparedStatement pr = con.prepareStatement(sql);
                pr.setString(1, password);
                pr.setString(2, username);
                
                ResultSet rs = pr.executeQuery();
                while(rs.next()){
                    uid = rs.getInt("uid");
                    email = rs.getString("email");
                    pass = rs.getString("password");
                    name = rs.getString("uname");
                    mode = rs.getString("mode"); 
                }
            
                if((pass.equalsIgnoreCase(password) && (email.equalsIgnoreCase(username)) && (mode.equalsIgnoreCase("User")))){
            
                 HttpSession session = request.getSession();
                 session.setAttribute("username", name);
                 session.setAttribute("uid", uid);
                 session.setAttribute("log", "Logout");
                    
                RequestDispatcher view = request.getRequestDispatcher("/customer.jsp");
                 view.forward(request, response);
            
            }else if(pass.equalsIgnoreCase("admin") && (email.equalsIgnoreCase("admin")) && (mode.equalsIgnoreCase("admin"))){
                 HttpSession session = request.getSession();
                 session.setAttribute("username", name);
                 session.setAttribute("uid", uid);
                 session.setAttribute("log", "Logout");
                          
                 response.sendRedirect("admin/listUser.jsp");
            }else{
               out.println("<script> alert('Invalid username or password');history.back();</script>");
            }
            
            }catch(SQLException e){
                e.printStackTrace();
            }
            
            
    }

    }  // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
