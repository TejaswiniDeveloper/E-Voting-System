<%-- 
    Document   : Featured-Election
    Created on : 14 Jan, 2025, 8:38:09 PM
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
                font-family: 'Times New Roman', Times, serif;
                margin: 0;
                padding: 0;
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
            }*/

            .nav-bar .logo{
                font-weight: bold;
                color: #bb3286;
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
                font-size: 16px;
                border-radius: 5px;
                transition: background-color 0.3s;
            }

            .nav-bar a:hover{
                background-color: #d6d1d1;
                padding-top: 4px;
                padding-bottom: 4px;
            }

            .nav-links{
                display: flex;
                padding: 5px;
            }*/

            .main-banner{
                background: linear-gradient(to right, #cc2c97b9, #bb6fb5);
                color: white;
                text-align: center;
                padding: 50px;
                position: relative;
                height: 60px;
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


            h1{
                font-size: 40px;
                font-family: 'Courier New', Courier, monospace;
                margin-bottom: 20px;
            }

            .container{
                /*max-width: 1000px;*/
                margin: 0 auto;
                padding: 20px;
            }

            .featured-election{
                display: flex;
                flex-wrap: wrap;
                justify-content: space-evenly;
                gap: 5px;
            }

            .featured-election div{
                flex: 1;
                margin: 10px;
            }

            .featured-election img{
                width: 400px;
                height: 300px;
                border-radius: 9px;
            }

            .featured-election div img:hover{
                transform: scale(1.05);
                transition: transform o.3s;
            }

            .header{
                background: linear-gradient(90deg, #6a11cb, #2575fc);
                color: white;
                padding: 20px 0;
                text-align: center;
            }

            div img{
                box-shadow: 0 0 1rem rgba(61, 59, 59, 0.63);
            }

            .card p:hover{
                transform: scale(1.05);
                transition: transform o.3s;
            }

            /*Responsive Design*/

            @media (max-width: 460px){

                .featured-election{
                    display: grid;
                    grid-template-columns: 1fr;  /* 1 per row */
                    gap: 15px;
                }

                .featured-election div{
                    margin: 0;
                }

                .featured-election img{
                    width: 100%;
                    height: 200px;   /* smaller for mobile */
                    object-fit: cover;
                }

                .main-banner{
                    padding: 30px 10px;
                    height: auto;   /* fix overflow */
                }

                .main-banner h1{
                    font-size: 22px;
                }

                .main-banner p{
                    font-size: 14px;
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
        <h1>Featured Elections</h1>
        <div class="wave"></div>
    </div>
    <div class="container">
        <h3><center>Join Our E-Voting System</center></h3>
        <h1><center>Featured Elections</center></h1>
        <div class="featured-election">
            <div>
                
                <img src="H4.jpg" alt="Elderly Woman Voting">
            </div>
            <div>
                
                <img src="H5.jpg" alt="Vote India Banner">
            </div>
            <div>
                
                <img src="H1.jpg" alt="Group Of People Showing Voting ID">
            </div>
            <div>
                
                <img src="H7.jpg" alt="Vote India Banner">
            </div>
            <div>
              
                <img src="H3.jpg" alt="Group Of People Showing Voting ID">
            </div>
            <div>
               
                <img src="H6.jpg" alt="Group Of People Showing Voting ID">
            </div>
        </div>
    </div>
    </body>
</html>
