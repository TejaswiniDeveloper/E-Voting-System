package Servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.http.Part;

@WebServlet("/User_Login_Servlet")
public class User_Login_Servlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String email = request.getParameter("txt_email");
        String password = request.getParameter("txt_password");

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Users_Registration", "Users_Registration", "Users_Registration");

            String query = "SELECT status FROM Users_Registration WHERE email = ? AND password = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, password);

            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                String status = rs.getString("status");

                if ("Approved".equalsIgnoreCase(status)) {
                    // ✅ Store user email in session
                    HttpSession session = request.getSession();
                    session.setAttribute("userEmail", email);  // ✅ Now, you can access this in VoteServlet.java
                    
                    response.getWriter().write("success");
                } else if ("Pending".equalsIgnoreCase(status)) {
                    response.getWriter().write("pending");
                } else if ("Rejected".equalsIgnoreCase(status)) {
                    response.getWriter().write("rejected");
                }
            } else {
                response.getWriter().write("error");
            }

            con.close();
        } catch (Exception e) {
            e.printStackTrace();
            response.getWriter().write("error");
        }
    }
}