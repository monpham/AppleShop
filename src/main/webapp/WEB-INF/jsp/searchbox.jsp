<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01/22/21
  Time: 12:54 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Full Page Search Bar</title>

    <script src="https://kit.fontawesome.com/4bea204677.js" crossorigin="anonymous"></script>
</head>
<style>
    *{
        margin: 0;
        padding: 0;
        box-sizing: border-box;
    }
    body{

        background: #f2f2f2;
        position: relative;
    }
    .close{
        position: absolute;
        color: #FFF;
        top: 20px;
        right: 50px;
        font-size: 1.7em;
        cursor: pointer;
        transition:  all 600ms cubic-bezier(0.68, -0.55, 0.265, 1.55);
        display: none;
        z-index: 9999;
    }
    .close:hover{
        font-size: 2.4em;
        transform: rotate(360deg);
    }
    .search{
        position: fixed;
        top: 50%;
        left: 50%;
        transform: translate(-50%,-50%);
        background:#2E3BB8;
        transition: all .4s linear;
        width: 0;
        height: 0;
        border-radius: 50%;
    }
    .search i{
        color:#2E3BB8;
        font-size:1.7em;
        cursor:pointer;
    }
    .search .input{
        position: absolute;
        top: 50%;
        left: 50%;
        transform: translate(-50%,-50%);
        width: 350px;
        border: none;
        outline: none;
        background: transparent;
        border-bottom: 3px solid #EEE;
        font-size: 1.3em;
        color: #EEE;
        display: none;
    }
    .open{
        width: 4000px;
        height: 4000px;
    }







</style>
<body>
<div  class="close">
    <i class="fa fa-close"></i>
</div>
<form action="/searchproducts">
<div  class="search">
    <i class="fa fa-search"></i>
    <input type="text" class="input">
</div>
</form>









<script>
    let srcBtn = document.querySelector('.fa-search');
    let search = document.querySelector('.search');
    let closeBtn = document.querySelector('.close');
    let input = document.querySelector('.input');

    srcBtn.addEventListener('click', () => {
        srcBtn.style.display = 'none';
        search.classList.add('open');
        closeBtn.style.display = 'block';
        input.style.display = 'block';
    })
    closeBtn.addEventListener('click', () => {
        search.classList.remove('open');
        closeBtn.style.display = 'none';
        input.style.display = 'none';
        srcBtn.style.display = 'block';
    })


















</script>
</body>
</html>
