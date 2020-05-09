/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import static com.sun.org.apache.xalan.internal.lib.ExsltStrings.split;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.List;
import java.util.Properties;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.emailSending;

/**
     *
 * @author Zahrana
 */
public class sendEmail extends HttpServlet {
private static final long serialVersionUID = 1L;
	
   String sender,message,password,name;
   String reciever;
   
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
        /*         
        String[] revisionNumber = request.getParameterValues("checkBox");
        String[] username = request.getParameterValues("UserName");
        String[] petname = request.getParameterValues("petName");
        String[] email = request.getParameterValues("email");
        
        
        out.println(Arrays.toString(revisionNumber));
   */
        
        
  emailSending er = new emailSending();
                   
                String username = request.getParameter("userName");
                String petName = request.getParameter("petName");
                String veterinarian = request.getParameter("veterinarian");
                String vaccineName = request.getParameter("vaccineName");
                String description = request.getParameter("description");
                String date = request.getParameter("lastDate");
                String[] email = request.getParameterValues("email");
                int checkBox = Integer.parseInt(request.getParameter("checkBox"));
                
                //java.sql.Date vaccineDate = java.sql.Date.valueOf(date);
                
                //emailDetails(username,petName,veterinarian,vaccineName,vaccineDate,description,email);
               
               String message = ("Name of Pet"+ "\t" + petName +"\n" +"Veterinarian" +"\t" + veterinarian + "\n"
                       + "Vaccine Name" + "\t" + vaccineName + "\n" + "Last Vaccine Date" + "\t" + date + "\n"
                       + "Vaccine Description" +"\t" + description + "\n");
           
                 //String[] to ={split(Arrays.toString(email))};
    
                if(emailSender("fathisharana256@gmail.com", "sharana=12345", message, to))
                     out.println("sent Successfully");
                 
                else
                      out.println("Error occured");
                
               //out.println(checkBox);
         /*er.setVaccineId(checkBox);
         er.setUsername(username);
         er.setPetName(petName);
         er.setVeterinarian(veterinarian);
         er.setVaccineName(vaccineName);
         //er.setVaccineDate(vaccineDate);
         er.setDescription(description);
         er.setEmail(email);

         em.add(er);
         
         for(emailSending e:em){
           out.println(e.getEmail());
         }
             
    
        }*/
        }
        }           
public List<emailSending> emailDetails(String uname, String pname,String veten,String vname,Date vdate,String vdes,String email){

    List<emailSending> em = new ArrayList();
    emailSending er = new emailSending();
               
         er.setUsername(uname);
         er.setPetName(pname);
         er.setVeterinarian(veten);
         er.setVaccineName(vname);
         er.setVaccineDate(vdate);
         er.setDescription(vdes);
         er.setEmail(email);

         em.add(er);
         for(int i=0; i<em.size(); i++){
            System.out.println(i);
             System.out.println(i);
         }
         return em;
}
    
 public static boolean emailSender(String from, String password,String msg,String to[]){
  String host ="smtp.gmail.com";
  Properties pros = System.getProperties();
  pros.put("mail.smtp.starttls.enable","true");
  pros.put("mail.smtp.host",host);
  pros.put("mail.smtp.user",from);
  pros.put("mail.smtp.password",password);
  pros.put("mail.smtp.port",587);
  pros.put("mail.smtp.auth","true");
  
   //Authenticator auth = new SMTPAuthenticator();
  Session session = Session.getDefaultInstance(pros,null);
  MimeMessage message = new MimeMessage(session);
  try{
      message.setFrom(new InternetAddress(from) );
      InternetAddress[] address = new InternetAddress[to.length];
     
      for(int i=0; i<to.length; i++){
          address[i] = new  InternetAddress(to[i]);
          
      }
      for(int i=0; i<address.length; i++){
          message.addRecipient(Message.RecipientType.TO, address[i]);
      }
      message.setSubject("Reminding vaccine Details");
      message.setText(msg);
      Transport trans = session.getTransport("smtp");
      trans.connect(host,from, password);
      trans.sendMessage(message, message.getAllRecipients());
      trans.close();
      return true;
  }catch(MessagingException ms){
          ms.printStackTrace();
          }
  return false;
  }
    
}