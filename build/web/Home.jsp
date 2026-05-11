<%-- 
    Document   : Admin-Nav
    Created on : 26 Jan, 2025, 9:16:32 PM
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
            *{
                margin: 0;
                padding: 0;
                box-sizing: border-box;
                font-family: 'Times New Roman', Times, serif;    
            }
            body{
                background-color: whitesmoke;
            }
              .navbar{
                height: 45px;
                display: flex;
                justify-content: center;
                align-items: center;
                background-color: white;
                padding: 10px 20px;
                box-shadow: 0 4px 6px rgba(0,0,0,0.1);
                margin-left: 10px;
                margin-bottom: 20px;
                border-radius: 15px;
                z-index: 1000;
                position: relative;
            }
            h1{
                color: firebrick;
                font-size: 2rem;
                font-family: monospace;
                font-weight: bold;
                text-decoration: none;  
                list-style: none;
                margin-left: 20px;
            }
            .navbar ul{
                list-style: none;
                margin: 0;
                padding: 0;
                display: flex;
                background-color: white;
            }
            .navbar ul li{
                margin: 0 15px;
                list-style: none;
            }
            .navbar ul li a{
                text-decoration: none;
                color: black;
                font-size: 20px;
                transition: color 0.3s;
                display: flex;
                background-color: white;
            }
            .navbar ul li a:hover{
                color: white;
                background-color: white;
                border: 2px solid black;
                background-color: gray;
                padding: 4px 4px 4px 4px;
                border-radius: 8px 8px 8px 8px;
            }
           /* Slideshow container */
           .slideshow-container { 
            max-width: 100%; 
            position: relative; 
            margin-right: 40px; 
            margin-left: 40px; /*margin: auto;*/ 
            background-color: white; 
          }

            /* Hide the images by default */
            .mySlides {
              display: none;
            }

            /* Next & previous buttons */
            .prev, .next {
              cursor: pointer;
              position: absolute;
              top: 50%;
              width: auto;
              margin-top: -22px;
              padding: 16px;
              color: black;
              font-weight: bold;
              font-size: 18px;
              transition: 0.6s ease;
              border-radius: 0 3px 3px 0;
              user-select: none;
              border-radius: 50%;
            }

            /* Position the "next button" to the right */
            .next {
              right: 0;
              border-radius: 50%;
            }

            /* On hover, add a black background color with a little bit see-through */
            .prev:hover, .next:hover {
              color: white;
              background-color: rgba(0,0,0,0.8);
            }

            /* Caption text */
            .text {
              color: #f2f2f2;
              font-size: 15px;
              padding: 8px 12px;
              position: absolute;
              bottom: 8px;
              width: 100%;
              text-align: center;
            }

            /* Number text (1/3 etc) */
            .numbertext {
              color: black;
              font-size: 12px;
              padding: 8px 12px;
              position: absolute;
              top: 0;
            }

            /* The dots/bullets/indicators */
            .dot {
              cursor: pointer;
              height: 15px;
              width: 15px;
              margin: 0 2px;
              background-color: #bbb;
              border-radius: 50%;
              display: inline-block;
              transition: background-color 0.6s ease;
            }

            .active, .dot:hover {
              background-color: green;
            }

            /* Fading animation */
            .fade {
              animation-name: fade;
              animation-duration: 1.5s;
            }

            @keyframes fade {
              from {opacity: .4}
              to {opacity: 1}
            }       
            img{
                max-width: 100%;
                height: auto;
                border-radius: 25px 25px 25px 25px;
            }
            .container {
                width: 100%;
                text-align: center;
                margin: 20px;
              }
              .container h1 {
                margin-bottom: 20px;
              }
              .party-list {
                display: flex;
                justify-content: center;
                flex-wrap: wrap;
                gap: 20px;
              }
              .party {
                border: 1px solid #ddd;
                border-radius: 8px;
                overflow: hidden;
                width: 240px;
                text-align: center;
                box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
                cursor: pointer;
                background-color: white;
              }
              .party:hover{
                  border: 1.5px solid black
              }
              .party img {
                width: 100%;
                height: auto;
              }
              .party-details {
                padding: 10px;
                background-color: white;
              }
              .party-details h3 {
                margin: 10px 0 5px;
                font-size: 16px;
                color: #333;
                background-color: white;
              }
              .product-details .price {
                color: #007BFF;
                font-weight: bold;
              }
              .navigation {
                margin-top: 20px;
              }
              .navigation button {
                padding: 10px 20px;
                border: none;
                background-color: #007BFF;
                color: white;
                font-size: 14px;
                cursor: pointer;
                border-radius: 4px;
              }
              .navigation button:hover {
                background-color: #0056b3;
              }
            .features-section{
                display: flex;
                justify-content: center;
                flex-wrap: wrap;
                margin-top: 20px;  
                cursor: pointer;
            }
            .feature-box{
                width: 285px;
                height: 180px;
                margin: 10px;
                padding: 20px;
                text-align: center;
                border-radius: 5px;
                box-shadow: 0 2px 5px rgba(0,0,0,0.1);
            }
            .feature-box:hover{
                border: 2px solid black;
            }
            .feature-icon{
                font-size: 30px;
                margin-bottom: 5px; 
                background-color: #007bff;
            }
            h3{
                font-size: 25px;
                color: black;
            }
            p{
                color: white;
                font-size: 18px;
            }
           /*color customization*/
           .feature-box:nth-child(1){
               background-color: #007bff;
               color: white;
           }
           .feature-box:nth-child(2){
               background-color: #ffc107;
               color: white;
           }
           .feature-box:nth-child(3){
               background-color: #dc3545;
               color: white;
           }
           .feature-box:nth-child(4){
               background-color: #00aeef;
               color: white;
           }
           
          .container1 {
            display: flex;
            justify-content: center;
            gap: 20px;
            flex-wrap: wrap;
            padding: 20px;
          }
          /* Section Styles */
          .section1 {
            flex: 1;
            margin: 10px;
            min-width: 250px;
            max-width: 400px;
            background: #fff;
            border: 1px solid #ddd;
            border-radius: 5px;
            padding: 15px;
          }

          .section1 h2 {
            text-align: center;
            font-size: 1.5em;
            color: darkred;
            margin-bottom: 10px;
          }

          /* Item Styles */
          .item {
            display: flex;
            align-items: center;
            text-align: left;
            margin-bottom: 20px;
            gap: 15px;
            border-bottom: 1px solid #eee;
            padding-bottom: 15px;
            width: 350px;
            background-color: white;
          }

          .item:last-child {
            border-bottom: none;
          }
          .item-text{
              flex: 1;
          }
          .item img {
            width: 100%;
            max-width: 120px;
            height: 100px;
            border-radius: 5px;
          }

          .section1 h3 {
            font-size: 1.2em;
            margin: 10px 0;   
            background-color: white;
          }

          button{
              font-size: 20px;
              padding: 8px;
              margin: 0px;
              background-color: whitesmoke;
              border-radius: 8%;
              border: 1px solid gray;
          }

          @media (max-width: 768px) {
            .container1 {
              flex-direction: column;
              align-items: center;
            }

            .section1 {
              max-width: 100%;
            }
          }
          .latest-news-ul{
                padding:0px;
                list-style:none;
                line-height: 12px;
            }
            .upcoming-events-ul{
                padding:0px;
                list-style:none;
                line-height: 12px;
            }
            
            .container2{
                display: flex;
                justify-content: space-around;
                padding: 20px;
                background-color: black;
                padding: 30px;
                background-color: #3b444b;
                border-radius: 20px 20px 0px 0px;
            }
            .intro{
                line-height: 28px;
                width: 30%;
            }
            .categories, .sub-categories{
                width: 20%;
            }
            .container2, .intro h1{
                color: palevioletred;
            }
            .categories, .sub-categories h2{
                text-align: center;
                color: white;
            }
            .sub-categories ul{
                list-style: none;
                font-size: 20px;
                line-height: 50px;
                padding: 0
            }            
             ul, li{
                line-height: 40px;
                font-size: 20px;
                list-style: none;
             }
             .Copyrights{
                height: 80px;
                color: white;
                font-size: 25px;
                padding-top: 5px; 
                background-color: #3b444b;
                border-radius: 0px 0px 20px 20px;
                text-align: center;
             }

          @media (max-width: 460px){

            /* NAVBAR FIX */
            .navbar{
                flex-direction: column;
                align-items: flex-start;
                height: auto;
                padding: 10px;
                gap: 10px;
            }

            .navbar ul{ 
                flex-direction: column;
                width: 100%;
            }

          .navbar ul li{
              width: 100%;
              margin: 5px 0;
          }

          .navbar ul li a{
            display: block;
              width: 100%;
              padding: 8px;
          }

          /* IMPORTANT: prevent overlap */
          .slideshow-container{
            margin-top: 15px;
          }

        /* SLIDESHOW IMAGE FIX */
          .slideshow-container img{
            width: 100%;
            height: 180px;   /* 👈 reduce for mobile */
            object-fit: cover;
          }
        

       /* PARTY CARDS */
          .party{
            width: 100%;
          }
          .party img{
            width: 100%;
            height: 120px;        /* 👈 reduce size */
            object-fit: contain;  /* 👈 no cropping */
          }

          /* FEATURES */
          .feature-box{
            width: 100%;
            height: auto;
          }

          /* NEWS ITEMS */
          .item{
            width: 100%;
            max-width: 100%;
            flex-direction: column;
            align-items: center;
            text-align: center;
          }

          .item img{
            width: 100%;
            max-width: 200px;
            height: auto;
          }

          /* SECTION LAYOUT */
          .container1{
            flex-direction: column;
            align-items: center;
          }

          /* FOOTER FIX */
          .container2{
            flex-direction: column;
            text-align: center;
          }

          .intro,
          .categories,
          .sub-categories{
              width: 100%;
          }

         /* TEXT SIZE FIX */
          h1{
            font-size: 22px;
          }

          h3{
            font-size: 18px;
          }

          p{
            font-size: 14px;
          }
        }  
      </style>
    </head>
    <body><br><br>
        <h1>Electronic-Voting!!</h1><br>
            <nav class="navbar">
            <ul>
                <li><a href="Home.jsp">Home</a></li>
                <li><a href="About-Us.jsp">About Us</a></li>
                <li><a href="Contact.jsp">Contact Us</a></li>
                <li><a href="Dashboard.jsp">Dashboard</a></li>
                <li><a href="Index.jsp">LogOut</a></li>                   
            </ul>
            </nav>
            <br><br>
       
        <!-- Slideshow container -->
        <div class="slideshow-container">

        <!-- Full-width images with number and caption text -->
        <div class="mySlides fade">
          <div class="numbertext">1 / 5</div>
          <img src="UL1.jpg" style="width:100%" >
          <div class="text">E-Voting!!..</div>
        </div>

        <div class="mySlides fade">
          <div class="numbertext">2 / 5</div>
          <img src="D1.jpg" style="width:100%">
          <div class="text">E-Voting!!..</div>
        </div>

        <div class="mySlides fade">
          <div class="numbertext">3 / 5</div>
          <img src="B2.jpg" style="width:100%">
          <div class="text">E-Voting!!..</div>
        </div>
        
        <div class="mySlides fade">
          <div class="numbertext">4 / 5</div>
          <img src="E3.jpg" style="width:100%">
          <div class="text">E-Voting!!..</div>
        </div>

        <div class="mySlides fade">
          <div class="numbertext">5 / 5</div>
          <img src="logo.jpg" style="width:100%">
          <div class="text">E-Voting!!..</div>
        </div>

        <!-- Next and previous buttons -->
        <a class="prev" onclick="plusSlides(-1)">&#10094;</a>
        <a class="next" onclick="plusSlides(1)">&#10095;</a>
      </div>
      <br>

      <!-- The dots/circles -->
      <div style="text-align:center">
        <span class="dot" onclick="currentSlide(1)"></span>
        <span class="dot" onclick="currentSlide(2)"></span>
        <span class="dot" onclick="currentSlide(3)"></span>
        <span class="dot" onclick="currentSlide(4)"></span>
        <span class="dot" onclick="currentSlide(5)"></span>
      </div>
      
       <div class="container">
        <h1>Latest Parties</h1>
        <div class="party-list">
            <div class="party"><br><br>
              <img src="P1.jpg" alt="BJP">
            <div class="party-details">
              <h3>BJP</h3>           
            </div>
          </div>
            <div class="party"><br><br>
            <img src="P2.jpg" alt="Shivsena">
            <div class="party-details">
              <h3>Shivsena</h3>            
            </div>
          </div>
            <div class="party"><br><br>
            <img src="P3.jpg" alt="Congress">
            <div class="party-details">
              <h3>Congress</h3>            
            </div>
          </div>
            <div class="party"><br>
            <img src="P4.jpg" alt="Rashravadi">
            <div class="party-details">
              <h3>Rashrawadi</h3>             
            </div>
          </div>
            <div class="party"><br><br><br><br>
            <img src="P5.jpg" alt="AAP">
            <div class="party-details">
              <h3>AAP</h3>              
            </div>
          </div>
        </div>
        <div class="navigation">
          <button>Prev</button>
          <button>Next</button>
        </div>
      </div>
      
      <section class="features-section">
          <div class="feature-box">
              <i class="fas fa-sync feature-icon"></i>
              <h3 class="feature-title" style="background-color:#007bff"> Experience</h3><br>
              <p style="background-color:#007bff">TRUSTED BY VOTERS NATIONWIDE</p>
          </div>
          <div class="feature-box">
              <i class="fa-solid fa-users feature-icon" style="background-color:#ffc107"></i>
              <h3 class="feature-title" style="background-color:#ffc107">Happy Voters</h3><br>
              <p style="background-color:#ffc107">EASY TO USE</p>
          </div>
          <div class="feature-box">
              <i class="fas fa-lock feature-icon" style="background-color:#dc3545"></i>
              <h3 class="feature-title" style="background-color:#dc3545">Secure Voting </h3><br>
              <p style="background-color:#dc3545">FULLY ENCRYPTED FOR YOUR SAFETY</p>
          </div>
          <div class="feature-box">
              <i class="fa-solid fa-globe feature-icon" style="background-color:#00aeef"></i>
              <h3 class="feature-title" style="background-color:#00aeef">FAST & CONVENIENT</h3>
              <p style="background-color:#00aeef">VOTE FROM ANYWHERE</p>
          </div>
      </section>
      
     <div class="container1">
    <div class="section1">
        <h2 style="background-color:white">CANDIDATES</h2><br><br>
        <div class="item">
            <img src="CP1.jpg" alt="Sheesham Arm Chair">
            <h3>NARENDRA MODI</h3>
            <button>BJP</button>
        </div>
            <div class="item">
            <img src="CP2.jpg" alt="Dining table with 6 chairs">
            <h3>EKANATH SHINDE</h3>
            <button>Shivsena</button>    
        </div>
    
        <div class="item">
            <img src="CP3.jpg" alt="Dining table with 6 chairs">
            <h3>RAHUL GANDHI</h3>
            <button>Congress</button>      
        </div>
   
        <div class="item">
            <img src="CP4.jpg" alt="Dining table with 6 chairs">
            <h3>AJIT POWAR</h3>
            <button>Rashrawadi</button>     
        </div>        
        
        <div class="item">
            <img src="CP5.jpg" alt="Dining table with 6 chairs">
            <h3>ARVIND KEJRIWAL</h3>
            <button>AAP</button>     
        </div>
    </div>

    <div class="section1">
        <h2 style="background-color:white">LATEST NEWS</h2>
        <marquee direction="right" style="background-color:white">
            <ul class="latest-news-ul" style="background-color:white">
                <li style="background-color:white">1. India explores blockchain-based e-voting for 2024 elections.</li>
                <li style="background-color:white">2. Maharashtra village opts for ballot papers over EVMs.</li>
                <li style="background-color:white">3. Coimbatore school introduces e-voting for children's parliament.</li>
                <li style="background-color:white">4. Bombay High Court allows release of 1,944 seized EVMs.</li>
                <li style="background-color:white">5. Maharashtra Congress calls for ballot paper voting.</li>
                <li style="background-color:white">6. Voting machine companies fight disinformation about e-voting.</li>
                <li style="background-color:white">7. U.S. states implement late election rule changes.</li>
                <li style="background-color:white">8. Efforts underway to debunk myths about U.S. elections.</li>
            </ul>
        </marquee>
        <h2 style="background-color:white">UPCOMING EVENTS</h2>
        <marquee direction="left" style="background-color:white">
            <ul class="latest-news-ul" style="backgroud-color:white">
                <li style="background-color:white">1. Telangana to trial mobile-based e-voting in 2024.</li>
                <li style="background-color:white">2. India's first mobile e-voting test on October 20, 2024.</li>
                <li style="background-color:white">3. E-Vote-ID 2025 conference scheduled in France.</li>
                <li style="background-color:white">4. Delhi’s 'Aagaz-e-Voting' musical event in February 2025.</li>
                <li style="background-color:white">5. NSDL offers e-voting for corporate events.</li>
                <li style="background-color:white">6. Gold Coast pre-poll voting runs from October 14-25, 2024.</li>
                <li style="background-color:white">7. Early voting for NYC’s 2024 elections starts October 26.</li>
                <li style="background-color:white">8. U.S. 2024 Presidential Election on November 5, 2024.</li>
            </ul>
        </marquee>
    </div>

    <div class="section1">
        <h2 style="background-color:white">NEW FEATURES</h2><br><br>
        <div class="item">
            <img src="NF1.jpg" alt="Mob Voting">
            <h3>VOTE BY MOBILE</h3>
        </div><br>
        <div class="item">
            <img src="NF2.jpg" alt="Laptop Voting">
            <h3>VOTE BY LAPTOP</h3>
        </div><br>
        <div class="item">
            <img src="NF3.jpg" alt="Secure">
            <h3>SECURITY</h3>
        </div><br>
        <div class="item">
            <img src="NF4.jpg" alt="Live Voting Result">
            <h3>LIVE VOTING RESULT</h3>
        </div><br>
    </div>
  </div>
      
      <div class="container2">
          <div class="intro" style="background-color:#3b444b">
              <h1 style="background-color:#3b444b">Electronic Voting</h1><br>
              <p style="background-color:#3b444b">Electronic voting is voting that uses electronic means to either aid or take care of casting and counting ballots including voting time.
                Depending on the particular implementation, e-voting may use standalone electronic voting machines (also called EVM) or computers connected to the Internet (online voting). It may encompass a range of Internet services, from basic transmission of tabulated results to full-function online voting through common connectable household devices. The degree of automation may be limited to marking a paper ballot, or may be a comprehensive system of vote input, vote recording, data encryption and transmission to servers, and consolidation and tabulation of election results.</p>
          </div>
          <div class="categories" style="background-color:#3b444b">
              <h2 style="background-color:#3b444b">Legal & Privacy</h2>
              <ul style="background-color:#3b444b"><br>
                  <li style="background-color:#3b444b">Terms Of Service</li><br><hr><br>
                  <li style="background-color:#3b444b">Privacy Policy</li><br><hr><br>
                  <li style="background-color:#3b444b">Disclaimer</li><br><hr><br>                
              </ul>
          </div>
          <div class="categories" style="background-color:#3b444b">
              <h2 style="background-color:#3b444b">Quick Links</h2>
              <ul style="background-color:#3b444b"><br>
                  <li style="background-color:#3b444b">FAQs</li><br><hr><br>
                  <li style="background-color:#3b444b">Guidelines For Voters</li><br><hr><br>
                  <li style="background-color:#3b444b">Election Schedule</li><br><hr><br style="background-color:#3b444b">                  
              </ul>
          </div>
          <div class="categories" style="background-color:#3b444b">
              <h2 style="background-color:#3b444b">Contact Information</h2>
              <ul style="background-color:#3b444b"><br>
                  <li style="background-color:#3b444b">E-mail Support<br>support@evotingplatform.com</li><br><hr><br>
                  <li style="background-color:#3b444b">HelpLine Number<br>+1-800-XXXXXXX</li><br><hr><br>
              </ul>
          </div>         
        </div>
        <div class="Copyrights">
            <u style="background-color:#3b444b">&copy; 2025 E-Voting.com Inc, Or Its Affiliates. <br>All Rights Reserved.  </u>
        </div>
      
        <script>
           let slideIndex = 1;
           showSlides(slideIndex);

            // Next/previous controls
            function plusSlides(n) {
              showSlides(slideIndex += n);
            }

            // Thumbnail image controls
            function currentSlide(n) {
              showSlides(slideIndex = n);
            }

            function showSlides(n) {
              let i;
              let slides = document.getElementsByClassName("mySlides");
              let dots = document.getElementsByClassName("dot");
              if (n > slides.length) {slideIndex = 1}
              if (n < 1) {slideIndex = slides.length}
              for (i = 0; i < slides.length; i++) {
                slides[i].style.display = "none";
              }
              for (i = 0; i < dots.length; i++) {
                dots[i].className = dots[i].className.replace(" active", "");
              }
              slides[slideIndex-1].style.display = "block";
              setTimeout(showSlides, 2000);
              dots[slideIndex-1].className += " active";
            }
        </script>
    </body>
</html>
