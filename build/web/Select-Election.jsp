<%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Select Election</title>
    <style>
         *{
             font-family: Times-New_Roman;
         }
       
        body {
            background-image: url(SE1.jpg);
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            height: 100vh;   /* ADD THIS */
            margin: 0;
            display: flex;   /* also needed */
            justify-content: center;
            align-items: center;
        }
        .container {
            backdrop-filter: blur(8px);
            padding: 20px;
            box-shadow: 0px 0px 10px rgba(0, 0, 0, 0.1);
            border-radius: 20px 60px 20px 60px;               
            height: 400px;
        }
        h1 {
            text-align: center;
            font-size: 3rem;
            color: black;          
        }
        label {
            font-weight: bold;
            display: block;
            margin-top: 10px;
            font-size: 24px;
            color: black;
        }
        select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border-radius: 5px;
            border: 1px solid #ddd;
            font-size: 16px;
            background: rgba(255, 255, 255, 0.7);
        }
        button {
            width: 100px;
            padding: 10px;
            margin-top: 15px;
            border: none;
            background: #007bff;
            color: white;
            cursor: pointer;
            border-radius: 5px;
            font-size: 18px;
            display: block;
            margin: auto;
        }
        button:hover {
            background: #0056b3;
        }

        /* Responsive Design */
        @media (max-width: 768px) {
            html, body {
                height: 100%;
                margin: 0;
                padding: 0;
            }
            body {
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;
                height: 100vh;   /* ADD THIS */
                margin: 0;
                display: flex;   /* also needed */
                justify-content: center;
                align-items: center;
            }

            .container {
                width: 90%;
                height: auto;
                padding: 15px;
            }

            h1 {
                font-size: 2rem;
            }

            label {
                font-size: 18px;
            }

            select {
                font-size: 14px;
            }

            button {
                width: 100%;
                font-size: 16px;
            }
        }

        /* Mobile devices */
        @media (max-width: 460px) {
            body {
                background-size: cover;
                align-items: center;      
                justify-content: center; /* Centers horizontally */
                align-items: center;     /* Centers vertically */
                height: 100vh;
            }
     
            .container {
                width: 95%;
                padding: 10px;
            }

            h1 {
                font-size: 1.6rem;
            }

            label {
                font-size: 16px;
            }

            select {
                font-size: 13px;
                padding: 8px;
            }

            button {
                font-size: 14px;
                padding: 8px;
            }
        }
    </style>
    <script>
        function submitForm() {
            var electionId = document.getElementById("election").value;
            if (electionId) {
                window.location.href = "Vote-Now.jsp?electionId=" + electionId;
            } else {
                alert("Please select an election.");
            }
        }
    </script>
</head>
<body>
    <div class="container"><br><br><br><br><br><br><br><br><br><br><br><br>
        <h1>Select Election !!.. </h1>
        <form>
            <label><b>Choose Election:</b></label>
            <select id="election" name="election">
                <option value="">-- Select An Election --</option>
                <%
                    try {
                        Class.forName("org.apache.derby.jdbc.ClientDriver");
                        Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Add_Election", "Add_Election", "Add_Election");
                        Statement stmt = con.createStatement();
                        ResultSet rs = stmt.executeQuery("SELECT ELECTION_ID, ELECTION_NAME FROM Add_Election");
                        while (rs.next()) {
                %>
                            <option value="<%= rs.getInt("ELECTION_ID") %>"><%= rs.getString("ELECTION_NAME") %></option>
                <%
                        }
                        con.close();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                %>
            </select><br><br>
            <button type="button" onclick="submitForm()">Submit</button>
        </form>
    </div>
            
</body>
</html>