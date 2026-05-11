<%-- 
    Document   : Aboout
    Created on : 30 Jan, 2025, 2:32:44 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Voting !!</title>
        <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.2/css/all.min.css" integrity="sha512-SnH5WK+bZxgPHs44uWIX+LLJAJ9/2PkPKZ5QiAj6Ta86w+fsb2TkcmfRyVX3pBnMFcV7oQPJkl9QevSCWr3W6A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
        <style>
            html, body {
                margin: 0;
                padding: 0;
                min-height: 100vh;
            }
            *{
                margin: 0;
                padding: 0;
                box-sizing: border-box;
            }
            body{
                font-family: 'Times New Roman', Times, serif;
                line-height: 1.6;
                display: flex;
                flex-direction: column;
            }
            .navbar{               
                display: flex;
                justify-content: space-between;
                align-items: center;
                height: 80px;
                padding: 10px 20px;
                background-color: white;
                padding: 10px 20px;
                box-shadow: 0 4px 6px rgba(0,0,0,0.1);          
                border-radius: 15px;
                margin: 20px;
            }
            .navbar .logo{
                color: darkred;
                font-size: 2.5em;
                font-weight: bold;
                font-family: monospace;
            }
            .navbar ul{
                list-style: none;
                display: flex;
                gap: 15px;
            }
            .navbar ul li{
                display: inline;
            }
            .navbar ul li a{
                color: black;
                text-decoration: none;
                padding: 5px 10px;
                transition: background 0.3s;
                font-size: 20px;
            }
            .navbar ul li a:hover{
                color: white;
                background-color: white;
                border: 2px solid black;
                background-color: gray;
                padding: 4px 4px 4px 4px;
                border-radius: 8.5px;
            }
            
            .About-Us{
                padding: 20px;
                text-align: center;
                /*background-color: #f4f4f4;*/
            }
            .About-Us h1{
                margin-bottom: 10px;
                font-size: 2em;
            }
            .About-Us p{
                margin-bottom: 20px;
                color: #555;
            }
            .image-container img{
                width: 100%;
                max-width: 2000px;
                height: 500px;
                border-radius: 5px;
                box-shadow: 0 4px 8px rgba(0,0,0,0.2);
                cursor: pointer;
                border-radius: 20px;
            }
            .container1{
               display: flex;
            }
            .left-section{
                width: 50%;
                padding: 20px;
                
            }            
            .left-section h1{
                font-size: 35px;
            } 
            .right-section{
                width: 50%;
                padding: 20px;
            }
            .right-section h2{
                font-size: 20px;
                margin-bottom: 10px;
            }
            .experience-section{
                text-align: center;
                justify-content: center;
                display: flex;
            }
            .experience-section p{
                font-size: 25px;
            }
            .sec1{
                width: 20%;
                padding: 20px;
            }
            .sec2{
                width: 20%;
                padding: 20px;
            }
            .quote{              
                font-size: 45px;
                color: black;
                margin-top: 20px;
                background-color: #f0ad4e;
                padding: 20px;
                justify-content: center;
                text-align: center;
                align-items: center;
                border-radius: 30px;
                margin: 20px auto;
                max-width: 900px;
            }
            .quote:hover{
                color: black;
                border: 5px solid black;
                font-family: monospace;
            }
            .main-content {
                flex: 1;
            }

            /*📱 Tablet (≤ 768px)*/

            @media (max-width: 768px) {

            .navbar {
                flex-direction: column;
                height: auto;
                gap: 10px;
                text-align: center;
            }

            .navbar ul {
                flex-wrap: wrap;
                justify-content: center;
            }

            .navbar ul li a {
                font-size: 16px;
            }

            .container1 {
                flex-direction: column;
            }

            .left-section,
            .right-section {
                width: 100%;
                padding: 15px;
            }

            .image-container img {
                height: auto;
            }

            .quote {
                font-size: 30px;
                margin-left: 20px;
                margin-right: 20px;
            }

            .experience-section {
                flex-wrap: wrap;
            }

            .sec1, .sec2 {
                width: 45%;
            }
            }

            /*📱 Mobile (≤ 480px)*/
            
            @media (max-width: 480px) {

            .navbar {
                padding: 10px;
            }

            .navbar .logo {
                font-size: 1.8em;
            }

            .navbar ul {
                flex-direction: column;
                gap: 8px;
            }

            .navbar ul li a {
                font-size: 14px;
            }

            .About-Us h1 {
                font-size: 22px;
            }

            .About-Us p {
                font-size: 14px;
            }

            .left-section h1 {
                font-size: 24px;
            }

            .right-section h2 {
                font-size: 16px;
            }

            .experience-section {
                flex-direction: column;
                align-items: center;
            }

            .sec1, .sec2 {
                width: 90%;
            }

            .quote {
                font-size: 22px;
                margin-left: 10px;
                margin-right: 10px;
                padding: 15px;
            }
            }
        </style>
    </head>
    <body>
        <header>
            <div class="navbar">
                <div class="logo"><u>Electronic-Voting</u> !!</div>
                <nav>
                    <ul>
                        <li><a href="Home.jsp">Home</a></li>
                        <li><a href="About-Us.jsp">About-Us</a></li>
                        <li><a href="About.jsp">Motive</a></li>
                        <li><a href="Election.jsp">Election</a></li>
                        <li><a href="Contact.jsp">Contact-Us</a></li>
                    </ul>
                </nav>
            </div>
        </header>  
        <main>
            <section class="About-Us">
                <h1>About-Us</h1>
                <p>Home > About-Us</p>
                <div class="image-container">
                    <img src="About.jpg" alt="E-Voting"
                </div>
            </section>
         </main>
        <div class="container1">
            <div class="left-section"><br><br>
                <h1>"Your Vote, Your Voice - Now Just A Click Away with Secure E-Voting !!"</h1>
            </div>
            <div class="right-section">
                <p><h2>E-Voting is voting through an electronic system on resolutions of company requiring members/shareholder’s consent. The need for e-Voting arises when a company wishes to pass a resolution by Postal Ballot or Annual General Meeting or Extraordinary General Meeting.
                    Ministry of Corporate Affairs, Government of India has authorized NSDL for setting up an electronic platform to facilitate members / shareholders to cast vote in electronic form. e-Voting system created by NSDL is certified by Standardization Testing and Quality Certification (STQC) Directorate, Department of Information Technology, Ministry of Communications & IT, Government of India.</h2></p>
                    <p><h2>In Addition to providing remote based E-voting option, NSDL also facilitates companies to provide electronic voting option at meeting venue using portable devices like Tablets. Further, NSDL helps companies to conduct virtual meetings and live streaming of meeting proceedings.</h2></p>
            </div>
        </div>
        <div class="quote">
            <p>&OpenCurlyDoubleQuote;Empowering Democracy with technology - Secure, Accessible, And Transparent E-Voting For All. !!</p>
        </div>  
        
        <div class="experience-section">
            <div class="sec1">
                <i class="fas fa-lock feature-icon" style="height: 35px"></i>
                <p>SECURITY</p>
            </div>
            <div class="sec2">
                <h2>2,500</h2>
                <p>HAPPY VOTERS</p>
            </div
        </div>       
    </body>
</html>