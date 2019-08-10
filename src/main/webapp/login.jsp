<%--
  Created by IntelliJ IDEA.
  User: damian.lukaszewski
  Date: 2019-08-10
  Time: 13:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="${pageContext.request.contextPath}/login" method="post">
    Username: <input type="text" name="Login"><br>
    Password: <input type="text" name="Password"><br>
    <input type="submit" value="Log in">
</form>



</body>
</html>
