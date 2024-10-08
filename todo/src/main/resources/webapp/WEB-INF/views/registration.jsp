<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Signup Form</title>
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Poppins:400,500,600,700&display=swap">
    <link rel="stylesheet" href="https://fonts.googleapis.com/css?family=Roboto:400,500,700&display=swap">
    <link rel="stylesheet" href="https://colorlib.com/etc/lf/Login_v1/vendor/bootstrap/css/bootstrap.min.css">
    <link rel="stylesheet" href="https://colorlib.com/etc/lf/Login_v1/fonts/font-awesome-4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet" href="https://colorlib.com/etc/lf/Login_v1/vendor/animate/animate.css">
    <link rel="stylesheet" href="https://colorlib.com/etc/lf/Login_v1/vendor/css-hamburgers/hamburgers.min.css">
    <link rel="stylesheet" href="https://colorlib.com/etc/lf/Login_v1/vendor/select2/select2.min.css">
    <link rel="stylesheet" href="https://colorlib.com/etc/lf/Login_v1/css/util.css">
    <link rel="stylesheet" href="https://colorlib.com/etc/lf/Login_v1/css/main.css">
    <style>
        .signup100-form-title {
            font-family: 'Roboto', sans-serif;
        }
    </style>
    <script>
        function validateForm(){
            var userName = document.forms["myForm"]["username"].value;
            var email = document.forms["myForm"]["email"].value;
            var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if(userName == ""){
                alert("UserName must be filled out");
                return false;
            }
            if(userName.length < 5 || userName > 15){
                alert("Username must be between 5 to 16=5 charaters");
                return false;
            }
            if(!emailPattern.test(email)){
                alert("Invalid email format");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <div class="limiter">
        <div class="container-login100">
            <div class="wrap-login100">
                <form name ="myForm" class="signup100-form validate-form" action="/signup" method="post">
                    <span class="signup100-form-title">
                        Create Account
                    </span>
                    <div class="wrap-input100 validate-input" data-validate="Name is required">
                        <input class="input100" type="text" name="firstName" placeholder="First Name"  required minlength="3" maxlength="15">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                            <i class="fa fa-user" aria-hidden="true"></i>
                        </span>
                    </div>
                    <div class="wrap-input100 validate-input" data-validate="Name is required">
                         <input class="input100" type="text" name="lastName" placeholder="Last Name"  required minlength="3" maxlength="15">
                         <span class="focus-input100"></span>
                         <span class="symbol-input100">
                            <i class="fa fa-user" aria-hidden="true"></i>
                         </span>
                    </div>
                    <div class="wrap-input100 validate-input" data-validate="Name is required">
                        <input class="input100" type="text" name="userName" placeholder="Username" required minlength="5" maxlength="10">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                            <i class="fa fa-user" aria-hidden="true"></i>
                        </span>
                    </div>
                    <div class="wrap-input100 validate-input" data-validate="Valid email is required: ex@abc.xyz">
                        <input class="input100" type="text" name="email" placeholder="Email">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                            <i class="fa fa-envelope" aria-hidden="true"></i>
                        </span>
                    </div>
                    <div class="wrap-input100 validate-input" data-validate="Valid mobile no is required">
                        <input class="input100" type="text" name="mobile" placeholder="Mobile"  required minlength="10" maxlength="10">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                            <i class="fa fa-envelope" aria-hidden="true"></i>
                        </span>
                    </div>
                    <div class="wrap-input100 validate-input" data-validate="Password is required">
                        <input class="input100" type="password" name="password" placeholder="Password" required minlength="8" maxlength="12">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                            <i class="fa fa-lock" aria-hidden="true"></i>
                        </span>
                    </div>
                    <div class="wrap-input100 validate-input" data-validate="Confirm password is required">
                        <input class="input100" type="password" name="confirmpassword" placeholder="Confirm Password" required minlength="8" maxlength="12">
                        <span class="focus-input100"></span>
                        <span class="symbol-input100">
                            <i class="fa fa-lock" aria-hidden="true"></i>
                        </span>
                    </div>
                    <div class="container-login100-form-btn">
                        <button class="login100-form-btn">
                            Sign Up
                        </button>
                    </div>
                    <div class="text-center p-t-12">
                        <span class="txt1">
                            Already have an account?
                        </span>
                        <a class="txt2" href="/">
                            Login
                        </a>
                    </div>
                </form>
            </div>
        </div>
    </div>
    <script src="https://colorlib.com/etc/lf/Login_v1/vendor/jquery/jquery-3.2.1.min.js"></script>
    <script src="https://colorlib.com/etc/lf/Login_v1/vendor/bootstrap/js/popper.js"></script>
    <script src="https://colorlib.com/etc/lf/Login_v1/vendor/bootstrap/js/bootstrap.min.js"></script>
    <script src="https://colorlib.com/etc/lf/Login_v1/vendor/select2/select2.min.js"></script>
    <script src="https://colorlib.com/etc/lf/Login_v1/vendor/tilt/tilt.jquery.min.js"></script>
    <script>
        $('.js-tilt').tilt({
            scale: 1.1
        });
    </script>
    <script src="https://colorlib.com/etc/lf/Login_v1/js/main.js"></script>
</body>
</html>