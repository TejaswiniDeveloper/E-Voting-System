<%-- 
    Document   : Election
    Created on : 14 Jan, 2025, 8:37:37 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Voting!!</title>
        <style>
            body{
                font-family: 'Times New Roman', Times, serif;
                margin: 0;
                padding: 0;
                background-color: #f2f2f2;
            }
            /*.nav-bar{
                display: flex;
                justify-content: space-between;
                align-items: center;
                padding: 10px 20px;
                list-style: none;
                background-color: #fff;
                box-shadow: 0 2px 4px rgb(0, 0, 0, 0.1);
                font-size: 20px;
                font-weight: bolder;
                height: 50px;
            }*/
            .nav-bar .logo{
                font-weight: bold;
                color: #6c63ff;
                font-size: 20px;
                border: 5px solid whitesmoke;
                border-radius: 8px;
                padding: 4px;
                margin: 2px;
            }
            /*.nav-bar a{
                color: #333;
                text-decoration: none;
                padding: 0 15px;
                font-size: 20px;
                border-radius: 5px;
                transition: background-color 0.3s;
            }
            .nav-bar a:hover{
                background-color: #d6d1d1;
                padding-top: 10px;
                padding-bottom: 4px;
            }
            .nav-links{
                display: flex;
                padding: 5px;
            }*/
            .main-banner{
                background: linear-gradient(to right, #6862dbb9, #a29bfe);
                color: white;
                text-align: center;
                padding: 40px 20px;
                position: relative;
            }
            .main-banner h1{
                font-size: 36px;
                margin: 0;
            }
            .main-banner p{
                font-size: 18px;
                color: rgba(255, 255, 255, 0.8);
            }
            .wave{
                position: absolute;
                bottom: -10px;
                left: 0;
                width: 100%;
                height: 60px;
                background: ellipse(50% 100% at 50% 100%);
            }
            .content{
                display: flex;
                justify-content: center;
                padding: 40px 20px;
                flex-wrap: wrap;           
                gap: 50px;
            }
            .card{
               background-color: white;
               border: 1px solid #ddd;
               width: 400px;
               padding: 20px;
               text-align: center;
               box-shadow: 0 2px 4px rgba(0, 0, 0, 0.2);
               transition: 0.5s;
            }

            .card:hover{
                transform: scale(1.05);
            }

            .card img{
                width: 100%;
                height: auto;                
                border-radius: 10px;
            }
            .card h3{
                margin-top: 0;
                font-size: 18px;
                color: #333;
            }
            .footer{
                background-color: #8a8a8f;
                color: rgb(34, 32, 32);
                text-align: center;
                padding: 10px;
                font-size: 40px;
                height: 32px;
            }

            .card{
                transition: 0.6s;
            }

            .card:hover{
                transform: rotate(5deg) scale(1.05);
            }

            /* Responsive Design */
          
            @media (max-width: 768px){

                .content{
                    flex-direction: column;
                    align-items: center;
                }

                .card{
                    width: 90%;
                }

                .main-banner h1{
                    font-size: 26px;
                }

                .main-banner p{
                    font-size: 16px;
                }
            }
        </style>
    </head>
    <body>
            <div class="nav-bar">
            <div class="logo">E-Voting<br>
            </div>

        </div>
        <div class="main-banner">
            <h1>Election</h1>
            <p>Home / Electtion</p>
            <div class="wave"></div>
        </div>
        <div class="content">
            <div class="card">
                <img src="E1.jpg" alt="Vote Online">
                <h3>Vote Online</h3>
            </div>
            <div class="card">
                <img src="E2.jpg" alt="Vote By Paper">
                <h3>Vote By Paper</h3>
            </div>
            <div class="card">
                <img src="E3.jpg" alt="Vote In Person">
                <h3>Vote In Person</h3>
            </div>
        </div>
        <div class="footer">
            <p>Every Vote Counts</p>
        </div>
    </body>
</html>
