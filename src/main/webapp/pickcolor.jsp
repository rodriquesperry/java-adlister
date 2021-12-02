<%--
  Created by IntelliJ IDEA.
  User: rodriquesperry
  Date: 12/2/21
  Time: 10:27 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <%@ include file="partials/head.jsp"%>
    <title>Title</title>
</head>
<body>
 <%@ include file="partials/head.jsp"%>
    <div class="container" style="margin-top: 7rem">
        <form action="/pickcolor" method="post">
            <div class="form-group my-3">
                <label for="colorChoice"><h2>Input a color</h2></label>
                <input type="text" name="colorChoice" class="form-control" id="colorChoice">
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>

    </div>

    <%@ include file="partials/scripts.jsp"%>
</body>
</html>
