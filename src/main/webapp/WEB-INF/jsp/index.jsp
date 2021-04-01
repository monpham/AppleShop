<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page import="java.util.List"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- Favicon -->
    <link rel="shortcut icon" href="./images/favicon.ico" type="image/x-icon">
    <!-- FontAwesome -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css" />
    <!-- AOS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/aos/2.3.4/aos.css" />
    <!-- Glidejs -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Glide.js/3.4.1/css/glide.core.css" />
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/Glide.js/3.4.1/css/glide.theme.css" />
    <!-- Custom Stylesheet -->
    <link rel="stylesheet" href="/master/styles.css" />
    <title>Codevo - Portfolio</title>
</head>

<body>
<header id="header" class="header">
    <!-- Navigation -->
    <div class="navigation">
        <nav class="nav d-flex container">
            <div class="nav-header d-flex">
                <div class="logo">
                    <h1>J<span>A</span>VA</h1>
                </div>

                <div class="hamburger"><i class="fas fa-bars"></i></div>
            </div>

            <div class="nav-menu d-flex">
                <ul class="nav-list d-flex">
                    <li class="nav-item">
                        <a href="/design" class="nav-link">Home</a>
                    </li>

                    <li class="nav-item">
                        <a href="#about" class="nav-link scroll-link">About</a>
                    </li>

                    <li class="nav-item">
                        <a href="#services" class="nav-link scroll-link">Services</a>
                    </li>

                    <li class="nav-item">
                        <a href="#portfolio" class="nav-link scroll-link">Portfolio</a>
                    </li>

                    <li class="nav-item">
                        <a href="#testimonial" class="nav-link scroll-link">Testimonial</a>
                    </li>

                    <li class="nav-item">
                        <a href="#blog" class="nav-link scroll-link">Blog</a>
                    </li>

                    <li class="nav-item">
                        <a href="#contact" class="nav-link scroll-link">Contact</a>
                    </li>
                </ul>
            </div>
        </nav>
    </div>

    <!-- Hero Content -->
    <div class="hero container">
        <h1>We're <span>team of</span> <br />professionals!</h1>
        <p>
            We design & develop a website using the latest technologies. Our
            design is unique, also the code is valid. We do everything with a
            professional touch.
        </p>
        <div class="btn-group">
            <a href="" class="btn btn1">CONTACT US</a>
            <a href="" class="btn btn2">HIRE US</a>
        </div>
    </div>
</header>

<!-- About Section -->
<section class="section about" id="about">
    <div class="about-center container">
        <div class="left" data-aos="fade-right" data-aos-duration="2000">
            <div class="subtitle">Warm welcome!</div>
            <h2 class="title">About QUỐC</h2>
            <p>
                Jurado team has a lot of awesome people who dedicate their time to
                make some creative things & us really proud of that. Mostly we do
                web design & development work based on WordPress
            </p>
            <p class="top">
                We are working with the Wordpress very beginning of the time. Our
                expert team is very well known, this framework. We love to build a
                website using WordPress.
            </p>

            <div class="count">
                <div class="count-1">
                    <span>235</span>
                    <p>Clients worldwide</p>
                </div>
                <div class="count-2">
                    <span>70</span>
                    <p>Awards</p>
                </div>
                <div class="count-3">
                    <span>640</span>
                    <p>Hours worked</p>
                </div>
            </div>
        </div>
        <div class="right" data-aos="fade-left" data-aos-duration="2000">
            <img src="/master/images/mon.jpg" alt="" />
        </div>
    </div>
</section>

<!-- services -->
<section class="section services" id="services">
    <div class="services-center container">
        <div class="top">
            <div class="subtitle">What we love to Do!</div>
            <h2 class="title">Our affordable services</h2>
            <p>
                Our expert team member has a lot of specialty, but what we love to
                do most of the time I a real question! Here are the things we really
                love to do!
            </p>
        </div>

        <div class="glide" id="glide1">
            <div class="glide__track" data-glide-el="track">
                <ul class="glide__slides">
                    <li class="glide__slide">
                        <div class="service">
                            <span><i class="fas fa-mobile-alt"></i></span>
                            <h3>WORDPRES THEME</h3>
                            <p>
                                We build WordPres theme, maintaining all the WP rules &
                                standard, which is 100% valid, SEO friendly.
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="service">
                            <span><i class="fas fa-paint-brush"></i></span>
                            <h3>PSD to HTML</h3>
                            <p>
                                Slicing PSD to HTML with proper way is a very important
                                thing & we do it most efficient way.
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="service">
                            <span><i class="far fa-heart"></i></span>
                            <h3>Javascript</h3>
                            <p>
                                Javascript is the #1 programming language at this moment &
                                we know it very well.
                            </p>
                        </div>
                    </li>

                    <li class="glide__slide">
                        <div class="service">
                            <span><i class="far fa-image"></i></span>
                            <h3>Website design</h3>
                            <p>
                                Design a website is a most important part of building a
                                website & we do it professionally.
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="service">
                            <span><i class="fas fa-pencil-alt"></i></span>
                            <h3>Custom WordPress</h3>
                            <p>
                                WordPress is our love & we can build awesome custom made
                                website using this #1 CMS
                            </p>
                        </div>
                    </li>
                </ul>
            </div>

            <!-- Dots -->
            <div class="glide__bullets" data-glide-el="controls[nav]">
                <button class="glide__bullet" data-glide-dir="<<"></button>
                <button class="glide__bullet" data-glide-dir=">>"></button>
            </div>
        </div>
    </div>
