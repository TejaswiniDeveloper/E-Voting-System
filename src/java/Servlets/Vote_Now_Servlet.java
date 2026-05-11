package Servlets;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Vote_Now_Servlet")
public class Vote_Now_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String candidateName = request.getParameter("candidateName");
        String electionType = request.getParameter("electionType");

        Connection con = null;
        PreparedStatement ps = null;

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Add_Candidates", "Add_Candidates", "Add_Candidates");

            // Increment vote count
            String updateVoteQuery = "UPDATE Add_Candidates SET TOTAL_VOTES = TOTAL_VOTES + 1 WHERE CANDIDATE_NAME = ? AND ELECTION_TYPE = ?";
            ps = con.prepareStatement(updateVoteQuery);
            ps.setString(1, candidateName);
            ps.setString(2, electionType);
            int rowsUpdated = ps.executeUpdate();

            if (rowsUpdated > 0) {
                response.getWriter().println("<script>alert('Successfully Voted'); window.location.href='Vote-Now.jsp';</script>");
            } else {
                response.getWriter().println("<script>alert('Voted!'); window.location.href='Vote-Now.jsp';</script>");
            }

        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().println("<script>alert('Database Error!'); window.location.href='Vote-Now.jsp';</script>");
        } finally {
            try {
                if (ps != null) ps.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}