<%@ page import="java.sql.*" %>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>E-Voting!!</title>
    <style>
        *{
            font-family: 'Times New Roman', Times, serif;
        }
        h1{
            font-size: 40px;
            color: black;
            font-family: monospace;
        }
        button{
           color: white;
           background-color: green;
           height: 40px;
           border-radius: 8px;
           font-size: 18px;
        }
        button:hover{
            background-color: darkgreen;
        }
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 10px;
        }
        .table-container{
            width: 100%;
            overflow-x: auto;   /* 🔥 allows horizontal scroll on small screens */
        }
        table {
            width: 100%;
             /* 🔥 ensures table is wide enough for all columns */
            margin: auto;
            border-collapse: collapse;
            background: #fff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
            border-radius: 10px;
        }
        th, td {
            padding: 8px;
            text-align: center;
            border-bottom: 1px solid #ddd;
        }
        /* HEADER STYLE */
        th {
            background-color: #009879;   /* green header */
            color: white;
            font-weight: bold;
        }

        /* ZEBRA STRIPES (ROW COLORS) */
        tr:nth-child(even) {
            background-color: #f2f2f2;   /* light gray */
        }

        tr:nth-child(odd) {
            background-color: #ffffff;   /* white */
        }

        /* OPTIONAL: hover effect */
        tr:hover {
            background-color: #d9f2e6;   /* soft green highlight */
            transition: 0.2s;
        }
                
                /* ===== 700px to 900px ===== */
        @media (min-width: 700px) and (max-width: 900px){
            

            th, td{
                font-size: 14px;
                padding: 8px;
            }

            h1{
                font-size: 32px;
                text-align: center;
            }

            button{
                font-size: 16px;
                height: 38px;
            }
        }

        /* MOBILE TABLE VIEW */
        @media (max-width:700px){

            table,
            tbody,
            tr,
            td{
                display: block;
                width: 100%;
            }

            th{
                display: none;
            }

            table{
                background: transparent;
                box-shadow: none;
            }

            tr{
                margin-bottom: 15px;
                background-color: #f2f2f2;
                border-radius: 10px;
                padding: 10px;
                box-shadow: 0 0 5px rgba(0,0,0,0.1);
            }

            td{
                text-align: left;
                border: none;
                border-bottom: 1px solid #ccc;
                padding: 8px;
                background: transparent;
            }

            td:last-child{
                border-bottom: none;
            }

            td::before{
                content: attr(data-label) " : ";
                font-weight: bold;
                color: #009879;
            }
        }
        @media (min-width:270px) and (max-width:700px){

            table,
            tbody,
            tr,
            td{
                display: block;
                width: 100%;
            }

            th{
                display: none;
            }

            table{
                background: transparent;
                box-shadow: none;
            }

            tr{
                margin-bottom: 15px;
                background-color: #f2f2f2;
                border-radius: 10px;
                padding: 10px;
                box-shadow: 0 0 5px rgba(0,0,0,0.1);
            }

            td{
                text-align: left;
                border: none;
                border-bottom: 1px solid #ccc;
                padding: 8px;
                background: transparent;
            }

            td:last-child{
                border-bottom: none;
            }

            td::before{
                content: attr(data-label) " : ";
                font-weight: bold;
                color: #009879;
            }
        }
        
    </style>
</head>
<body>
    <div id="btn">   <button>Pending Voters</button> </div>
    <h1><center>Registered Voter's List</center></h1>
    <div class="table-container">
        <table border="4">
            <tr>
                <th>ID</th>
                <th>Full Name</th>
                <th>Gender</th>
                <th>Date of Birth</th>
                <th>Contact</th>
                <th>Address</th>
                <th>Email</th>
                <th>Status</th>
            </tr>
            <%
                try {
                    Class.forName("org.apache.derby.jdbc.ClientDriver"); // Derby Driver
                    Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/Users_Registration", "Users_Registration", "Users_Registration");
                    Statement stmt = con.createStatement();
                    ResultSet rs = stmt.executeQuery("SELECT * FROM Users_Registration");

                    while (rs.next()) {
            %>
            <tr>
                
                <td data-label="ID"><%= rs.getInt("ID") %></td>

                <td data-label="Full Name">
                    <%= rs.getString("FULLNAME") %>
                </td>

                <td data-label="Gender">
                    <%= rs.getString("GENDER") %>
                </td>

                <td data-label="Date of Birth">
                    <%= rs.getDate("DOB") %>
                </td>

                <td data-label="Contact">
                    <%= rs.getString("CONTACT") %>
                </td>

                <td data-label="Address">
                    <%= rs.getString("ADDRESS") %>
                </td>

                <td data-label="Email">
                    <%= rs.getString("EMAIL") %>
                </td>

                <td data-label="Status">
                    <%= rs.getString("STATUS") %>
                </td>

            </tr>
            <%
                    }
                    con.close();
                } catch (Exception e) {
                    out.println("Error: " + e.getMessage());
                }
            %>
        </table>
    </div>
    <script>
          document.getElementById("btn").addEventListener("click",function(){
                window.location.href ="Admin_Approve_Users.jsp";
            });         

    </script>
</body>
</html>