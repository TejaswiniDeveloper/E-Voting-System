package Servlets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@WebServlet("/Add_Candidates_Servlet")
@MultipartConfig(maxFileSize = 16177215)  // File size limit ~16MB
public class Add_Candidates_Servlet extends HttpServlet {
    private static final String DB_URL = "jdbc:derby://localhost:1527/Add_Candidates;create=true";
    private static final String DB_USER = "Add_Candidates";
    private static final String DB_PASSWORD = "Add_Candidates";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        String electionType = request.getParameter("electionType");
        String candidateName = request.getParameter("candidateName");
        String partyName = request.getParameter("partyName");
        String address = request.getParameter("address");
        String phone = request.getParameter("phone");

        // File Upload Handling
        Part candidatePicPart = request.getPart("candidatePic");
        Part partyPicPart = request.getPart("partyPic");

        // Store images inside the "uploads" folder inside the project directory
        String uploadPath = getServletContext().getRealPath("") + "uploads";
        File uploadDir = new File(uploadPath);
        if (!uploadDir.exists()) uploadDir.mkdir();

        String candidatePic = uploadFile(candidatePicPart, uploadPath);
        String partyPic = uploadFile(partyPicPart, uploadPath);

        // Store the relative path in the database
        String candidatePicPath = "uploads/" + candidatePic;
        String partyPicPath = "uploads/" + partyPic;

        // Database Connection and Insert Query
        try (Connection conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD)) {
            String sql = "INSERT INTO Add_Candidates (election_type, candidate_name, candidate_pic, party_name, party_pic, address, phone_no) VALUES (?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, electionType);
            stmt.setString(2, candidateName);
            stmt.setString(3, candidatePicPath);
            stmt.setString(4, partyName);
            stmt.setString(5, partyPicPath);
            stmt.setString(6, address);
            stmt.setString(7, phone);

            int rowsInserted = stmt.executeUpdate();
            response.getWriter().println(rowsInserted > 0 ? "Candidate added successfully!" : "Error adding candidate.");
        } catch (SQLException e) {
            e.printStackTrace();
            response.getWriter().println("Database Error: " + e.getMessage());
        }
    }

    private String uploadFile(Part filePart, String uploadPath) throws IOException {
        String fileName = filePart.getSubmittedFileName();
        if (fileName == null || fileName.isEmpty()) {
            return "default.jpg"; // Default image if no file is uploaded
        }
        String filePath = uploadPath + File.separator + fileName;
        FileOutputStream fos = new FileOutputStream(filePath);
        InputStream is = filePart.getInputStream();

        byte[] buffer = new byte[1024];
        int bytesRead;
        while ((bytesRead = is.read(buffer)) != -1) {
            fos.write(buffer, 0, bytesRead);
        }
        fos.close();
        is.close();
        return fileName;
    }
}