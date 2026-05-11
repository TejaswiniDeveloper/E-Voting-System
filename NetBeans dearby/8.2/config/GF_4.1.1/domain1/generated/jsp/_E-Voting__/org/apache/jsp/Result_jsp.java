package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Result_jsp extends org.apache.jasper.runtime.HttpJspBase
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

      out.write("\r\n");
      out.write("\r\n");
      out.write("<center>\r\n");

    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/Add_Candidates", "Add_Candidates", "Add_Candidates");

        // Get all election names for dropdown
        String electionQuery = "SELECT DISTINCT ELECTION_TYPE FROM Add_Candidates";
        ps = con.prepareStatement(electionQuery);
        rs = ps.executeQuery();

      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("    <title>Election Results</title>\r\n");
      out.write("    <script>\r\n");
      out.write("    function fetchResults() {\r\n");
      out.write("        var electionType = document.getElementById(\"electionSelect\").value;\r\n");
      out.write("        if (electionType === \"\") {\r\n");
      out.write("            document.getElementById(\"resultTable\").innerHTML = \"<p style='color:red;'>Please select an election.</p>\";\r\n");
      out.write("            return;\r\n");
      out.write("        }\r\n");
      out.write("\r\n");
      out.write("        var xhr = new XMLHttpRequest();\r\n");
      out.write("        xhr.open(\"GET\", \"Fetch_Results_Servlet?electionType=\" + encodeURIComponent(electionType), true);\r\n");
      out.write("        xhr.onreadystatechange = function () {\r\n");
      out.write("            if (xhr.readyState == 4) {\r\n");
      out.write("                if (xhr.status == 200) {\r\n");
      out.write("                    document.getElementById(\"resultTable\").innerHTML = xhr.responseText;\r\n");
      out.write("                } else {\r\n");
      out.write("                    document.getElementById(\"resultTable\").innerHTML = \"<p style='color:red;'>Error fetching results.</p>\";\r\n");
      out.write("                }\r\n");
      out.write("            }\r\n");
      out.write("        };\r\n");
      out.write("        xhr.send();\r\n");
      out.write("    }\r\n");
      out.write("</script>\r\n");
      out.write("    <style>\r\n");
      out.write("        *{\r\n");
      out.write("            font-family: Times-New-Roman;\r\n");
      out.write("            font-size: 20px;\r\n");
      out.write("        }\r\n");
      out.write("        body{\r\n");
      out.write("            background-image: url(Img4.jpg);\r\n");
      out.write("            background-size: cover;\r\n");
      out.write("            object-fit: cover;\r\n");
      out.write("            background-position: center;\r\n");
      out.write("            background-repeat: no-repeat;\r\n");
      out.write("            height: 100%;\r\n");
      out.write("            margin: 0%;\r\n");
      out.write("        }\r\n");
      out.write("        h1{\r\n");
      out.write("            font-size: 40px;\r\n");
      out.write("            color: darkred;\r\n");
      out.write("            backdrop-filter: blur(2px);\r\n");
      out.write("        }\r\n");
      out.write("        select{\r\n");
      out.write("            backdrop-filter: blur(50px);\r\n");
      out.write("        \r\n");
      out.write("            #resultTable{\r\n");
      out.write("                background-color: whitesmoke;\r\n");
      out.write("            }\r\n");
      out.write("    </style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("    <h1>SELECT ELECTIONS TO VIEW RESULTS</h1>\r\n");
      out.write("    <select id=\"electionSelect\" onchange=\"fetchResults()\">\r\n");
      out.write("        <option value=\"\">-- Select Election --</option>\r\n");
      out.write("        ");

            while (rs.next()) {
        
      out.write("\r\n");
      out.write("            <option value=\"");
      out.print( rs.getString("ELECTION_TYPE") );
      out.write('"');
      out.write('>');
      out.print( rs.getString("ELECTION_TYPE") );
      out.write("</option>\r\n");
      out.write("        ");

            }
        
      out.write("\r\n");
      out.write("    </select>\r\n");
      out.write("    <br><br>\r\n");
      out.write("    <div id=\"resultTable\"></div>\r\n");
      out.write("</body>\r\n");
      out.write("</html>\r\n");
      out.write("\r\n");

    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

      out.write("\r\n");
      out.write("</center>");
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
