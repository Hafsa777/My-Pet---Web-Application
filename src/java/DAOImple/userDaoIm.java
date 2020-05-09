/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImple;

import DAOInterfaces.userDao;
import Database.database;
import static com.sun.org.apache.xerces.internal.xinclude.XIncludeHandler.BUFFER_SIZE;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.sql.Blob;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import static java.util.Collections.list;
import java.util.List;
import model.User;


public class userDaoIm implements userDao{
    
    private String sql = null;
    private Connection con = null;
   
    public userDaoIm() {
        con = database.getConnection();
    }
 
    @Override
    public void addUser(User u1,InputStream in) {
        
        
       try {
            PreparedStatement pr = con
                    .prepareStatement("insert into user(uname,address,phoneNo,password,image,email) values (?,?,?,?,?,?)");
            // Parameters start with 1
            pr.setString(1, u1.getUserName());
            pr.setString(2, u1.getAddress());
            pr.setString(3, u1.getPhoneNo());
             pr.setString(4, u1.getPassword());
             pr.setBlob(5,in);
            pr.setString(6, u1.getEmail());
            pr.executeUpdate();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void updateUser(User u1,InputStream in) {
        sql = "update user set uname=?, address=?, phoneNo=?, password=?, image=?, email=? where uid=?";
        
        try{
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setString(1,u1.getUserName());
            pr.setString(2,u1.getAddress());
            pr.setString(3, u1.getPhoneNo());
            pr.setString(4,u1.getPassword());
            pr.setBlob(5,in);
            pr.setString(6, u1.getEmail());
            pr.setInt(7, u1.getUserId());
            
            pr.executeUpdate();
            
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteUser(int id) {
        sql = "delete from user where uid=?";
        try{
        
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setInt(1, id);
            
            pr.executeUpdate();
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public List<User> getAllUser() {
        List<User> li = null;
         ResultSet rs = null;
         
        sql = "select * from user";
         try{
        
            PreparedStatement pr = con.prepareStatement(sql);
            rs = pr.executeQuery();
            while(rs.next()){
                if(li == null)
                    li = new ArrayList<>();
                     Blob b1  = rs.getBlob("image");
                     byte byteayyar[] = b1.getBytes(1, (int)b1.length());
                     //response.setContentType("image/gif");
                     //OutputStream os = response.getOutputStream();
                     //os.write(byteayyar);
                    //os.flush();
                    
                    User u1 = new User();
                    u1.setUserName(rs.getString("uname"));
                    u1.setAddress(rs.getString("address"));
                    u1.setPhoneNo(rs.getString("phoneNo"));
                    u1.setPassword(rs.getString("password"));
                    u1.setEmail(rs.getString("email"));
                 
                    u1.setImage(b1);
                    li.add(u1);
                    
               
 
 
            }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return li;
    }

    @Override
    public User findById(int id) {
        User u = new User();
        ResultSet rs= null;
        
        sql = "select * from user where uid=?";
        try{
        
            PreparedStatement pr = con.prepareStatement(sql);
            pr.setInt(1, id);
            
            rs = pr.executeQuery();
             if(rs.next()){
                
                    u.setUserName(rs.getString("uname"));
                    u.setAddress(rs.getString("address"));
                    u.setPhoneNo(rs.getString("phoneNo"));
                    u.setPassword(rs.getString("password"));
                    u.setImage(rs.getBlob("image"));
                    u.setEmail(rs.getString("email"));
                 
             }    
            
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        return u;
    }
    
}
