package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import Database.database;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class listUser_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html;charset=UTF-8");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("          <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("\n");
      out.write(" \n");
      out.write("  <link href=\"css/simple-sidebar.css\" rel=\"stylesheet\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <div class=\"d-flex\" id=\"wrapper\">\n");
      out.write("\n");
      out.write("    <!-- Sidebar -->\n");
      out.write("    <div class=\"bg-light border-right\" id=\"sidebar-wrapper\">\n");
      out.write("      <div class=\"sidebar-heading\">My Pet </div>\n");
      out.write("      <div class=\"list-group list-group-flush\">\n");
      out.write("        <a href=\"listUser.jsp\" class=\"list-group-item list-group-item-action bg-light\">User Management</a>\n");
      out.write("        <a href=\"listPet.jsp\" class=\"list-group-item list-group-item-action bg-light\">Pet Management</a>\n");
      out.write("        <a href=\"trackingVaccince\" class=\"list-group-item list-group-item-action bg-light\">Tracking Vaccine</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("    <!-- /#sidebar-wrapper -->\n");
      out.write("\n");
      out.write("    <!-- Page Content -->\n");
      out.write("    <div id=\"page-content-wrapper\">\n");
      out.write("\n");
      out.write("      <nav class=\"navbar navbar-expand-lg navbar-light bg-light border-bottom\">\n");
      out.write("        <button class=\"btn btn-primary\" id=\"menu-toggle\">Toggle Menu</button>\n");
      out.write("\n");
      out.write("        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("          <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("        </button>\n");
      out.write("\n");
      out.write("        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("          <ul class=\"navbar-nav ml-auto mt-2 mt-lg-0\">\n");
      out.write("            <li class=\"nav-item active\">\n");
      out.write("              <a class=\"nav-link\" href=\"main.jsp\">Home <span class=\"sr-only\">(current)</span></a>\n");
      out.write("            </li>\n");
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                Action\n");
      out.write("              </a>\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"viewProfile.jsp\">View Profile</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"logOut.jsp\">Sign Out</a>\n");
      out.write("            </li>\n");
      out.write("          </ul>\n");
      out.write("        </div>\n");
      out.write("      </nav>\n");
      out.write("\n");
      out.write("\n");
      out.write("  \n");
      out.write("      ");

              
        
            Connection con = null;
            PreparedStatement pr = null;
            ResultSet rs = null;
            String sql= null;
            
            try{
                con = database.getConnection();
                sql = "select * from user where mode='User'";
                pr = con.prepareStatement(sql);
                //pr.setInt(1, uid);
                rs = pr.executeQuery();
            
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        
      out.write("\n");
      out.write("        \n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("      <h3 class=\"mt-4\">List Of Users</h3>\n");
      out.write("        <table align=\"center\" class=\"table table-hover\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th>Image</th> \n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Phone Number</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Password</th>\n");
      out.write("            </tr>\n");
      out.write("       \n");
      out.write("          \n");
      out.write("             ");
 while(rs.next()) { 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><a href=\"userPet.jsp?id=");
      out.print(rs.getInt("uid") );
      out.write("\" class=\"btn btn-light\"><img class=\"rounded \" src=\"getImage.jsp?id=");
      out.print(rs.getInt("uid") );
      out.write("\" alt=\"\" height=\"100px\" width=\"150px\"/></a></td>     \n");
      out.write("                <td><a href=\"userPet.jsp?id=");
      out.print(rs.getInt("uid") );
      out.write("\" class=\"btn btn-light\">");
      out.print(rs.getString("name") );
      out.write("</a></td>\n");
      out.write("                <td>");
      out.print(rs.getString("address") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("phoneNo") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("email") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("password") );
      out.write("</td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("            ");
 } 
      out.write("\n");
      out.write("        </table>\n");
      out.write("           \n");
      out.write("          \n");
      out.write("  </div>\n");
      out.write(" </div>\n");
      out.write("    </div>\n");
      out.write("          \n");
      out.write("        <div class=\"clearfix\"></div>         \n");
      out.write("          \n");
      out.write("   <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("\n");
      out.write("  <!-- Menu Toggle Script -->\n");
      out.write("  <script>\n");
      out.write("    $(\"#menu-toggle\").click(function(e) {\n");
      out.write("      e.preventDefault();\n");
      out.write("      $(\"#wrapper\").toggleClass(\"toggled\");\n");
      out.write("    });\n");
      out.write("  </script>           \n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
