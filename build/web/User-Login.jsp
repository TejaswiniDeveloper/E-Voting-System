<%-- 
    Document   : User-Login
    Created on : 14 Jan, 2025, 8:39:15 PM
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
    background-image: url(UL1.jpg);
    background-size: cover;
    background-position: center;
    background-repeat: no-repeat;
    
    height: 100vh;   /* FIX */
    margin: 0;

    display: flex;           /* CENTERING FIX */
    justify-content: center;
    align-items: center;
}

.container{
    width: 400px;
    height: 400px;
    box-shadow: 10px 10px 10px rgba(0,0,0,0.5);
    border: 1.5px solid white;
    backdrop-filter: blur(6px);
    border-radius: 30px;
    padding: 20px;
    text-align: center;
}

            
         h1{
   font-size: 40px;
   color: white;
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
           #email, #password{
    height: 2.2rem;
    width: 90%;
    border-radius:14px;
    border: none;
    padding: 5px;
}

/* buttons */
.btn{
    display: flex;
    justify-content: center;
    gap: 25px;
    margin-top: 15px;
}
            #button{
                width: 6rem;
                font-size: 20px;
                font-weight: 600;
                font-family: 'Times New Roman', Times, serif;
                background-color: gray;
                border-radius: 10px;
                padding: 8px;
                box-shadow: 4px rgb(250, 250, 250);
                cursor: pointer;
            }
            #button:hover{
                background-color: green;
            }
           #button, #cancel-button{
    width: 6rem;
    font-size: 18px;
    font-weight: 600;
    background-color: gray;
    border-radius: 10px;
    padding: 8px;
    cursor: pointer;
    border: none;
}
            #cancel-button:hover{
                background-color: red;
            }
            #register-link{
                color: blue;
                text-decoration: underline;
                cursor: pointer;
                font-size:20px;
                font-weight: 800;
            } 

           @media (min-width: 480px) and (max-width: 768px){
    .container{
        margin-left: 200px;
        margin-top: 150px;
        width: 350px;
    }

    h1{
        font-size: 35px;
    }

    #email, #password{
        width: 16rem;
    }
}
@media (max-width: 600px){
    .container{
        margin-left: 100px;
        margin-top: 130px;
        width: 300px;
    }
}
@media (max-width: 480px){
      .container{
        margin-left: 20px;
        margin-top: 120px;
        width: 90%;
    }
    h1{
        font-size: 28px;
    }

    label{
        font-size: 20px;
    }

    #email, #password{
        width: 90%;
    }

    .btn{
        flex-direction: column;
        gap: 10px;
    }
}

        </style>
    </head>
    <body>
        <form action="User_Login_Servlet" method="POST">
        <div class="container">            
            <h1>User Login !!</h1>

            <div class="label">
                <label>E-mail</label> 
            </div>
            <input type="text" onkeypress="javascript:return isAlphanumeric(evt)" name="txt_email"required id="email" placeholder="Enter Your E-mail I'D" class="form-control"><br><br>
           
            <div class="label">
                <label>Password</label> 
            </div>
            <input type="password" onkeypress="javascript:return isAlphanumeric(evt)" name="txt_password" required id="password" placeholder="Enter Your Password" class="form-control"><br><br>

            <div class="btn">
               <input type="submit" name="btn_signup" id="button" value="SIGNUP"/>
                <input type="button" name="btn_signup" id="cancel-button" value="EXIT"/><br>
            </div><br>

            <div class="register-link">
                <span id="register-link" onclick="openRegistrationPage()">Click Here To Register</span>
            </div><br>
         </div>                      
    </form>
        
    <script>
            //Linking Register Link To UserRegistration Page
            document.getElementById("register-link").addEventListener("click",function(){
                window.open("User-Registration.jsp","_Blank");
            });

            //Go Back To index Page Using Cancel Button On UserLogincreen
            document.getElementById("cancel-button").addEventListener("click",function(){
                window.location.href="Dashboard.jsp";
            });
            
            //Login Validation
             document.getElementById("button").addEventListener("click", function () {
    const email = document.getElementById("email").value;
    const password = document.getElementById("password").value;

    if (!email || !password) {
        alert("Please enter both email and password.");
        return;
    }

    // Create AJAX request
    const xhr = new XMLHttpRequest();
    xhr.open("POST", "User_Login_Servlet", true);
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

    xhr.onreadystatechange = function () {
        if (xhr.readyState === 4 && xhr.status === 200) {
            const response = xhr.responseText.trim();
            if (response === "success") {
                alert("Login Successful!");
                window.location.href = "Select-Election.jsp"; // Redirect on success
            } else {
                alert("Invalid email or password. Please try again.");
            }
        }
    };

    // Correctly format the data to be sent
    xhr.send("txt_email=" + encodeURIComponent(email) + "&txt_password=" + encodeURIComponent(password));
});
       
</script>
        </script>
    </body>
</html>
