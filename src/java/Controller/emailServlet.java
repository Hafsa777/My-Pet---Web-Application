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
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.emailSending;

/**
 * @author Zahrana
 */
public class emailServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
              PreparedStatement pr = null;
              String sql = null;
              ResultSet rs = null;
              Connection  con  = database.getConnection();
              String VaccineDate1,date,month,year,month1;
              Date vaccineDate;
            
              
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
          
            
           date = request.getParameter("date");
           month = request.getParameter("month");
           year = request.getParameter("year");
        
          
          try{
                SimpleDateFormat  monthFormat = new SimpleDateFormat("MMMM");
                 Calendar cal = Calendar.getInstance();
                cal.setTime(monthFormat.parse(month));
                SimpleDateFormat output = new SimpleDateFormat("MM");
                month1 = output.format(cal.getTime());
         
        
                VaccineDate1 = (year + "-" + month1 + "-" + date);
                out.println(VaccineDate1);
                
              }catch(ParseException e){
                 e.printStackTrace();
          } 
           request.setAttribute("user",getAllUser());
           RequestDispatcher view = request.getRequestDispatcher("/newjsp2.jsp");
           view.forward(request, response);
        }
    }
          
    
    public List<emailSending> getAllUser(){
               
            java.sql.Date vacDate =  java.sql.Date.valueOf(VaccineDate1);
            List <emailSending>  arr = new ArrayList<>();
            try{
              pr = con.prepareStatement("select v.vid,u.uname,p.pname,p.veterinarian,v.vname,v.description,v.last_date, u.email from vaccine v, pet p,user u where v.pid= p.pid and p.uid= u.uid and v.next_date=?");
              pr.setDate(1, vacDate);
              
              rs = pr.executeQuery();
              while(rs.next()){
                
                 emailSending es = new emailSending();
                 
                 es.setVaccineId(rs.getInt("vid"));
                 es.setUsername(rs.getString("uname"));
                 es.setPetName(rs.getString("pname"));
                 es.setVeterinarian(rs.getString("veterinarian"));
                 es.setVaccineName(rs.getString("vname"));
                 es.setDescription(rs.getString("description"));
                 es.setLastDate(rs.getDate("last_date"));
                 es.setEmail(rs.getString("email"));
                 
                 arr.add(es);
              
              }
              }catch(SQLException e){
              e.printStackTrace();
          }
          return arr;
            
            
        }
    }
       
          
        
     