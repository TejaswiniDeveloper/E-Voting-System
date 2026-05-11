package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class User_002dRegistration_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"preconnect\" href=\"https:/fonts.gstatic.com\" crossorigin>\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap\" rel=\"stylesheet\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"bootstrap.min.css\">\n");
      out.write("        <title>E-Voting!!</title>\n");
      out.write("        <style>  \n");
      out.write("            body{\n");
      out.write("                background-image: url(U1.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                object-fit: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                height: 100vh;\n");
      out.write("                margin: 1%;\n");
      out.write("            }\n");
      out.write("            .img{\n");
      out.write("                background-image: url(U2.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                object-fit: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                height: 430px;\n");
      out.write("                width:350px;\n");
      out.write("                margin: 1%;\n");
      out.write("                /*margin-left: 260px;*/\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .main{\n");
      out.write("                align-items: center; \n");
      out.write("                height: 100vh;\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center;\n");
      out.write("                font-family: 'Poppins', sans-serif; \n");
      out.write("                /*border: 2px solid white; */\n");
      out.write("                padding: 2px;\n");
      out.write("                /*background-color: 00ffffff;\n");
      out.write("                backdrop-filter: blur(10px);*/\n");
      out.write("                box-shadow: 10px 20px 20PX RGBA(229,225,225,0.5);\n");
      out.write("                border-radius: 25px 25px 100px 25px;\n");
      out.write("                margin-top: 20px;\n");
      out.write("                margin: auto;\n");
      out.write("                height: auto;\n");
      out.write("                width: 950px;\n");
      out.write("                justify-content: center;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            p{\n");
      out.write("                font-size: 25px; \n");
      out.write("                font-weight: 500;\n");
      out.write("                font-family: 'Times New Roman', Times, serif;\n");
      out.write("            }\n");
      out.write("            h1{\n");
      out.write("                font-size: 35px;\n");
      out.write("                font-family: 'Times New Roman', Times, serif;\n");
      out.write("            }\n");
      out.write("            .box{\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: center; \n");
      out.write("                height: 450px; \n");
      out.write("                padding: 20px;\n");
      out.write("                border-radius: 80px 0px 80px 0px; \n");
      out.write("                /*background-color: rgba(255, 255, 255, 0.37);*/\n");
      out.write("                backdrop-filter: blur(10px);\n");
      out.write("                box-shadow: 0 0 10PX RGBA(229,225,225,0.5);\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("\n");
      out.write("            .box1{\n");
      out.write("                height: 20px; \n");
      out.write("                width: 85%; \n");
      out.write("                font-size: 15px;\n");
      out.write("                padding: 5px 10px; \n");
      out.write("                margin-bottom: 8px; \n");
      out.write("                border-radius: 5px; \n");
      out.write("                outline: none; \n");
      out.write("                border: none;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .registerdiv{\n");
      out.write("                border: 1px solid white; \n");
      out.write("                padding: 15px;\n");
      out.write("                background-color: 00ffffff;\n");
      out.write("                backdrop-filter: blur(10px);\n");
      out.write("                box-shadow: 0 0 10PX RGBA(229,225,225,0.5);\n");
      out.write("                margin-left: 260px;\n");
      out.write("                margin-top: 0px;\n");
      out.write("                cursor: pointer;\n");
      out.write("                /*background-image: url(U2.jpg);*/\n");
      out.write("                background-size: cover;\n");
      out.write("                object-fit: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                height: 450px;\n");
      out.write("                width:320px;\n");
      out.write("                margin: 1%;\n");
      out.write("                font-size: 25px;\n");
      out.write("\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .form-control{\n");
      out.write("                border-radius: 4px 4px 4px 4px;\n");
      out.write("                height: 28px;\n");
      out.write("                width: 200px;\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            #button{\n");
      out.write("                width: 100px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                font-family: 'Times New Roman', Times, serif;\n");
      out.write("                background-color: gray;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding: 8px;\n");
      out.write("                box-shadow: 4px rgb(250, 250, 250);\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            #button:hover{\n");
      out.write("                background-color: green;\n");
      out.write("            }\n");
      out.write("            #cancel-button{\n");
      out.write("                width: 100px;\n");
      out.write("                font-size: 20px;\n");
      out.write("                font-weight: 600;\n");
      out.write("                font-family: 'Times New Roman', Times, serif;\n");
      out.write("                background-color: gray;\n");
      out.write("                border-radius: 10px;\n");
      out.write("                padding: 8px;\n");
      out.write("                box-shadow: 4px rgb(250, 250, 250);\n");
      out.write("                cursor: pointer;\n");
      out.write("            }\n");
      out.write("            #cancel-button:hover{\n");
      out.write("                background-color: red;\n");
      out.write("            }\n");
      out.write("            label{\n");
      out.write("                font-size: 25px;\n");
      out.write("                font-weight: 500;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("            .col-sm-6{\n");
      out.write("                display: flex;\n");
      out.write("                justify-content: space-between;\n");
      out.write("            }\n");
      out.write("\n");
      out.write("        </style>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("      <body>\n");
      out.write("       <form action=\"User_Registration_Servlet\" method=\"POST\" onsubmit=\"returnvalidateRegistration\">\n");
      out.write("            <div class=\"main\">\n");
      out.write("                <div class=\"img\"></div>\n");
      out.write("                <div class=\"registerdiv\">\n");
      out.write("                    <h1>Welcome to Voting!!</h1>\n");
      out.write("                    <p><u>Register your Account</u></p>\n");
      out.write("                    <input type=\"text\" onkeypress=\"javascript:return isString(evt)\" name=\"txt_fullname\" required placeholder=\"Enter Full Name\" class=\"form-control\" > <br>   \n");
      out.write("                    <label>Gender\n");
      out.write("                        <input type=\"radio\" name=\"txt_gender\" value=\"Male\" required id=\"male\" >Male\n");
      out.write("                        <input type=\"radio\" name=\"txt_gender\" value=\"Female\" required id=\"female\" >Female\n");
      out.write("                    </label><br>\n");
      out.write("                    <form onsubmit=\"return validateAge()\"><label for=\"dob\"></label><input type=\"date\" id=\"dob\" name=\"dob\" required placeholder=\"Enter Your Date-Of-Birth\" class=\"form-control\">\n");
      out.write("                    <input type=\"text\" onkeypress=\"javascript:return isNumber(evt)\" name=\"txt_contact\" required placeholder=\"Enter Contact No\" class=\"form-control\" ><br>\n");
      out.write("                    <input type=\"text\" onkeypress=\"javascript:return isString(evt)\" name=\"txt_name\" required placeholder=\"Enter Address\" class=\"form-control\" required><br>\n");
      out.write("                    <input type=\"text\" onkeypress=\"javascript:return isAlphanumeric(evt)\" name=\"txt_email\"required id=\"email\" placeholder=\"Enter Your E-mail ID\" class=\"form-control\"><br>\n");
      out.write("                    <input type=\"password\" onkeypress=\"javascript:return isAlphanumeric(evt)\" name=\"txt_password\" required id=\"password\" placeholder=\"Enter Password\" class=\"form-control\" ><br>\n");
      out.write("                    <input type=\"password\" onkeypress=\"javascript:return isAlphanumeric(evt)\" name=\"txt_cpassword\" required id=\"cpassword\" placeholder=\"Confirm Password\" class=\"form-control\" ><br><br>\n");
      out.write("                    <div class=\"row\">\n");
      out.write("                        <div class=\"col-sm-6\">\n");
      out.write("                            <input type=\"submit\" name=\"btn_signup\" id=\"button\" value=\"SIGNUP\"/>\n");
      out.write("                            <input type=\"button\" name=\"btn_signup\" id=\"cancel-button\" value=\"EXIT\"/><br>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                \n");
      out.write("              ");
      out.write("\n");
      out.write("    ");
 if (request.getParameter("registered") != null) { 
      out.write("\n");
      out.write("        <script> showPendingMessage(); </script>\n");
      out.write("    ");
 } 
      out.write("\n");
      out.write("        \n");
      out.write("        <script>\n");
      out.write("            //Go Back To Login Page Using Cancel Button On UserRegistration Screen\n");
      out.write("            document.getElementById(\"cancel-button\").addEventListener(\"click\",function(){\n");
      out.write("                window.location.href =\"User-Login.jsp\";\n");
      out.write("            });         \n");
      out.write("\n");
      out.write("            </script>\n");
      out.write("  \n");
      out.write("            \n");
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
