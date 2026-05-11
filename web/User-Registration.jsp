<%-- 
    Document   : User-Registration
    Created on : 14 Jan, 2025, 8:39:42 PM
    Author     : LENOVO
--%>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ page import="java.sql.*" %>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="preconnect" href="https:/fonts.gstatic.com" crossorigin>
        <link href="https://fonts.googleapis.com/css2?family=Poppins:wght@300&display=swap" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="bootstrap.min.css">
        <title>E-Voting!!</title>
        <style>  
            html, body{
                height: 100%;
            }

            *{
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: 'Times New Roman', Times, serif;
            }

            /* BODY */
            body{
                background-image: url(U1.jpg);
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;
                background-attachment: fixed;
                min-height: 100vh;
            }
            /* MAIN CONTAINER */
           .main{
                display: flex;
                flex-wrap: wrap;
                justify-content: center;
                align-items: center;
                width: 90%;
                max-width: 950px;
                margin: 30px auto;   /* center properly */
                padding: 15px;
                border-radius: 25px 25px 100px 25px;
                box-shadow: 10px 20px 20px rgba(229,225,225,0.5);
                backdrop-filter: blur(5px);
            }

            /* IMAGE BOX */
            .img{
                background-image: url(U2.jpg);
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;
                width: 100%;
                max-width: 350px;
                min-height: 280px;
                border-radius: 20px;
                margin: 10px;
            }

            /* FORM CONTAINER */
            .registerdiv{
                border: 1px solid white; 
                padding: 15px;
                backdrop-filter: blur(10px);
                box-shadow: 0 0 10px rgba(229,225,225,0.5);
                width: 100%;
                max-width: 320px;
                margin: 10px;
                border-radius: 15px;
            }

            /* INNER BOX */
            .box{
                display: flex;
                flex-direction: column;
                justify-content: center; 
                padding: 20px;
                border-radius: 40px 0px 40px 0px; 
                backdrop-filter: blur(10px);
                box-shadow: 0 0 10px rgba(229,225,225,0.5);
            }

            /* INPUTS */
            .box1{
                width: 100%; 
                font-size: 15px;
                padding: 8px; 
                margin-bottom: 10px; 
                border-radius: 5px; 
                outline: none; 
                border: none;
            }

            .form-control{
                width: 100%;
                height: 30px;
                border-radius: 5px;
            }

            /* TEXT */
            h1{
                font-size: 28px;
                margin-bottom: 10px;
            }

            p{
                font-size: 18px;
                margin-bottom: 10px;
            }

            label{
                font-size: 16px;
                margin-top: 5px;
            }

            /* BUTTONS */
            #button, #cancel-button{
                width: 48%;
                font-size: 16px;
                font-weight: 600;
                border-radius: 10px;
                padding: 8px;
                cursor: pointer;
                border: none;
            }

            #button{
                background-color: gray;
            }
            #button:hover{
                background-color: green;
            }

            #cancel-button{
                background-color: gray;
            }
            #cancel-button:hover{
                background-color: red;
            }

            /* BUTTON ROW */
            .col-sm-6{
                display: flex;
                justify-content: space-between;
                gap: 10px;
                margin-top: 10px;
            }
            /* Fix for mobile */
            @media (max-width: 768px){
                body{
                    background-size: cover;
                    background-attachment: scroll;
                }
            }

            /* ===== TABLET ===== */
            @media (max-width: 900px){
                body{
                    background-size: cover;
                    background-position: center;
                    background-attachment: scroll; /* better on mobile */
                }
                    .main{
                        flex-direction: column;
                    }
            }

            @media (max-width: 500px){
                body{
                    background-size: cover;  /* keep full background */
                }
            }

            /* ===== MOBILE ===== */
            @media (max-width: 480px){
                body{
                    background-size: cover;  /* keep full background */
                }

                h1{
                    font-size: 22px;
                    }

                p{
                    font-size: 16px;
                }

                label{
                    font-size: 14px;
                }

                .img{
                    min-height: 220px;
                }

                #button, #cancel-button{
                    width: 100%;
                }

                .col-sm-6{
                    flex-direction: column;
                }

                body{
                    background-size: contain; /* prevents image cut */
                }
            }

            @media (max-width: 320px){
                body{
                    background-size: cover;  /* keep full background */
                    
                }

                .main{
                    width: 95%;
                    padding: 10px;
                    border-radius: 15px;
                }

                .img{
                    min-height: 180px;
                }

                .registerdiv{
                    padding: 10px;
                    max-width: 100%;
                }

                h1{
                    font-size: 18px;
                }

                p{
                    font-size: 14px;
                }

                label{
                    font-size: 13px;
                }

                .box{
                    padding: 10px;
                }

                .box1{
                    font-size: 13px;
                    padding: 6px;
                }

                .form-control{
                    height: 26px;
                }

                #button, #cancel-button{
                    width: 100%;
                    font-size: 14px;
                    padding: 6px;
                }

                .col-sm-6{
                    flex-direction: column;
                    gap: 8px;
                }
            }
        </style>
    </head>
    <body>
      <body>
       <form action="User_Registration_Servlet" method="POST" onsubmit="returnvalidateRegistration">
            <div class="main">
                <div class="img"></div>
                <div class="registerdiv">
                    <h1>Welcome to Voting!!</h1>
                    <p><u>Register your Account</u></p>
                    <input type="text" onkeypress="javascript:return isString(evt)" name="txt_fullname" required placeholder="Enter Full Name" class="form-control" > <br>   
                    <label>Gender
                        <input type="radio" name="txt_gender" value="Male" required id="male" >Male
                        <input type="radio" name="txt_gender" value="Female" required id="female" >Female
                    </label><br>
                    <form onsubmit="return validateAge()"><label for="dob"></label><input type="date" id="dob" name="dob" required placeholder="Enter Your Date-Of-Birth" class="form-control">
                    <input type="text" onkeypress="javascript:return isNumber(evt)" name="txt_contact" required placeholder="Enter Contact No" class="form-control" ><br>
                    <input type="text" onkeypress="javascript:return isString(evt)" name="txt_name" required placeholder="Enter Address" class="form-control" required><br>
                    <input type="text" onkeypress="javascript:return isAlphanumeric(evt)" name="txt_email"required id="email" placeholder="Enter Your E-mail ID" class="form-control"><br>
                    <input type="password" onkeypress="javascript:return isAlphanumeric(evt)" name="txt_password" required id="password" placeholder="Enter Password" class="form-control" ><br>
                    <input type="password" onkeypress="javascript:return isAlphanumeric(evt)" name="txt_cpassword" required id="cpassword" placeholder="Confirm Password" class="form-control" ><br><br>
                    <div class="row">
                        <div class="col-sm-6">
                            <input type="submit" name="btn_signup" id="button" value="SIGNUP"/>
                            <input type="button" name="btn_signup" id="cancel-button" value="EXIT"/><br>
                        </div>
                    </div>
                
              <%-- Show popup if registered --%>
    <% if (request.getParameter("registered") != null) { %>
        <script> showPendingMessage(); </script>
    <% } %>
        
        <script>
            //Go Back To Login Page Using Cancel Button On UserRegistration Screen
            document.getElementById("cancel-button").addEventListener("click",function(){
                window.location.href ="User-Login.jsp";
            });         

            </script>
  
            
    </body>
</html>
