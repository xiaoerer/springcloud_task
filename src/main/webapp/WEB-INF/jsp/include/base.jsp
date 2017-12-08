<%--<%@ taglib prefix="e" uri="http://mycompany.com" %>--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="UTF-8" %>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <%--<meta name="viewport" content="width=device-width, initial-scale=1">--%>
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1, user-scalable=no">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->

    <link href="${contextPath}/static/img/favicon.ico" rel="shortcut icon bookmark" type="image/x-icon"/>
    <%@include file="taglibs.jsp"%>
    <!--设置绝对路径-->
    <script>
        var contextPath = "${contextPath}";
    </script>
    <!-- Bootstrap -->
    <!--全部配置到本地-->
    <%--<script  type="text/javascript" src="${contextPath}/static/ext/jquery-3.2.1.slim.min.js"></script>--%>
    <%--<script src="${contextPath}/static/ext/bootstrap.min.js"></script>
    <link href="${contextPath}/static/ext/bootstrap.min.css" rel="stylesheet">
    <!--可以不用引入-->
    <link href="${contextPath}/static/ext/bootstrap-theme.min.css" rel="stylesheet">--%>

    <!--网络加速配置-->
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://cdn.bootcss.com/jquery/1.12.4/jquery.min.js"></script>
    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="https://cdn.bootcss.com/bootstrap/3.3.7/js/bootstrap.min.js"
            integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
            crossorigin="anonymous"></script>
    <!-- 最新版本的 Bootstrap 核心 CSS 文件 -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap.min.css"
          integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    <!-- 可选的 Bootstrap 主题文件（一般不用引入） -->
    <link rel="stylesheet" href="https://cdn.bootcss.com/bootstrap/3.3.7/css/bootstrap-theme.min.css"
          integrity="sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp" crossorigin="anonymous">


    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->

    <e:parentTag name="title"><title>定时发送系统</title></e:parentTag>
</head>
<body>
    <e:parentTag name="title"><title>测试父类</title></e:parentTag>aa
</body>
</html>
