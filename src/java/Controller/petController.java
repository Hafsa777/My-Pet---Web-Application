
package Controller;

import DAOImple.PetdaoIm;
import DAOInterfaces.petDAO;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import model.pet;

@MultipartConfig(maxFileSize = 1024 * 1024 * 1)
public class petController extends HttpServlet {
    private static final long serialVersionUID = 1L;
    private static String INSERT = "/pet.jsp";
     private static String UPDATE = "/updatePet.jsp";
    private static String LIST_PET = "/customer.jsp";
    private petDAO pt1;
    
    public petController() {
        super();
        pt1 = new PetdaoIm();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
         response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
        String forward="";
        String action = request.getParameter("action");
        pet p = new pet();
        
         if (action.equalsIgnoreCase("delete")){
            int pid = Integer.parseInt(request.getParameter("id"));
            pt1.deletePet(pid);
            forward = LIST_PET;
            request.setAttribute("pets", pt1.findAllPet());
             out.println("<script> alert('Invalid username or password');history.back();</script>");
           
        } else if (action.equalsIgnoreCase("edit")){
            forward = UPDATE;
            int pid = Integer.parseInt(request.getParameter("id"));
            pet pt2 = pt1.findById(pid);
            request.setAttribute("pet", pt2);
        
        } else if (action.equalsIgnoreCase("list")){
            forward = LIST_PET;
            List<pet> pets = pt1.findAllPet();
            request.setAttribute("pets", pets);
         
        } else {
            forward = INSERT;
        }

        RequestDispatcher view = request.getRequestDispatcher(forward);
        view.forward(request, response);
    }
    }
        
     protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

          pet p1 = new pet();
          
          Part p = request.getPart("file");
          String imageName = p.getSubmittedFileName();
          InputStream in =p.getInputStream();
          
          String pid = request.getParameter("id");
          int id = Integer.parseInt(request.getParameter("username"));
        
          p1.setName(request.getParameter("name"));
          p1.setBreed(request.getParameter("breed"));
          p1.setType(request.getParameter("type"));
          p1.setAge(Integer.parseInt(request.getParameter("age")));
          p1.setSex(request.getParameter("sex"));
          p1.setColor(request.getParameter("color"));
          p1.setVeterinarian(request.getParameter("veterinarian"));
          p1.setUid(Integer.parseInt(request.getParameter("username")));
          
         
          
       if (pid == null || pid.isEmpty()){
           pt1.insertImage(id,in, imageName); 
           pt1.addPet(p1,imageName);
           
       }
        else
        {
            p1.setPid(Integer.parseInt(pid));
            pt1.updatePet(p1);
            int i = Integer.parseInt(pid);
            pt1.editImage(i, in, imageName);
        }
       
        RequestDispatcher view = request.getRequestDispatcher(LIST_PET);
        request.setAttribute("pets",pt1.findAllPet());
        view.forward(request, response);
       
        
        
     }
}