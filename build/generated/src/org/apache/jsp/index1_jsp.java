package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class index1_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">   \n");
      out.write("        <link href=\"css/small-business.css\" rel=\"stylesheet\">\n");
      out.write("         <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<head>\n");
      out.write("    \n");

try
{	
	Class.forName("com.mysql.jdbc.Driver"); 
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pet","root","root");
	if(request.getParameter("delete")!=null)
	{
		int vid=Integer.parseInt(request.getParameter("delete"));
		
		PreparedStatement pstmt=null;
		
		pstmt=con.prepareStatement("delete from pet.vaccine1 where vid=? "); 
		pstmt.setInt(1,vid);
		pstmt.executeUpdate(); 
		
		con.close();
	}
}
catch(Exception e)
{
	out.println(e);
}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Welcome</title>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        <style>\n");
      out.write("            \n");
      out.write("            body {\n");
      out.write("               \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #items {\n");
      out.write("                font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("                border-collapse: collapse;\n");
      out.write("                width: 100%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #items td, #items th {\n");
      out.write("                border: 1px solid #ddd;\n");
      out.write("                padding: 8px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #items tr:nth-child(even){background-color: #f2f2f2;}\n");
      out.write("\n");
      out.write("            #items tr:hover {background-color: #ddd;}\n");
      out.write("\n");
      out.write("            #items th {\n");
      out.write("                padding-top: 12px;\n");
      out.write("                padding-bottom: 12px;\n");
      out.write("                text-align: left;\n");
      out.write("                background-color: #4CAF50;\n");
      out.write("                color: white;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #container {\n");
      out.write("                margin: auto;\n");
      out.write("                width: 800px;\n");
      out.write("                font-family: \"Trebuchet MS\", Arial, Helvetica, sans-serif;\n");
      out.write("                font-size:14px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            #controls {\n");
      out.write("                \n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            </style>\n");
      out.write("        \n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <body>\n");
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
      out.write("        <div id=\"container\">\n");
      out.write("            \n");
      out.write("            <h2 style=\"text-align:center;\">Vaccine Details</h2>\n");
      out.write("            \n");
      out.write("            <div id=\"control\">\n");
      out.write("                <a href=\"addVaccine.jsp\">+ Add New vaccine</a>\n");
      out.write("            </div>\n");
      out.write("        <br />\n");
      out.write("        <table id=\"items\">\n");
      out.write("            <tr>\n");
      out.write("\t\t\t\t<th width=\"50\">ID</th>\n");
      out.write("\t\t\t\t<th width=\"300\">Name</th>\n");
      out.write("\t\t\t\t\n");
      out.write("                                <th width=\"150\">description</th>\n");
      out.write("                                <th width=\"50\">last date</th>\n");
      out.write("                                <th width=\"50\">next date</th>\n");
      out.write("                                \n");
      out.write("                               \n");
      out.write("\t\t\t\t<th width=\"50\"></th>\n");
      out.write("\t\t\t\t<th width=\"50\"></th>\n");
      out.write("\t\t\t</tr>\n");
      out.write("\t\t");

		
		try
		{	
			Class.forName("com.mysql.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pet","root","root");
			PreparedStatement pstmt=null;
			pstmt=con.prepareStatement("select * from pet.vaccine1"); 
			ResultSet rs=pstmt.executeQuery(); 
		
			while(rs.next())
			{	
		
      out.write("\n");
      out.write("\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getInt(1));
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString(2));
      out.write("</td>\n");
      out.write("\t\t\t\t\t<td>");
      out.print(rs.getString(3));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(4));
      out.write("</td>\n");
      out.write("                                        <td>");
      out.print(rs.getString(5));
      out.write("</td>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\n");
      out.write("                                        \n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t\t<td><a href=\"update.jsp?edit=");
      out.print(rs.getInt(1));
      out.write(" \">Edit</a></td>\n");
      out.write("\t\t\t\t\t<td><a href=\"?delete=");
      out.print(rs.getInt(1));
      out.write(" \">Delete</a></td>\n");
      out.write("\t\t\t\t\t\n");
      out.write("\t\t\t\t</tr>\n");
      out.write("\t\t");

			}
			
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
		
      out.write("\n");
      out.write("        </table>\n");
      out.write("        \n");
      out.write("              </div>\n");
      out.write("        <div class=\"clearfix\"></div>  \n");
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
