package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import Database.database;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class viewDetails_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">   \n");
      out.write("        <link href=\"css/small-business.css\" rel=\"stylesheet\">\n");
      out.write("         <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("  <script type=\"text/javascript\">  \n");
      out.write("  function deletePost() {\n");
      out.write("    var ask = window.confirm(\"Are you sure you want to delete?\");\n");
      out.write("    if (ask == true) {\n");
      out.write("        window.alert(\"successfully deleted.\");\n");
      out.write("        window.location.href = \"viewDetails.jsp\";\n");
      out.write("\n");
      out.write("    }\n");
      out.write("    else{\n");
      out.write("        window.location.href=\"viewDetails.jsp\"\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("function alterDetails() {\n");
      out.write("    var ask = window.confirm(\"Do you want to change Details?\");\n");
      out.write("}\n");
      out.write("\n");
      out.write("</script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("          <!-- Navigation -->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
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
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"aboutUs.jsp\">About</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"contactUs.jsp\">Contact</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"photoGalleryForUser.jsp\">Photo Gallery</a>\n");
      out.write("          </li>\n");
      out.write("           <li class=\"nav-item dropdown active\">\n");
      out.write("              <a class=\"nav-link dropdown-toggle\" href=\"customer.jsp\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                Pet Info\n");
      out.write("              </a>\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-right\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                 <a class=\"dropdown-item\" href=\"pet.jsp\">Add Pet</a>\n");
      out.write("                 <a class=\"dropdown-item\" href=\"vaccine.jsp\">Vaccine Details</a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("           <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                Profile\n");
      out.write("              </a>\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-left\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"viewProfile.jsp\">View Profile</a>\n");
      out.write("                 <a class=\"dropdown-item\" href=\"logOut\">Sign Out</a>\n");
      out.write("              </div\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("           \n");
      out.write("     ");

              
        if(session.getAttribute("username")!= null){
          
            int uid = Integer.parseInt(session.getAttribute("uid").toString());
             int pid = Integer.parseInt(request.getParameter("id"));
            Connection con = null;
            PreparedStatement pr,p = null;
            ResultSet rs = null;
            ResultSet r = null;
            String sql,sql1= null;
            
            try{
                con = database.getConnection();
                sql = "select * from pet where uid=? and  pid=?";
                pr = con.prepareStatement(sql);
                pr.setInt(1, uid);
                pr.setInt(2, pid);
                rs = pr.executeQuery();
            
                sql1 = "select * from vaccine where   pid=?";
                p = con.prepareStatement(sql1);
                //p.setInt(1, uid);
                p.setInt(1, pid);
                r = p.executeQuery();
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        
      out.write("\n");
      out.write(" \n");
      out.write(" <div class=\"container\">\n");
      out.write("     \n");
      out.write("     ");
 if(!r.next()) {
        while(rs.next()) { 
      out.write("\n");
      out.write("          <div class=\"row align-items-center my-5\">\n");
      out.write("             <h2 align=\"center\"><span style=\"font-size: 40px !important; color:rosybrown\"> Info Of ");
      out.print(rs.getString("name") );
      out.write("</span></h2>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row my-5\">\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("                <img class=\"img-fluid rounded mb-4 mb-lg-0\" src=\"getPetImage.jsp?id=");
      out.print(rs.getInt("pid") );
      out.write("\" alt=\"\"  />\n");
      out.write("            </div>\n");
      out.write("      \n");
      out.write("      <div class=\"col-lg-7\">\n");
      out.write("          <h2 class=\"h4\"><span style=\"font-size: 30px !important; color:blueviolet\">Primary Details</span></h2>&nbsp;\n");
      out.write("         <table class=\"table table-striped\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th>Type</th>\n");
      out.write("                <td>");
      out.print(rs.getString("type") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Breed</th>\n");
      out.write("                <td>");
      out.print(rs.getString("breed") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Age</th>\n");
      out.write("                <td>");
      out.print(rs.getString("age") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("              <tr>\n");
      out.write("                <th>Sex</th>\n");
      out.write("                <td>");
      out.print(rs.getString("sex") );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <th>Color</th>\n");
      out.write("                <td>");
      out.print(rs.getString("color") );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <th>Veterinarian</th>\n");
      out.write("                <td>");
      out.print(rs.getString("veterinarian") );
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("         \n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("      \n");
      out.write("          <a class=\"btn btn-primary\" href=\"petController?action=edit&id=");
      out.print(rs.getInt("pid") );
      out.write("\" onclick=\"alterDetails()\">Alter Details?</a> \n");
      out.write("           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("         <a class=\"btn btn-danger\" href=\"petController?action=delete&id=");
      out.print(rs.getInt("pid") );
      out.write("\" onclick=\"deletePost()\">Delete</a>\n");
      out.write("         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("            <a class=\"btn btn-warning\" href=\"customer.jsp\">Back</a>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write(" </div>\n");
      out.write("    ");
}}else {
         while(rs.next()) { 
      out.write("\n");
      out.write("          <div class=\"row align-items-center my-5\">\n");
      out.write("             <h2 align=\"center\"><span style=\"font-size: 40px !important; color:rosybrown\"> Info Of ");
      out.print(rs.getString("name") );
      out.write("</span></h2>\n");
      out.write("          </div>\n");
      out.write("          <div class=\"row my-5\">\n");
      out.write("            <div class=\"col-lg-4\">\n");
      out.write("                <img class=\"img-fluid rounded mb-4 mb-lg-0\" src=\"getPetImage.jsp?id=");
      out.print(rs.getInt("pid") );
      out.write("\" alt=\"\"  />\n");
      out.write("            </div>\n");
      out.write("      \n");
      out.write("      <div class=\"col-lg-4\">\n");
      out.write("          <h2 class=\"h4\"><span style=\"font-size: 30px !important; color:blueviolet\">Primary Details</span></h2>&nbsp;\n");
      out.write("         <table class=\"table table-striped\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th>Type</th>\n");
      out.write("                <td>");
      out.print(rs.getString("type") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Breed</th>\n");
      out.write("                <td>");
      out.print(rs.getString("breed") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("                <th>Age</th>\n");
      out.write("                <td>");
      out.print(rs.getString("age") );
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("              <tr>\n");
      out.write("                <th>Sex</th>\n");
      out.write("                <td>");
      out.print(rs.getString("sex") );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <th>Color</th>\n");
      out.write("                <td>");
      out.print(rs.getString("color") );
      out.write("</td>\n");
      out.write("              </tr>\n");
      out.write("              <tr>\n");
      out.write("                <th>Veterinarian</th>\n");
      out.write("                <td>");
      out.print(rs.getString("veterinarian") );
      out.write("</td>\n");
      out.write("             </tr>\n");
      out.write("         \n");
      out.write("        </table>\n");
      out.write("            \n");
      out.write("      \n");
      out.write("          <a class=\"btn btn-primary\" href=\"petController?action=edit&id=");
      out.print(rs.getInt("pid") );
      out.write("\" onclick=\"alterDetails()\">Alter Details?</a> \n");
      out.write("           &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("         <a class=\"btn btn-danger\" href=\"petController?action=delete&id=");
      out.print(rs.getInt("pid") );
      out.write("\" onclick=\"deletePost()\">Delete</a>\n");
      out.write("         \n");
      out.write("  </div>\n");
      out.write("         \n");
      out.write("             <div class=\"col-lg-4\">\n");
      out.write("                 <h2> <span style=\"font-size: 25px !important; color:palevioletred\">Vaccine Details</span></h2>&nbsp;\n");
      out.write("                  <table class=\"table table-striped\">\n");
      out.write("            \n");
      out.write("                   <tr>\n");
      out.write("                        <th>Vaccine Name</th>\n");
      out.write("                        <td>");
      out.print(r.getString("name") );
      out.write("</td>\n");
      out.write("                   </tr>\n");
      out.write("                   <tr>\n");
      out.write("                        <th>Description</th>\n");
      out.write("                        <td>");
      out.print(r.getString("description") );
      out.write("</td>\n");
      out.write("                   </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th>Vaccine Date</th>\n");
      out.write("                        <td>");
      out.print(r.getDate("vdate") );
      out.write("</td>\n");
      out.write("                   </tr>\n");
      out.write("                  \n");
      out.write("                  </table>\n");
      out.write("    \n");
      out.write("     \n");
      out.write("         <a class=\"btn btn-primary\" href=\"update.jsp&id=");
      out.print(r.getInt("pid") );
      out.write("\" onclick=\"alterDetails()\">Alter Details?</a> \n");
      out.write("         &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("         <a class=\"btn btn-danger\" href=\"vaccDelete.jsp&id=");
      out.print(r.getInt("pid") );
      out.write("\" onclick=\"deletePost()\">Delete</a>\n");
      out.write("        \n");
      out.write("     ");
 }}}
      out.write("\n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("    </div>\n");
      out.write(" </div>\n");
      out.write(" <div class=\"row align-items-center my-5\">\n");
      out.write("         <div style=\"position:absolute; left:200px; margin-top:-85px;\">\n");
      out.write("            <a class=\"btn btn-warning\" style=\"width:100px\" href=\"customer.jsp\">Back</a>  \n");
      out.write("            \n");
      out.write("         </div>\n");
      out.write(" </div>           \n");
      out.write("    <div class=\"clearfix\"></div>  \n");
      out.write("          \n");
      out.write("\n");
      out.write("  <footer class=\"py-4 bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"m-0 text-center text-white\">Copyright &copy; MyPet 2019</p>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("  </footer>\n");
      out.write("\n");
      out.write("        \n");
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
