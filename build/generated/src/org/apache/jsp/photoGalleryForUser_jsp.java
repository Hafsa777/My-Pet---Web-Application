package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import Database.database;
import java.sql.PreparedStatement;
import java.sql.Blob;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.io.*;

public final class photoGalleryForUser_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("         <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("           <link href=\"css/small-business.css\" rel=\"stylesheet\">\n");
      out.write("           <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\"  href=\"#\"><span style=\"font-size: 25px !important; color:greenyellow\">My</span>Pet</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"index.jsp\">Home\n");
      out.write("              <span class=\"sr-only\">(current)</span>\n");
      out.write("            </a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("            <a class=\"nav-link\" href=\"aboutUs.jsp\">About</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("            <a class=\"nav-link\" href=\"contactUs.jsp\">Contact</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item active\">\n");
      out.write("            <a class=\"nav-link\" href=\"photoGalleryForUser.jsp\">Photo Gallery</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item dropdown\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                Pet Info\n");
      out.write("              </a>\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                 <a class=\"dropdown-item\" href=\"pet.jsp\">Add Pet</a>\n");
      out.write("                 <a class=\"dropdown-item\" href=\"vaccine.jsp\">Vaccine Details</a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("       <li class=\"nav-item dropdown\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                Dropdown\n");
      out.write("              </a>\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("               <a class=\"dropdown-item\" href=\"viewProfile.jsp\">View Profile</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"logOut.jsp\">Sign Out</a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("        \n");
      out.write("        ");

         if(session.getAttribute("username")!= null){
          
            int uid = Integer.parseInt(session.getAttribute("uid").toString());
            Connection con = null;
            PreparedStatement pr,p = null;
            ResultSet rs = null;
            ResultSet r = null;
            String sql,sql1= null;
            
            try{
                con = database.getConnection();
                sql = "select * from photogallery where userId=?";
                pr = con.prepareStatement(sql);
                pr.setInt(1, uid);
              
                rs = pr.executeQuery();
            
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        
      out.write("\n");
      out.write("  <div class=\"card-body\">  \n");
      out.write("    ");
 while(rs.next()) { 
      out.write("\n");
      out.write("        <img class=\"img-fluid rounded mb-4 img-thumbnail m1\" src=\"getImageById.jsp?id=");
      out.print(rs.getInt("imId") );
      out.write("\" alt=\"\" height=\"200px\" width=\"300px\"/>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("  </div>\n");
      out.write("  \n");
      out.write("  <div class=\"row\">\n");
      out.write("      <div class=\" col\"></div>\n");
      out.write("  <div class=\"col-lg-4\">    \n");
      out.write("        <form name=\"image\" action=\"imageUpload\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("          \n");
      out.write("            <div class=\" card-body\">\n");
      out.write("                <span style=\"font-size: 25px !important; color:peru\">Add Image</span>\n");
      out.write("                <br>\n");
      out.write("                <input type=\"file\"  name=\"file\" required=\"required\">\n");
      out.write("            </div>\n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print( session.getAttribute("uid"));
      out.write("\" name=\"username\" />\n");
      out.write("           \n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <input type=\"submit\"  class=\"btn btn-success\" value=\"upload\">\n");
      out.write("            </div>\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("            <div class=\"clearfix\"></div>\n");
      out.write("            \n");
      out.write("        ");
 }
         else
             response.sendRedirect("signUp.jsp");
        
      out.write("\n");
      out.write("             \n");
      out.write("        <div class=\"clearfix\"></div>\n");
      out.write("  <!-- Footer -->\n");
      out.write("  <footer class=\"py-4 bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"m-0 text-center text-white\">Copyright &copy; MyPet 2019</p>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
