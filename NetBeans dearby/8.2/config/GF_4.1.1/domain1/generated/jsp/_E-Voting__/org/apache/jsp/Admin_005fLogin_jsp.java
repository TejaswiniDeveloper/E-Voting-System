package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Admin_005fLogin_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      response.setContentType("text/html");
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("    <title>E-Voting!!</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            background-image: url(AL1.jpg);\n");
      out.write("            background-size: cover;\n");
      out.write("            background-position: center;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            margin: 1%;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            margin: 150px auto;\n");
      out.write("            width: 400px;\n");
      out.write("            height: auto;\n");
      out.write("            border: 1px solid white;\n");
      out.write("            box-shadow: 10px 10px 10px 10px;\n");
      out.write("            backdrop-filter: blur(2px);\n");
      out.write("            border-radius: 30px;\n");
      out.write("            padding: 20px;\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            font-size: 50px;\n");
      out.write("            color: black;\n");
      out.write("            font-family: 'Times New Roman', Times, serif;\n");
      out.write("        }\n");
      out.write("        .form-control {\n");
      out.write("            text-align: center;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            color: black;\n");
      out.write("            font-size: 25px;\n");
      out.write("        }\n");
      out.write("        #username, #password {\n");
      out.write("            height: 2rem;\n");
      out.write("            width: 18rem;\n");
      out.write("            border-radius: 14px;\n");
      out.write("            margin-bottom: 10px;\n");
      out.write("        }\n");
      out.write("        #username:hover, #password:hover {\n");
      out.write("            border: 4px solid rgba(206, 142, 24, 0.884);\n");
      out.write("        }\n");
      out.write("        .btn {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            gap: 25px;\n");
      out.write("            margin-top: 20px;\n");
      out.write("        }\n");
      out.write("        #button {\n");
      out.write("            width: 6rem;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: 600;\n");
      out.write("            font-family: 'Times New Roman', Times, serif;\n");
      out.write("            color: black;\n");
      out.write("            background-color: gray;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 8px;\n");
      out.write("            box-shadow: 4px 4px 4px rgb(212, 206, 206);\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        #button:hover {\n");
      out.write("            background-color: green;\n");
      out.write("        }\n");
      out.write("        #cancel-button {\n");
      out.write("            width: 6rem;\n");
      out.write("            font-size: 20px;\n");
      out.write("            font-weight: 600;\n");
      out.write("            font-family: 'Times New Roman', Times, serif;\n");
      out.write("            color: black;\n");
      out.write("            background-color: gray;\n");
      out.write("            border-radius: 10px;\n");
      out.write("            padding: 8px;\n");
      out.write("            box-shadow: 4px 4px 4px rgb(250, 250, 250);\n");
      out.write("            cursor: pointer;\n");
      out.write("        }\n");
      out.write("        #cancel-button:hover {\n");
      out.write("            background-color: red;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("  \n");
      out.write("<form method=\"POST\" action=\"Admin_Login.jsp\">\n");
      out.write("       <div class=\"container\">            \n");
      out.write("           <h1>Admin Login !!</h1>\n");
      out.write("           <div class=\"label\">\n");
      out.write("               <label>Username</label> \n");
      out.write("           </div>\n");
      out.write("           <input type=\"text\" name=\"username\" required id=\"username\" placeholder=\"Enter Your Username\" class=\"form-control\"><br><br>\n");
      out.write("          \n");
      out.write("           <div class=\"label\">\n");
      out.write("               <label>Password</label> \n");
      out.write("           </div>\n");
      out.write("           <input type=\"password\" name=\"password\" required id=\"password\" placeholder=\"Enter Your Password\" class=\"form-control\"><br><br>\n");
      out.write("           \n");
      out.write("           <div class=\"btn\">\n");
      out.write("              <input type=\"submit\" id=\"button\" value=\"LOGIN\"/>\n");
      out.write("              <input type=\"button\" id=\"cancel-button\" value=\"EXIT\"/><br>\n");
      out.write("           </div>\n");
      out.write("       </div>    \n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    <script>\n");
      out.write("        // When the page loads, check if the user is already logged in\n");
      out.write("    window.onload = function(){\n");
      out.write("        // Check if a sessionStorage item named 'loggedIn' exists\n");
      out.write("        if (sessionStorage.getItem('loggedIn') === 'true') {\n");
      out.write("            // If the user is already logged in, redirect them to Admin-Nav.jsp\n");
      out.write("            window.location.href = \"Admin-Nav.jsp\";\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    // Prevent form submission and validate credentials\n");
      out.write("    document.getElementById(\"button\").addEventListener(\"click\", function(event) {\n");
      out.write("        event.preventDefault(); // Prevent form submission\n");
      out.write("        \n");
      out.write("        // Hardcoded username and password\n");
      out.write("        var validUsername = \"Admin_Teju\";\n");
      out.write("        var validPassword = \"Admin_Teju\";\n");
      out.write("\n");
      out.write("        // Get user inputs\n");
      out.write("        var username = document.getElementsByName(\"username\")[0].value;\n");
      out.write("        var password = document.getElementsByName(\"password\")[0].value;\n");
      out.write("\n");
      out.write("        // Check if fields are empty\n");
      out.write("        if (username === \"\" || password === \"\") {\n");
      out.write("            alert(\"Please enter both username and password!\");\n");
      out.write("            return;\n");
      out.write("        }\n");
      out.write("\n");
      out.write("        // Validate credentials\n");
      out.write("        if (username === validUsername && password === validPassword) {\n");
      out.write("            alert(\"Login successful..!!\");\n");
      out.write("\n");
      out.write("            // Set the sessionStorage value to indicate the user is logged in\n");
      out.write("            sessionStorage.setItem('loggedIn', 'true');\n");
      out.write("\n");
      out.write("            // Redirect to the admin navigation page\n");
      out.write("            window.location.href = \"Admin-Nav.jsp\"; \n");
      out.write("        } else {\n");
      out.write("            alert(\"Invalid username or password..!!\");\n");
      out.write("        }\n");
      out.write("    });\n");
      out.write("\n");
      out.write("    // Cancel button logic: Redirect to Dashboard.jsp\n");
      out.write("    document.getElementById(\"cancel-button\").addEventListener(\"click\", function(){\n");
      out.write("        window.location.href = \"Dashboard.jsp\";\n");
      out.write("    });\n");
      out.write("    </script>\n");
      out.write("    \n");
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
}
