package Servlets;

import java.io.IOException;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;

/**
 *
 * @author LENOVO
 */
@WebServlet(name = "Delete_Voter_Servlet", urlPatterns = {"/Delete_Voter_Servlet"})
public class Delete_Voter_Servlet extends HttpServlet {
 protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Users_Registration;create=true", "Users_Registration", "Users_Registration");

            String query = "DELETE FROM Users_Registration WHERE email=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, email);
            int rowsAffected = ps.executeUpdate();

            ps.close();
            conn.close();

            if (rowsAffected > 0) {
                response.sendRedirect("View-Voters.jsp");  // Refresh the page after deletion
            } else {
                response.getWriter().println("Error: Voter not found!");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

