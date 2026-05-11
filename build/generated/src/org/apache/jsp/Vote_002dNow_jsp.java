package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class Vote_002dNow_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("<html>\n");
      out.write("<head>\n");
      out.write("    <title>Candidate List</title>\n");
      out.write("    <style>\n");
      out.write("        table { width: 80%; border-collapse: collapse; margin: 20px auto; }\n");
      out.write("        th, td { border: 1px solid black; padding: 10px; text-align: center; }\n");
      out.write("        th { background-color: green; color: white; }\n");
      out.write("        img { width: 50px; height: 50px; }\n");
      out.write("        .vote-btn { background-color: blue; color: white; padding: 5px 10px; cursor: pointer; border: none; }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("    <h2 align=\"center\">Candidate List</h2>\n");
      out.write("\n");
      out.write("    <form action=\"Vote_Now_Servlet\" method=\"post\">\n");
      out.write("        <input type=\"hidden\" name=\"candidateId\" id=\"candidateId\" value=\"");
      out.print(request.getParameter("candidateId"));
      out.write("\">\n");
      out.write("        <input type=\"hidden\" name=\"electionType\" id=\"electionType\" value=\"");
      out.print(request.getParameter("electionType"));
      out.write("\">\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    <table align=\"center\">\n");
      out.write("        <tr>\n");
      out.write("            <th>Election Type</th>\n");
      out.write("            <th>Candidate Name</th>\n");
      out.write("            <th>Candidate Image</th>\n");
      out.write("            <th>Party Name</th>\n");
      out.write("            <th>Party Image</th>\n");
      out.write("            <th>Action</th>\n");
      out.write("        </tr>\n");
      out.write("        \n");
      out.write("        ");

            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/Add_Candidates", "Add_Candidates", "Add_Candidates");
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT ID, ELECTION_TYPE, CANDIDATE_NAME, CANDIDATE_PIC, PARTY_NAME, PARTY_PIC FROM ADD_CANDIDATES");

                while (rs.next()) {
                    int candidateId = rs.getInt("ID"); // ? Get candidate ID
                    String electionType = rs.getString("ELECTION_TYPE");
                    String candidateName = rs.getString("CANDIDATE_NAME");
                    String candidatePic = rs.getString("CANDIDATE_PIC");
                    String partyName = rs.getString("PARTY_NAME");
                    String partyPic = rs.getString("PARTY_PIC");
        
      out.write("\n");
      out.write("        <tr>\n");
      out.write("            <td>");
      out.print( electionType );
      out.write("</td>\n");
      out.write("            <td>");
      out.print( candidateName );
      out.write("</td>\n");
      out.write("            <td><img src=\"");
      out.print( request.getContextPath() );
      out.write('/');
      out.print( candidatePic );
      out.write("\" alt=\"");
      out.print( candidateName );
      out.write("\"></td>\n");
      out.write("            <td>");
      out.print( partyName );
      out.write("</td>\n");
      out.write("            <td><img src=\"");
      out.print( request.getContextPath() );
      out.write('/');
      out.print( partyPic );
      out.write("\" alt=\"");
      out.print( partyName );
      out.write("\"></td>\n");
      out.write("            <td>\n");
      out.write("                <button class=\"vote-btn\" onclick=\"vote('");
      out.print( candidateId );
      out.write("', '");
      out.print( electionType );
      out.write("')\">Vote</button>\n");
      out.write("            </td>\n");
      out.write("        </tr>\n");
      out.write("        ");
  
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            }
        
      out.write("\n");
      out.write("    </table>\n");
      out.write("\n");
      out.write("    <script>\n");
      out.write("        function vote(candidateId, electionType) {\n");
      out.write("            if (confirm(\"Are you sure you want to vote?\")) {\n");
      out.write("                document.getElementById(\"candidateId\").value = candidateId;\n");
      out.write("                document.getElementById(\"electionType\").value = electionType;\n");
      out.write("                document.forms[0].submit();\n");
      out.write("            }\n");
      out.write("        }\n");
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
