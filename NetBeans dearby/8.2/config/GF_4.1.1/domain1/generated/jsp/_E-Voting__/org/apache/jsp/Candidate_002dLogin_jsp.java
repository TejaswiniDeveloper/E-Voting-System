package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Candidate_002dLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("             body{\n");
      out.write("                background-image: url(D2.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                object-fit: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                height: 100%;\n");
      out.write("                margin: 1%;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .container{\n");
      out.write("                margin-top: 50px;\n");
      out.write("                margin-left: 400px;\n");
      out.write("                width: 550px;\n");
      out.write("                height: 550px;\n");
      out.write("                box-shadow: 10px 10px 10px 10px;\n");
      out.write("                backdrop-filter: blur(2px);\n");
      out.write("                border-radius: 50%;\n");
      out.write("                padding: 8px;\n");
      out.write("                text-align: center;\n");
      out.write("                cursor: pointer;\n");
      out.write("                border: 2px solid black;\n");
      out.write("            }\n");
      out.write("            \n");
      out.write("            h1\n");
      out.write("            {\n");
      out.write("               font-size: 50px;\n");
      out.write("               color: black;\n");
      out.write("               text-align: center;\n");
      out.write("               font-family: 'Times New Roman', Times, serif;\n");
      out.write("            }\n");
      out.write("            .form-control{\n");
      out.write("                text-align: center;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            label\n");
      out.write("            {\n");
      out.write("                color: black;\n");
      out.write("                font-size: 25px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            #username{\n");
      out.write("                height: 3rem;\n");
      out.write("                width:18rem;\n");
      out.write("                border-radius:14px;\n");
      out.write("                border: 2px solid black;\n");
      out.write("            }\n");
      out.write("            #username:hover{\n");
      out.write("                border: 4px solid rgba(206, 142, 24, 0.884);\n");
      out.write("            }\n");
      out.write("            #password{\n");
      out.write("                height: 3rem;\n");
      out.write("                width:18rem;\n");
      out.write("                border-radius: 14px;\n");
      out.write("                border: 2px solid black;\n");
      out.write("            }\n");
      out.write("            #password:hover{\n");
      out.write("                border: 4px solid rgba(206, 142, 24, 0.884);\n");
      out.write("            }\n");
      out.write("            .btn{\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                gap: 25px;\n");
      out.write("            }\n");
      out.write("            #button{\n");
      out.write("                width: 6rem;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                color: white;\n");
      out.write("                font-family: 'Times New Roman', Times, serif;\n");
      out.write("                background-color: gray;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                border: 2px solid black;\n");
      out.write("                padding: 8px;\n");
      out.write("                box-shadow: 4px rgb(150, 128, 128);\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            #button:hover{\n");
      out.write("                background-color: green;\n");
      out.write("            }\n");
      out.write("            #cancel-button{\n");
      out.write("                width: 6rem;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                color: white;\n");
      out.write("                font-family: 'Times New Roman', Times, serif;\n");
      out.write("                background-color: gray;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                border: 2px solid black;\n");
      out.write("                padding: 8px;\n");
      out.write("                box-shadow: 4px rgb(250, 250, 250);\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            #cancel-button:hover{\n");
      out.write("                background-color: red;\n");
      out.write("            }\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("         <form action=\"Login\" method=\"POST\">\n");
      out.write("        <div class=\"container\"><br><br><br><br>    \n");
      out.write("            <h1>Candidate Login !!</h1><br>\n");
      out.write("\n");
      out.write("            <div class=\"label\">\n");
      out.write("                <label>UserName</label> \n");
      out.write("            </div>\n");
      out.write("            <input type=\"text\" onkeypress=\"javascript:return isAlphanumeric(evt)\" name=\"txt_username\"required id=\"username\" placeholder=\"Enter your UserName\" class=\"form-control\"><br><br>\n");
      out.write("           \n");
      out.write("            <div class=\"label\">\n");
      out.write("                <label>Password</label> \n");
      out.write("            </div>\n");
      out.write("            <input type=\"password\" onkeypress=\"javascript:return isAlphanumeric(evt)\" name=\"txt_password\" required id=\"password\" placeholder=\"Enter Your Password\" class=\"form-control\"><br><br><br><br>\n");
      out.write("\n");
      out.write("            <div class=\"btn\">\n");
      out.write("               <input type=\"submit\" name=\"btn_signup\" id=\"button\" value=\"SIGNUP\"/>\n");
      out.write("                <input type=\"button\" name=\"btn_signup\" id=\"cancel-button\" value=\"EXIT\"/><br>\n");
      out.write("            </div><br>\n");
      out.write("         </div>                      \n");
      out.write("    </form>\n");
      out.write("        \n");
      out.write("\n");
      out.write("    \n");
      out.write("             \n");
      out.write("        </form> \n");
      out.write("        <script>\n");
      out.write("            //Linking Sign-up Link To Candidate Sign-up Page\n");
      out.write("            //document.getElementById(\"sign-up\").addEventListener(\"click\",function(){\n");
      out.write("              //  window.open(\"CandidateSign-Up.html\",\"_Blank\");\n");
      out.write("            //});\n");
      out.write("            \n");
      out.write("            //Go Back To index Page Using Cancel Button On Candidate Login screen\n");
      out.write("            document.getElementById(\"cancel-button\").addEventListener(\"click\",function(){\n");
      out.write("                window.location.href=\"Dashboard.jsp\";\n");
      out.write("            });\n");
      out.write("\n");
      out.write("            //Pop Up Msg For Login Successfully Completed\n");
      out.write("            document.getElementById(\"login-button\").addEventListener(\"click\",function(){\n");
      out.write("                const username = document.getElementById(\"username\").value;\n");
      out.write("                const password = getElementById(\"password\").value;\n");
      out.write("\n");
      out.write("                if(username && password){\n");
      out.write("                    alert(\"Login Successfully Completed !!..\")\n");
      out.write("                } else {\n");
      out.write("                    alert(\"Please Enter Both UserName & Password !!\");\n");
      out.write("                }\n");
      out.write("            });\n");
      out.write("        </script>\n");
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
