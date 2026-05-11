package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Fetch_Results_Servlet")
public class Fetch_Results_Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();

        String electionType = request.getParameter("electionType");

        if (electionType == null || electionType.trim().isEmpty()) {
            out.println("<p style='color:red;'>Please select an election.</p>");
            return;
        }

        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null;

        try {
            // Load Database Driver
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Add_Candidates", "Add_Candidates", "Add_Candidates");

            // Fetch candidates and vote counts
            String query = "SELECT CANDIDATE_NAME, PARTY_NAME, TOTAL_VOTES FROM ADD_CANDIDATES WHERE ELECTION_TYPE = ?";
            ps = con.prepareStatement(query);
            ps.setString(1, electionType);
            rs = ps.executeQuery();

            // Start HTML Table
            out.println("<table border='1' style='width:80%; border-collapse: collapse; text-align:center; margin-top:10px;'>");
            out.println("<tr style='background-color: #f2f2f2; font-weight: bold;'>");
            out.println("<th>Candidate</th><th>Party</th><th>Total Votes</th></tr>");

            boolean hasResults = false;

            while (rs.next()) {
                hasResults = true;
                out.println("<tr>");
                out.println("<td>" + rs.getString("CANDIDATE_NAME") + "</td>");
                out.println("<td>" + rs.getString("PARTY_NAME") + "</td>");               
                out.println("<td>" + rs.getInt("TOTAL_VOTES") + "</td>");
                out.println("</tr>");
            }

            if (!hasResults) {
                out.println("<tr><td colspan='3' style='text-align:center; color:red;'>No candidates found for this election.</td></tr>");
            }

            out.println("</table>");

        } catch (Exception e) {
            e.printStackTrace(); // Log error in the server console
            out.println("<p style='color:red;'>Error fetching results. Please try again later.</p>");
        } finally {
            // Close resources
            try {
                if (rs != null) rs.close();
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}