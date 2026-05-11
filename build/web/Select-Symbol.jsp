<%-- 
    Document   : Select-Symbol
    Created on : 14 Jan, 2025, 8:42:43 PM
    Author     : LENOVO
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>E-Voting!!</title>
        <style>
            html, body {
    margin: 0;
    padding: 0;
    overflow-x: hidden; 
    height: 100%;/* prevents tiny gaps */
}
            body{
                font-family: 'Times New Roman', Times, serif;
                background-color: #f5f5f5;
                margin: 0;
                padding: 20px;
                text-align: center;
                 min-height: calc(100vh + 5px);
                    background-image: url(E1.jpg);
                    background-size: cover;
                    object-fit: cover;
                    background-position: center;
                    background-repeat: no-repeat;
                    

                }

            h1{
                font-size: 40px;
                color: white;
            }

            .party-container{
                display: flex;
                flex-wrap: wrap;
                justify-content: center;
                gap: 20px;
                margin-top: 20px;
            }
            .party-card{
                background-color: gray;
                color: #fff;
                width: 280px;
                padding: 10px;
                border-radius: 2px 100px 2px 100px;
                text-align: center;
                box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
                transition: transform 0.3s ease;
                box-shadow:  0 10px 10px rgba(61, 56, 56, 0.973);
            }
            .party-card:hover{
                transform: scale(1.05);
                background-color: black;
            }
            .party-logo{
                margin-top: 40px;
                border-radius: 4px;
                justify-content: center;
            } 
            button{
                margin-top: 10px;
                padding: 12px 12px;
                background-color: #28a745;
                border: none;
                border-radius: 10px;
                color: white;
                cursor: pointer;
                font-size: 20px;
                font-weight: 500;
            }
            button:hover{
                background-color: #218838;
            }

            /* Responsive Design */
            /* Mobile */
            @media (max-width: 460px) {
                html {
                    background: url(E1.jpg) no-repeat center/cover;
                }
                body {
                    margin: 0;
                    background: transparent; /* IMPORTANT */
                }
            }

            /* Tablet */
            @media (max-width: 768px) {
                html {
                    background: url(E1.jpg) no-repeat center/cover;
                }
                body {
                    margin: 0;
                    background: transparent;
                }
            }

            /* Desktop */
            @media (min-width: 769px) {
                html {
                    background: url(E1.jpg) no-repeat center/cover;
                }
                body {
                    margin: 0;
                    background: transparent;
                }
            }
        </style>
    </head>
    <body>
        <h1> Party Symbol's</h1>
    <div class="party-container">
        <div class="party-card">
            <img src="P1.jpg" alt="BJP" class="party-logo">
            <button>BJP</button>
        </div>
        <div class="party-card">
            <img src="P2.jpg" alt="Shivsena" class="party-logo">
            <button>Shivsena</button>
        </div>
        <div class="party-card">
            <img src="P3.jpg" alt="Congess" class="party-logo">
            <button>Congress</button>
        </div>
        <div class="party-card">
            <img src="P4.jpg" alt="NCP" class="party-logo">
            <button>Rashtrawadi</button>
        </div>
        <div class="party-card">
            <img src="P5.jpg" alt="NCP" class="party-logo">
            <button>AAP</button>
        </div>
    </div>
    </body>
</html>
