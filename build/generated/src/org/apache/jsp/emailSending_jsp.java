package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class emailSending_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h2>Vaccine Sending Details</h2>\n");
      out.write("        \n");
      out.write("        <form action=\"emailServlet\" method=\"GET\">\n");
      out.write("        <<select name=\"year\">\n");
      out.write("           \n");
      out.write("            <option>2019</option>\n");
      out.write("            <option>2020</option>\n");
      out.write("             <option>2021</option>\n");
      out.write("            <option>2022</option> \n");
      out.write("            \n");
      out.write("        </select>\n");
      out.write("        <select name=\"month\">\n");
      out.write("            <option>January</option>\n");
      out.write("            <option>February</option>\n");
      out.write("            <option>March</option>\n");
      out.write("            <option>April</option>\n");
      out.write("            <option>May</option>\n");
      out.write("            <option>June</option>\n");
      out.write("            <option>July</option>\n");
      out.write("            <option>August</option>\n");
      out.write("            <option>September</option>\n");
      out.write("            <option>October</option>\n");
      out.write("            <option>November</option>\n");
      out.write("            <option>December</option>\n");
      out.write("        </select>\n");
      out.write("        <select name=\"date\">\n");
      out.write("            <option>01</option>\n");
      out.write("            <option>02</option>\n");
      out.write("            <option>3</option>\n");
      out.write("            <option>4</option>\n");
      out.write("            <option>5</option>\n");
      out.write("            <option>6</option>\n");
      out.write("            <option>7</option>\n");
      out.write("            <option>8</option>\n");
      out.write("            <option>9</option>\n");
      out.write("            <option>10</option>\n");
      out.write("            <option>11</option>\n");
      out.write("            <option>12</option>\n");
      out.write("            <option>13</option>\n");
      out.write("            <option>14</option>\n");
      out.write("            <option>15</option>\n");
      out.write("            <option>16</option>\n");
      out.write("            <option>17</option>\n");
      out.write("            <option>18</option>\n");
      out.write("            <option>19</option>\n");
      out.write("            <option>20</option>\n");
      out.write("            <option></option>\n");
      out.write("            <option></option>\n");
      out.write("            <option></option>\n");
      out.write("            <option></option>\n");
      out.write("            <option></option>\n");
      out.write("            <option></option>\n");
      out.write("            <option></option>\n");
      out.write("            <option></option>\n");
      out.write("            <option></option>\n");
      out.write("            <option></option>\n");
      out.write("        </select>\n");
      out.write("        <input type=\"submit\" value=\"select\" />\n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("       \n");
      out.write("       \n");
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
