<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<%@include file="include/taglibs.jsp"%>
<html>
<head>
    <title>登录页面</title>
</head>
<body>
<h1>登录页面信息</h1>
<form action="${pageContext.request.contextPath }/loginUser" method="post">
    <input type="text" name="username"><br>
    <input type="password" name="password"><br>
    <input type="submit" value="提交">
</form>
</body>
</html>
