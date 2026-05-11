package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        \n");
      out.write("            .header{\n");
      out.write("               background: linear-gradient(90deg, #cc6766, #9d7bbd);\n");
      out.write("               color: white;\n");
      out.write("               padding: 20px 0;\n");
      out.write("               text-align: center;\n");
      out.write("               height: 170px;\n");
      out.write("               border-radius: 20px;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           .header h1{\n");
      out.write("               font-size: 2rem;\n");
      out.write("               font-family: 'Courier New', Courier, monospace;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           p{\n");
      out.write("               font-size: 25px;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           /*.nav{\n");
      out.write("               display: flex;\n");
      out.write("               justify-content: center;\n");
      out.write("               gap: 20px;\n");
      out.write("               list-style: none;\n");
      out.write("               font-size: 20px;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           .nav a{\n");
      out.write("               color: white;\n");
      out.write("               text-decoration: none;\n");
      out.write("               font-weight: bold;\n");
      out.write("               padding: 8px 16px;\n");
      out.write("               border-radius: 4px;\n");
      out.write("               transition: background-color 0.3s;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           .nav a:hover{\n");
      out.write("               background-color: #d6d1d1;\n");
      out.write("           }*/\n");
      out.write("\n");
      out.write("           .content{\n");
      out.write("               text-align: center;\n");
      out.write("               padding: 40px 10px;\n");
      out.write("               background-color: #f9f9f9;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           .content h2{\n");
      out.write("               font-size: 1.8rem;\n");
      out.write("               margin-bottom: 20px;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           .cards{\n");
      out.write("               display: flex;\n");
      out.write("               justify-content: center;\n");
      out.write("               gap: 20px;\n");
      out.write("               flex-wrap: wrap;\n");
      out.write("               transform: scale(1.05);\n");
      out.write("               transition: transform o.3s;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           .card{\n");
      out.write("               background-color: white;\n");
      out.write("               box-shadow: 0 4px 8px rgb(0, 0, 0, 0.1);\n");
      out.write("               border-radius: 8px;\n");
      out.write("               padding: 20px;\n");
      out.write("               width: 300px;\n");
      out.write("               height: 250px;\n");
      out.write("               text-align: center;\n");
      out.write("               cursor: pointer;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           .card:hover{\n");
      out.write("               background-color: whitesmoke;\n");
      out.write("               box-shadow: 0 6px 10px black;\n");
      out.write("               border-radius: 20px;\n");
      out.write("               transform: translate(20px);\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           .card h3{\n");
      out.write("               margin-bottom: 10px;\n");
      out.write("               font-size: 1.5rem;\n");
      out.write("               color: #2d045867;\n");
      out.write("               font-weight: Bold;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("           .card p{\n");
      out.write("               color: #555;\n");
      out.write("               font-size: 1rem;\n");
      out.write("               text-align: justify;\n");
      out.write("               font-weight: bold;\n");
      out.write("           }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"header\">\n");
      out.write("        <h1>E-Voting</h1>\n");
      out.write("        <p>Every Vote Counts</p>\n");
      out.write("        \n");
      out.write("        <p><center>Home / About</center></p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"content\">\n");
      out.write("        <h1>About Voting</h1>\n");
      out.write("        <div class=\"cards\">\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h3>Our Mission</h3>\n");
      out.write("                <p>This Project aims to leverage technology to enhance the accessibility, security and efficiency of the voting experience for citizens.</p>\n");
      out.write("                <p>Electronic voting aims to replace traditional paper ballots with electronic voting machines(EVMs) that can accurately record and count votes,reducing the time and resources required for voting and counting process.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h3>Our Vision</h3>\n");
      out.write("                <p>This system eliminates the need for physical ballot paper and allows eligible voters to cast their votes ellectronically.</p>\n");
      out.write("                <p>E-voting is to create a digital democracy where voting is secure,efficient and accessible to all citizens.</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"card\">\n");
      out.write("                <h3>Our Goal</h3>\n");
      out.write("                <p>The E-Voting System project is a digital solution designed to streamline and modernize the traditional voting proces. </p>\n");
      out.write("                <p>The electronic voting system aims to reduce the time and resources required for voting and counting processes, increase voter turnout and minimize errors and discrepancies in vote counting.</p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
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
