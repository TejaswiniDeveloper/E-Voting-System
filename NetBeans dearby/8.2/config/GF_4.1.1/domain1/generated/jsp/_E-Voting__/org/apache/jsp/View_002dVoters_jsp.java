package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class View_002dVoters_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>E-Voting!!</title>\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("            font-family: Times-New-Roman;\n");
      out.write("        }\n");
      out.write("        h1{\n");
      out.write("            font-size: 40px;\n");
      out.write("            color: black;\n");
      out.write("            font-family: monospace;\n");
      out.write("        }\n");
      out.write("        button{\n");
      out.write("           color: white;\n");
      out.write("           background-color: green;\n");
      out.write("           height: 40px;\n");
      out.write("           border-radius: 8px;\n");
      out.write("           font-size: 18px;\n");
      out.write("        }\n");
      out.write("        button:hover{\n");
      out.write("            background-color: darkgreen;\n");
      out.write("        }\n");
      out.write("        body {\n");
      out.write("            font-family: Arial, sans-serif;\n");
      out.write("            background-color: #f4f4f4;\n");
      out.write("            margin: 20px;\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 80%;\n");
      out.write("            margin: auto;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background: #fff;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            border-radius: 10px;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            padding: 10px;\n");
      out.write("            text-align: center;\n");
      out.write("            border-bottom: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("        th {\n");
      out.write("            background-color: #009879;\n");
      out.write("            color: white;\n");
      out.write("        }\n");
      out.write("        tr:nth-child(even) {\n");
      out.write("            background-color: #f2f2f2;\n");
      out.write("        }\n");
      out.write("        .btn {\n");
      out.write("            padding: 5px 10px;\n");
      out.write("            border: none;\n");
      out.write("            color: white;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 3px;\n");
      out.write("        }\n");
      out.write("       \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"btn\">   <button>Pending Voters</button> </div>\n");
      out.write("    <h1><center>Registered Voter's List</center></h1>\n");
      out.write("    <table border=\"4\">\n");
      out.write("        <tr>\n");
      out.write("            <th>ID</th>\n");
      out.write("            <th>Full Name</th>\n");
      out.write("            <th>Gender</th>\n");
      out.write("            <th>Date of Birth</th>\n");
      out.write("            <th>Contact</th>\n");
      out.write("            <th>Address</th>\n");
      out.write("            <th>Email</th>\n");
      out.write("            <th>Status</th>\n");
      out.write("        </tr>\n");
      out.write("        ");

            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver"); // Derby Driver
                Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Users_Registration", "Users_Registration", "Users_Registration");
                Statement stmt = con.createStatement();
                ResultSet rs = stmt.executeQuery("SELECT * FROM Users_Registration");

                while (rs.next()) {
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( rs.getInt("ID") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("FULLNAME") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("GENDER") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getDate("DOB") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("CONTACT") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("ADDRESS") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("EMAIL") );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( rs.getString("STATUS") );
      out.write("</td>\n");
      out.write("        </tr>\n");
      out.write("        ");

                }
                con.close();
            } catch (Exception e) {
                out.println("Error: " + e.getMessage());
            }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("    <script>\n");
      out.write("          document.getElementById(\"btn\").addEventListener(\"click\",function(){\n");
      out.write("                window.location.href =\"Admin_Approve_Users.jsp\";\n");
      out.write("            });         \n");
      out.write("\n");
      out.write("    </script>\n");
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
