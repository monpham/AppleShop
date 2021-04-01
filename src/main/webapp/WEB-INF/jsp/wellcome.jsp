<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01/16/21
  Time: 9:08 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html lang="en">
<head>
  <meta charset="UTF-8">
  <meta name="viewport" content="width=device-width, initial-scale=1.0">
  <title>Price Table HTML CSS & JS</title>
  <link rel="stylesheet" href="/error/Style1.css">
</head>
<body>

<div class="container">
  <div class="top">
    <h1>Apple & Shop</h1>
    <div class="toggle-btn">
      <span class="back">Annually</span>
      <label class="switch">
        <input type="checkbox" id="checkbox" onclick="check()" ; />
        <span class="slider round"></span>
      </label>
      <span class="back">Monthly</span>
    </div>
  </div>

  <div class="package-container">

    <div class="packages">
      <h1>Say</h1>
      <h2 class="text1">Wellcome</h2>
      <h2 class="text2">Wellcome</h2>
      <ul class="list">
        <li class="first">${accounts.id}</li>
        <li>${accounts.phonenumber}</li>
        <li>${accounts.email}</li>
        <li>${accounts.userEntity.username}</li>
      </ul>
      <a href="/logout" class="button button3">Log out </a>
    </div>

    <div class="packages">
      <h1>Customer</h1>
      <h2 class="text1">$20.99</h2>
      <h2 class="text2">$240.99</h2>
      <ul class="list">
        <li class="first">Buy Iphone</li>
        <li>Buy Ipad</li>
        <li>Buy Macbook</li>
        <li>Buy Apple Watch</li>
      </ul>
      <a href="/" class="button button2">Get started now</a>
    </div>

    <div class="packages">
      <h1>Agency</h1>
      <h2 class="text1">$30.99</h2>
      <h2 class="text2">$340.99</h2>
      <ul class="list">
        <li class="first">Buy Iphone %</li>
        <li>Buy Ipad %</li>
        <li>Buy Macbook %</li>
        <li>Buy Apple Watch %</li>
      </ul>
      <a href="/factory" class="button button1">Go Mannager</a>
    </div>

  </div>


</div>


<script>
  function check()
  {
    var checkbox = document.getElementById("checkbox");
    var text1 = document.getElementsByClassName("text1");
    var text2 = document.getElementsByClassName("text2");
    for (var i = 0; i < text1.length; i++)
    {
      if (checkbox.checked == true)
      {
        text1[i].style.display = "block";
        text2[i].style.display = "none";
      }
      else if (checkbox.checked == false)
      {
        text1[i].style.display = "none";
        text2[i].style.display = "block";
      }
    }

  }
  check();
</script>


</body>
</html>
