<%-- 
    Document   : Candidate-Login
    Created on : 14 Jan, 2025, 8:40:10 PM
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
                background-image: url(D2.jpg);
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;
                min-height: 100vh;
                margin: 0;
                display: flex;
                justify-content: center;
                align-items: center;
            }
            .container{
                width: 90%;
                max-width: 450px;
                height: auto;

                box-shadow: 0 10px 30px rgba(0,0,0,0.4);
                backdrop-filter: blur(5px);

                border-radius: 20px;  /* better than 50% for login UI */

                padding: 25px;
                text-align: center;
                border: 2px solid black;
            }          
            h1
            {
               font-size: 50px;
               color: black;
               text-align: center;
               font-family: 'Times New Roman', Times, serif;
            }
            .form-control{
                text-align: center;
                cursor: pointer;
            }
            label
            {
                color: black;
                font-size: 25px;
                cursor: pointer;
            }
            #username,
            #password{
                width: 90%;
                max-width: 300px;
                height: 45px;
                border-radius: 14px;
                border: 2px solid black;
                margin: 10px 0;
            }
           
            #username:hover{
                border: 4px solid rgba(206, 142, 24, 0.884);
            }
           
            #password:hover{
                border: 4px solid rgba(206, 142, 24, 0.884);
            }
            .btn{
                display: flex;
                justify-content: center;
                gap: 20px;
                flex-wrap: wrap;
            }

            #button{
                width: 6rem;
                font-size: 20px;
                font-weight: 600;
                color: white;
                font-family: 'Times New Roman', Times, serif;
                background-color: gray;
                border-radius: 10px;
                border: 2px solid black;
                padding: 8px;
                box-shadow: 4px rgb(150, 128, 128);
                cursor: pointer;
            }
           #button:hover{
                background-color: green;
            }
            #button, #cancel-button{
                width: 120px;
                font-size: 18px;
                font-weight: 600;
                border-radius: 10px;
                padding: 10px;
                cursor: pointer;
                border: 2px solid black;
                color: white;
                background-color: gray;
            }     
            #cancel-button:hover{
                background-color: red;
            }

            /* Responsive Design */

            @media (max-width: 768px){

                .container{
                    width: 90%;
                    border-radius: 15px;
                    padding: 20px;
                }

                h1{
                    font-size: 32px;
                }

                #username, #password{
                    width: 100%;
                }

                .btn{
                    flex-direction: column;
                    gap: 10px;
                }
            }
        </style>
    </head>
        </style>
    </head>
    <body>
         <form action="Login" method="POST">
        <div class="container"><br><br><br><br>    
            <h1>Candidate Login !!</h1><br>

            <div class="label">
                <label>UserName</label> 
            </div>
            <input type="text" onkeypress="javascript:return isAlphanumeric(evt)" name="txt_username"required id="username" placeholder="Enter your UserName" class="form-control"><br><br>
           
            <div class="label">
                <label>Password</label> 
            </div>
            <input type="password" onkeypress="javascript:return isAlphanumeric(evt)" name="txt_password" required id="password" placeholder="Enter Your Password" class="form-control"><br><br><br><br>

            <div class="btn">
               <input type="submit" name="btn_signup" id="button" value="SIGNUP"/>
                <input type="button" name="btn_signup" id="cancel-button" value="EXIT"/><br>
            </div><br>
         </div>                      
    </form>
        

    
             
        </form> 
        <script>
            //Linking Sign-up Link To Candidate Sign-up Page
            //document.getElementById("sign-up").addEventListener("click",function(){
              //  window.open("CandidateSign-Up.html","_Blank");
            //});
            
            //Go Back To index Page Using Cancel Button On Candidate Login screen
            document.getElementById("cancel-button").addEventListener("click",function(){
                window.location.href="Dashboard.jsp";
            });

            //Pop Up Msg For Login Successfully Completed
            document.getElementById("login-button").addEventListener("click",function(){
                const username = document.getElementById("username").value;
                const password = getElementById("password").value;

                if(username && password){
                    alert("Login Successfully Completed !!..")
                } else {
                    alert("Please Enter Both UserName & Password !!");
                }
            });
        </script>
    </body>
</html>
