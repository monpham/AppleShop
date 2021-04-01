<!DOCTYPE html>
<!-- Created By CodingNepal -->
<html lang="en" dir="ltr">
<head>
    <meta charset="utf-8">
    <!-- Somehow I got an error, so I comment the title, just uncomment to show -->
    <!-- <title>404 Error Page | CodingNepal</title> -->
    <link rel="stylesheet" href="/error/style.css">
</head>
<body>
<div id="error-page">
    <div class="content">
        <h2 class="header" data-text="Exit">
            Exit</h2>
        <h4 data-text="See you again">
            See you again</h4>
        <p>
          </p>
        <div class="btns">
         <form action="/logout" method="post">
            <input  type="hidden"  name="_csrf" <%--value="${_csrf.parameterName}"--%> value="${_csrf.token}"/>
            <button type="submit">LOG OUT</button>
        </form>

            <a href="/">
                Return To Home </a>
        </div>
    </div>
</div>
</body>
</html>
