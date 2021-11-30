<%--
  Created by IntelliJ IDEA.
  User: rodriquesperry
  Date: 11/30/21
  Time: 12:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String userName = request.getParameter("userName");
        String password = request.getParameter("password");

        if (userName.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>

<html>
<head>
    <%@ include file="partials/head.jsp"%>
    <title>Login</title>
</head>
<body>
    <div class="col">
        <div class="card mx-auto" id="loginPanel" style="width:18rem;margin-top: 13rem;">
            <div class="card-header">
                <h5>Log In</h5>
            </div>
            <form action="/login.jsp" method="post">
                <div class="form-group">
                    <label for="userName" class="ml-2">User Name</label>
                    <input type="text" name="userName" class="form-control mx-auto" id="userName" style="width: 95%">
                </div>
                <div class="form-group">
                    <label for="Password" class="ml-2">Password</label>
                    <input type="password" name="password" class="form-control mx-auto" id="Password" style="width: 95%">
                </div>
                <button type="submit" class="btn btn-primary ml-2">Log In</button>
            </form>
        </div>
    </div>




    <%@ include file="partials/scripts.jsp"%>
</body>
</html>
