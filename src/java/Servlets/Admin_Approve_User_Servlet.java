/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

@WebServlet("/Admin_Approve_User_Servlet")
public class Admin_Approve_User_Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String action = request.getParameter("action");

        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Users_Registration", "Users_Registration", "Users_Registration");

            String status = action.equals("approve") ? "Approved" : "Rejected";
            String query = "UPDATE Users_Registration SET status = ? WHERE email = ?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, status);
            pst.setString(2, email);
            pst.executeUpdate();

            response.sendRedirect("Admin_Approve_Users.jsp"); // Reload admin page
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}