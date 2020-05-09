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

public final class photoGallery1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    <body>\n");
      out.write("        ");

         if(session.getAttribute("username")!= null){
          
            int uid = Integer.parseInt(session.getAttribute("uid").toString());
             //int pid = Integer.parseInt(request.getParameter("id"));
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
      out.write("             ");
 while(rs.next()) { 
      out.write("\n");
      out.write("    \n");
      out.write("        <img class=\"img-fluid rounded mb-4 mb-lg-0\" src=\"getAllImage.jsp?id=");
      out.print(rs.getInt("imId") );
      out.write("\" alt=\"\" height=\"200px\" width=\"300px\"/>\n");
      out.write("      \n");
      out.write("        \n");
      out.write("        ");
 }}
         else
             response.sendRedirect("signUp.jsp");
        
      out.write("\n");
      out.write("                \n");
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
