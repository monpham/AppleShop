<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8"/>
    <meta name="viewport" content="width=device-width, initial-scale=1.0"/>
    <link
            href="https://unpkg.com/boxicons@2.0.7/css/boxicons.min.css"
            rel="stylesheet"
    />
    <link rel="stylesheet" href="/resource/login.css"/>
    <title>Animated Login</title>
</head>
<body>
<!-- Container -->
<div class="container" id="container">
    <!-- Row -->
    <div class="row">
        <!-- Sign Up -->
        <div class="col align-center flex-col sign-up">
            <div class="form-wrapper align-center">


                <form:form action="/UserRegisterAccount" class="form sign-up" modelAttribute="account" method="post">

                <%--    <td><spring:message code="password" text="default text" /></td>--%>
                    <div class="input-group">
                        <i class=" bx bxs-user"></i>
                        <form:input path="username" type="text" placeholder="Username" />
                    </div>
                    <div class="input-group">
                        <i class="bx bxs-lock-alt"></i>
                        <form:input path="password" type="password" placeholder="Password" />
                    </div>

                    <div class="input-group">
                        <i class="bx bx-mail-send"></i>
                        <form:input path="accountEntity.email" type="email" placeholder="Email" id="email"  />
                    </div>
<div id="result"></div>

                    <div class="input-group">
                        <i class="bx bxs-lock-alt"></i>
                        <form:input path="accountEntity.phonenumber" type="phonenumber"
                                    placeholder="PHONENUMBE"  />
                    </div>

                    <form:input path="enabled" type="hidden" value="1"/>
                    <button type="submit" id="validate">Sign up</button>
                    <p>
                        <span>Already have an account?</span>
                        <b id="sign-in">Sign in here</b>
                    </p>

                </form:form>

            </div>

            <div class="form-wrapper">
                <div class="social-list align-center sign-up">
                    <div class="align-center facebook-bg">


                        <i class="bx bxl-facebook">
                        </i>


                    </div>
                    <div class="align-center google-bg">
                        <i class="bx bxl-google"></i>
                    </div>
                    <div class="align-center twitter-bg">
                        <i class="bx bxl-twitter"></i>
                    </div>
                    <div class="align-center insta-bg">
                        <i class="bx bxl-instagram-alt"></i>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Sign Up -->
        <!-- Sign In -->
        <div class="col align-center flex-col sign-in">
            <div class="form-wrapper align-center">
                <div class="form sign-in">
                    <form:form action="/j_spring_security_check" method="post" name="login">
                    <div class="input-group">
                        <i class="bx bxs-user"></i>
                        <input type="text" name="username"/>
                    </div>
                    <div class="input-group">
                        <i class="bx bxs-lock-alt"></i>
                        <input type="password" name="password"/>
                    </div>
                    <div class="input-group">
                        <input name="_csrf" type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
                        <button type="submit">Sign in</button>

                        <p>
                            <b>Forgot password?</b>
                        </p>
                        <p>
                            <span> Don't have an account? </span>
                            <b id="sign-up">Sign up here</b>


                        </p>
                        </form:form>


                    </div>
                </div>
            </div>

            <div class="form-wrapper">
                <div class="social-list align-center sign-in">
                    <div class="align-center facebook-bg">
                        <i class="bx bxl-facebook"></i>

                    </div>
                    <div class="align-center google-bg">
                        <i class="bx bxl-google"></i>
                    </div>
                    <div class="align-center twitter-bg">
                        <i class="bx bxl-twitter"></i>
                    </div>
                    <div class="align-center insta-bg">
                        <i class="bx bxl-instagram-alt"></i>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Sign In -->
    </div>
    <!-- End Row -->
    <!-- Content Section -->
    <div class="row content-row">
        <!-- Sign In Content -->
        <div class="col align-items flex-col">
            <div class="text sign-in">
                <h2>Welcome Back</h2>
                <p>
                    Lorem ipsum dolor sit amet consectetur, adipisicing elit. Quae et
                    cumque consectetur illo accusamus impedit eos ut. Eos, odit
                    facilis.
                </p>
            </div>
            <div class="img sign-in">
                <img src="/resource/images/bg1.svg" alt=""/>
            </div>
        </div>

        <!-- Sign Up Content -->
        <div class="col align-items flex-col">
            <div class="img sign-up">
                <img src="/resource/images/bg2.svg" alt=""/>
            </div>
            <div class="text sign-up">
                <h2>Join with us</h2>
                <p>
                    Lorem ipsum dolor sit amet consectetur, adipisicing elit. Quae et
                    cumque consectetur illo accusamus impedit eos ut. Eos, odit
                    facilis.
                </p>
            </div>
        </div>
    </div>

</div>

<!-- End Container -->

<!-- Script -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.1/jquery.min.js"></script>
<script src="/resource/js/login.js"></script>

</body>
</html>
