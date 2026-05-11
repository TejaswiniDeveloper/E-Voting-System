<%@ page import="java.sql.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>E-Voting !!</title>
    <style>
        *{
            font-family: 'Times New Roman', Times, serif;
        }
        body {
            margin: 0;                          /* remove white gap */
            min-height: 100vh;     
            font-size: 16px;             /* full screen */
            display: flex;
            justify-content: center;
            align-items: center;
            background-image: url(AL3.jpg);
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }
       .container {
            width: 500px;          /* slightly bigger */
            max-width: 92%;
            min-width: 320px;      /* prevents too small */
            backdrop-filter: blur(6px);
            padding: 25px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 30px 75px 30px 75px;
            background-image: url(NF3.jpg);
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
        }
        h1 {
            text-align: center;
            color: black;
            font-size: 28px;
        }
        label {
            font-weight: bold;
            display: block;
            margin-top: 10px;
            font-size: 20px;
        }
        input, select {
            width: 100%;
            padding: 8px;
            margin-top: 5px;
            border: 1px solid #ddd;
            border-radius: 5px;
        }
        input:hover{
            border: 2.5px solid peru;
        }
       #btn {
            display: block;
            width: 120px;
            margin: 20px auto;
            color: white;
            background-color: green;
            border-radius: 20px;
            cursor: pointer;
            border: none;
            padding: 8px;
        }
        #btn:hover {
            color: black;
            background-color: darkgreen;
            border: none;
        }
        input:focus, select:focus {
            outline: none;
            border: 2px solid peru;
     }

        /*📱 Tablet (≤ 768px) */

        @media (max-width: 768px) {

        body {
                margin: 0;
                padding: 10px;
                font-size: 14px;
            }

            .container {
                width: 90%;
                margin: 30px auto;
                padding: 15px;
                border-radius: 20px;
            }

            label {
                font-size: 16px;
            }

            input, select {
                font-size: 14px;
                padding: 8px;
            }

            #btn {
                width: 100%;
                margin: 20px auto;
            }
            }

            /*📱 Mobile (≤ 480px) */

           @media (max-width: 480px) {

            body{
                font-size: 13px;
            }

            .container {
                width: 95%;
                margin: 20px auto;
                padding: 12px;
                border-radius: 15px;
            }

            h1 {
                font-size: 20px;
            }

            label {
                font-size: 14px;
            }

            input, select {
                font-size: 13px;
                padding: 6px;
            }

            #btn {
                width: 100%;
                font-size: 14px;
                padding: 8px;
            }
            }            

            @media (min-width: 1024px) {
            .container {
                width: 600px;   /* bigger on desktop */
            }
            }
    </style>
</head>
<body>
    <div class="container">
        <h1>Add Candidates !!</h1>
        <form action="Add_Candidates_Servlet" method="post" enctype="multipart/form-data">
            <label for="electionType">Election Type:</label>
            <select name="electionType" required>
                <option value="">-- Select Election --</option>
                <%
                Connection conn = null;
                Statement stmt = null;
                ResultSet rs = null;
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    conn = DriverManager.getConnection("jdbc:derby://localhost:1527/Add_Election", "Add_Election", "Add_Election");
                    stmt = conn.createStatement();
                    rs = stmt.executeQuery("SELECT ELECTION_NAME FROM Add_Election");

                    while (rs.next()) {
                        String electionName = rs.getString("ELECTION_NAME");
            %>
                <option value="<%= electionName %>"><%= electionName %></option>
            <%
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                } finally {
                    if (rs != null) rs.close();
                    if (stmt != null) stmt.close();
                    if (conn != null) conn.close();
                }
            %>
            </select>

            <label for="candidateName">Candidate Name:</label>
            <input type="text" name="candidateName" required>

            <label for="candidatePic">Candidate Picture:</label>
            <input type="file" name="candidatePic" required>

            <label for="partyName">Party Name:</label>
            <input type="text" name="partyName" required>

            <label for="partyPic">Party Picture:</label>
            <input type="file" name="partyPic" required>

            <label for="address">Address:</label>
            <input type="text" name="address" required>

            <label for="phone">Phone Number:</label>
            <input type="text" name="phone" required>

            <input type="submit" id="btn" value="Submit">
        </form>
    </div>
</body>
</html>