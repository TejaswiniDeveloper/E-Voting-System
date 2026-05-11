package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.json.Json;
import javax.json.JsonObject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Check_Vote_Servlet")
public class Check_Vote_Servlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String email = request.getParameter("email");
        String electionType = request.getParameter("electionType");
        boolean alreadyVoted = false;

        try {
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Votes", "Votes", "Votes");
            String query = "SELECT * FROM Votes WHERE EMAIL=? AND ELECTIONTYPE=?";
            PreparedStatement pst = con.prepareStatement(query);
            pst.setString(1, email);
            pst.setString(2, electionType);
            ResultSet rs = pst.executeQuery();

            if (rs.next()) {
                alreadyVoted = true;
            }
            con.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        // Create JSON response
        JsonObject json = Json.createObjectBuilder()
                .add("alreadyVoted", alreadyVoted)
                .build();

        response.setContentType("application/json");
        PrintWriter out = response.getWriter();
        out.print(json.toString());
        out.flush();
    }
}