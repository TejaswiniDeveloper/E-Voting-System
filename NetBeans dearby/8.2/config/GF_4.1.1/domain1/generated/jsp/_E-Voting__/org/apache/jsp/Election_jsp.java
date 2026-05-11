package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Election_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("            body{\n");
      out.write("                font-family: 'Times New Roman', Times, serif;\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                background-color: #f2f2f2;\n");
      out.write("            }\n");
      out.write("            /*.nav-bar{\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-items: center;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                list-style: none;\n");
      out.write("                background-color: #fff;\n");
      out.write("                box-shadow: 0 2px 4px rgb(0, 0, 0, 0.1);\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: bolder;\n");
      out.write("                height: 50px;\n");
      out.write("            }*/\n");
      out.write("            .nav-bar .logo{\n");
      out.write("                font-weight: bold;\n");
      out.write("                color: #6c63ff;\n");
      out.write("                font-size: 20px;\n");
      out.write("                border: 5px solid whitesmoke;\n");
      out.write("                border-radius: 8px;\n");
      out.write("                padding: 4px;\n");
      out.write("                margin: 2px;\n");
      out.write("            }\n");
      out.write("            /*.nav-bar a{\n");
      out.write("                color: #333;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding: 0 15px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                transition: background-color 0.3s;\n");
      out.write("            }\n");
      out.write("            .nav-bar a:hover{\n");
      out.write("                background-color: #d6d1d1;\n");
      out.write("                padding-top: 10px;\n");
      out.write("                padding-bottom: 4px;\n");
      out.write("            }\n");
      out.write("            .nav-links{\n");
      out.write("                display: flex;\n");
      out.write("                padding: 5px;\n");
      out.write("            }*/\n");
      out.write("            .main-banner{\n");
      out.write("                background: linear-gradient(to right, #6862dbb9, #a29bfe);\n");
      out.write("                color: white;\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 50px;\n");
      out.write("                position: relative;\n");
      out.write("                height: 40px;\n");
      out.write("            }\n");
      out.write("            .main-banner h1{\n");
      out.write("                font-size: 36px;\n");
      out.write("                margin: 0;\n");
      out.write("            }\n");
      out.write("            .main-banner p{\n");
      out.write("                font-size: 18px;\n");
      out.write("                color: rgba(255, 255, 255, 0.8);\n");
      out.write("            }\n");
      out.write("            .wave{\n");
      out.write("                position: absolute;\n");
      out.write("                bottom: -10px;\n");
      out.write("                left: 0;\n");
      out.write("                width: 100%;\n");
      out.write("                height: 60px;\n");
      out.write("                background: ellipse(50% 100% at 50% 100%);\n");
      out.write("            }\n");
      out.write("            .content{\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-around;\n");
      out.write("                padding: 40px 20px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("            }\n");
      out.write("            .card{\n");
      out.write("               background-color: white;\n");
      out.write("               border: 1px solid #ddd;\n");
      out.write("               border-radius: 10px;\n");
      out.write("               width: 30%;\n");
      out.write("               height: auto;\n");
      out.write("               padding: 20px;\n");
      out.write("               text-align: center;\n");
      out.write("               box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);\n");
      out.write("               transition: all 5s ease-in-out 0.2s;\n");
      out.write("               transform: rotate(45deg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card:hover{\n");
      out.write("                transform: rotate(360deg);\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .card img{\n");
      out.write("                width: 300px;\n");
      out.write("                height: 300px;\n");
      out.write("                margin-bottom: 15px;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                box-shadow: 0 0 2rem rgba(61, 59, 59, 0.63);\n");
      out.write("            }\n");
      out.write("            .card h3{\n");
      out.write("                margin-top: 0;\n");
      out.write("                font-size: 18px;\n");
      out.write("                color: #333;\n");
      out.write("            }\n");
      out.write("            .footer{\n");
      out.write("                background-color: #8a8a8f;\n");
      out.write("                color: rgb(34, 32, 32);\n");
      out.write("                text-align: center;\n");
      out.write("                padding: 10px;\n");
      out.write("                font-size: 40px;\n");
      out.write("                height: 32px;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("            <div class=\"nav-bar\">\n");
      out.write("            <div class=\"logo\">E-Voting<br>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-banner\">\n");
      out.write("            <h1>Election</h1>\n");
      out.write("            <p>Home / Electtion</p>\n");
      out.write("            <div class=\"wave\"></div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"content\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img src=\"E1.jpg\" alt=\"Vote Online\">\n");
      out.write("                <h3>Vote Online</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img src=\"E2.jpg\" alt=\"Vote By Paper\">\n");
      out.write("                <h3>Vote By Paper</h3>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <img src=\"E3.jpg\" alt=\"Vote In Person\">\n");
      out.write("                <h3>Vote In Person</h3>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"footer\">\n");
      out.write("            <p>Every Vote Counts</p>\n");
      out.write("        </div>\n");
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
