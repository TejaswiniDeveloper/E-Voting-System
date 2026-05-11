<%@ page import="java.sql.*" %>
<%@ page import="javax.servlet.http.*" %>
<%@ page import="javax.servlet.*" %>

<!DOCTYPE html>
<html>
<head>
    <title>E-Voting !!</title>
    <style>
        *{
            font-family: 'Times New Roman', Times, serif;
        }
        html, body {
            margin: 0;
            padding: 0;
            min-height: 100vh;
        }
        body {
            /*margin: 0;  */            /* remove extra space */
            /*padding: 10px;*/
            background-color: #f4f4f4;
            /*display: flex;
            flex-direction: column;*/
        }      
        .main-content {
            flex: 1;
        }
        h1 {
            font-size: 30px;
            text-align: center;
            margin: 20px 0  10px 0;   /* small clean spacing */
        }
        .table-container {
            width: 95%;
            margin: 0 auto 20px auto;
            overflow-x: auto;   /* SCROLL FIX */
        }
        table {
            width: 100%;
            min-width: 600px;  
            border-collapse: collapse;
            background: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 5px;              /* prevents squeezing */
        }
        th, td {
            padding: 10px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }

        th {
            background-color: #009879;
            color: white;
        }

        tr:nth-child(even) {
            background-color: #f2f2f2;
        }

        .main-content {
            padding-bottom: 20px;
        }
            
        /*📱 Add media queries */
         @media (max-width: 768px) {
            table {
                min-width: 500px;
            }

            th, td {
                font-size: 14px;
                padding: 8px;
            }
        }

        @media (max-width: 480px) {
            table {
                min-width: 450px;
            }

            th, td {
                font-size: 12px;
                padding: 6px;
            }
        }
       
        @media (max-width: 600px) {

            table, thead, tbody, th, td, tr {
                display: block;
                width: 100%;
            }

            thead {
                display: none;
            }

            tr {
                background: white;
                margin-bottom: 15px;
                padding: 12px;
                border-radius: 10px;
                box-shadow: 0 0 5px rgba(0,0,0,0.1);
            }

            td {
                text-align: left;
                padding: 8px;
                position: relative;
                padding-left: 120px;   /* space for label */
            }

            /* THIS IS THE MAGIC PART */
            td::before {
                position: absolute;
                left: 10px;
                top: 8px;
                font-weight: bold;
                color: #009879;   /* your green color */
            }

            td:nth-child(1)::before { content: "Name:"; }
            td:nth-child(2)::before { content: "Email:"; }
            td:nth-child(3)::before { content: "Action:"; }
        }

        @media (max-width: 320px) {

            tr {
                padding: 8px;
            }

            td {
                padding: 6px;
                padding-left: 75px;   /* tighter spacing */
                font-size: 11px;      /* smaller text */
                line-height: 1.4;
            }
            th{
                display: none;
            }

            td::before {
                font-size: 10px;
                left: 8px;
            }

            /* Fix long email overflow */
            td:nth-child(2) {
                word-break: break-all;
            }

            /* Make action links stack if needed */
            td:nth-child(3) a {
                display: block;
                margin-bottom: 4px;
            }
         }        
    </style>
</head>
<body>
    <div class="main-content">
        <h1><center>Pending User Approvals</center></h2>
        <div class="table-container">

            <table border="4">
                <tr>
                    <th>Name</th>
                    <th>Email</th>
                    <th>Action</th>
                </tr>
                <%
                    Class.forName("org.apache.derby.jdbc.ClientDriver");
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Users_Registration", "Users_Registration", "Users_Registration");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM Users_Registration WHERE status = 'Pending'");

                    while (rs.next()) {
                %>
                <tr>
                    <td><%= rs.getString("FULLNAME") %></td>
                    <td><%= rs.getString("EMAIL") %></td>
                    <td>
                        <a href="Admin_Approve_User_Servlet?email=<%= rs.getString("EMAIL") %>&action=approve">Approve</a> |
                        <a href="Admin_Approve_User_Servlet?email=<%= rs.getString("EMAIL") %>&action=reject">Reject</a>
                    </td>
                </tr>
                <% } %>
            </table>
        </div>  
    </div>
</body>
</html>