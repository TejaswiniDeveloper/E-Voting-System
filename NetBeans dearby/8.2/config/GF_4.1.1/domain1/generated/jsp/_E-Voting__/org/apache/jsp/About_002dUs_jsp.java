package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class About_002dUs_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <title>E-Voting !!</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css\" integrity=\"sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==\" crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\n");
      out.write("        <style>\n");
      out.write("            *{\n");
      out.write("                margin: 0;\n");
      out.write("                padding: 0;\n");
      out.write("                box-sizing: border-box;\n");
      out.write("            }\n");
      out.write("            body{\n");
      out.write("                font-family: Times-New-Roman;\n");
      out.write("                line-height: 1.6;\n");
      out.write("            }\n");
      out.write("            .navbar{               \n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("                align-items: center;\n");
      out.write("                height: 80px;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                background-color: white;\n");
      out.write("                padding: 10px 20px;\n");
      out.write("                box-shadow: 0 4px 6px rgba(0,0,0,0.1);\n");
      out.write("                margin-left: 10px;\n");
      out.write("                border-radius: 15px;\n");
      out.write("                margin-top:20px;\n");
      out.write("            }\n");
      out.write("            .navbar .logo{\n");
      out.write("                color: darkred;\n");
      out.write("                font-size: 2.5em;\n");
      out.write("                font-weight: bold;\n");
      out.write("                font-family: monospace;\n");
      out.write("            }\n");
      out.write("            .navbar ul{\n");
      out.write("                list-style: none;\n");
      out.write("                display: flex;\n");
      out.write("                gap: 15px;\n");
      out.write("            }\n");
      out.write("            .navbar ul li{\n");
      out.write("                display: inline;\n");
      out.write("            }\n");
      out.write("            .navbar ul li a{\n");
      out.write("                color: black;\n");
      out.write("                text-decoration: none;\n");
      out.write("                padding: 5px 10px;\n");
      out.write("                transition: background 0.3s;\n");
      out.write("                font-size: 20px;\n");
      out.write("            }\n");
      out.write("            .navbar ul li a:hover{\n");
      out.write("                color: white;\n");
      out.write("                background-color: white;\n");
      out.write("                border: 2px solid black;\n");
      out.write("                background-color: gray;\n");
      out.write("                padding: 4px 4px 4px 4px;\n");
      out.write("                border-radius: 8.5px;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            .About-Us{\n");
      out.write("                padding: 20px;\n");
      out.write("                text-align: center;\n");
      out.write("                /*background-color: #f4f4f4;*/\n");
      out.write("            }\n");
      out.write("            .About-Us h1{\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("                font-size: 2em;\n");
      out.write("            }\n");
      out.write("            .About-Us p{\n");
      out.write("                margin-bottom: 20px;\n");
      out.write("                color: #555;\n");
      out.write("            }\n");
      out.write("            .image-container img{\n");
      out.write("                width: 100%;\n");
      out.write("                max-width: 2000px;\n");
      out.write("                height: 500px;\n");
      out.write("                border-radius: 5px;\n");
      out.write("                box-shadow: 0 4px 8px rgba(0,0,0,0.2);\n");
      out.write("                cursor: pointer;\n");
      out.write("                border-radius: 20px;\n");
      out.write("            }\n");
      out.write("            .container1{\n");
      out.write("               display: flex;\n");
      out.write("            }\n");
      out.write("            .left-section{\n");
      out.write("                width: 50%;\n");
      out.write("                padding: 20px;\n");
      out.write("                \n");
      out.write("            }            \n");
      out.write("            .left-section h1{\n");
      out.write("                font-size: 35px;\n");
      out.write("            } \n");
      out.write("            .right-section{\n");
      out.write("                width: 50%;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            .right-section h2{\n");
      out.write("                font-size: 20px;\n");
      out.write("                margin-bottom: 10px;\n");
      out.write("            }\n");
      out.write("            .experience-section{\n");
      out.write("                text-align: center;\n");
      out.write("                justify-content: center;\n");
      out.write("                display: flex;\n");
      out.write("            }\n");
      out.write("            .experience-section p{\n");
      out.write("                font-size: 25px;\n");
      out.write("            }\n");
      out.write("            .sec1{\n");
      out.write("                width: 20%;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            .sec2{\n");
      out.write("                width: 20%;\n");
      out.write("                padding: 20px;\n");
      out.write("            }\n");
      out.write("            .quote{              \n");
      out.write("                font-size: 45px;\n");
      out.write("                color: black;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                background-color: #f0ad4e;\n");
      out.write("                padding: 20px;\n");
      out.write("                justify-content: center;\n");
      out.write("                text-align: center;\n");
      out.write("                align-items: center;\n");
      out.write("                margin-left: 100px;\n");
      out.write("                margin-right: 100px;\n");
      out.write("                border-radius: 30px;\n");
      out.write("            }\n");
      out.write("            .quote:hover{\n");
      out.write("                color: black;\n");
      out.write("                border: 5px solid black;\n");
      out.write("                font-family: monospace;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <header>\n");
      out.write("            <div class=\"navbar\">\n");
      out.write("                <div class=\"logo\"><u>Electronic-Voting</u> !!</div>\n");
      out.write("                <nav>\n");
      out.write("                    <ul>\n");
      out.write("                        <li><a href=\"Home.jsp\">Home</a></li>\n");
      out.write("                        <li><a href=\"About-Us.jsp\">About-Us</a></li>\n");
      out.write("                        <li><a href=\"About.jsp\">Motive</a></li>\n");
      out.write("                        <li><a href=\"Election.jsp\">Election</a></li>\n");
      out.write("                        <li><a href=\"Contact.jsp\">Contact-Us</a></li>\n");
      out.write("                    </ul>\n");
      out.write("                </nav>\n");
      out.write("            </div>\n");
      out.write("        </header>  \n");
      out.write("        <main>\n");
      out.write("            <section class=\"About-Us\">\n");
      out.write("                <h1>About-Us</h1>\n");
      out.write("                <p>Home > About-Us</p>\n");
      out.write("                <div class=\"image-container\">\n");
      out.write("                    <img src=\"About.jpg\" alt=\"E-Voting\"\n");
      out.write("                </div>\n");
      out.write("            </section>\n");
      out.write("         </main>\n");
      out.write("        <div class=\"container1\">\n");
      out.write("            <div class=\"left-section\"><br><br>\n");
      out.write("                <h1>\"Your Vote, Your Voice - Now Just A Click Away with Secure E-Voting !!\"</h1>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"right-section\">\n");
      out.write("                <p><h2>E-Voting is voting through an electronic system on resolutions of company requiring members/shareholder’s consent. The need for e-Voting arises when a company wishes to pass a resolution by Postal Ballot or Annual General Meeting or Extraordinary General Meeting.\n");
      out.write("                    Ministry of Corporate Affairs, Government of India has authorized NSDL for setting up an electronic platform to facilitate members / shareholders to cast vote in electronic form. e-Voting system created by NSDL is certified by Standardization Testing and Quality Certification (STQC) Directorate, Department of Information Technology, Ministry of Communications & IT, Government of India.</h2></p>\n");
      out.write("                    <p><h2>In Addition to providing remote based E-voting option, NSDL also facilitates companies to provide electronic voting option at meeting venue using portable devices like Tablets. Further, NSDL helps companies to conduct virtual meetings and live streaming of meeting proceedings.</h2></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"quote\">\n");
      out.write("            <p>&OpenCurlyDoubleQuote;Empowering Democracy with technology - Secure, Accessible, And Transparent E-Voting For All. !!</p>\n");
      out.write("        </div>  \n");
      out.write("        \n");
      out.write("        <div class=\"experience-section\">\n");
      out.write("            <div class=\"sec1\">\n");
      out.write("                <i class=\"fas fa-lock feature-icon\" style=\"height: 35px\"></i>\n");
      out.write("                <p>SECURITY</p>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"sec2\">\n");
      out.write("                <h2>2,500</h2>\n");
      out.write("                <p>HAPPY VOTERS</p>\n");
      out.write("            </div\n");
      out.write("        </div>       \n");
      out.write("    </body>\n");
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
}
