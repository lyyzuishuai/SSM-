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
<head>
    <title>修改商品信息</title>
    <link rel="stylesheet" href="../../../assets7/css/index.css">
    <style>
        #but {
            display: block;
            width: 70px;
            height: 30px;
            color: #fff;
            background-color: #4FA1D9;
            transform: translate(200px);
            opacity: 0.8;
        }

        #but:hover {
            background-color: #fff;
            color: #ffa400;
        }

    </style>
</head>
<body>
<canvas class="cavs" width="1575" height="1337"></canvas>
<div class="loginmain">
    <form action="${pageContext.request.contextPath}/manage/prod/updateProductById" method="post">
        <div class="login-title">
            <span>修改商品信息</span>
        </div>
        <div class="login-con">
            <div class="login-user">
                <input type="text" name="id" value="${prod.id}">
            </div>

            <div class="login-user">
                <input type="text" name="name" required readonly value="${prod.name}"/>
            </div>

            <div class="login-user">
                <input type="text" required value="${prod.price}" name="price"/>
            </div>

            <div class="login-user">
                <input type="text" required value="${prod.stock}" name="stock"/>
            </div>
            <div class="login-user">
                <input type="text" required value="${prod.categorylevel1id}" name="categorylevel1id"/>
            </div>
            <div class="login-user">
                <input type="text" required value="${prod.categorylevel2id}" name="categorylevel2id"/>
            </div>
            <div class="login-user">
                <input type="text" required value="${prod.categorylevel3id}" name="categorylevel3id"/>
            </div>

            <div>
                <button type="submit"
                        class="btn btn-primary" id="but">
                    确认
                </button>
            </div>
        </div>
    </form>
</div>
</body>
</html>
<script src="https://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script src="../../../assets7/js/ban.js"></script>

