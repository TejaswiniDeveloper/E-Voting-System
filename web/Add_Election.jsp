<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>E-Voting !!</title>
    <style>
        html, body {
            height: 100%;
        }
        body {
            font-family: 'Times New Roman', Times, serif;
            margin: 0;                 /* remove extra space */
            min-height: 100vh;         /* full screen height */
            display: flex;
            justify-content: center;
            align-items: center;
            background-image: url(Add-El1.jpg);
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }
        .container {
            width: 450px;
            max-width: 90%;
            backdrop-filter: blur(6px);
            padding: 20px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 20px 60px 20px 60px;
            border: 1px solid gray;
        }
        h1 {
            text-align: center;
            font-size: 3.5rem;
            color: black;
            text-decoration: underline graytext;
        }
        label {
            font-weight: bold;
            display: block;
            margin-top: 10px;
            font-size: 20px;
        }
        input {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        .buttons {
            display: flex;
            gap: 10px;
            margin-top: 15px;
        }
            button {
            flex: 1;
            padding: 10px;
            border: none;
            background: green;
            color: white;
            cursor: pointer;
            border-radius: 8px;
            transition: 0.3s;
        }
        button:hover {
            background: darkgreen;
        }
        .update{
            background-color: #007bff;
        }
         .update:hover {
            background: #006e8a;
        }
        .delete {
            background: #dc3545;
        }
        .delete:hover {
            background: #b52b36;
        }
        .message {
            text-align: center;
            color: green;
            margin-top: 10px;
        }
        .error {
            text-align: center;
            color: red;
            margin-top: 10px;
        }
        p{
            font-size: 22px;
        }
        input:focus {
            outline: none;
            border: 2px solid green;
        }

        /*📱 Tablet (≤ 768px) */

        @media (max-width: 768px) {

        body {
            padding: 10px;
            margin: 0;
        }

        .container {
            width: 90%;
            margin: 40px auto;
            padding: 15px;
            border-radius: 20px;
        }

        h1 {
            font-size: 2rem;
        }

        label {
            font-size: 16px;
        }

        input {
            font-size: 14px;
            padding: 8px;
        }

        .buttons {
            flex-wrap: wrap;
        }

        button {
            flex: 100%;
            margin: 5px 0;
        }
        }

        /*📱 Mobile (≤ 480px) */

        @media (max-width: 480px) {

        .container {
            width: 95%;
            margin: 20px auto;
            padding: 12px;
            border-radius: 15px;
        }

        h1 {
            font-size: 1.5rem;
        }

        label {
            font-size: 14px;
        }

        input {
            font-size: 13px;
            padding: 6px;
        }

        button {
            font-size: 14px;
            padding: 8px;
        }

        p {
            font-size: 16px;
        }
        }
    </style>
</head>
<body>

<div class="container">
    <h1>Add Election !!</h1>
    
    <form method="post" action="Add_Election.jsp">
        <label for="electionId">Election ID:</label>
        <input type="text" id="electionId" name="electionId" required>

        <label for="electionName">Election Name:</label>
        <input type="text" id="electionName" name="electionName" required>

        <label for="electionDate">Election Date:</label>
        <input type="date" id="electionDate" name="electionDate" required>

        <label for="conductDate">Code of Conduct Date:</label>
        <input type="date" id="conductDate" name="conductDate" required>

        <div class="buttons">
            <button type="submit" name="action" value="Add">Add</button>
            <button type="submit" name="action" value="Update" class="update">Update</button>
            <button type="submit" name="action" value="Delete" class="delete">Delete</button>
        </div>
    </form>

    <% 
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
    %>

</div>

</body>
</html>