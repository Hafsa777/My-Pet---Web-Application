package org.apache.jsp.Petmanagement.vendor.jspPages;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Database.database;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class customer_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("       \n");
      out.write("        <title>ClientView</title>\n");
      out.write("<style>\n");
      out.write("table {\n");
      out.write("  border-collapse: collapse;\n");
      out.write("  border-spacing: 0;\n");
      out.write("  width: 80%;\n");
      out.write("  border: 1px solid #ddd;\n");
      out.write("}\n");
      out.write("\n");
      out.write("td {\n");
      out.write("  text-align: left;\n");
      out.write("  padding: 16px;\n");
      out.write("  \n");
      out.write("}\n");
      out.write("th{\n");
      out.write("     background-color:#888;\n");
      out.write("     color: white;\n");
      out.write("     text-align: left;\n");
      out.write("     padding: 16px;\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(even) {\n");
      out.write("  background-color: #f2f2f2;\n");
      out.write("}\n");
      out.write("a {\n");
      out.write("    text-decoration: none;\n");
      out.write("    \n");
      out.write("}\n");
      out.write("</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("    \n");
      out.write("        ");

              
        if(session.getAttribute("username")!= null){
          
            int uid = Integer.parseInt(session.getAttribute("uid").toString());
            Connection con = null;
            PreparedStatement pr = null;
            ResultSet rs = null;
            String sql= null;
            
            try{
                con = database.getConnection();
                sql = "select * from pet where uid=?";
                pr = con.prepareStatement(sql);
                pr.setInt(1, uid);
                rs = pr.executeQuery();
            
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        
      out.write("\n");
      out.write("        \n");
      out.write("        <table align=\"center\">\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("                <th>Image</th> \n");
      out.write("                <th>Name</th>\n");
      out.write("                <th>Type</th>\n");
      out.write("                <th>Breed</th>\n");
      out.write("                <th>Action</th>\n");
      out.write("            </tr>\n");
      out.write("       \n");
      out.write("          \n");
      out.write("             ");
 while(rs.next()) { 
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td><img src=\"getPetImage.jsp?id=");
      out.print(rs.getInt("pid") );
      out.write("\" alt=\"\" width=\"75px\" height=\"50px\"></td>\n");
      out.write("                <td>");
      out.print(rs.getString("name") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("type") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("breed") );
      out.write("</td>\n");
      out.write("                <td><a href=\"../../../petController?action=list&id=");
      out.print(rs.getInt("pid") );
      out.write("\">View Details</a>\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <a href=\"../../../petController?action=edit&id=");
      out.print(rs.getInt("pid") );
      out.write("\">Edit</a>\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"../../../petController?action=delete&id=");
      out.print(rs.getInt("pid") );
      out.write("\">Delete</a>  </td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("           \n");
      out.write("            ");
 }
                }else 
                    response.sendRedirect("login.jsp");
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
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
