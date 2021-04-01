<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 02/02/21
  Time: 1:33 PM
  To change this template use File | Settings | File Templates.
--%><%@ taglib prefix="xlink" uri="http://www.springframework.org/tags/form" %>

<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="from" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="java.util.List"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Title</title>
</head>
<body>
<form:form method="GET" action="${pageContext.request.contextPath}/cart/Transaction" modelAttribute="transactionEntity">

  <div>
    <span>Your ADRESS</span>
    <form:input path="transactionaddress"  />
  </div>
  <div>
    <span>Your NAME</span>
    <form:input path="transactionname"  />
  </div>

  <div>
    <span>Your phone</span>
    <form:input path="transactionphone"  />
  </div>
  <div>
    <span>Your mail</span>
    <form:input path="transactionmail"  />
  </div>
  <div>
    <span>Your SECURITY</span>
    <form:input path="security"  />
  </div>
  <div>
    <span>Your PAYMENT</span>
    <form:input path="payment"  value="${sessionScope.myCartTotal + (sessionScope.myCartTotal * 0.1)}" />
  </div>


  <input type="submit" value="SEND" >
</form:form>
</body>
</html
