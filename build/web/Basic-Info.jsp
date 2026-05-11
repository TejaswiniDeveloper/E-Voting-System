<%-- 
    Document   : Basic-Info
    Created on : 14 Jan, 2025, 8:36:47 PM
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
                font-family: 'Courier New', Courier, monospace;
            }

            body{
                background-image: url(D7.jpg);
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;
                min-height: 100vh;
                background-attachment: scroll; /* IMPORTANT */
            }

            /* Basic info box */
            .Position{
                height: 300px;
                width: 450px;
                font-size: 30px;

                background-image: url("D1.jpg");
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;

                border: 10px solid whitesmoke;
                color: aqua;

                position: fixed;
                right: 20px;
                top: 200px;
            }

            /* Heading */
            h1{
                color: palevioletred;
                font-size: 50px;
                font-weight: 800;
                text-align: center;
            }

            h2{
                text-decoration: underline overline;
                text-align: center;
            }
            
            /*Responsive Design*/
            @media (max-width: 768px){
                .Position{
                    width: 90%;
                    height: auto;
                    position: fixed;
                    margin: 20px auto;
                }

                h1{
                    font-size: 32px;
                }

                body{
                    padding: 10px;
                }
            }
        </style>
    </head>
    <body>
       <h1>E-Voting!!</h1>
        <p>
            E-Voting system is the system that aims in reducing the complexity and cost of the election process. Here the voter can vote in spite of his absence in the particular locality. The administrator’s effort is much reduced by checking the election status of all the localities individually forms a place and it is easy for him to announce the election result. The administrator is the soul controller of the E-Voting system in all process including refreshing the votes, editing the voter details, creating new nominee and so on. Thus the E-Voting system can reduce the cost and effort of election process. In this voting system each voter will be provided with a specific voter-id and a password through which access for the voting can be granted. If once the access is granted for a voter-id, then the access is denied for logging in till the voting system is refreshed for the next election. Similarly, the administrator will be provided with a special id through which he can view the status of the election. Based on the id segregation between the voter and administrator is carried out initially.
        </p><br><hr><br>

        <h2>Objectives Of E-voting System :</h2><br>
        <p>
    •	To deliver information about different political parties and their leaders.<br><br>

    •	To provide secure voting system and maintains all the requirements of the voting process such as authentication, confidentiality and integrity.<br><br>

    •	To simplicity is also necessary to ensure the participation of common people. To help and manage your elections easily and securely<br><br>
        </p><hr><br>

        <div class="Position">
        <center>
            <b>
                <u>E-Voting!!</u>
            </b>
        </center>
    </div>

    <h2>Advantages Of E-Voting System :</h2><br>
    <p>
        •	The  E-Voting System is a software application which avoids more manual hours that need to spend in record keeping and calculating votes.<br><br>

        •	Through this the users and the candidates are registered online. Their information is stored in the database the admin can easily access the details of the voters and the candidates.<br><br>

        •	The voters are allowed to vote online they can even vote by sitting at home. Every User allowed to vote only once so there is no chance of duplicated votes.<br><br>

        •	This application keeps the data in a centralized way which is available to all the users simultaneously. It is very easy to manage historical data in database.<br><br>

        •	They can easily use the tool that decreases manual hours spending for normal things and hence increases the performance.<br><br>
    </p><hr><br>

    <h2>Benifits Of E-Voting System :</h2><br>
    <p>
        • Maintain ballot secrecy with secure and efficient online voting<br><br>
        •Test your online election for free before your actual election starts<br><br>
        •Receive legally valid results and conduct online votings according to democratic principles with POLYAS<br><br>
        •Increase voter turnout with easy vote submission and digital voter communication<br><br>
    </p><hr><br>

    <h2>Comparing Online Elections with Traditional Methods :</h2><br>
    <p>
        •<u>Electronic Voting Machines (EVM)</u><br>
        While EVMs represented a significant advancement over paper ballots, they are now considered outdated compared to online elections. EVMs still require physical presence and can be vulnerable to tampering if not adequately secured.<br><br>

        •<u>Paper Ballots</u><br>
    Traditional paper ballots, though trusted for their simplicity and physical record, are resource-intensive and prone to errors such as miscounts and lost ballots. Online elections offer a more efficient and reliable alternative.<br><br>
    </p><hr>

    </body>
</html>