</section>

<!-- Portfolio -->

<section class="section portfolio" id="portfolio">
    <div class="portfolio-center container">
        <div class="top">
            <div class="subtitle">Work We Completed</div>
            <h2 class="title">Our Portfolio</h2>
            <p>
                We worked with lots of things & we don't upload everything here. But
                we really love to share some of our favorite works which you can see
                in below!
            </p>
        </div>

        <div class="portfolio-container">
            <div class="single" data-aos="fade-down" data-aos-duration="2000">
                <img src="/master/images/work1.jpg" alt="" />
                <div class="overlay">
                    <div class="details">
                        <h3>Custom website build from scratch using WordPress</h3>
                        <div class="btn-group">
                            <a href=""><i class="fas fa-plus"></i></a>
                            <a href=""><i class="fas fa-link"></i></a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="single" data-aos="fade-right" data-aos-duration="2000">
                <img src="/master/images/work2.jpg" alt="" />
                <div class="overlay">
                    <div class="details">
                        <h3>Psd to HTML slicing</h3>
                        <div class="btn-group">
                            <a href=""><i class="fas fa-plus"></i></a>
                            <a href=""><i class="fas fa-link"></i></a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="single" data-aos="fade-left" data-aos-duration="2000">
                <img src="/master/images/work3.jpg" alt="" />
                <div class="overlay">
                    <div class="details">
                        <h3>Psd design</h3>
                        <div class="btn-group">
                            <a href=""><i class="fas fa-plus"></i></a>
                            <a href=""><i class="fas fa-link"></i></a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="single" data-aos="flip-up" data-aos-duration="2000">
                <img src="/master/images/work4.jpg" alt="" />
                <div class="overlay">
                    <div class="details">
                        <h3>Custom website build</h3>
                        <div class="btn-group">
                            <a href=""><i class="fas fa-plus"></i></a>
                            <a href=""><i class="fas fa-link"></i></a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="single" data-aos="flip-right" data-aos-duration="2000">
                <img src="/master/images/work5.jpg" alt="" />
                <div class="overlay">
                    <div class="details">
                        <h3>Redesign website</h3>
                        <div class="btn-group">
                            <a href=""><i class="fas fa-plus"></i></a>
                            <a href=""><i class="fas fa-link"></i></a>
                        </div>
                    </div>
                </div>
            </div>

            <div class="single" data-aos="flip-up" data-aos-duration="2000">
                <img src="/master/images/work6.jpg" alt="" />
                <div class="overlay">
                    <div class="details">
                        <h3>Design a website with WordPress</h3>
                        <div class="btn-group">
                            <a href=""><i class="fas fa-plus"></i></a>
                            <a href=""><i class="fas fa-link"></i></a>
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>
</section>

<!--
    Testimonials
   -->
<section class="section testimonials" id="testimonial">
    <div class="container">
        <div class="top">
            <div class="subtitle">Few words from clients</div>
            <h2 class="title">Testimonial</h2>
            <p>
                Clients are our assets & we always try to fulfill their requirements
                100%. We have lots of clients & most of them are very happy with us!
            </p>
        </div>

        <div class="glide" id="glide2">
            <div class="glide__track" data-glide-el="track">
                <ul class="glide__slides">
                    <li class="glide__slide">
                        <div class="testimonial">
                            <span class="quote">&#8220;</span>
                            <p>
                                I enjoyed working with
                                <span class="color">@CoderExperts Team</span>
                                very much. After explaining what I needed as giving a few
                                examples, they provided exactly what I needed.
                            </p>
                            <div class="bottom">
                                <div class="img-holder">
                                    <img src="/master/images/test1.jpg" alt="" />
                                </div>
                                <div>
                                    <h4>Samia Shahrin</h4>
                                    <span>Designer</span>
                                </div>
                            </div>
                    </li>
                    <li class="glide__slide">
                        <div class="testimonial">
                            <span class="quote">&#8220;</span>
                            <p>
                                I enjoyed working with
                                <span class="color">@CoderExperts Team</span>
                                very much. After explaining what I needed as giving a few
                                examples, they provided exactly what I needed.
                            </p>
                            <div class="bottom">
                                <div class="img-holder">
                                    <img src="/master/images/test2.jpg" alt="" />
                                </div>
                                <div>
                                    <h4>Samia Shahrin</h4>
                                    <span>Frontend Developer</span>
                                </div>
                            </div>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="testimonial">
                            <span class="quote">&#8220;</span>
                            <p>
                                I enjoyed working with
                                <span class="color">@CoderExperts Team</span>
                                very much. After explaining what I needed as giving a few
                                examples, they provided exactly what I needed.
                            </p>
                            <div class="bottom">
                                <div class="img-holder">
                                    <img src="/master/images/test3.jpg" alt="" />
                                </div>
                                <div>
                                    <h4>Samia Shahrin</h4>
                                    <span>Content Writer</span>
                                </div>
                            </div>
                        </div>
                    </li>
                </ul>
            </div>

            <!-- Arrows -->
            <div class="glide__arrows" data-glide-el="controls">
                <button class="glide__arrow glide__arrow--left" data-glide-dir="<"><i class="fas fa-angle-left"></i></button>
                <button class="glide__arrow glide__arrow--right" data-glide-dir=">"><i
                        class="fas fa-angle-right"></i></button>
            </div>
        </div>
    </div>
