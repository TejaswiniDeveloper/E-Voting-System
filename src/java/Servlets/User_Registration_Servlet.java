package Servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.Period;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/User_Registration_Servlet")
public class User_Registration_Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/plain");

        String fullName = request.getParameter("txt_fullname");
        String gender = request.getParameter("txt_gender");
        String dob = request.getParameter("dob");
        String contact = request.getParameter("txt_contact");
        String address = request.getParameter("txt_name");
        String email = request.getParameter("txt_email");
        String password = request.getParameter("txt_password");
        String confirmPassword = request.getParameter("txt_cpassword");

        if (!isUserAdult(dob)) {
            response.getWriter().write("error-age");
            return;
        }

        if (!password.equals(confirmPassword)) {
            response.getWriter().write("error-password");
            return;
        }

        Connection con = null;
        PreparedStatement pst = null;
        try {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            con = DriverManager.getConnection("jdbc:derby://localhost:1527/Users_Registration", "Users_Registration", "Users_Registration");

            String query = "INSERT INTO Users_Registration (FULLNAME, GENDER, DOB, CONTACT, ADDRESS, EMAIL, PASSWORD, CONFIRM_PASSWORD, STATUS) VALUES (?, ?, ?, ?, ?, ?, ?, ?, 'Pending')";
            pst = con.prepareStatement(query);
            pst.setString(1, fullName);
            pst.setString(2, gender);
            pst.setString(3, dob);
            pst.setString(4, contact);
            pst.setString(5, address);
            pst.setString(6, email);
            pst.setString(7, password);
            pst.setString(8, confirmPassword);

            int rowsInserted = pst.executeUpdate();

            if (rowsInserted > 0) {
                response.getWriter().write("Registration successfully Completed !!..WAIT FOR ADMIN APPROVEL AND THEN LOGIN");
            } else {
                response.getWriter().write("error-db");
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            response.getWriter().write("error: " + e.getMessage());
        } finally {
            try {
                if (pst != null) pst.close();
                if (con != null) con.close();
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
        }
    }

    private boolean isUserAdult(String dob) {
        try {
            LocalDate birthDate = LocalDate.parse(dob);
            LocalDate currentDate = LocalDate.now();
            int age = Period.between(birthDate, currentDate).getYears();
            return age >= 18;
        } catch (Exception e) {
            return false;
        }
    }
}