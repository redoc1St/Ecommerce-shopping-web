<%-- 
    Document   : Login
    Created on : Mar 11, 2021, 11:55:09 PM
    Author     : ACER
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

    <head>
        <link href="css/Login.css" rel="stylesheet" type="text/css"/>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
        <script src="//code.jquery.com/jquery-1.11.1.min.js"></script>
        <!------ Include the above in your HEAD tag ---------->

        <div class="sidenav">
            <div class="login-main-text">
                <h2>Application<br> Login Page</h2>
                <p>Login or register from here to access.</p>
            </div>
        </div>
        <div class="main">
            <div class="col-md-6 col-sm-12">
                <div class="login-form">
                    <form action="login" method="get">
                        <h6 style="color: #b21f2d">${error}</h6>
                        <div class="form-group">
                            <label>User Name</label>
                            <input type="text" class="form-control" name="user" placeholder="User Name">
                        </div>
                        <div class="form-group">
                            <label>Password</label>
                            <input type="password" class="form-control" name="pass" placeholder="Password">
                        </div>

                        <button type="submit" class="btn btn-black">Login</button>

                        <!--<button type="submit" class="btn btn-secondary">Register</button>-->
                    </form>
                    
                        <a href="#" onclick="showForm()">
                            Sign Up
                        </a>
                        <form action="signup" method="get">
                            <h6 style="color: #b21f2d">${requestScope.errorr}</h6>
                            <div class="form-group">
                                <label>Name</label>
                                <input type="text" class="form-control" name="name" placeholder="User Name">
                            </div>
                            <div class="form-group">
                                <label>User Name</label>
                                <input type="text" class="form-control" name="user" placeholder="User Name">
                            </div>
                            <div class="form-group">
                                <label>Password</label>
                                <input type="password" class="form-control" name="pass" placeholder="Password">
                            </div>
                            <!--<button type="submit" class="btn btn-black">Login</button>-->
                            <button type="submit" class="btn btn-secondary">Register</button>
                        </form>
                    
                </div>
            </div>
        </div>
        <script>
            document.getElementsByTagName('form')[1].style.display = 'none'
            function showForm() {

                document.getElementsByTagName('form')[1].style.display = 'block'
            }
        </script>
    </body>
</html>
