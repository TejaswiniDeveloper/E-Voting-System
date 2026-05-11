package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Add_005fCandidates_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Add Candidate - E-Voting</title>\n");
      out.write("    <style>\n");
      out.write("        *{\n");
      out.write("            font-family: Times-New-Roman;\n");
      out.write("        }\n");
      out.write("        body {         \n");
      out.write("            padding: 0;\n");
      out.write("            background-image: url(AL3.jpg);\n");
      out.write("            background-size: cover;\n");
      out.write("            object-fit: cover;\n");
      out.write("            background-position: center;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            height: 100%;\n");
      out.write("            margin: 1%;\n");
      out.write("        }\n");
      out.write("        .container {\n");
      out.write("            width: 450px;\n");
      out.write("            backdrop-filter: blur(6px);\n");
      out.write("            padding: 20px;\n");
      out.write("            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            margin-left: 230px;\n");
      out.write("            border-radius: 30px 75px 30px 75px;\n");
      out.write("            background-image: url(NF3.jpg);\n");
      out.write("            background-size: cover;\n");
      out.write("            object-fit: cover;\n");
      out.write("            background-position: center;\n");
      out.write("            background-repeat: no-repeat;\n");
      out.write("            height: 100%;\n");
      out.write("        \n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            color: black;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            font-weight: bold;\n");
      out.write("            display: block;\n");
      out.write("            margin-top: 10px;\n");
      out.write("            font-size: 25px;\n");
      out.write("        }\n");
      out.write("        input, select {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 8px;\n");
      out.write("            margin-top: 5px;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 25px;\n");
      out.write("        }\n");
      out.write("        input:hover{\n");
      out.write("            border: 2.5px solid peru;\n");
      out.write("        }\n");
      out.write("        #btn {           \n");
      out.write("            margin-left: 10rem;\n");
      out.write("            width: 110px;\n");
      out.write("            color: white;\n");
      out.write("            background-color: green;\n");
      out.write("            border-radius: 20px;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("        #btn:hover {\n");
      out.write("            color: black;\n");
      out.write("            background-color: darkgreen;\n");
      out.write("            border: none;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <div class=\"container\">\n");
      out.write("        <h1>Add Candidates !!</h1>\n");
      out.write("        <form action=\"Add_Candidates_Servlet\" method=\"post\" enctype=\"multipart/form-data\">\n");
      out.write("            <label for=\"electionType\">Election Type:</label>\n");
      out.write("            <select name=\"electionType\" required>\n");
      out.write("                <option value=\"\">-- Select Election --</option>\n");
      out.write("                ");

                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Add_Election", "Add_Election", "Add_Election");
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery("SELECT ELECTION_NAME FROM Add_Election");

                    while (rs.next()) {
                        String electionName = rs.getString("ELECTION_NAME");
            
      out.write("\n");
      out.write("                <option value=\"");
      out.print( electionName );
      out.write('"');
      out.write('>');
      out.print( electionName );
      out.write("</option>\n");
      out.write("            ");

                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (rs != null) rs.close();
                    if (stmt != null) stmt.close();
                    if (conn != null) conn.close();
                }
            
      out.write("\n");
      out.write("            </select>\n");
      out.write("\n");
      out.write("            <label for=\"candidateName\">Candidate Name:</label>\n");
      out.write("            <input type=\"text\" name=\"candidateName\" required>\n");
      out.write("\n");
      out.write("            <label for=\"candidatePic\">Candidate Picture:</label>\n");
      out.write("            <input type=\"file\" name=\"candidatePic\" required>\n");
      out.write("\n");
      out.write("            <label for=\"partyName\">Party Name:</label>\n");
      out.write("            <input type=\"text\" name=\"partyName\" required>\n");
      out.write("\n");
      out.write("            <label for=\"partyPic\">Party Picture:</label>\n");
      out.write("            <input type=\"file\" name=\"partyPic\" required>\n");
      out.write("\n");
      out.write("            <label for=\"address\">Address:</label>\n");
      out.write("            <input type=\"text\" name=\"address\" required>\n");
      out.write("\n");
      out.write("            <label for=\"phone\">Phone Number:</label>\n");
      out.write("            <input type=\"text\" name=\"phone\" required>\n");
      out.write("\n");
      out.write("            <input type=\"submit\" id=\"btn\" value=\"Submit\">\n");
      out.write("        </form>\n");
      out.write("    </div>\n");
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
