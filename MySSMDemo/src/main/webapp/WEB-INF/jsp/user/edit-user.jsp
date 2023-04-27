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
    <title>修改用户信息</title>
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,500;0,600;0,700;1,400&amp;display=swap">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" type="text/css" href="https://www.jq22.com/jquery/bootstrap-5.0.0.css">
    <!-- Fontawesome CSS -->
    <link rel="stylesheet" href="../../../assets/plugins/fontawesome/css/fontawesome.min.css">
    <link rel="stylesheet" href="../../../assets/plugins/fontawesome/css/all.min.css">
    <!-- Main CSS -->
    <link rel="stylesheet" href="../../../assets/css/style.css">
    <link rel="stylesheet" type="text/css" href="../../../assets2/css/htmleaf-demo.css">
    <link rel="stylesheet" href="../../../assets2/css/demo.css"/>
    <link rel="stylesheet" href="../../../assets2/dist/styles/Vidage.css"/>
    <link rel="stylesheet" href="../../../assets5/css/style.css">
    <link rel="stylesheet" href="../../../assets7/css/index.css">
    <style>
        @font-face {
            font-family: 'icomoon';
            src: url('../../../assets/fonts/icomoon.eot?fxfybm');
            src: url('../../../assets/fonts/icomoon.eot?fxfybm#iefix') format('embedded-opentype'),
            url('fonts/icomoon.ttf?fxfybm') format('truetype'),
            url('../../../assets/fonts/icomoon.woff?fxfybm') format('woff'),
            url('../../../assets/fonts/icomoon.svg?fxfybm#icomoon') format('svg');
            font-weight: normal;
            font-style: normal;
            font-display: block;
        }

        .form-control {
            background: transparent;
            margin-top: 20px;
            border: 0;
        }


        #bvn {
            width: 300px;
            height: 30px;
            transform: translate(65px);
            margin-top: 30px;
            border: 0;
            border-left: #00a2e3;

        }

        #but {
            display: block;
            width: 100px;
            height: 40px;
            color: #fff;
            background-color: #4FA1D9;
            transform: translate(160px, 45px);
            opacity: 0.8;
            line-height: 20px;
        }

        #but:hover {
            background-color: #fff;
            color: #ffa400;
        }

        .loginmain {
            height: 800px;
        }

        #bbn {
            color: #4FA1D9;
        }

        .icoon {
            display: block;
            color: #4FA1D9;
            font-family: 'icomoon';
            z-index: 99;
            font-size: 30px;
            transform: translate(230px, -40px);
        }


    </style>
</head>

<body>
<div class="loginmain">
    <form method="post" action="/user/updateUserById">
        <div class="login-title">
            <span>修改用户信息</span>
        </div>
        <div class="login-con">
            <div class="form-control">
                <input type="text" name="id" required readonly value="${user.id}"/>
            </div>

            <div class="form-control">
                <input type="text" required value="${user.loginname}" name="loginname"/>
            </div>

            <div class="form-control">
                <input type="text" required value="${user.username}" name="username"/>
            </div>

            <div id="bvn">
                <select name="sex" required value="${user.sex}" class="form-control">
                    <option value={''} hidden selected disabled>选择性别</option>
                    <option value="1"
                            <c:if test="${'1' eq user.sex}">selected</c:if>  >男
                    </option>
                    <option value="0"
                            <c:if test="${'0' eq user.sex}">selected</c:if>  >女
                    </option>
                </select>
                <span class="icoon"></span>
            </div>

            <div class="form-control">
                <input type="text" value="${user.email}" required name="email"/>
            </div>

            <div class="form-control">
                <input type="text" value="${user.mobile}" required name="mobile"/>
            </div>

            <div id="bvn">
                <select name="type" required value="${user.type}" class="form-control">
                    <option value={''} hidden selected disabled>是否删除</option>
                    <option value="1"
                            <c:if test="${'1' eq user.type}">selected</c:if> >Yes
                    </option>
                    <option value="0"
                            <c:if test="${'0' eq user.type}">selected</c:if> >No
                    </option>
                </select>
                <span class="icoon"></span>
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
<script src="../../../assets5/js/script.js"></script>
<!-- Jquery JS-->
<script src="${pageContext.request.contextPath}/template/vendor/jquery-3.2.1.min.js"></script>
<!-- Bootstrap JS-->
<script src="${pageContext.request.contextPath}/template/vendor/bootstrap-4.1/popper.min.js"></script>
<script src="${pageContext.request.contextPath}/template/vendor/bootstrap-4.1/bootstrap.min.js"></script>
<!-- Vendor JS       -->
<script src="${pageContext.request.contextPath}/template/vendor/slick/slick.min.js"></script>
<script src="${pageContext.request.contextPath}/template/vendor/wow/wow.min.js"></script>
<script src="${pageContext.request.contextPath}/template/vendor/animsition/animsition.min.js"></script>
<script src="${pageContext.request.contextPath}/template/vendor/bootstrap-progressbar/bootstrap-progressbar.min.js"></script>
<script src="${pageContext.request.contextPath}/template/vendor/counter-up/jquery.waypoints.min.js"></script>
<script src="${pageContext.request.contextPath}/template/vendor/counter-up/jquery.counterup.min.js"></script>
<script src="${pageContext.request.contextPath}/template/vendor/circle-progress/circle-progress.min.js"></script>
<script src="${pageContext.request.contextPath}/template/vendor/perfect-scrollbar/perfect-scrollbar.js"></script>
<script src="${pageContext.request.contextPath}/template/vendor/chartjs/Chart.bundle.min.js"></script>
<script src="${pageContext.request.contextPath}/template/vendor/select2/select2.min.js"></script>
<!-- Main JS-->
<script src="${pageContext.request.contextPath}/template/js/main.js"></script>

<script src="https://www.jq22.com/jquery/jquery-3.3.1.js"></script><!-- Bootstrap Core JS -->
<script src="../../../assets/js/popper.min.js"></script>
<script src="../../../assets/plugins/bootstrap/js/bootstrap.min.js"></script><!-- Slimscroll JS -->
<script src="../../../assets/plugins/slimscroll/jquery.slimscroll.min.js"></script><!-- Custom JS -->
<script src="../../../assets/js/script.js"></script>
<script src="https://www.jq22.com/jquery/jquery-1.10.2.js"></script>
<script src="../../../assets7/js/ban.js"></script>
</html>
