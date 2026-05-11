<%-- 
    Document   : Admin-Nav
    Created on : 26 Jan, 2025, 9:16:32 PM
    Author     : LENOVO
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Voting !!</title>
        <style>
          
           *{
                margin: 0;
                box-sizing: border-box;
                font-family: 'Times New Roman', Times, serif;
            }

            body{
                margin: 0;
                min-height: 100vh;   /* ✅ fixed */
                background-image: url(D6.jpg);
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;
            }

            /* NAVBAR */
            .navbar{
                display: flex;
                justify-content: space-between;
                align-items: center;
                background-color: whitesmoke;
                padding: 12px 20px;
                box-shadow: 0 4px 6px rgba(0,0,0,0.1);
            }

            /* LOGO */
            .navbar .logo{
                color: firebrick;
                font-size: 2rem;
                font-weight: bold;
                text-decoration: none;
            }

            /* MENU */
            .navbar ul{
                list-style: none;
                display: flex;
                gap: 15px;
            }

            .navbar ul li a{
                text-decoration: none;
                color: black;
                font-size: 18px;
                padding: 5px 8px;
                border-radius: 6px;
                transition: 0.3s;
            }

            /* HOVER */
            .navbar ul li a:hover{
                background-color: #eee;
                border: 1px solid gray;
            }

            /* LOGOUT BUTTON */
            .navbar ul li:last-child a{
                background-color: white;
                color: green;
                border: 1px solid green;
            }

            .navbar ul li:last-child a:hover{
                background-color: #d4f3d6;
            }

            /* 📱 TABLET */
            @media (max-width: 768px){

                .navbar{
                    flex-direction: column;
                    gap: 10px;
                }

                .navbar ul{
                    flex-wrap: wrap;
                    justify-content: center;
                }
            }

            /* 📱 MOBILE */
            @media (max-width: 480px){

                .navbar ul{
                    flex-direction: column;
                    width: 100%;
                    align-items: center;
                }

                .navbar ul li{
                    width: 100%;
                }

                .navbar ul li a{
                    display: block;
                    width: 100%;
                    text-align: center;
                    font-size: 15px;
                }
            }

            /* 📱 SMALL MOBILE */
            @media (max-width: 320px){

                .navbar .logo{
                    font-size: 1.4rem;
                }

                .navbar ul li a{
                    font-size: 13px;
                }
            }
        </style>
    </head>
    <body>
        <nav class="navbar">
            <a href="#" class="logo">Electronic-Voting</a>
            <ul>
                <li><a href="Add_Election.jsp">Add Election</a></li>
                <li><a href="Add_Candidates.jsp">Add Candidate</a></li>
                <li><a href="View-Voters.jsp">View Voters</a></li>
                 <li><a href="Index.jsp">LogOut</a></li>
                <li><a href="Result.jsp">View Result</a></li>               
            </ul>
        </nav>
    </body>
</html>
