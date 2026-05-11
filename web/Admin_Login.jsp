
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>E-Voting !!</title>
    <style>
        html, body {
            margin: 0;
            padding: 0;
            height: 100%;
        }

        body {
            background-image: url(AL1.jpg);
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;

            display: flex;
            justify-content: center;
            align-items: center;
        }
        
        .container {
            width: 400px;
            max-width: 90%;        /* responsive */
            padding: 25px;

            border: 1px solid white;
            border-radius: 25px;
            backdrop-filter: blur(4px);

            box-shadow: 0 0 15px rgba(0,0,0,0.3);
            text-align: center;
        }
            h1 {
            font-size: 32px;
            margin-bottom: 15px;
        }
        .form-control {
            text-align: center;
        }
        label {
            color: black;
            font-size: 25px;
        }
       #username, #password {
            width: 100%;          /* full width */
            height: 40px;
            border-radius: 10px;
            margin-bottom: 12px;
            padding: 5px;
        }
        #username:hover, #password:hover {
            border: 4px solid rgba(206, 142, 24, 0.884);
        }
        .btn {
            display: flex;
            justify-content: center;
            gap: 15px;
            flex-wrap: wrap;   /* important for small screens */
        }

        #button {
            width: 6rem;
            font-size: 20px;
            font-weight: 600;
            font-family: 'Times New Roman', Times, serif;
            color: black;
            background-color: gray;
            border-radius: 10px;
            padding: 8px;
            box-shadow: 4px 4px 4px rgb(212, 206, 206);
            cursor: pointer;
        }
        #button:hover {
            background-color: green;
        }
       #button, #cancel-button {
            width: 120px;
            font-size: 16px;
            padding: 8px;
        }
        #cancel-button:hover {
            background-color: red;
        }

        /*📱 MEDIA QUERIES*/
        @media (max-width: 480px) {

            h1 {
                font-size: 24px;
            }

            label {
                font-size: 18px;
            }

            #button, #cancel-button {
                width: 100%;   /* full width buttons */
            }
        }

        @media (max-width: 460px) {

            .container {
                width: 95%;
                padding: 15px;
                border-radius: 20px;
            }

            h1 {
                font-size: 22px;
            }

            label {
                font-size: 16px;
            }

            #username, #password {
                height: 36px;
                font-size: 14px;
            }

            .btn {
                flex-direction: column;   /* stack buttons */
                gap: 10px;
            }

            #button, #cancel-button {
                width: 100%;   /* full width buttons */
                font-size: 14px;
            }
        }
    </style>
</head>
<body>
  
<form method="POST" action="Admin_Login.jsp">
       <div class="container">            
           <h1>Admin Login !!</h1>
           <div class="label">
               <label>Username</label> 
           </div>
           <input type="text" name="username" required id="username" placeholder="Enter Your Username" class="form-control"><br><br>
          
           <div class="label">
               <label>Password</label> 
           </div>
           <input type="password" name="password" required id="password" placeholder="Enter Your Password" class="form-control"><br><br>
           
           <div class="btn">
              <input type="submit" id="button" value="LOGIN"/>
              <input type="button" id="cancel-button" value="EXIT"/><br>
           </div>
       </div>    
    </form>
    
    <script>
        // When the page loads, check if the user is already logged in
    window.onload = function(){
        // Check if a sessionStorage item named 'loggedIn' exists
        if (sessionStorage.getItem('loggedIn') === 'true') {
            // If the user is already logged in, redirect them to Admin-Nav.jsp
            window.location.href = "Admin-Nav.jsp";
        }
    }

    // Prevent form submission and validate credentials
    document.getElementById("button").addEventListener("click", function(event) {
        event.preventDefault(); // Prevent form submission
        
        // Hardcoded username and password
        var validUsername = "Admin_Teju";
        var validPassword = "Admin_Teju";

        // Get user inputs
        var username = document.getElementsByName("username")[0].value;
        var password = document.getElementsByName("password")[0].value;

        // Check if fields are empty
        if (username === "" || password === "") {
            alert("Please enter both username and password!");
            return;
        }

        // Validate credentials
        if (username === validUsername && password === validPassword) {
            alert("Login successful..!!");

            // Set the sessionStorage value to indicate the user is logged in
            sessionStorage.setItem('loggedIn', 'true');

            // Redirect to the admin navigation page
            window.location.href = "Admin-Nav.jsp"; 
        } else {
            alert("Invalid username or password..!!");
        }
    });

    // Cancel button logic: Redirect to Dashboard.jsp
    document.getElementById("cancel-button").addEventListener("click", function(){
        window.location.href = "Dashboard.jsp";
    });
    </script>
    
</body>
</html>