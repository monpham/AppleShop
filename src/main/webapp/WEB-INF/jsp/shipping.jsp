<%@ taglib prefix="th" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>

<html lang="en">

<head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />

    <!-- Google Font -->
    <link href="https://fonts.googleapis.com/css2?family=Dosis:wght@400;600;700;800&display=swap" rel="stylesheet" />

    <!-- Custom Stylesheet -->
    <link rel="stylesheet" href="/shipping/style.css" />
    <title>Uniq Agency</title>
</head>

<body>
<!-- Header -->
<header class="header" id="header">
    <!-- Navigation -->
    <div class="navigation">
        <nav class="nav__center container">
            <div class="nav__logo">
          <span>
            <svg>
              <use xlink:href="/shipping/images/sprite.svg#icon-map2"></use>
            </svg>
          </span>
                <h1>APPLE SHOP </h1>
            </div>

            <div class="nav__menu">
                <ul class="nav__list">
                    <li class="nav__item">
                        <a href="/" class="nav__link">Home</a>
                    </li>

                    <li class="nav__item">
                        <a href="/" class="nav__link">Services</a>
                    </li>

                    <li class="nav__item">
                        <a href="/" class="nav__link">Products</a>
                    </li>

                    <li class="nav__item">
                        <a href="/factory" class="nav__link">Shipping</a>
                    </li>
                </ul>
            </div>

            <div class="hamburger">
                <svg>
                    <use xlink:href="/shipping/images/sprite.svg#icon-menu"></use>
                </svg>
            </div>
        </nav>
    </div>

    <!-- Banner -->
    <div class="banner container">
        <div class="banner__center">
            <div class="banner__left">
                <div class="btn-group">
                <span>Marketing Agency</span>
                <h1>We are a digital agency with a product mindset</h1>
                <p>
                    Problem solvers, makers and doers. Our way of working helps client
                    create world class experiences, get ahead and stay there.
                </p>

                   <form:form method="post" action="/paypal/pay">
                    <button class="button" type="submit"> Process Payment </button>
            </form:form>
            </div>
            </div>
            <div class="banner__right">
                <img src="/shipping/images/pic1.svg" alt="" />
            </div>
        </div>
    </div>
</header>

<!-- Main -->
<main>
    <section class="section products" id="products">
        <div class="product__center container">
            <div class="product__left">
                <img src="/shipping/images/pic2.svg" alt="" />
            </div>
            <div class="product__right">
                <h1>Best of breed tools meet best in class strategy</h1>

                <p>
                    Unleash your video marketing potential and build a loyal audience
                    of consumers with tools that ignite your fan base, and strategy to
                    keep you on track. We've reinvented the way that brands engage
                    consumers using video.
                </p>
                <a href="/paypal/pay" target="blank">Subscribe Now</a>
            </div>
        </div>
    </section>
</main>

<!-- Footer -->
<footer id="footer" class="section footer">
    <div class="footer__top container">
        <div class="footer-top__box">
            <h3>EXTRAS</h3>
            <a href="#">Brands</a>
            <a href="#">Gift Certificates</a>
            <a href="#">Affiliate</a>
            <a href="#">Specials</a>
            <a href="#">Site Map</a>
        </div>
        <div class="footer-top__box">
            <h3>INFORMATION</h3>
            <a href="#">About Us</a>
            <a href="#">Privacy Policy</a>
            <a href="#">Terms & Conditions</a>
            <a href="#">Contact Us</a>
            <a href="#">Site Map</a>
        </div>
        <div class="footer-top__box">
            <h3>MY ACCOUNT</h3>
            <a href="#">My Account</a>
            <a href="#">Order History</a>
            <a href="#">Wish List</a>
            <a href="#">Newsletter</a>
            <a href="#">Returns</a>
        </div>
        <div class="footer-top__box">
            <h3>CONTACT US</h3>
            <div>
          <span>
            <svg>
              <use xlink:href="/shipping/images/sprite.svg#icon-location"></use>
            </svg>
          </span>
                43 Dream House, Dreammy street, 7131 Dreamville, USA
            </div>
            <div>
          <span>
            <svg>
              <use xlink:href="/shipping/images/sprite.svg#icon-envelop"></use>
            </svg>
          </span>
                company@gmail.com
            </div>
            <div>
          <span>
            <svg>
              <use xlink:href="./images/sprite.svg#icon-phone"></use>
            </svg>
          </span>
                456-456-4512
            </div>
            <div>
          <span>
            <svg>
              <use xlink:href="/shipping/images/sprite.svg#icon-paperplane"></use>
            </svg>
          </span>
                Dream City, USA
            </div>
        </div>
    </div>
</footer>
<!-- End Footer -->

<script src="/shipping/index.js"></script>
</body>

</html>
