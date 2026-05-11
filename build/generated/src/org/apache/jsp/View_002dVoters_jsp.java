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
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>E-Voting!!</title>\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("            font-family: 'Times New Roman', Times, serif;\n");
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
      out.write("            margin: 10px;\n");
      out.write("        }\n");
      out.write("        .table-container{\n");
      out.write("            width: 100%;\n");
      out.write("            overflow-x: auto;   /* ð¥ allows horizontal scroll on small screens */\n");
      out.write("        }\n");
      out.write("        table {\n");
      out.write("            width: 100%;\n");
      out.write("             /* ð¥ ensures table is wide enough for all columns */\n");
      out.write("            margin: auto;\n");
      out.write("            border-collapse: collapse;\n");
      out.write("            background: #fff;\n");
      out.write("            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            border-radius: 10px;\n");
      out.write("        }\n");
      out.write("        th, td {\n");
      out.write("            padding: 8px;\n");
      out.write("            text-align: center;\n");
      out.write("            border-bottom: 1px solid #ddd;\n");
      out.write("        }\n");
      out.write("        /* HEADER STYLE */\n");
      out.write("th {\n");
      out.write("    background-color: #009879;   /* green header */\n");
      out.write("    color: white;\n");
      out.write("    font-weight: bold;\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* ZEBRA STRIPES (ROW COLORS) */\n");
      out.write("tr:nth-child(even) {\n");
      out.write("    background-color: #f2f2f2;   /* light gray */\n");
      out.write("}\n");
      out.write("\n");
      out.write("tr:nth-child(odd) {\n");
      out.write("    background-color: #ffffff;   /* white */\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* OPTIONAL: hover effect */\n");
      out.write("tr:hover {\n");
      out.write("    background-color: #d9f2e6;   /* soft green highlight */\n");
      out.write("    transition: 0.2s;\n");
      out.write("}\n");
      out.write("        \n");
      out.write("        /* ===== 700px to 900px ===== */\n");
      out.write("@media (min-width: 700px) and (max-width: 900px){\n");
      out.write("    \n");
      out.write("\n");
      out.write("    th, td{\n");
      out.write("        font-size: 14px;\n");
      out.write("        padding: 8px;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    h1{\n");
      out.write("        font-size: 32px;\n");
      out.write("        text-align: center;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    button{\n");
      out.write("        font-size: 16px;\n");
      out.write("        height: 38px;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("/* MOBILE TABLE VIEW */\n");
      out.write("@media (max-width:700px){\n");
      out.write("\n");
      out.write("    table,\n");
      out.write("    tbody,\n");
      out.write("    tr,\n");
      out.write("    td{\n");
      out.write("        display: block;\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    th{\n");
      out.write("        display: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    table{\n");
      out.write("        background: transparent;\n");
      out.write("        box-shadow: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    tr{\n");
      out.write("        margin-bottom: 15px;\n");
      out.write("        background-color: #f2f2f2;\n");
      out.write("        border-radius: 10px;\n");
      out.write("        padding: 10px;\n");
      out.write("        box-shadow: 0 0 5px rgba(0,0,0,0.1);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    td{\n");
      out.write("        text-align: left;\n");
      out.write("        border: none;\n");
      out.write("        border-bottom: 1px solid #ccc;\n");
      out.write("        padding: 8px;\n");
      out.write("        background: transparent;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    td:last-child{\n");
      out.write("        border-bottom: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    td::before{\n");
      out.write("        content: attr(data-label) \" : \";\n");
      out.write("        font-weight: bold;\n");
      out.write("        color: #009879;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("@media (min-width:270px) and (max-width:700px){\n");
      out.write("\n");
      out.write("    table,\n");
      out.write("    tbody,\n");
      out.write("    tr,\n");
      out.write("    td{\n");
      out.write("        display: block;\n");
      out.write("        width: 100%;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    th{\n");
      out.write("        display: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    table{\n");
      out.write("        background: transparent;\n");
      out.write("        box-shadow: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    tr{\n");
      out.write("        margin-bottom: 15px;\n");
      out.write("        background-color: #f2f2f2;\n");
      out.write("        border-radius: 10px;\n");
      out.write("        padding: 10px;\n");
      out.write("        box-shadow: 0 0 5px rgba(0,0,0,0.1);\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    td{\n");
      out.write("        text-align: left;\n");
      out.write("        border: none;\n");
      out.write("        border-bottom: 1px solid #ccc;\n");
      out.write("        padding: 8px;\n");
      out.write("        background: transparent;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    td:last-child{\n");
      out.write("        border-bottom: none;\n");
      out.write("    }\n");
      out.write("\n");
      out.write("    td::before{\n");
      out.write("        content: attr(data-label) \" : \";\n");
      out.write("        font-weight: bold;\n");
      out.write("        color: #009879;\n");
      out.write("    }\n");
      out.write("}\n");
      out.write("\n");
      out.write("   \n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div id=\"btn\">   <button>Pending Voters</button> </div>\n");
      out.write("    <h1><center>Registered Voter's List</center></h1>\n");
      out.write("    <div class=\"table-container\">\n");
      out.write("        <table border=\"4\">\n");
      out.write("            <tr>\n");
      out.write("                <th>ID</th>\n");
      out.write("                <th>Full Name</th>\n");
      out.write("                <th>Gender</th>\n");
      out.write("                <th>Date of Birth</th>\n");
      out.write("                <th>Contact</th>\n");
      out.write("                <th>Address</th>\n");
      out.write("                <th>Email</th>\n");
      out.write("                <th>Status</th>\n");
      out.write("            </tr>\n");
      out.write("            ");

                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver"); // Derby Driver
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Users_Registration", "Users_Registration", "Users_Registration");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM Users_Registration");

                    while (rs.next()) {
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                \n");
      out.write("                <td data-label=\"ID\">");
      out.print( rs.getInt("ID") );
      out.write("</td>\n");
      out.write("\n");
      out.write("                <td data-label=\"Full Name\">\n");
      out.write("                    ");
      out.print( rs.getString("FULLNAME") );
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td data-label=\"Gender\">\n");
      out.write("                    ");
      out.print( rs.getString("GENDER") );
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td data-label=\"Date of Birth\">\n");
      out.write("                    ");
      out.print( rs.getDate("DOB") );
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td data-label=\"Contact\">\n");
      out.write("                    ");
      out.print( rs.getString("CONTACT") );
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td data-label=\"Address\">\n");
      out.write("                    ");
      out.print( rs.getString("ADDRESS") );
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td data-label=\"Email\">\n");
      out.write("                    ");
      out.print( rs.getString("EMAIL") );
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("                <td data-label=\"Status\">\n");
      out.write("                    ");
      out.print( rs.getString("STATUS") );
      out.write("\n");
      out.write("                </td>\n");
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            ");

                    }
                    con.close();
                } catch (Exception e) {
                    out.println("Error: " + e.getMessage());
                }
            
      out.write("\n");
      out.write("        </table>\n");
      out.write("    </div>\n");
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