</section>

<!-- Blog -->
<section class="section blog" id="blog">
    <div class="container">
        <div class="top">
            <div class="subtitle">Learn with CoderExperts</div>
            <h2 class="title">Our Blog</h2>
            <p>
                Want to stay up to date with latest programming worlds newses, don't
                worry. Follow our blog & we hope you learn most of the thing you
                need.
            </p>
        </div>


        <div class="glide" id="glide3">
            <div class="glide__track" data-glide-el="track">
                <ul class="glide__slides">
                    <li class="glide__slide">
                        <div class="single">
                            <div class="img-holder">
                                <img src="/master/images/quoc.jpg" alt="" />
                            </div>
                            <div class="bottom">
                                <span>09 FEB, 2020</span>
                                <h3>How to make a WordPress website secure step by step</h3>
                                <p>
                                    We'll be updating this page continually with the best deals as
                                    soon as they come out, so make sure to bookmark this page and
                                    check back more than once.
                                </p>
                                <a href="">READ MORE</a>
                            </div>
                    </li>
                    <li class="glide__slide">
                        <div class="single">
                            <div class="img-holder">
                                <img src="/master/images/quoc1.jpg" alt="" />
                            </div>
                            <div class="bottom">
                                <span>22 DEC, 2020</span>
                                <h3>How to learn Javascript from Scratch to advanced</h3>
                                <p>
                                    We'll be updating this page continually with the best deals as
                                    soon as they come out, so make sure to bookmark this page and
                                    check back more than once.
                                </p>
                                <a href="">READ MORE</a>
                            </div>
                    </li>
                    <li class="glide__slide">
                        <div class="single">
                            <div class="img-holder">
                                <img src="/master/images/quoc3.jpg" alt="" />
                            </div>
                            <div class="bottom">
                                <span>25 SEP,2020</span>
                                <h3>Get 25% discount all of our products in this Black Friday</h3>
                                <p>
                                    We'll be updating this page continually with the best deals as
                                    soon as they come out, so make sure to bookmark this page and
                                    check back more than once.
                                </p>
                                <a href="">READ MORE</a>
                            </div>
                    </li>
                </ul>
            </div>

            <!-- Arrows -->
            <div class="glide__arrows" data-glide-el="controls">
                <button class="glide__arrow glide__arrow--left" data-glide-dir="<"><i class="fas fa-angle-left"></i></button>
                <button class="glide__arrow glide__arrow--right" data-glide-dir=">"><i
                        class="fas fa-angle-right"></i></button>
            </div>
        </div>
    </div>
</section>

<!-- Contact -->
<section class="section contact" id="contact">
    <div class="contact-center container">
        <div class="left" data-aos="fade-down-right" data-aos-duration="2000">
            <h2>Contact Us</h2>
            <p>
                Send your requirement using the form & our support team will get
                back to you as soon as possible. Please describe briefly everything
                you need & possibly send some example you like.
            </p>
            <p>
                Note: we can't spam you with lots of messages. We hate to send spam
                messages of our valuable clients.
            </p>
            <div class="bottom">
                <div>
                    <span><i class="fas fa-map-marked-alt"></i></span>
                    <h4>Location</h4>
                    <small>60 Helland Bridge</small>
                </div>
                <div>
                    <span><i class="far fa-envelope-open"></i></span>
                    <h4>Email</h4>
                    <small>ziddah.edem@gmail.com</small>
                </div>
            </div>
        </div>

        <div class="right" data-aos="fade-up-left" data-aos-duration="2000">
            <form class="form">
                <div>
                    <input type="text" placeholder="First Name" />
                    <input type="email" placeholder="E-mail" />
                </div>
                <textarea cols="30" rows="10" placeholder="Message"></textarea>
                <a href="">SEND</a>
            </form>
        </div>
    </div>
</section>

<!-- Footer -->
<footer>
    <p>&copy; QUỐC ĐẸP TRAI. 2020 All right reserved!</p>
</footer>
<!-- AOS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/aos/2.3.4/aos.js"></script>
<!-- Gsap -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.5.1/gsap.min.js"></script>
<!-- Glidejs -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/Glide.js/3.4.1/glide.min.js"></script>
<!-- Custom Script -->
<script src="/master/js/slider.js"></script>
<script src="/master/js/index.js"></script>
</body>

</html>
