package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class Add_005fElection_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>E-Voting!!</title>\n");
      out.write("    <style>\n");
      out.write("        body {\n");
      out.write("            font-family: Times-New_Roman;        \n");
      out.write("            padding: 0;\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: center;\n");
      out.write("            align-items: center;\n");
      out.write("                background-image: url(Add-El1.jpg);\n");
      out.write("                background-size: cover;\n");
      out.write("                object-fit: cover;\n");
      out.write("                background-position: center;\n");
      out.write("                background-repeat: no-repeat;\n");
      out.write("                height: 100%;\n");
      out.write("                margin: 1%;\n");
      out.write("            }\n");
      out.write("        .container {\n");
      out.write("            width: 450px;\n");
      out.write("            backdrop-filter:blur(6px);\n");
      out.write("            padding: 20px;\n");
      out.write("            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);\n");
      out.write("            border-radius: 20px 60px 20px 60px;\n");
      out.write("            margin-top: 90px;            \n");
      out.write("            border: 1px solid gray;\n");
      out.write("            margin-right: 4rem;\n");
      out.write("        }\n");
      out.write("        h1 {\n");
      out.write("            text-align: center;\n");
      out.write("            font-size: 3.5rem;\n");
      out.write("            color: black;\n");
      out.write("            text-decoration: underline graytext;\n");
      out.write("        }\n");
      out.write("        label {\n");
      out.write("            font-weight: bold;\n");
      out.write("            display: block;\n");
      out.write("            margin-top: 10px;\n");
      out.write("            font-size: 25px;\n");
      out.write("        }\n");
      out.write("        input {\n");
      out.write("            width: 100%;\n");
      out.write("            padding: 8px;\n");
      out.write("            margin-top: 5px;\n");
      out.write("            border: 1px solid #ddd;\n");
      out.write("            border-radius: 5px;\n");
      out.write("            font-size: 20px;\n");
      out.write("        }\n");
      out.write("        .buttons {\n");
      out.write("            display: flex;\n");
      out.write("            justify-content: space-between;\n");
      out.write("            margin-top: 15px;\n");
      out.write("        }\n");
      out.write("        button {\n");
      out.write("            flex: 1;\n");
      out.write("            padding: 10px;\n");
      out.write("            margin: 5px;\n");
      out.write("            border: none;\n");
      out.write("            background: green;\n");
      out.write("            color: white;\n");
      out.write("            cursor: pointer;\n");
      out.write("            border-radius: 5px;\n");
      out.write("        }\n");
      out.write("        button:hover {\n");
      out.write("            background: darkgreen;\n");
      out.write("        }\n");
      out.write("        .update{\n");
      out.write("            background-color: #007bff;\n");
      out.write("        }\n");
      out.write("         .update:hover {\n");
      out.write("            background: #006e8a;\n");
      out.write("        }\n");
      out.write("        .delete {\n");
      out.write("            background: #dc3545;\n");
      out.write("        }\n");
      out.write("        .delete:hover {\n");
      out.write("            background: #b52b36;\n");
      out.write("        }\n");
      out.write("        .message {\n");
      out.write("            text-align: center;\n");
      out.write("            color: green;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        .error {\n");
      out.write("            text-align: center;\n");
      out.write("            color: red;\n");
      out.write("            margin-top: 10px;\n");
      out.write("        }\n");
      out.write("        p{\n");
      out.write("            font-size: 22px;\n");
      out.write("        }\n");
      out.write("    </style>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("    <h1>Add Election !!</h1>\n");
      out.write("    \n");
      out.write("    <form method=\"post\" action=\"Add_Election.jsp\">\n");
      out.write("        <label for=\"electionId\">Election ID:</label>\n");
      out.write("        <input type=\"text\" id=\"electionId\" name=\"electionId\" required>\n");
      out.write("\n");
      out.write("        <label for=\"electionName\">Election Name:</label>\n");
      out.write("        <input type=\"text\" id=\"electionName\" name=\"electionName\" required>\n");
      out.write("\n");
      out.write("        <label for=\"electionDate\">Election Date:</label>\n");
      out.write("        <input type=\"date\" id=\"electionDate\" name=\"electionDate\" required>\n");
      out.write("\n");
      out.write("        <label for=\"conductDate\">Code of Conduct Date:</label>\n");
      out.write("        <input type=\"date\" id=\"conductDate\" name=\"conductDate\" required>\n");
      out.write("\n");
      out.write("        <div class=\"buttons\">\n");
      out.write("            <button type=\"submit\" name=\"action\" value=\"Add\">Add</button>\n");
      out.write("            <button type=\"submit\" name=\"action\" value=\"Update\" class=\"update\">Update</button>\n");
      out.write("            <button type=\"submit\" name=\"action\" value=\"Delete\" class=\"delete\">Delete</button>\n");
      out.write("        </div>\n");
      out.write("    </form>\n");
      out.write("\n");
      out.write("    ");
 
        String action = request.getParameter("action");
        if (action != null) {
            String electionId   = request.getParameter("electionId");
            String electionName = request.getParameter("electionName");
            String electionDate = request.getParameter("electionDate");
            String conductDate  = request.getParameter("conductDate");

            Connection conn = null;
            PreparedStatement ps = null;
            String sql = "";

            try {
                // Load Apache Derby driver
                Class.forName("org.apache.derby.jdbc.EmbeddedDriver");

                // Update database connection URL
                String dbURL = "jdbc:derby://localhost:1527/Add_Election;create=true";
                conn = DriverManager.getConnection(dbURL, "Add_Election", "Add_Election");

                if ("Add".equals(action)) {     
                    sql = "INSERT INTO Add_Election (ELECTION_ID, ELECTION_NAME, ELECTION_DATE, CODE_OF_CONDUCT_DATE) VALUES (?,?,?,?)";
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, electionId);
                    ps.setString(2, electionName);
                    ps.setDate(3, java.sql.Date.valueOf(electionDate));
                    ps.setDate(4, java.sql.Date.valueOf(conductDate));
                    int result = ps.executeUpdate();
                    if (result > 0) {
                        out.println("<p class='message'>Election added successfully.</p>");
                    }
                } else if ("Update".equals(action)) {
                    sql = "UPDATE Add_Election SET ELECTION_NAME=?, ELECTION_DATE=?, CODE_OF_CONDUCT_DATE=? WHERE ELECTION_ID=?";
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, electionName);
                    ps.setDate(2, java.sql.Date.valueOf(electionDate));
                    ps.setDate(3, java.sql.Date.valueOf(conductDate));
                    ps.setString(4, electionId);
                    int result = ps.executeUpdate();
                    if (result > 0) {
                        out.println("<p class='message'>Election updated successfully.</p>");
                    } else {
                        out.println("<p class='error'>No election found with the given ID.</p>");
                    }
                } else if ("Delete".equals(action)) {
                    sql = "DELETE FROM Add_Election WHERE ELECTION_ID=?";
                    ps = conn.prepareStatement(sql);
                    ps.setString(1, electionId);
                    int result = ps.executeUpdate();
                    if (result > 0) {
                        out.println("<p class='message'>Election deleted successfully.</p>");
                    } else {
                        out.println("<p class='error'>No election found with the given ID.</p>");
                    }
                }
            } catch (Exception e) {
                out.println("<p class='error'>Error: " + e.getMessage() + "</p>");
            } finally {
                if (ps != null) try { ps.close(); } catch (Exception ignored) {}
                if (conn != null) try { conn.close(); } catch (Exception ignored) {}
            }
        }
    
      out.write("\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("\n");
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
