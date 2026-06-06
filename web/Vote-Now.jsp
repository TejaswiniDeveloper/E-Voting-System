<%@ page import="java.sql.*" %>
<%@ page import="java.io.*" %>
<html>
<head>
    <title>Candidate List</title>
    <style>
    *{
        box-sizing: border-box;
        font-family: 'Times New Roman', Times, serif;
    }

    body{
        margin: 0;
        padding: 10px;
        background-color: #f4f4f4;
    }

    /* TABLE CONTAINER */
    .table-container{
        width: 100%;
        overflow-x: auto;
    }

    table{
        width: 100%;
        max-width: 1100px;
        margin: 20px auto;
        border-collapse: collapse;
        background-color: white;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
        border-radius: 10px;
        overflow: hidden;
    }

    /* HEADER */
    th{
        background-color: #009879;
        color: white;
        padding: 12px;
        font-size: 18px;
    }

    /* TABLE DATA */
    td{
        padding: 10px;
        text-align: center;
        border-bottom: 1px solid #ddd;
    }

    /* ONE LINE WHITE ONE LINE GRAY */
    tr:nth-child(even){
        background-color: #f2f2f2;
    }

    tr:nth-child(odd){
        background-color: white;
    }

    /* HOVER EFFECT */
    tr:hover{
        background-color: #d9f2e6;
        transition: 0.2s;
    }

    /* IMAGE */
    img{
        width: 60px;
        height: 60px;
        border-radius: 50%;
        object-fit: cover;
    }

    /* BUTTON */
    .vote-btn{
        background-color: #007bff;
        color: white;
        padding: 8px 14px;
        border: none;
        border-radius: 6px;
        cursor: pointer;
        font-size: 15px;
    }

    .vote-btn:hover{
        background-color: #0056b3;
    }

    /* ===== TABLET ===== */
    @media (min-width:700px) and (max-width:900px){

        th, td{
            font-size: 14px;
            padding: 8px;
        }

        img{
            width: 50px;
            height: 50px;
        }

        .vote-btn{
            font-size: 14px;
            padding: 7px 12px;
        }
    }

    /* ===== MOBILE VIEW ===== */
   @media (max-width:700px){

    table,
    tbody,
    tr,
    td{
        display: block;
        width: 100%;
        padding: 15px 55px 15px 15px;
        margin-right: 20px;
    }

    th{
        display: none;
    }

    table{
        background: transparent;
        box-shadow: none;
    }

    tr{
        margin-bottom: 20px;
        background: #ffffff;
        border-radius: 12px;
        padding: 15px;
        box-shadow: 0 2px 8px rgba(0,0,0,0.1);
        overflow: hidden;
    }

    td{
        display: flex;
        align-items: center;
        justify-content: space-between;
        gap: 10px;

        padding: 15px 35px 15px 15px;

        border: none;
        border-bottom: 1px solid #ddd;

        text-align: right;
        font-size: 17px;
         box-sizing: border-box;
}
    }

    td:last-child{
        border-bottom: none;
    }

    td::before{
        content: attr(data-label) " : ";
        font-weight: bold;
        color: #009879;
        text-align: left;
        flex: 1;
    }

    td img{
        width: 65px;
        height: 65px;
        border-radius: 50%;
        object-fit: cover;
        margin-left: 15px;
         margin-right: 25px;
    }

    .vote-btn{
        width: 100%;
        padding: 10px;
        font-size: 17px;
        border-radius: 8px;
    }

    h1{
        font-size: 32px;
        text-align: center;
    }

            
</style>
</head>
<body>
    <h2 align="center">Candidate List</h2>

    <form action="Vote_Now_Servlet" method="post">
        <input type="hidden" name="candidateId" id="candidateId" value="<%=request.getParameter("candidateId")%>">
        <input type="hidden" name="electionType" id="electionType" value="<%=request.getParameter("electionType")%>">
    </form>

    <table align="center">
        <tr>
            <th>Election Type</th>
            <th>Candidate Name</th>
            <th>Candidate Image</th>
            <th>Party Name</th>
            <th>Party Image</th>
            <th>Action</th>
        </tr>
        
        <%
            Connection con = null;
            Statement stmt = null;
            ResultSet rs = null;
            try {
                Class.forName("org.apache.derby.jdbc.ClientDriver");
                con = DriverManager.getConnection("jdbc:derby://localhost:1527/Add_Candidates", "Add_Candidates", "Add_Candidates");
                stmt = con.createStatement();
                rs = stmt.executeQuery("SELECT ID, ELECTION_TYPE, CANDIDATE_NAME, CANDIDATE_PIC, PARTY_NAME, PARTY_PIC FROM ADD_CANDIDATES");

                while (rs.next()) {
                    int candidateId = rs.getInt("ID"); // ? Get candidate ID
                    String electionType = rs.getString("ELECTION_TYPE");
                    String candidateName = rs.getString("CANDIDATE_NAME");
                    String candidatePic = rs.getString("CANDIDATE_PIC");
                    String partyName = rs.getString("PARTY_NAME");
                    String partyPic = rs.getString("PARTY_PIC");
        %>
        <tr>
            <td data-label="Election Type"><%= electionType %></td>
            <td data-label="Candidate Name"><%= candidateName %></td>
            <td  data-label="Party Image"><img src="<%= request.getContextPath() %>/<%= candidatePic %>" alt="<%= candidateName %>"></td>
            <td  data-label="Party Name"><%= partyName %></td>
            <td  data-label="Party Image"><img src="<%= request.getContextPath() %>/<%= partyPic %>" alt="<%= partyName %>"></td>
            <td data-label="Action">
                <button class="vote-btn" onclick="vote('<%= candidateId %>', '<%= electionType %>')">Vote</button>
            </td>
        </tr>
        <%  
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (rs != null) rs.close();
                if (stmt != null) stmt.close();
                if (con != null) con.close();
            }
        %>
    </table>

    <script>
        function vote(candidateId, electionType) {
            if (confirm("Are you sure you want to vote?")) {
                document.getElementById("candidateId").value = candidateId;
                document.getElementById("electionType").value = electionType;
                document.forms[0].submit();
            }
        }
    </script>
</body>
</html>