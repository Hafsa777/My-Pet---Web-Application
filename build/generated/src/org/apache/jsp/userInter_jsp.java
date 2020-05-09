package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class userInter_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("        <link href=\"css/small-business.css\" rel=\"stylesheet\">\n");
      out.write("        <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("        <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        \n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\"  href=\"#\"><span style=\"font-size: 25px !important; color:greenyellow\">My</span>Pet</a>\n");
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
      out.write("          <li class=\"nav-item \">\n");
      out.write("            <a class=\"nav-link\" href=\"aboutUs.jsp\">About</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item \">\n");
      out.write("            <a class=\"nav-link\" href=\"contactUs.jsp\">Contact</a>\n");
      out.write("          </li>\n");
      out.write("          <li class=\"nav-item\">\n");
      out.write("            <a class=\"nav-link\" href=\"photoGallery.jsp\">Photo Gallery</a>\n");
      out.write("          </li>\n");
      out.write("           <li class=\"nav-item dropdown\">\n");
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
      out.write("               <a class=\"dropdown-item\" href=\"signUp.jsp\">Sign In</a>\n");
      out.write("                <a class=\"dropdown-item\" href=\"signUp.jsp\">Sign Up</a>\n");
      out.write("              </div>\n");
      out.write("            </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("<div class=\"clearfix\"></div>\n");
      out.write("<div class=\"container\">\n");
      out.write("   <div class=\"row align-items-center my-5\">\n");
      out.write("       <div class=\"col-lg-12\">\n");
      out.write("            <img class=\"img-fluid rounded mb-4 mb-lg-0\" src=\"pet1.jpg\" alt=\"\" width=\"1000px\">\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write(" <div class=\"clearfix\"></div>   \n");
      out.write("<div class=\"row\">\n");
      out.write("      <div class=\"col-md-4 mb-5\">\n");
      out.write("        <div class=\"card h-100\">\n");
      out.write("          <div class=\"card-body\">\n");
      out.write("            <h2 class=\"card-title\">Pet Management</h2>\n");
      out.write("             <img class=\"img-fluid rounded mb-4 mb-lg-0\" src=\"1.jpg\" alt=\"\" width=\"200px\" height=\"150px\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"card-footer\">\n");
      out.write("            <a href=\"pet.jsp\" class=\"btn btn-primary btn-sm\">Store Pet Info</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    <div class=\"col-md-4 mb-5\">\n");
      out.write("        <div class=\"card h-100\">\n");
      out.write("          <div class=\"card-body\">\n");
      out.write("            <h2 class=\"card-title\">Vaccine Info</h2>\n");
      out.write("             <img class=\"img-fluid rounded mb-4 mb-lg-0\" src=\"3.jpg\" alt=\"\" width=\"200px\" height=\"150px\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"card-footer\">\n");
      out.write("            <a href=\"vaccine.jsp\" class=\"btn btn-primary btn-sm\">Store vaccine Info</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    <div class=\"col-md-4 mb-5\">\n");
      out.write("        <div class=\"card h-100\">\n");
      out.write("          <div class=\"card-body\">\n");
      out.write("            <h2 class=\"card-title\">Photo Gallery</h2>\n");
      out.write("             <img class=\"img-fluid rounded mb-4 mb-lg-0\" src=\"6.jpg\" alt=\"\" width=\"200px\" height=\"150px\">\n");
      out.write("          </div>\n");
      out.write("          <div class=\"card-footer\">\n");
      out.write("            <a href=\"photoGalleryForUser.jsp\" class=\"btn btn-primary btn-sm\">Add Photo</a>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("        \n");
      out.write("<div class=\"clearfix\"></div>\n");
      out.write(" <footer class=\"py-4 bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"m-0 text-center text-white\">Copyright &copy; MyPet 2019</p>\n");
      out.write("    </div>\n");
      out.write("  </footer>\n");
      out.write("\n");
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
