package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class update_jsp extends org.apache.jasper.runtime.HttpJspBase
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

try
{	
	Class.forName("com.mysql.jdbc.Driver");   
	
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/pet","root","root");

	if(request.getParameter("btn_add")!=null)
	{
		String vid,name,description,last_date,next_date;
		
                vid=request.getParameter("txt_vid");
                //pid=request.getParameter("txt_pid");
		name=request.getParameter("txt_name"); 
		description=request.getParameter("txt_description");
                last_date=request.getParameter("txt_last");
                next_date=request.getParameter("txt_next");
                
              
		
		PreparedStatement pstmt=null;
		
		pstmt=con.prepareStatement("update pet.vaccine1 set name=?,description=?,last_date=?,next_date=? WHERE vid=?");
		pstmt.setString(1,name); 
		//pstmt.setString(2,pid);
                pstmt.setString(2,description);
                pstmt.setString(3,last_date);
                pstmt.setString(4,next_date);
                
                 pstmt.setString(5,vid);
                
		pstmt.executeUpdate();
		
		con.close();
		
		out.println("Update Successfully...! Click view link.");
		
	}	
	
}
catch(Exception e)
{
	out.println(e);
}


      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Update details</title>\n");
      out.write("        \n");
      out.write("          <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">   \n");
      out.write("        <link href=\"css/small-business.css\" rel=\"stylesheet\">\n");
      out.write("         <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("        \n");
      out.write("      <style type=\"text/css\">\n");
      out.write(" body{\n");
      out.write("        text-align: center;\n");
      out.write(" }\n");
      out.write("#first{\n");
      out.write("width:600px;\n");
      out.write("height:600px;\n");
      out.write("margin:50px auto ;\n");
      out.write("padding:50px;\n");
      out.write("background-color:white;\n");
      out.write("color:#333;\n");
      out.write("border:2px solid #C2D6FF;\n");
      out.write("border-radius:40px 0 40px 0;\n");
      out.write("}\n");
      out.write("label{\n");
      out.write("font-size:15px;\n");
      out.write("font-weight:700;\n");
      out.write("float:left;\n");
      out.write("}\n");
      out.write("input#fname{\n");
      out.write("background-image:url(../images/icon_name.png);\n");
      out.write("background-repeat:no-repeat;\n");
      out.write("background-position:6px;\n");
      out.write("border:1px solid #DADADA;\n");
      out.write("margin-top:10px;\n");
      out.write("margin-bottom:10px;\n");
      out.write("padding-left:35px;\n");
      out.write("width:310px;\n");
      out.write("height:30px;\n");
      out.write("font-size:14px;\n");
      out.write("box-shadow:0 0 10px;\n");
      out.write("-webkit-box-shadow:0 0 10px;\n");
      out.write("/* For I.E */\n");
      out.write("-moz-box-shadow:0 0 10px;\n");
      out.write("/* For Mozilla Web Browser */\n");
      out.write("border-radius:5px;\n");
      out.write("-webkit-border-radius:5px;\n");
      out.write("/* For I.E */\n");
      out.write("-moz-border-radius:5px\n");
      out.write("/* For Mozilla Web Browser */\n");
      out.write("}\n");
      out.write("#sub{\n");
      out.write("    float:left;  \n");
      out.write("}\n");
      out.write("\n");
      out.write("</style>\n");
      out.write("    </head>   \n");
      out.write("    <body>\n");
      out.write("                      <!-- Navigation -->\n");
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
      out.write("  </nav>  \n");
      out.write("        <script>\n");
      out.write("\t\t\n");
      out.write("\t\t\tfunction validate()\n");
      out.write("\t\t\t{\n");
      out.write("\t\t\t\tvar name = document.myform.txt_name;\n");
      out.write("\t\t\t\tvar description = document.myform.txt_description;\n");
      out.write("                                var last_date = document.myform.txt_last;\n");
      out.write("                                var next_date = document.myform.txt_next;\n");
      out.write("\t\t\t\t\n");
      out.write("\t\t\t\tif (name.value == \"\")\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\twindow.alert(\"please enter name !\");\n");
      out.write("\t\t\t\t\tname.focus();\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t\tif (description.value == \"\")\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\twindow.alert(\"please enter description !\");\n");
      out.write("\t\t\t\t\towner.focus();\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("                                if (last_date.value == \"\")\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\twindow.alert(\"please enter stock !\");\n");
      out.write("\t\t\t\t\towner.focus();\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("                                if (next_date.value == \"\")\n");
      out.write("\t\t\t\t{\n");
      out.write("\t\t\t\t\twindow.alert(\"please enter next_date !\");\n");
      out.write("\t\t\t\t\towner.focus();\n");
      out.write("\t\t\t\t\treturn false;\n");
      out.write("\t\t\t\t}\n");
      out.write("\t\t\t}\n");
      out.write("\t\t\t\n");
      out.write("        </script>\n");
      out.write("        \n");
      out.write("        \n");
      out.write("        \n");
      out.write("                    \n");
      out.write("           ");

		try
		{
			Class.forName("com.mysql.jdbc.Driver"); 
		
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pet","root","root"); 
	
			if(request.getParameter("edit")!=null) 
			{
				int id=Integer.parseInt(request.getParameter("edit"));
		
                                
				String name,des,last,next;
		
				PreparedStatement pstmt=null; 
				
				pstmt=con.prepareStatement("select * from pet.vaccine1 where vid=?"); 
				pstmt.setInt(1,id);
				ResultSet rs=pstmt.executeQuery(); 
				
				while(rs.next()) 
				{
					id=rs.getInt(1);
                                       // pid=rs.getString(2);
					name=rs.getString(2);
					des=rs.getString(3);
                                        last=rs.getString(4);
                                        next=rs.getString(5);
                                        
			
      out.write("\n");
      out.write("                    \n");
      out.write("                   <div class=\"container\">\n");
      out.write("    <div id=\"first\">\n");
      out.write("            <h3 style=\"text-align:center;\">Update Details</h3>\n");
      out.write("       \n");
      out.write("            <br />\n");
      out.write("            \n");
      out.write("            <form method=\"post\" name=\"myform\"  onsubmit=\"return validate();\">\n");
      out.write("                <table>\n");
      out.write("                    <tr><td><label>ID</label></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" name=\"txt_vid\" size=\"10\" value=\"");
      out.print(id);
      out.write("\" readonly /></td> </tr>\n");
      out.write("                   \n");
      out.write("                    \n");
      out.write("                    <tr><td><label>vaccine Name</label></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" id=\"fname\" name=\"txt_name\" size=\"50\"value=\"");
      out.print(name);
      out.write("\" ></td></tr>\n");
      out.write("                   \n");
      out.write("                    <tr><td><label>description</label></td></tr>\n");
      out.write("                     <tr><td><input type=\"text\" id=\"fname\" name=\"txt_description\" size=\"50\" value=\"");
      out.print(des);
      out.write("\"></td></tr>\n");
      out.write("                  \n");
      out.write("                     <tr><td><label>last vaccine date</label></td></tr>\n");
      out.write("                     <tr><td><input type=\"text\" id=\"fname\" name=\"txt_last\"value=\"");
      out.print(last);
      out.write("\" ></td></tr>\n");
      out.write("                   \n");
      out.write("                    <tr><td><label>next vaccine date</td></label></td></tr>\n");
      out.write("                    <tr><td><input type=\"text\" id=\"fname\" name=\"txt_next\"  value=\"");
      out.print(next);
      out.write("\" ></td></tr>\n");
      out.write("                         <tr><td>\n");
      out.write("                             <div class=\"card-body\">\n");
      out.write("                                 <input class=\"btn btn-success\" type=\"submit\" name=\"btn_add\" value=\"Update\"></div></td>\n");
      out.write("                                 &nbsp;\n");
      out.write("                         <td><a href=\"index1.jsp\" class=\"btn btn-outline-primary\">View vaccine details</a></td></tr>\n");
      out.write("           \n");
      out.write("                </table>\n");
      out.write("                            ");

				}
			}
		}
		catch(Exception e)
		{
			out.println(e);
		}
		
      out.write("\t\n");
      out.write("            </form>\n");
      out.write("         </div>\n");
      out.write("  </div>\n");
      out.write("                          <div class=\"clearfix\"></div>  \n");
      out.write("          \n");
      out.write("\n");
      out.write("  <footer class=\"py-4 bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"m-0 text-center text-white\">Copyright &copy; MyPet 2019</p>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("  </footer>\n");
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
