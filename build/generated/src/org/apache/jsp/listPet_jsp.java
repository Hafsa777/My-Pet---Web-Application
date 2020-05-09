package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.SQLException;
import Database.database;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class listPet_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html; charset=UTF-8");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Pet management Application</title>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("     ");

              
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
      out.write("    <center>\n");
      out.write("        <h1>Your pets</h1>\n");
      out.write("        \n");
      out.write("    </center>\n");
      out.write("    <div align=\"center\">\n");
      out.write("        <table border=\"1\" cellpadding=\"5\">\n");
      out.write("            <caption><h2>List of pets</h2></caption>\n");
      out.write("            <tr>\n");
      out.write("                <th>Pet Name</th>\n");
      out.write("                <th>Type</th>\n");
      out.write("                <th>breed</th>\n");
      out.write("                <th>Actions</th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("              ");
 while(rs.next()) { 
      out.write("\n");
      out.write("               <tr>\n");
      out.write("                <td></td>\n");
      out.write("                <td>");
      out.print(rs.getString("name") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("type") );
      out.write("</td>\n");
      out.write("                <td>");
      out.print(rs.getString("breed") );
      out.write("</td>\n");
      out.write("                <td><a href=\"petController?action=list&id=");
      out.print(rs.getInt("pid") );
      out.write("\">View Details</a>\n");
      out.write("                        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                    <a href=\"petController?action=edit&id=");
      out.print(rs.getInt("pid") );
      out.write("\">Edit</a>\n");
      out.write("                    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;\n");
      out.write("                        <a href=\"petController?action=delete&id=");
      out.print(rs.getInt("pid") );
      out.write("\">Delete</a>  </td>\n");
      out.write("               \n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("          \n");
      out.write("        </table>\n");
      out.write("    </div>   \n");
      out.write("    <h3>\n");
      out.write("            <a href=\"petController?action=insert\">Add New Pet</a>\n");
      out.write("           \n");
      out.write("        </h3>\n");
      out.write("     ");
 }
        
            
      out.write("\n");
      out.write("</body>\n");
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
