package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Index_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setHeader("X-Powered-By", "JSP/2.3");
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
      out.write("        <title>E-Voting!!</title>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                margin: 0%;\n");
      out.write("                padding: 0%;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("                font-family: 'Times New Roman', Times, serif;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            body{\n");
      out.write("                background-image: url(B1.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                object-fit: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                height: 100vh;\n");
      out.write("                margin: 0%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            nav{\n");
      out.write("                /*background-color: #333;*/\n");
      out.write("                color: #fff;\n");
      out.write("               /* height: 80px;*/\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-items: center;\n");
      out.write("                padding: 1rem;\n");
      out.write("                font-weight: bolder;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .logo{\n");
      out.write("                /*background-image: url(logo.png);\n");
      out.write("                background-repeat: no-repeat;*/\n");
      out.write("                font-size: 40px;\n");
      out.write("                font-weight: bolder;\n");
      out.write("                font-family: 'Courier New', Courier, monospace;\n");
      out.write("                border: 5px solid rgb(112, 110, 110);\n");
      out.write("                border-radius: 8px;\n");
      out.write("                padding: 4px;\n");
      out.write("                margin: 2px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-links{\n");
      out.write("                list-style: none;\n");
      out.write("                display: flex;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-links li{\n");
      out.write("                margin-left: 20px;\n");
      out.write("                border: 2px solid black;\n");
      out.write("                padding: 10px 10px 10px 10px;\n");
      out.write("                border-radius: 15px;\n");
      out.write("            }\n");
      out.write("            .nav-links li:hover{\n");
      out.write("                background-color: green;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .nav-links a{\n");
      out.write("                color: #fff;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding: 8px 16px;\n");
      out.write("                border-radius: 15px;\n");
      out.write("                transition: background-color 0.3s;\n");
      out.write("                height: 20px;\n");
      out.write("                width: 20px;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            /*.nav-links a:hover{\n");
      out.write("                background-color: green;\n");
      out.write("                color: white;\n");
      out.write("            }*\n");
      out.write("    /</style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav>\n");
      out.write("            <div class=\"logo\">E-Voting</div>\n");
      out.write("            <ul class=\"nav-links\">\n");
      out.write("            <li><a href=\"Home.jsp\">GO</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </nav>\n");
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
