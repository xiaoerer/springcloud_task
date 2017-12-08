<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%--
  Created by IntelliJ IDEA.
  User: XieZhengJun
  Date: 2017/12/4
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<h1>欢迎${user.username }光临!请选择你的操作:</h1><br>
<ul>
    <shiro:hasPermission name="add"><li>增加</li></shiro:hasPermission>
    <shiro:hasPermission name="delete"><li>删除</li></shiro:hasPermission>
    <shiro:hasPermission name="update"><li>修改</li></shiro:hasPermission>
    <shiro:hasPermission name="query"><li>查询</li></shiro:hasPermission>
</ul>
<a href="${pageContext.request.contextPath }/logOut">点我注销</a>

${user.username}+${user.password}

</body>
</html>
