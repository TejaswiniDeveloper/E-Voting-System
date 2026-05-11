<%-- 
    Document   : Dashboard
    Created on : 14 Jan, 2025, 8:50:49 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Voting!!</title>
        <style>
            * {
                margin: 0;
                padding: 0;
                box-sizing: border-box;
           }

         body{
            background-image: url(D3.jpg);
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            min-height: 100vh;
            margin: 0;
            font-family: 'Times New Roman', Times, serif;
        }

           /* Container */
           .container{
              display: flex;
              flex-direction: row;   /* sidebar left, content right */
              height: auto;
              margin: 20px;
          }

           /* Sidebar */
          .sidebar{
              width: 25%;
              min-height: 600px;
              padding: 20px;

              border-radius: 25px;
              border: 10px solid whitesmoke;

              background: linear-gradient(to right, #dad3d9, #fff, #d6ccd5);
          }
           .sidebar p{
             font-size: 25px;
             font-weight: 500px;
             color: red;
             font-family: 'Times New Roman', Times, serif;
           }
           .steps {
             list-style: none;
             display: flex;
             flex-direction: column;
             margin-right: 15px;
           }
           li:hover{
             background-color: skyblue;
             padding: 5px;
             border-radius: 10px;
           }
           .step {
             display: flex;
             align-items: center;
             font-size: 1rem;
             color: #0f0e0e;
           }

           .step span {
             width: 30px;
             height: 30px;
             display: flex;
             justify-content: center;
             align-items: center;
             border-radius: 50%;
             color: #fff;
           }

           .step.completed span {
             background: #28a745;
           }

           .step.active span {
             background: #28a745;
           }
           .help {
             margin-top: 30px;
             text-align: center;
           }

           .help button {
             font-size: 20px;
             font-weight: 650px;
             padding: 10px 20px;
             background: skyblue;
             color: #fff;
             border: none;
             border-radius: 10px;
             cursor: pointer;
           }

           .help button:hover{
             background-color: green;
             color: black;
           }
          .content{
            width: 100%;
            display: flex;
            justify-content: space-around;
            flex-wrap: wrap;
            padding: 20px;
            gap: 20px;
        }

           .section{
              flex: 1;
              min-width: 250px;
              height: auto;

              padding: 20px;
              border: 10px solid white;
              border-radius: 8px;
              text-align: center;
          }
           .section:hover{
             background: linear-gradient(to right, orange, #ffff, green);
           }
           .section:last-child {
             margin-right: 0;
           }

           .section:last-child:hover{
             background: linear-gradient(to right, orange, #ffff, green);
           }
           .section h2 {
             font-size: 1.5em;
             margin-bottom: 20px;
           }

           .boxes h1{
             font-family: 'Courier New', Courier, monospace;
             font-size: 50px;
             font-weight: 1000;
             text-align: center;
             color: palevioletred;
           }

           h1 {
             text-align: center;
             color: #333;
             margin-bottom: 0px;
             margin-top: 0px;
           }

           .steps{
             list-style: none;
             display: flex;
             flex-direction: column;
             gap: 20px;
           }

           .step {
             flex: 1;
             padding: 20px;
             border: 1px solid black;
             border-radius: 8px;
             text-align: center;
             margin-right: 10px;
           }

           .step:last-child {
             margin-right: 0;
           }

           h2 {
             font-size: 20px;
             color: #333;
             font-weight: 600;
             font-family: 'Courier New', Courier, monospace;
           }

           h3 {
             font-size: 20px;
             font-weight: 600;
             color: black;
             font-family: 'Courier New', Courier, monospace;
           }

           p {
             font-size: 20px;
             font-weight: 600;
             color: black;
             font-family: 'Courier New', Courier, monospace;
           }

           .content h2{
             font-size: 30px;
             font-weight: 800;
             color: darkblue;
           }
           .content p{
             font-size: 25px;
             font-weight: 800;
             color: black;
           }

           #button {
             background-color: palevioletred;
             color: black;
             padding: 10px 20px;
             border: none;
             border-radius: 10px;
             font-size: 18px;
             cursor: pointer;
             margin-top: 10px;
           }

           #button:hover {
             background-color: rgb(148, 66, 93);
           }
           #button1 {
             background-color: palevioletred;
             color: black;
             padding: 10px 20px;
             border: none;
             border-radius: 10px;
             font-size: 18px;
             cursor: pointer;
             margin-top: 10px;
           }

           #button1:hover {
             background-color: rgb(148, 66, 93);
           }
           #button2 {
             background-color: palevioletred;
             color: black;
             padding: 10px 20px;
             border: none;
             border-radius: 10px;
             font-size: 18px;
             cursor: pointer;
             margin-top: 10px;
           }

           #button2
           :hover {
             background-color: rgb(148, 66, 93);
           }

          @media (max-width: 768px){

              .container{
                  flex-direction: column; /* sidebar top, content bottom */
              }

              .sidebar{
                  width: 100%;
              }

            .content{
              width: 75%;
              display: flex;
              justify-content: center;
              align-items: center;
              flex-wrap: wrap;

              gap: 80px;   /* 👈 THIS creates space between boxes */
              padding: 20px;
          }

              .section{
                  width: 90%;
                  margin-bottom: 15px;
              }
          }

        </style>                
    </head>
    <body>
            <div class="container">
         <!-- Step Progress Sidebar -->
         <aside class="sidebar">

           <p>MENU..</p><br>
           <ul class="steps">
             <li><a href="Basic-Info.jsp" class="step completed" >
               <span>1</span>
               <h2>Basic Details</h2>
               </a></li>
             <li><a href="Home.jsp" class="step completed" >
               <span>2</span>
               <h2>Home</h2>
             </a></li>
             <li><a href="About-Us.jsp" class="step completed" >
               <span>3</span>
               <h2>About-Us</h2>
             </a></li>
             <li><a href="Election.jsp" class="step completed" >
               <span>3</span>
               <h2>Election.</h2>
             </a></li>
             <li><a href="Home.jsp" class="step completed" >
               <span>5</span>
             <h2>Exit</h2>
             </a></li>
           </ul>
           <div class="help">
             <p>Having troubles?</p><br>
             <button <li> <a href="Contact.jsp" class="step completed" >CONTACT US</a></li></button>
           </div>
         </aside>
       <div class="boxes"><br><br>
         <h1>E-Voting Dashboard</h1><br><br>
         <div class="steps">
           <div class="step">
             <h2><u>Step 1 :</u>----</h2>
             <h3>Register as a User :- </h3>
             <p>----DO REGISTRATION !!..</p>
           </div>
           <div class="step active">
             <h2><u>Step 2 :</u>----</h2>
             <h3>Candidate Information :-</h3>
             <p>----GET CANDIDATE INFORMATION !!..</p>
           </div>
           <div class="step">
             <h2><u>Step 3 :</u>----</h2>
             <h3>Admin Control :-</h3>
             <p>----ADMIN CONTROL !!..</p>
           </div>
         </div><br><br>

         <div class="content">

           <div class="section user">
             <h2>USER SECTION</h2><br>
             <p>Total Registered Users:<br> <span id="users">500K</span></p>
             <button id="button" data-url="User-Login.jsp">User Login</button><br>
           </div>

           <div class="section candidate">
             <h2>CANDIDATE SECTION</h2><br>
             <p>Leading Candidate:<br><span id="leadingCandidate">Candidates</span></p>
             <button id="button1" data-url="Candidate-Login.jsp">Candidate Login</button><br>
           </div>

           <div class="section admin">
             <h2>ADMIN SECTION</h2><br>
             <p>System Status: <br><span id="systemStatus">Active</span></p><br>
             <button id="button2" data-url="Admin_Login.jsp">Admin Login</button><br>
           </div>

         </div>
       </div>
     <script>

         document.getElementById("button").addEventListener("click",function(){
                window.open("User-Login.jsp","_Blank");
            });
             document.getElementById("button1").addEventListener("click",function(){
                window.open("Candidate-Login.jsp","_Blank");
            });
             document.getElementById("button2").addEventListener("click",function(){
                window.open("Admin_Login.jsp","_Blank");
            });
     </script>
    </body>
</html>
