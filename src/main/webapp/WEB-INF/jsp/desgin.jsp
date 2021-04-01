<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <!-- Favicon -->
    <link rel="shortcut icon" href="/design/images/favicon.ico" type="image/x-icon" />
    <!-- Font Awesome -->
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/5.15.1/css/all.min.css"
    />
    <!-- AOS -->
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/aos/2.3.4/aos.css"
    />
    <!-- Glidejs -->
    <link
            rel="stylesheet"
            href="https://cdnjs.cloudflare.com/ajax/libs/Glide.js/3.4.1/css/glide.core.css"
    />
    <!-- Custom StyleSheet -->
    <link rel="stylesheet" href="/design/styles.css" />
    <title>Portfolio Website</title>
</head>
<body>
<!-- Header -->
<header id="home" class="header">
    <!-- Navigation -->
    <nav class="nav">
        <div class="navigation container">
            <div class="logo">
                <h1>YouTuber<span>.</span></h1>
            </div>

            <div class="menu">
                <div class="top-nav">
                    <div class="logo">
                        <h1>YouTuber<span>.</span></h1>
                    </div>
                    <div class="close">
                        <i class="fas fa-times"></i>
                    </div>
                </div>

                <ul class="nav-list">
                    <li class="nav-item">
                        <a href="#home" class="nav-link scroll-link">Home</a>
                    </li>
                    <li class="nav-item">
                        <a href="#about" class="nav-link scroll-link">About</a>
                    </li>
                    <li class="nav-item">
                        <a href="#services" class="nav-link scroll-link">Services</a>
                    </li>
                    <li class="nav-item">
                        <a href="#skills" class="nav-link scroll-link">Skills</a>
                    </li>
                    <li class="nav-item">
                        <a href="#teams" class="nav-link scroll-link">Teams</a>
                    </li>
                    <li class="nav-item">
                        <a href="#contact" class="nav-link scroll-link">Contact</a>
                    </li>
                </ul>
            </div>

            <div class="hamburger">
                <i class="fas fa-bars"></i>
            </div>
        </div>
    </nav>
    <!-- Hero -->
    <div class="hero">
        <h3>Hello, my name is</h3>
        <h1>PHAM HUYNH PHU QUOC</h1>
        <h4>And I'm a <span id="type1"></span></h4>
        <a href="https://codesandbox.io/embed/r3f-game-i2160">Hire me</a>
    </div>

    <img class="banner" src="/design/images/Untitled-3.png" alt="" />

    <div class="icons">
        <span><i class="fab fa-facebook-f"></i></span>
        <span><i class="fab fa-instagram"></i></span>
        <span><i class="fab fa-twitter"></i></span>
    </div>
</header>

<!-- Main -->
<section class="section about" id="about">
    <div class="title">
        <h1>About me</h1>
    </div>

    <div class="about-center container">
        <div class="left" data-aos="fade-right" data-aos-duration="2000">
            <img src="/design/images/quoc.jpg" alt="" />
        </div>
        <div class="right" data-aos="fade-left" data-aos-duration="2000">
            <h1>I'm Alexandar a <span id="type2"></span></h1>
            <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Maiores
                placeat inventore rerum tempore cupiditate, amet adipisci aut eius
                facilis quisquam magni ratione maxime officiis earum blanditiis
                magnam illum obcaecati vero? Odit ipsa facilis officiis fuga
                voluptate similique sunt exercitationem voluptatibus, illo et fugit
                eveniet provident quo atque, nesciunt explicabo tenetur!
            </p>
            <a href="/design/98cf614afb42477b87e71f41397d52d2.pdf" class="btn">Download CV</a>
        </div>
    </div>
</section>

<!-- Services -->
<section class="section theme" id="services">
    <div class="title">
        <h1>My Services</h1>
    </div>

    <div class="services-center container">
        <div class="service" data-aos="fade-down" data-aos-duration="2000">
            <span><i class="fab fa-accusoft"></i></span>
            <h2>Web Design</h2>
            <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolore
                exercitationem numquam porro asperiores neque architecto.
            </p>
        </div>

        <div class="service" data-aos="fade-up" data-aos-duration="2000">
            <span><i class="fas fa-chart-line"></i></span>
            <h2>Advertising</h2>
            <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolore
                exercitationem numquam porro asperiores neque architecto.
            </p>
        </div>

        <div class="service" data-aos="fade-down" data-aos-duration="2000">
            <span><i class="fas fa-blender-phone"></i></span>
            <h2>Apps Design</h2>
            <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Dolore
                exercitationem numquam porro asperiores neque architecto.
            </p>
        </div>
    </div>
</section>

