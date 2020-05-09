package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Client_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("         <!-- Bootstrap core CSS -->\n");
      out.write(" <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write(" <link href=\"vendor/bootstrap/css/style.css\" rel=\"stylesheet\">\n");
      out.write(" <link href=\"css/small-business.css\" rel=\"stylesheet\">\n");
      out.write(" <script src=\"vendor/bootstrap/js/jquery-1.11.1.min.js\"></script>\n");
      out.write("\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <!-- Navigation -->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\">My Pet</a>\n");
      out.write("      <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\" aria-controls=\"navbarResponsive\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("        <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("      </button>\n");
      out.write("      <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("        <ul class=\"navbar-nav ml-auto\">\n");
      out.write("          <li class=\"nav-item active\">\n");
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
      out.write("            <a class=\"nav-link\" href=\"photoGallery.jsp\">Photo Gallery</a>\n");
      out.write("          </li>\n");
      out.write("          \n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("      <div class=\"w3l_banner_nav_right\">\n");
      out.write("<!-- login -->\n");
      out.write("\t\t<div class=\"w3_login\">\n");
      out.write("\t\t\t<h3>Sign In & Sign Up</h3>\n");
      out.write("\t\t\t<div class=\"w3_login_module\">\n");
      out.write("\t\t\t\t<div class=\"module form-module\">\n");
      out.write("\t\t\t\t  <div class=\"toggle\"><i class=\"fa fa-times fa-pencil\"></i>\n");
      out.write("\t\t\t\t\t<div class=\"tooltip\">Click Me</div>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  <div class=\"form\">\n");
      out.write("\t\t\t\t\t<h2>Login to your account</h2>\n");
      out.write("\t\t\t\t\t<form action=\"login\" method=\"post\">\n");
      out.write("\t\t\t\t\t  <input type=\"text\" name=\"username\" placeholder=\"Username@gmail.com\" required=\"required\">\n");
      out.write("\t\t\t\t\t  <input type=\"password\" name=\"password\" placeholder=\"Password\" required=\"required\">\n");
      out.write("\t\t\t\t\t  <input type=\"submit\" value=\"Login\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  <div class=\"form\">\n");
      out.write("\t\t\t\t\t<h2>Create an account</h2>\n");
      out.write("\t\t\t\t\t<form action=\"User_Controller\" method=\"post\" onsubmit=\"return validateForm();\" enctype=\"multipart/form-data\">\n");
      out.write("\t\t\t\t\t  <input type=\"password\" id=\"pass\" name=\"password\" placeholder=\"Password\" required=\"required\">\n");
      out.write("                                          <input type=\"text\" name=\"name\" placeholder=\"Full Name\" required=\"required\">\n");
      out.write("                                          <input type=\"text\" name=\"address\" placeholder=\"Address Line1\" required=\"required\">\n");
      out.write("\t\t\t\t\t  <input type=\"email\" id=\"email\" name=\"email\" placeholder=\"Email Address\" required=\"required\">\n");
      out.write("\t\t\t\t\t  <input type=\"text\" onkeypress=\"return isNumberKey(event)\" id=\"phone\" name=\"phoneNo\" placeholder=\"Phone Number\" required=\"required\">\n");
      out.write("                                          <input type=\"file\"  name=\"file\" required=\"required\" > \n");
      out.write("\t\t\t\t\t  <input type=\"submit\" value=\"Register\">\n");
      out.write("\t\t\t\t\t</form>\n");
      out.write("\t\t\t\t  </div>\n");
      out.write("\t\t\t\t  <!--<div class=\"cta\"><a href=\"#\">Forgot your password?</a></div>-->\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t<script>\n");
      out.write("\t\t\t\t$('.toggle').click(function(){\n");
      out.write("\t\t\t\t  // Switches the Icon\n");
      out.write("\t\t\t\t  $(this).children('i').toggleClass('fa-pencil');\n");
      out.write("\t\t\t\t  // Switches the forms  \n");
      out.write("\t\t\t\t  $('.form').animate({\n");
      out.write("\t\t\t\t\theight: \"toggle\",\n");
      out.write("\t\t\t\t\t'padding-top': 'toggle',\n");
      out.write("\t\t\t\t\t'padding-bottom': 'toggle',\n");
      out.write("\t\t\t\t\topacity: \"toggle\"\n");
      out.write("\t\t\t\t  }, \"slow\");\n");
      out.write("\t\t\t\t});\n");
      out.write("                                \n");
      out.write("              function validateForm(){\n");
      out.write("                var pass=$('#pass').val().trim();\n");
      out.write("                var email = $('#email').val().trim();\n");
      out.write("                var phone = $('#phone').val().trim();\n");
      out.write("                var emailReg = /^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_\\-\\.]+)\\.([a-zA-Z]{2,5})$/;\n");
      out.write("                \n");
      out.write("                \n");
      out.write("                if(!emailReg.test(email))\n");
      out.write("                {\n");
      out.write("                    alert(\"Please enter valid email address.\")\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(pass.length<8)\n");
      out.write("                {\n");
      out.write("                    alert(\"Password must be 8 charcter long.\")\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                else if(phone.length<10||phone.match(/^([a-zA-Z])$/))\n");
      out.write("                {\n");
      out.write("                    alert(\"Phone number is not valid\")\n");
      out.write("                    return false;\n");
      out.write("                }\n");
      out.write("                \n");
      out.write("    }        \n");
      out.write("        </script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            function isNumberKey(evt)\n");
      out.write("            {\n");
      out.write("                var charCode=(evt.which) ? evt.which:evt.keyCode\n");
      out.write("                if(charCode>31&&(charCode<48||charCode>57))\n");
      out.write("                    return false;\n");
      out.write("                return true;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("\t\t</div>\n");
      out.write("<!-- //login -->\n");
      out.write("\t\t</div><!--./nav right-->\n");
      out.write("\t\t<div class=\"clearfix\"></div>\n");
      out.write("\t</div>\n");
      out.write("<footer class=\"py-5 bg-dark\">\n");
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
