<%-- 
    Document   : Client
    Created on : Mar 18, 2019, 11:18:09 PM
    Author     : Zahrana
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
         <!-- Bootstrap core CSS -->
 <link href="vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
 <link href="vendor/bootstrap/css/style.css" rel="stylesheet">
 <link href="css/small-business.css" rel="stylesheet">
 <script src="vendor/bootstrap/js/jquery-1.11.1.min.js"></script>
  <script src="vendor/jquery/jquery.min.js"></script>
  <script src="vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

    </head>
    <body>
        <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand"  href="#"><span style="font-size: 25px !important; color:greenyellow">My</span>Pet</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item">
            <a class="nav-link" href="index.jsp">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="aboutUs.jsp">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="contactUs.jsp">Contact</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="photoGallery.jsp">Photo Gallery</a>
          </li>
           <li class="nav-item dropdown active">
          <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
                Profile
              </a>
              <div class="dropdown-menu dropdown-menu-left" aria-labelledby="navbarDropdown">
                <a class="dropdown-item" href="signUp.jsp">Sign In</a>
                <a class="dropdown-item" href="signUp.jsp">Sign Up</a>
              </div
          </li>
          
        </ul>
      </div>
    </div>
  </nav>
        <div class="container">
        <br><br>
<div class="row">
        <div class="col-lg-3">
            <div class="w3l_banner_nav_left">
            <img class="rounded mb-4" src="images.jpg" height="300px" width="500px"/>
</div>
        </div>
    <div class="col-lg-9">
      <div class="w3l_banner_nav_right">
<!-- login -->
		<div class="w3_login">
			<h3>Sign In & Sign Up</h3>
			<div class="w3_login_module">
				<div class="module form-module">
				  <div class="toggle"><i class="fa fa-times fa-pencil"></i>
					<div class="tooltip">Click Me</div>
				  </div>
				  <div class="form">
					<h2>Login to your account</h2>
					<form action="login" method="post">
					  <input type="text" name="username" placeholder="name@gmail.com" required="required">
					  <input type="password" name="password" placeholder="Password" required="required">
					  <input type="submit" value="Login">
					</form>
				  </div>
				  <div class="form">
					<h2>Create an account</h2>
					<form action="User_Controller" method="post" onsubmit="return validateForm();" enctype="multipart/form-data">
					  <input type="password" id="pass" name="password" placeholder="Password" required="required">
                                          <input type="text" name="name" placeholder="Full Name" required="required">
                                          <input type="text" name="address" placeholder="Address Line1" required="required">
					  <input type="email" id="email" name="email" placeholder="Email Address" required="required">
					  <input type="text" onkeypress="return isNumberKey(event)" id="phone" name="phoneNo" placeholder="Phone Number" required="required">
                                          <input type="file"  name="file" required="required" > 
					  <input type="submit" value="Register">
					</form>
				  </div>
				  <!--<div class="cta"><a href="#">Forgot your password?</a></div>-->
				</div>
                        </div>
                </div>
      </div>
    </div>
</div>
        </div>
        
                
               
   
			<script>
				$('.toggle').click(function(){
				  // Switches the Icon
				  $(this).children('i').toggleClass('fa-pencil');
				  // Switches the forms  
				  $('.form').animate({
					height: "toggle",
					'padding-top': 'toggle',
					'padding-bottom': 'toggle',
					opacity: "toggle"
				  }, "slow");
				});
                                
              function validateForm(){
                var pass=$('#pass').val().trim();
                var email = $('#email').val().trim();
                var phone = $('#phone').val().trim();
                var emailReg = /^([a-zA-Z0-9_\-\.]+)@([a-zA-Z0-9_\-\.]+)\.([a-zA-Z]{2,5})$/;
                
                
                if(!emailReg.test(email))
                {
                    alert("Please enter valid email address.")
                    return false;
                }
                else if(pass.length<8)
                {
                    alert("Password must be 8 charcter long.")
                    return false;
                }
                else if(phone.length<10||phone.match(/^([a-zA-Z])$/))
                {
                    alert("Phone number is not valid")
                    return false;
                }
                
    }        
        </script>
        <script type="text/javascript">
            function isNumberKey(evt)
            {
                var charCode=(evt.which) ? evt.which:evt.keyCode
                if(charCode>31&&(charCode<48||charCode>57))
                    return false;
                return true;
            }
        </script>
		</div>

		</div>

                <div class="clearfix"></div>		
	</div>
<footer class="py-4 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; MyPet 2019</p>
    </div>
    <!-- /.container -->
  </footer>
  <div class="clearfix"></div>	
    </body>
</html>
