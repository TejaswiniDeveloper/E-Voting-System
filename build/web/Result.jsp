<%@ page import="java.sql.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<center>
<%
    Connection con = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    try {
        Class.forName("org.apache.derby.jdbc.ClientDriver");
        con = DriverManager.getConnection("jdbc:derby://localhost:1527/Add_Candidates", "Add_Candidates", "Add_Candidates");

        // Get all election names for dropdown
        String electionQuery = "SELECT DISTINCT ELECTION_TYPE FROM Add_Candidates";
        ps = con.prepareStatement(electionQuery);
        rs = ps.executeQuery();
%>

<!DOCTYPE html>
<html>
<head>
    <title>Election Results</title>
    <script>
    function fetchResults() {
        var electionType = document.getElementById("electionSelect").value;
        if (electionType === "") {
            document.getElementById("resultTable").innerHTML = "<p style='color:red;'>Please select an election.</p>";
            return;
        }

        var xhr = new XMLHttpRequest();
        xhr.open("GET", "Fetch_Results_Servlet?electionType=" + encodeURIComponent(electionType), true);
        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4) {
                if (xhr.status == 200) {
                    document.getElementById("resultTable").innerHTML = xhr.responseText;
                } else {
                    document.getElementById("resultTable").innerHTML = "<p style='color:red;'>Error fetching results.</p>";
                }
            }
        };
        xhr.send();
    }
</script>
    <style>
        *{
            font-family: 'Times New Roman', Times, serif;
            font-size: 20px;
            
        }
        body{ 
            background-image: url(Img4.jpg); 
            background-size: cover; 
            background-position: center; 
            background-repeat: no-repeat; 
            min-height: 100vh; 
            margin: 0; 
        }
        h1{
            font-size: 40px;
            color: darkred;
            backdrop-filter: blur(2px);
          
        }
        select{
            backdrop-filter: blur(50px);
        }

        /*Responsive Design*/
        @media (max-width: 460px){      
                
            h1{
                font-size: 26px;
            }

            select{
                font-size: 16px;
                padding: 8px;
            }

            .container{
                width: 95%;
                padding: 15px;
            }
        }

        /* 📱 TABLET */
        @media (max-width: 768px){
            body{
                background-size: contain;
                align-items: center;      
                justify-content: center; /* Centers horizontally */
                align-items: center;     /* Centers vertically */
                height: 100vh;
            }
            h1{
                margin-top: 20px;
                font-size: 32px;
            }
        }
    </style>
</head>
<body>
    <h1>SELECT ELECTIONS TO VIEW RESULTS</h1>
    <select id="electionSelect" onchange="fetchResults()">
        <option value="">-- Select Election --</option>
        <%
            while (rs.next()) {
        %>
            <option value="<%= rs.getString("ELECTION_TYPE") %>"><%= rs.getString("ELECTION_TYPE") %></option>
        <%
            }
        %>
    </select>
    <br><br>
    <div id="resultTable"></div>
</body>
</html>

<%
    } catch (Exception e) {
        e.printStackTrace();
    } finally {
        try {
            if (rs != null) rs.close();
            if (ps != null) ps.close();
            if (con != null) con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
%>
</center>