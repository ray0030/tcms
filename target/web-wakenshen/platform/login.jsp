<%--
  Created by IntelliJ IDEA.
  User: 01
  Date: 七月 03 0003 
  Time: 21:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="/taglib.jsp"%>
<html>
<head>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <title>欢迎光临-登录</title>

    <link rel="shortcut icon" href="favicon.ico">
    <link href="css/bootstrap.min.css?v=3.3.6" rel="stylesheet">
    <link href="css/font-awesome.css?v=4.4.0" rel="stylesheet">

    <link href="css/animate.css" rel="stylesheet">
    <link href="css/style.css?v=4.1.0" rel="stylesheet">

    <script>
        if(window.top !== window.self){
            window.top.location = window.location;
        }
    </script>
</head>
<body class="gray-bg">

<div class="middle-box text-center loginscreen  animated fadeInDown">
    <div>
        <div>

            <!--  <h1 class="logo-name">H+</h1> -->

        </div>
        <h3>欢迎登录</h3>

        <form class="m-t" role="form" action="<c:url value='/platform/login'/>" method="post">
            <div class="form-group">
                <input type="email" class="form-control" placeholder="用户名" required="">
            </div>
            <div class="form-group">
                <input type="password" class="form-control" placeholder="密码" required="">
            </div>
            <button type="submit" class="btn btn-primary block full-width m-b" value="Login">登 录</button>

            <p class="text-muted text-center"> <a href="login.html#"><small>忘记密码了？</small></a> | <a href="register.html">注册一个新账号</a>
            </p>

        </form>
    </div>
</div>

<!-- 全局js -->
<script src="js/jquery.min.js?v=2.1.4"></script>
<script src="js/bootstrap.min.js?v=3.3.6"></script>

<script type="text/javascript" src="http://tajs.qq.com/stats?sId=9051096" charset="UTF-8"></script>
<!--统计代码，可删除-->

</body>
</html>




