<!-- Skills -->
<section class="section skills" id="skills">
    <div class="title">
        <h1>My Skills</h1>
    </div>

    <div class="skills-center container">
        <div class="skills-left" data-aos="fade-right" data-aos-duration="2000">
            <div class="skills-box">
                <h4>HTML5</h4>
                <div class="skills-ilt">
                    <div class="skills-bar html"></div>
                    <span>95%</span>
                </div>
            </div>
            <div class="skills-box">
                <h4>CSS</h4>
                <div class="skills-ilt">
                    <div class="skills-bar css"></div>
                    <span>85%</span>
                </div>
            </div>
            <div class="skills-box">
                <h4>JavaScript</h4>
                <div class="skills-ilt">
                    <div class="skills-bar javascript"></div>
                    <span>90%</span>
                </div>
            </div>
            <div class="skills-box">
                <h4>Nodejs</h4>
                <div class="skills-ilt">
                    <div class="skills-bar nodejs"></div>
                    <span>80%</span>
                </div>
            </div>

            <div class="skills-box">
                <h4>Mongodb</h4>
                <div class="skills-ilt">
                    <div class="skills-bar mongodb"></div>
                    <span>95%</span>
                </div>
            </div>
        </div>

        <div class="right" data-aos="fade-left" data-aos-duration="2000">
            <h3>My creative skills and experience</h3>
            <p>
                Lorem ipsum dolor, sit amet consectetur adipisicing elit. Aperiam
                tempora distinctio sed. Animi, doloribus est. Suscipit praesentium
                tenetur libero eos! Suscipit voluptatem qui, nulla accusantium
                deleniti nam recusandae officiis possimus at voluptate cupiditate
                soluta nostrum deserunt consequuntur, ut quis eligendi? Quidem et
                doloremque cupiditate veniam optio corporis voluptatum, animi nemo!
            </p>
            <a href="#" class="btn">Read more</a>
        </div>
    </div>
</section>

<!-- Teams -->
<section class="section theme" id="teams">
    <div class="title">
        <h1>My teams</h1>
    </div>

    <div class="teams-center container">
        <div class="glide">
            <div class="glide__track" data-glide-el="track">
                <ul class="glide__slides">
                    <li class="glide__slide">
                        <div class="team">
                            <div class="img-cover">
                                <img src="/design/images/quoc1.jpg" alt="" />
                            </div>
                            <h3>Someone name</h3>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Libero, quo?
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="team">
                            <div class="img-cover">
                                <img src="/design/images/quoc2.jpg" alt="" />
                            </div>
                            <h3>Someone name</h3>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Libero, quo?
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="team">
                            <div class="img-cover">
                                <img src="/design/images/quoc3.jpg" alt="" />
                            </div>
                            <h3>Someone name</h3>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Libero, quo?
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="team">
                            <div class="img-cover">
                                <img src="/design/images/quoc1.jpg" alt="" />
                            </div>
                            <h3>Someone name</h3>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Libero, quo?
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="team">
                            <div class="img-cover">
                                <img src="/design/images/quoc3.jpg" alt="" />
                            </div>
                            <h3>Someone name</h3>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Libero, quo?
                            </p>
                        </div>
                    </li>
                    <li class="glide__slide">
                        <div class="team">
                            <div class="img-cover">
                                <img src="/design/images/quoc.jpg" alt="" />
                            </div>
                            <h3>Someone name</h3>
                            <p>
                                Lorem ipsum dolor sit amet, consectetur adipisicing elit.
                                Libero, quo?
                            </p>
                        </div>
                    </li>
                </ul>
            </div>
        </div>
    </div>
</section>

<!-- Contact -->
<section class="section contact" id="contact">
    <div class="title">
        <h1>Contact me</h1>
    </div>

    <div class="contact-center container">
        <div class="left" data-aos="fade-down-right" data-aos-duration="2000">
            <h2>Get in Touch</h2>
            <p>
                Lorem ipsum dolor sit amet consectetur adipisicing elit. Rerum
                praesentium quibusdam ratione, cum ducimus minus iure saepe ipsum
                repudiandae. Cum adipisci cumque dicta suscipit fuga aliquid
                blanditiis quo quia vitae.
            </p>
            <div>
                <span class="icon"><i class="fas fa-user"></i></span>
                <span class="content">
              <h3>Name</h3>
              <span>Alexandar Smith</span>
            </span>
            </div>

            <div>
                <span class="icon"><i class="fas fa-map-marker-alt"></i></span>
                <span class="content">
              <h3>Address</h3>
              <span>United States</span>
            </span>
            </div>

            <div>
                <span class="icon"><i class="fas fa-envelope"></i></span>
                <span class="content">
              <h3>Email</h3>
              <span>youtube@gmail.com</span>
            </span>
            </div>
        </div>
        <div class="right" data-aos="fade-up-left" data-aos-duration="2000">
            <form class="form">
                <h2>Message me</h2>
                <div>
                    <input type="text" placeholder="Name" />
                    <input type="email" placeholder="Email" />
                </div>
                <input type="text" placeholder="Subject" />
                <textarea
                        cols="10"
                        rows="10"
                        placeholder="Describe Project"
                ></textarea>

                <a href="#" class="btn">Send message</a>
            </form>
        </div>
    </div>
</section>

<footer>
    <p>Created By <span>Java</span> | &copy; 2020 All rights reserved.</p>
</footer>

<!-- AOS -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/aos/2.3.4/aos.js"></script>
<!-- Typeit -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/typeit/7.0.4/typeit.min.js"></script>
<!-- GSAP -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/gsap/3.5.1/gsap.min.js"></script>
<!-- Glidejs -->
<script src="https://cdnjs.cloudflare.com/ajax/libs/Glide.js/3.4.1/glide.min.js"></script>
<!-- Custom Script -->
<script src="/design/index.js"></script>
</body>
</html>
