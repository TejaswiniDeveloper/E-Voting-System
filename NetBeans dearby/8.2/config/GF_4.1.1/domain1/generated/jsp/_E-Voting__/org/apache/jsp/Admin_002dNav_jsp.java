package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_002dNav_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>E-Voting !!</title>\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                font-family: Times-new-roman;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                background-image: url(D6.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                object-fit: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                height: 100vh;\n");
      out.write("                margin: 0%;\n");
      out.write("            }\n");
      out.write("            .navbar{\n");
      out.write("                height: 30px;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-items: center;\n");
      out.write("                background-color: whitesmoke;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                box-shadow: 0 4px 6px rgba(0,0,0,0.1);\n");
      out.write("            }\n");
      out.write("            .navbar .logo{\n");
      out.write("                color: firebrick;\n");
      out.write("                font-size: 2rem;\n");
      out.write("                /*font-family: monospace;*/\n");
      out.write("                font-weight: bold;\n");
      out.write("                text-decoration: none;  \n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            .navbar ul{\n");
      out.write("                list-style: none;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                display: flex;\n");
      out.write("            }\n");
      out.write("            .navbar ul li{\n");
      out.write("                margin: 0 15px;\n");
      out.write("                list-style: none;\n");
      out.write("            }\n");
      out.write("            .navbar ul li a{\n");
      out.write("                text-decoration: none;\n");
      out.write("                color: black;\n");
      out.write("                font-size: 20px;\n");
      out.write("                transition: color 0.3s;\n");
      out.write("                display: flex;\n");
      out.write("            }\n");
      out.write("            .navbar ul li a:hover{\n");
      out.write("                background-color: white;\n");
      out.write("                border: 2px solid gray;\n");
      out.write("                padding: 4px 4px 4px 4px;\n");
      out.write("                border-radius: 8px;\n");
      out.write("            }\n");
      out.write("            .navbar ul li:last-child a{\n");
      out.write("                background-color: white;\n");
      out.write("                color: green;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                transition: background-color 0.3s, color .3s;\n");
      out.write("            }\n");
      out.write("            .navbar ul li:last-child a:hover{\n");
      out.write("                background-color: #d4f3d6;\n");
      out.write("                color: #4caf50;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <nav class=\"navbar\">\n");
      out.write("            <a href=\"#\" class=\"logo\">Electronic-Voting</a>\n");
      out.write("            <ul>\n");
      out.write("                <li><a href=\"Add_Election.jsp\">Add Election</a></li>\n");
      out.write("                <li><a href=\"Add_Candidates.jsp\">Add Candidate</a></li>\n");
      out.write("                <li><a href=\"View-Voters.jsp\">View Voters</a></li>\n");
      out.write("                 <li><a href=\"Index.jsp\">LogOut</a></li>\n");
      out.write("                <li><a href=\"Result.jsp\">View Result</a></li>               \n");
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
