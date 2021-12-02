<%--
  Created by IntelliJ IDEA.
  User: rodriquesperry
  Date: 12/2/21
  Time: 1:30 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="partials/head.jsp"%>
    <title>Guessing Game</title>
</head>
<body>
    <h1 style="margin-top: 7rem; text-align: center">Please Enter a Number Between 1 & 3</h1>
    <div class="container d-flex justify-content-center" style="margin-top: 1rem">
        <form action="/guess" method="post"">
            <div class="form-group my-3">
                <input type="text" name="guessNumber" class="form-control mb-2" id="guessNumber" style="width: 44%">
            </div>
            <button type="submit" class="btn btn-primary" style="width: 45%">Submit</button>
        </form>
    </div>


    <%@ include file="partials/scripts.jsp"%>
</body>
</html>
