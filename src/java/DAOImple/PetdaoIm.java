/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAOImple;

import DAOInterfaces.petDAO;
import Database.database;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import model.pet;


public class PetdaoIm implements petDAO {

    private static PetdaoIm petdao = null;
    private Connection con;
    
public PetdaoIm(){    
     con = database.getConnection();
}
    
    
    @Override
    public void addPet(pet p1,String imageName) {
      int im = 0;
      try{
         PreparedStatement pre = con.prepareStatement("select imId from photogallery  where imageName=?");
          pre.setString(1,imageName);
          ResultSet rs = pre.executeQuery();
          while(rs.next()){
             im = rs.getInt("imId");
          }        
      
          String sql ="insert into pet(uid,pname,age,sex,color,type,breed,veterinarian,imId) values(?,?,?,?,?,?,?,?,?)"; 
      
          PreparedStatement pr = con.prepareStatement(sql);
      
         pr.setInt(1,p1.getUid());
         pr.setString(2,p1.getName());  
         pr.setInt(3,p1.getAge());
         pr.setString(4,p1.getSex());
         pr.setString(5,p1.getColor());
         pr.setString(6,p1.getType());
         pr.setString(7,p1.getBreed());
         pr.setString(8, p1.getVeterinarian());
         pr.setInt(9,im);
      
      /*if(pr.executeUpdate() > 0){
          ResultSet rs = pr.getGeneratedKeys();
          
           if (rs.next())
                    id = rs.getInt(1);
      }
      */
      pr.executeUpdate();
      
      }catch(SQLException e){
          e.printStackTrace();
      }
     
    }

    @Override
    public void updatePet(pet p1) {
      // int id = 0;
      String sql ="update pet set pname=?,age=?,sex=?,color=?,type=?,breed=?,veterinarian=? where pid=?"; 
      
      try{
      PreparedStatement pr = con.prepareStatement(sql);
     
      pr.setString(1,p1.getName());
      pr.setInt(2,p1.getAge());
      pr.setString(3,p1.getSex());
      pr.setString(4,p1.getColor());
      pr.setString(5,p1.getType());
      pr.setString(6,p1.getBreed());
      pr.setString(7, p1.getVeterinarian());
     
      pr.setInt(8, p1.getPid());
      
      pr.executeUpdate();
          
      }catch(SQLException e){
          e.printStackTrace();
      }
        
    }

    @Override
    public void deletePet(int id) {
        String sql1 ="delete from vaccine where pid=?";
        String sql = "delete from pet where pid=?";
        try{
        PreparedStatement p = con.prepareStatement(sql1);
        p.setInt(1, id);
        p.executeUpdate();
        
        PreparedStatement pr = con.prepareStatement(sql);
        pr.setInt(1, id);
  
        pr.executeUpdate();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public pet findById(int id) {
        pet p = new pet();
         
        String sql = "select * from pet where pid=?";
        try{
        PreparedStatement pr = con.prepareStatement(sql);
        pr.setInt(1, id);
        
        ResultSet rs = pr.executeQuery();
        if(rs.next()){
     
            p.setPid(rs.getInt("pid"));
            p.setName(rs.getString("pname"));
            p.setAge(rs.getInt("age"));
            p.setSex(rs.getString("sex"));
            p.setColor(rs.getString("color"));
            p.setType(rs.getString("type"));
            p.setBreed(rs.getString("breed"));
            p.setVeterinarian(rs.getString("veterinarian"));
            
          
        }
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       return p;
    }
    
 
    @Override
    public List<pet> findAllPet() {
        
         String sql = "select * from pet";
        List<pet> p = null;
        try {
            PreparedStatement pr = con.prepareStatement(sql);
 
            ResultSet rs = pr.executeQuery();
            while (rs.next()) {
                if (p == null)
                    p = new ArrayList<>();
 
               pet p1 = new pet();
               p1.setPid(rs.getInt("pid"));
               p1.setName(rs.getString("pname"));
               p1.setAge(rs.getInt("age"));
               p1.setSex(rs.getString("sex"));
               p1.setColor(rs.getString("color"));
               p1.setType(rs.getString("type"));
               p1.setBreed(rs.getString("breed"));
               p1.setVeterinarian(rs.getString("veterinarian"));
              
               p.add(p1);
               
            }
 
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
        }
 
        return p;
    }

    
    public static petDAO getInstance() {
        if (petdao == null)
            petdao = new PetdaoIm();
 
        return petdao;
    }

    public void insertImage(int id,InputStream in,String imageName){
   
      try{
         
        if(in != null){
             
                PreparedStatement p= con.prepareStatement("insert into photogallery(imageName,image,userId) values(?,?,?)");
                p.setString(1, imageName);
                p.setBlob(2, in);
                p.setInt(3, id);
               
                p.executeUpdate();              
        }
          
        
        }catch(SQLException e){
    
                e.printStackTrace();
            }
        
    }
    public void editImage(int id,InputStream in,String imageName){
    
      try{
        if(in != null){
             
            PreparedStatement p= con.prepareStatement("update photogallery set imageName=?, image=? where pid=?");              
            p.setString(1, imageName);
            p.setBlob(2, in);
            p.setInt(1, id);
                
            p.executeUpdate();
        }
        }catch(SQLException e){
    
                e.printStackTrace();
            }
        
    }
  

    
}
