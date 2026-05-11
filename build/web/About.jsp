<%-- 
    Document   : About
    Created on : 14 Jan, 2025, 8:48:29 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Voting !!</title>
        <style>
            html, body {
                margin: 0;
                padding: 0;
                min-height: 100vh;
            }

            body {
                display: flex;
                flex-direction: column;
                min-height: 100vh;
            }
                    
            .header{
               background: linear-gradient(90deg, #cc6766, #9d7bbd);
               color: white;
               padding: 20px 0;
               text-align: center;
               height: 170px;
               border-radius: 20px;
           }

           .header h1{
               font-size: 2rem;
               font-family: 'Courier New', Courier, monospace;
           }

           p{
               font-size: 25px;
           }

           /*.nav{
               display: flex;
               justify-content: center;
               gap: 20px;
               list-style: none;
               font-size: 20px;
           }

           .nav a{
               color: white;
               text-decoration: none;
               font-weight: bold;
               padding: 8px 16px;
               border-radius: 4px;
               transition: background-color 0.3s;
           }

           .nav a:hover{
               background-color: #d6d1d1;
           }*/

           .content{
               flex: 1;
               text-align: center;
               padding: 40px 10px;
               background-color: #f9f9f9;
           }

           .content h2{
               font-size: 1.8rem;
               margin-bottom: 20px;
           }

           .cards{
               display: flex;
               justify-content: center;
               gap: 20px;
               flex-wrap: wrap;
               transform: scale(1.05);
               transition: transform 0.3s;
           }

           .card{
               background-color: white;
               box-shadow: 0 4px 8px rgb(0, 0, 0, 0.1);
               border-radius: 8px;
               padding: 20px;
               width: 300px;
               height: 250px;
               text-align: center;
               cursor: pointer;
           }

          .card:hover {
                background-color: whitesmoke;
                box-shadow: 0 6px 10px rgba(0,0,0,0.3);
                transform: translateY(-5px);
            }

           .card h3{
               margin-bottom: 10px;
               font-size: 1.5rem;
               color: #2d045867;
               font-weight: Bold;
           }

           .card p{
               color: #555;
               font-size: 1rem;
               text-align: justify;
               font-weight: bold;
           }
           
           /*📱 Tablet (≤ 768px) */

           @media (max-width: 768px) {

            .header {
                /*height: auto;*/
                padding: 20px;
            }

            .header h1 {
                font-size: 1.6rem;
            }

            p {
                font-size: 18px;
            }

            .content {
                padding: 30px 10px;
            }

            .cards {
                gap: 15px;
                transform: none;   /* remove scaling on small screens */
            }

            .card {
                width: 90%;
                height: auto;
            }

            .card h3 {
                font-size: 1.3rem;
            }

            .card p {
                font-size: 14px;
            }
            }

            /*📱 Mobile (≤ 480px)*/

            @media (max-width: 480px) {

            .header h1 {
                font-size: 1.3rem;
            }

            p {
                font-size: 16px;
            }

            .content h2 {
                font-size: 1.4rem;
            }

            .cards {
                flex-direction: column;
                align-items: center;
                gap: 12px;
            }

            .card {
                width: 95%;
                padding: 15px;
            }

            .card h3 {
                font-size: 1.2rem;
            }

            .card p {
                font-size: 13px;
            }
            }

        </style>
    </head>
    <body>
        <div class="header">
        <h1>E-Voting</h1>
        <p>Every Vote Counts</p>
        
        <p><center>Home / About</center></p>
    </div>
    <div class="content">
        <h1>About Voting</h1>
        <div class="cards">
            <div class="card">
                <h3>Our Mission</h3>
                <p>This Project aims to leverage technology to enhance the accessibility, security and efficiency of the voting experience for citizens.</p>
                <p>Electronic voting aims to replace traditional paper ballots with electronic voting machines(EVMs) that can accurately record and count votes,reducing the time and resources required for voting and counting process.</p>
            </div>
            <div class="card">
                <h3>Our Vision</h3>
                <p>This system eliminates the need for physical ballot paper and allows eligible voters to cast their votes ellectronically.</p>
                <p>E-voting is to create a digital democracy where voting is secure,efficient and accessible to all citizens.</p>
            </div>
            <div class="card">
                <h3>Our Goal</h3>
                <p>The E-Voting System project is a digital solution designed to streamline and modernize the traditional voting proces. </p>
                <p>The electronic voting system aims to reduce the time and resources required for voting and counting processes, increase voter turnout and minimize errors and discrepancies in vote counting.</p>
            </div>
        </div>
    </div>
    </body>
</html>
