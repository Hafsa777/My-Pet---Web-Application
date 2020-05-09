package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class pet_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_out_value_nobody.release();
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
      response.setContentType("text/html; charset=EUC-KR");
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
      out.write("<!DOCTYPE html PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\" \"http://www.w3.org/TR/html4/loose.dtd\">\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=ISO-8859-1\">\n");
      out.write("<link href=\"vendor/bootstrap/css/bootstrap.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"vendor/bootstrap/css/style.css\" rel=\"stylesheet\">\n");
      out.write("  <link href=\"css/small-business.css\" rel=\"stylesheet\">\n");
      out.write("   <script src=\"vendor/jquery/jquery.min.js\"></script>\n");
      out.write("  <script src=\"vendor/bootstrap/js/bootstrap.bundle.min.js\"></script>\n");
      out.write("<style type=\"text/css\">\n");
      out.write(" body{\n");
      out.write("        text-align: center;\n");
      out.write(" }\n");
      out.write("#first{\n");
      out.write("width:600px;\n");
      out.write("height:800px;\n");
      out.write("margin:50px auto ;\n");
      out.write("padding:50px;\n");
      out.write("background-color:whitesmoke;\n");
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
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <!-- Navigation -->\n");
      out.write("  <nav class=\"navbar navbar-expand-lg navbar-dark bg-dark fixed-top\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <a class=\"navbar-brand\" href=\"index.jsp\">My Pet</a>\n");
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
      out.write("            <a class=\"nav-link\" href=\"photoGalleryforUser.jsp\">Photo Gallery</a>\n");
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
      out.write("            <li class=\"nav-item dropdown\">\n");
      out.write("          <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                Profile\n");
      out.write("              </a>\n");
      out.write("              <div class=\"dropdown-menu dropdown-menu-left\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                <a class=\"dropdown-item\" href=\"viewProfile.jsp\">View Profile</a>\n");
      out.write("                  <a class=\"dropdown-item\" href=\"logOut\">Sign Out</a>\n");
      out.write("              </div\n");
      out.write("          </li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </nav>\n");
      out.write("\n");
      out.write("    \n");
      out.write("    ");
 
        if(session.getAttribute("username")!= null){
             
    
      out.write("\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div id=\"first\">\n");
      out.write("    <form action=\"petController\" method=\"post\" name=\"pet\" enctype=\"multipart/form-data\">\n");
      out.write("       \n");
      out.write("        <table>\n");
      out.write("         \n");
      out.write("             <input type=\"hidden\"  name=\"id\" value=\"");
      if (_jspx_meth_c_out_0(_jspx_page_context))
        return;
      out.write("\" >\n");
      out.write("            \n");
      out.write("            <tr><td><label>Pet Name:</label></td></tr>\n");
      out.write("            <tr><td><input id=\"fname\" type=\"text\" name=\"name\"  required></td></tr>\n");
      out.write("            \n");
      out.write("            <tr><td><label>Breed :</label></td></tr>\n");
      out.write("            <tr><td><input id=\"fname\" type=\"text\"  name=\"breed\"  required></td></tr>\n");
      out.write("            \n");
      out.write("            <tr><td><label> Type</label> </td></tr>\n");
      out.write("            <tr><td><select name=\"type\" id=\"fname\">\n");
      out.write("                <option>Select</option>        \n");
      out.write("                <option>Cat</option>\n");
      out.write("                <option>Dog</option>\n");
      out.write("                    </select></td></tr>\n");
      out.write("            \n");
      out.write("            <tr><td><label>Age :</label></td></tr>\n");
      out.write("            <tr><td><input id=\"fname\" type=\"text\" name=\"age\"  required></td></tr>\n");
      out.write("            \n");
      out.write("            <tr><td><label>Sex :</label></td></tr>\n");
      out.write("            <tr><td><input id=\"fname\" type=\"text\" name=\"sex\" required></td></tr>\n");
      out.write("           \n");
      out.write("            <tr><td><label>Color:</label></td></tr>\n");
      out.write("            <tr><td><input id=\"fname\" type=\"text\"  name=\"color\"  required></td></tr>\n");
      out.write("            \n");
      out.write("            <tr><td><label>Veterinarian:</label></td></tr>\n");
      out.write("            <tr><td><input id=\"fname\" type=\"text\"  name=\"veterinarian\"  required></td></tr>\n");
      out.write("           \n");
      out.write("            <tr><td><label>Image</label></td><tr>\n");
      out.write("            <tr><td><input type=\"file\"  name=\"file\"  required></td></tr>\n");
      out.write("           \n");
      out.write("            <input type=\"hidden\" value=\"");
      out.print( session.getAttribute("uid"));
      out.write("\" name=\"username\" />\n");
      out.write("            <tr><td>\n");
      out.write("            <div class=\"card-body\">\n");
      out.write("                <input type=\"submit\" id=\"sub\" class=\"btn btn-success\" value=\"Add\">\n");
      out.write("            </div></td></tr>\n");
      out.write("        </table>\n");
      out.write("    </form>\n");
      out.write("   </div>\n");
      out.write("  </div>\n");
      out.write("  <div class=\"clearfix\"></div>\n");
      out.write("    ");
 }else
            response.sendRedirect("signUp.jsp");
      out.write("\n");
      out.write("  \n");
      out.write("           \n");
      out.write("  <footer class=\"py-4 bg-dark\">\n");
      out.write("    <div class=\"container\">\n");
      out.write("      <p class=\"m-0 text-center text-white\">Copyright &copy; MyPet 2019</p>\n");
      out.write("    </div>\n");
      out.write("    <!-- /.container -->\n");
      out.write("  </footer> \n");
      out.write("   \n");
      out.write("          \n");
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

  private boolean _jspx_meth_c_out_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent(null);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${pet.pid}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }
}
