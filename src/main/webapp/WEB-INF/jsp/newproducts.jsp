<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 01/14/21
  Time: 3:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Image Preview and Upload PHP</title>
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.0.0/css/bootstrap.min.css" />
    <link rel="stylesheet" href="main.css">
</head>
<style>
    .form-div { margin-top: 100px; border: 1px solid #e0e0e0; }
    #profileDisplay { display: block; height: 210px; width: 60%; margin: 0px auto; border-radius: 50%; }
    .img-placeholder {
        width: 60%;
        color: white;
        height: 100%;
        background: black;
        opacity: .7;
        height: 210px;
        border-radius: 50%;
        z-index: 2;
        position: absolute;
        left: 50%;
        transform: translateX(-50%);
        display: none;
    }
    .img-placeholder h4 {
        margin-top: 40%;
        color: white;
    }
    .img-div:hover .img-placeholder {
        display: block;
        cursor: pointer;
    }
</style>
<body>
<div class="container">
    <div class="row">
        <div class="col-4 offset-md-4 form-div">
<form:form modelAttribute="product" action="newProducts">
    <c:if test="${type.equals('update')}">

                <form:input path="id" readonly="true" type="hidden"/>

    </c:if>
                <h2 class="text-center mb-3 mt-3">Update Product</h2>

                <div class="alert <?php echo $msg_class ?>" role="alert">

                </div>

                <div class="form-group text-center" style="position: relative;" >
            <span class="img-div">
              <div class="text-center img-placeholder"  onClick="triggerClick()">
                <h4>Update image</h4>
              </div>
              <img src='<c:url value="/product/images/${product.images}"/>' onClick="triggerClick()" id="profileDisplay">
            </span>
                    <form:input path="images" type="file" name="profileImage" onChange="displayImage(this)" id="profileImage" class="form-control" style="display: none;" />
                    <label>Profile Image</label>
                </div>
                <div class="form-group">
                    <label>Name Products</label>
    <form:input name="bio" class="form-control" path="nameproduct"/>
                </div>
    <div class="form-group"><label>Descriptionimges</label>
    <form:input name="bio" class="form-control" path="descriptionimges"/></div>
    <div class="form-group"><label>Price</label>
    <form:input name="bio" class="form-control" path="price"/></div>
    <div class="form-group"><label>Factory</label>
        <form:input name="bio" class="form-control" path="code"/></div>
    <div class="form-group"><label>Portfolios</label>

    <form:select name="bio" class="form-control" path="productPortfolioEntity.id" items="${productPortfolios}"/>
    </div>
                <div class="form-group">
                    <button type="submit" name="save_profile" class="btn btn-primary btn-block">Save Products</button>
                </div>
</form:form>
        </div>
    </div>
</div>
</body>
<script>function triggerClick(e) {
    document.querySelector('#profileImage').click();
}
function displayImage(e) {
    if (e.files[0]) {
        var reader = new FileReader();
        reader.onload = function(e){
            document.querySelector('#profileDisplay').setAttribute('src', e.target.result);
        }
        reader.readAsDataURL(e.files[0]);
    }
}</script>
</html>
