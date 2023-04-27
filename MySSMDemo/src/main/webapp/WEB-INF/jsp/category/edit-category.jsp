<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2022/12/28
  Time: 22:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html>
<link rel="stylesheet" href="../../../assets7/css/index.css">
<head>
    <title>修改分类信息</title>
</head>
<style>
    #but {
        display: block;
        width: 70px;
        height: 30px;
        color: #fff;
        background-color: #4FA1D9;
        transform: translate(150px, 50px);
        opacity: 0.8;
    }

    #but:hover {
        background-color: #fff;
        color: #ffa400;
    }

    .loginmain {
        width: 405px;
        height: 400px;
    }

    .login-user {
        margin-top: 20px;
    }


</style>
<body>
<canvas class="cavs" width="1575" height="1337"></canvas>
<div class="loginmain">
    <form method="post" action="/manage/category/category/updateCategoryById">
        <div class="login-title">
            <span>修改分类信息</span>
        </div>
        <div class="login-con">
            <div class="login-user">
                <input type="hidden" name="id" value="${category.id}">
            </div>
            <div class="login-user">
                <input type="text" name="name" required readonly value="${category.name}"/>
            </div>

            <div class="login-user">
                <input type="number" required value="${category.parentid}" name="parentid"/>
            </div>

            <div class="login-user">
                <input type="number" required value="${category.type}" name="type"/><
            </div>

            <div>
                <button type="submit"
                        class="btn btn-primary" id="but">
                    确认
                </button>
            </div>
    </form>
</div>
</body>
<script src="https://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script src="../../../assets7/js/ban.js"></script>
</html>
