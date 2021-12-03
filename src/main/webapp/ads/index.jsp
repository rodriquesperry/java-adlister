<%--
  Created by IntelliJ IDEA.
  User: rodriquesperry
  Date: 12/3/21
  Time: 11:31 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Ads</title>
</head>
<body>
    <h1>Here are all the Ads</h1>
    <%-- Show a listing of all ads on site  --%>
    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
        </div>
    </c:forEach>

</body>
</html>
