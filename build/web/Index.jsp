<%-- 
    Document   : newjsp
    Created on : 14 Jan, 2025, 8:02:53 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Voting!!</title>
        <style>
            *{
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: 'Times New Roman', Times, serif;
            }

            body{
                background-image: url(B1.jpg);
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;
                min-height: 100vh;   /* ✅ better than height */
            }

            /* NAVBAR */
            nav{
                color: #fff;
                display: flex;
                justify-content: space-between;
                align-items: center;
                padding: 15px 30px;
                flex-wrap: wrap;   /* ✅ important */
            }

            /* LOGO */
            .logo{
                font-size: 40px;
                font-weight: bold;
                font-family: 'Courier New', Courier, monospace;
                border: 5px solid rgb(112, 110, 110);
                border-radius: 8px;
                padding: 4px 10px;
            }

            /* NAV LINKS */
            .nav-links{
                list-style: none;
                display: flex;
                gap: 15px;   /* ✅ better spacing */
            }

            .nav-links li{
                border: 2px solid black;
                padding: 8px 12px;
                border-radius: 15px;
                transition: 0.3s;
            }

            .nav-links li:hover{
                background-color: green;
            }

            .nav-links a{
                color: #fff;
                text-decoration: none;
                font-size: 18px;
            }

            /* 📱 MOBILE (≤460px) */
            @media (max-width: 460px){

                nav{
                    flex-direction: column;
                    align-items: flex-start;
                    padding: 15px;
                    gap: 10px;
                }

                .logo{
                    font-size: 28px;
                }

                .nav-links{
                    flex-direction: column;
                    width: 100%;
                }

                .nav-links li{
                    width: 100%;
                    margin: 5px 0;
                    text-align: center;
                }

                .nav-links a{
                    display: block;
                    width: 100%;
                    font-size: 16px;
                }
            }

            /* 📱 TABLET (461px – 768px) */
            @media (max-width: 768px){

                .logo{
                    font-size: 32px;
                }

                .nav-links{
                    gap: 10px;
                }

                .nav-links a{
                    font-size: 16px;
                }
            }
             
        </style>
    </head>
    <body>
        <nav>
            <div class="logo">E-Voting</div>
            <ul class="nav-links">
            <li><a href="Home.jsp">GO</a></li>
            </ul>
        </nav>
    </body>
</html>
