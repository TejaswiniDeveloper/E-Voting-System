<%-- 
    Document   : Contact
    Created on : 14 Jan, 2025, 8:38:50 PM
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
                background-image: url(C6.jpg);
                background-size: cover;
                object-fit: cover;
                background-position: center;
                background-repeat: no-repeat;
                height: 100%;
                margin: 1%;
            }


            /*.nav-bar{
                display: flex;
                justify-content: space-between;
                align-items: center;
                padding: 10px 20px;
                list-style: none;
                box-shadow: 0 2px 4px rgb(0, 0, 0, 0.1);
                font-size: 20px;
                font-weight: bolder;
            }*/

            .nav-bar .logo{
                font-weight: bold;
                color: #fff;
                font-size: 20px;
                border-radius: 8px;
                padding: 4px;
                margin: 2px;
            }

            /*.nav-bar a{
                color: #fff;
                text-decoration: none;
                padding: 0 15px;
                font-size: 20px;
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
                p*/

           .contact{
                position: relative;
                min-height: 100vh;
                padding: 40px 20px;
                display: flex;
                justify-content: center;
                align-items: center;
                flex-direction: column;
            }
            .contact .content{
                max-width: 800px;
                text-align: center;
            }

            .contact .content h2{
                font-size: 36px;
                font-weight: 500;
                color: #333;
            }

            .contact .content p{
                font-weight: 300;
                color: black;
                font-size: 24.5px
            }
           .container{
                width: 100%;
                display: flex;
                justify-content: center;
                align-items: flex-start;
                margin-top: 30px;
                gap: 30px;
                flex-wrap: wrap;
            }

          .container .contact-info{
                width: 100%;
                max-width: 500px;
                display: flex;
                flex-direction: column;
            }

            .container .contact-info .box{
                position: relative;
                padding: 20px 0;
                display: flex;
            }

            .container .contact-info .box .icon{
                max-width: 60px;
                height: 60px;
                background-color: #333;
                display: flex;
                justify-content: center;
                align-items: center;
                border-radius: 50%;
                font-size: 22px;
            }

           .container .contact-info .box .text{
                display: flex;
                margin-left: 20px;
                font-size: 18px;
                color: black;
                flex-direction: column;
                font-weight: 300;
            }
            .container .contact-info .box .text h3{
                font-weight: 500;
                color: red;
            }
            .contact-form{
                width: 100%;
                max-width: 400px;
                padding: 30px;
                background: #fff;
                border-radius: 10px;
            }

             .contact-form h2{
                font-size: 30px;
                color: #333;
                font-weight: 500;
             }

             .contact-form .input-box{
                position: relative;
                width: 100%;
                margin-top: 10px;
             }

             .contact-form .input-box input, .contact-form .input-box textarea{
                width: 100%;
                padding: 5px 0;
                font-size: 16px;
                margin: 10px 0;
                border: none;
                border-bottom: 2px solid #333;
                outline: none;
                resize: none;
             }

             .contact-form .input-box span{
                position: absolute;
                left: 0;
                padding: 5px 0;
                font-size: 16px;
                margin: 10px  0;
                pointer-events: none;
                transition: 0.5s;
                color: #666;
             }

             .contact-form .input-box input:focus~span,
             .contact-form .input-box input:valid~span,
             .contact-form .input-box textarea:focus~span,
             .contact-form .input-box textarea:valid~span{
                color: #e91663;
                font-size: 12px;
                transform: translateY(-20px);
             }

             .contact-form .input-box input[type=submit]{
                width: 100px;
                background: #00bcd4;
                color: #fff;
                border: none;
                cursor: pointer;
                padding: 10px;
                font-size: 18px;
                border-radius: 8px;
             }
             /*Responsive*/

             @media (max-width: 768px){

                .contact{
                    padding: 20px;
                }

                .container{
                    flex-direction: column;
                    align-items: center;
                }

                .contact-form{
                    width: 100%;
                }

                .container .contact-info{
                    width: 100%;
                }

                .contact .content h2{
                    font-size: 28px;
                }

                .contact .content p{
                    font-size: 18px;
                }
            }
        </style>
    </head>
    <body>
        <div class="nav-bar">
        <div class="logo">E-Voting<br>
        </div>
        
    </div>
    <section class="contact">
        <div class="content">
            <h2><b><u>Feel Free To Contact Us!!..</u></b></h2>
            <p><b></b>Start Working With Us. We Guarantee That You'll Be Able To Have Any Issue Resolved Within 24 Hours.</b></p.>
        </div>
        <div class="container">
            <div class="contact-info">
                <div class="box">
                    <div class="icon"></div>
                    <div class="text">
                    <h3><b>Head Office Address</b></h3>
                    <p><b>Vazare Gramapanchayat, Vazare At/Post Vazare,<br> Tal-Ajara 416220, Dist-Kolhapur.</b></p>
                </div>
             </div>
             <div class="box">
                <div class="icon"></div>
                <div class="text">
                    <h3><b>Call For Help</b></h3>
                    <p><b>91 255 9999 8888</b></p>
                </div>
             </div>
             <div class="box">
                <div class="icon"></div>
                <div class="text">
                    <h3><b>Contact With E-Mail</b></h3>
                    <p><b>coursing@gmail.com</b></p>
                </div>
             </div>
        </div>
        <div class="contact-form">
            <form>
                <h2><b>Send Message!!</b></h2>
                <div class="input-box">
                    <input type="text" name="" required="required">
                    <span><b>Enter Your Full Name</b></span>
                </div>
                <div class="input-box">
                    <input type="text" name="" required="required">
                    <span><b>Your E-Mail</b></span>
                </div>
                <div class="input-box">
                    <textarea required="required"></textarea>
                    <span><b>Enter Your Message....</b></span>
                </div>
                <div class="input-box">
                    <input type="submit" name="" value="Send"
                </div>
            </form>
        </div>
        </div>
    </section>
    </body>
</html>
