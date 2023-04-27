<%--
  Created by IntelliJ IDEA.
  User: lynnBear-huawei
  Date: 2022/12/23
  Time: 11:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>后台管理</title>

    <!-- Fontfaces CSS-->
    <%--    <link href="${pageContext.request.contextPath}/template/css/font-face.css" rel="stylesheet" media="all">--%>
    <%--    <link href="${pageContext.request.contextPath}/template/vendor/font-awesome-4.7/css/font-awesome.min.css"--%>
    <%--          rel="stylesheet" media="all">--%>
    <%--    <link href="${pageContext.request.contextPath}/template/vendor/font-awesome-5/css/fontawesome-all.min.css"--%>
    <%--          rel="stylesheet" media="all">--%>
    <%--    <link href="${pageContext.request.contextPath}/template/vendor/mdi-font/css/material-design-iconic-font.min.css"--%>
    <%--          rel="stylesheet" media="all">--%>

    <%--    <!-- Bootstrap CSS-->--%>
    <%--    <link href="${pageContext.request.contextPath}/template/vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet"--%>
    <%--          media="all">--%>

    <%--    <!-- Vendor CSS-->--%>
    <%--    <link href="${pageContext.request.contextPath}/template/vendor/animsition/animsition.min.css" rel="stylesheet"--%>
    <%--          media="all">--%>
    <%--    <link href="${pageContext.request.contextPath}/template/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css"--%>
    <%--          rel="stylesheet" media="all">--%>
    <%--    <link href="${pageContext.request.contextPath}/template/vendor/wow/animate.css" rel="stylesheet" media="all">--%>
    <%--    <link href="${pageContext.request.contextPath}/template/vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet"--%>
    <%--          media="all">--%>
    <%--    <link href="${pageContext.request.contextPath}/template/vendor/slick/slick.css" rel="stylesheet" media="all">--%>
    <%--    <link href="${pageContext.request.contextPath}/template/vendor/select2/select2.min.css" rel="stylesheet"--%>
    <%--          media="all">--%>
    <%--    <link href="${pageContext.request.contextPath}/template/vendor/perfect-scrollbar/perfect-scrollbar.css"--%>
    <%--          rel="stylesheet" media="all">--%>

    <%--    <!-- Main CSS-->--%>
    <%--    <link href="${pageContext.request.contextPath}/template/css/theme.css" rel="stylesheet" media="all">--%>
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
    <style>
        .Vidage {
            z-index: -1000;
        }

        .form-group {
            width: 400px;
            margin: 0 auto;
            margin-top: 30px;
        }

        .bor {
            display: flex;
            width: 950px;
        }

        .row2 {
            display: flex;
            width: 950px;
        }

        .sidebar {
            z-index: 1;
            background-color: #00000060;
        }

        .row {
            width: 1100px;

            transform: translate(340px, -10px);
            z-index: 1;
        }

        .card {
            opacity: 0.8;
            transform: translate(165px, 20px);
        }

        #bbn {
            width: 300px;
            margin-left: 40px;
        }

        .col-md-12 {
            opacity: 1;
        }

        .col-md-9 {
            transform: translate(170px, 30px);
        }

        .form-control-file {
            color: red;
        }

        .form-control-file:focus {
            /*color: green;*/
        }


        .col-md-3 {
            transform: translate(550px, -40px);
        }

        .pvt {
            opacity: 0;
        }

        #but {
            width: 200px;
            background-color: #00ACED;
            transform: translateX(400px);
        }

        #btn:hover {
            background-color: #ffa400 !important;
        }


        #timePic img {
            width: 100px;
            height: 50px;
            z-index: 99999;
        }

        .clock {
            transform: translate(850px, 5px);
        }
    </style>
</head>

<body>
<!-- Main Wrapper -->
<div class="Vidage">
    <video id="VidageVideo" class="Vidage__video" preload="metadata" loop autoplay muted>
        <source src="../../../assets2/videos/bg.mp4" type="video/mp4">
    </video>
</div>
<div class="Time">
    <!-- Search Bar -->
    <div class="clock">
        <div class="flip">
            <div class="digital front" data-number="0"></div>
            <div class="digital back" data-number="1"></div>
        </div>
        <div class="flip">
            <div class="digital front" data-number="0"></div>
            <div class="digital back" data-number="1"></div>
        </div>
        <em class="divider">:</em>
        <div class="flip">
            <div class="digital front" data-number="0"></div>
            <div class="digital back" data-number="1"></div>
        </div>
        <div class="flip">
            <div class="digital front" data-number="0"></div>
            <div class="digital back" data-number="1"></div>
        </div>
        <em class="divider">:</em>
        <div class="flip">
            <div class="digital front" data-number="0"></div>
            <div class="digital back" data-number="1"></div>
        </div>
        <div class="flip">
            <div class="digital front" data-number="0"></div>
            <div class="digital back" data-number="1"></div>
        </div>
    </div>
</div>

<!-- /Search Bar --><!-- Mobile Menu Toggle
           /Notifications --><!-- User Menu -->


<!-- /Header --><!-- Sidebar -->
<div class="sidebar" id="sidebar">
    <div class="sidebar-inner slimscroll">
        <div id="sidebar-menu" class="sidebar-menu">
            <ul>
                <li class="menu-title"><span>后台 管理</span></li>
                <li class="submenu"><a href="index.jsp"><i
                        class="fas fa-chalkboard-teacher"></i><span>用户管理</span><span
                        class="menu-arrow"></span></a>
                    <ul>
                        <li><a href="/adduser">新增用户</a></li>
                        <li><a href="/manage/user/list">用户管理</a></li>

                    </ul>
                </li>
                <li class="submenu"><a href="#"><i
                        class="fas fa-chalkboard-teacher"></i><span>分类管理</span><span
                        class="menu-arrow"></span></a>
                    <ul>
                        <li><a href="index.jsp">新增分类</a></li>
                        <li><a href="/manage/category/list">分类管理</a></li>
                    </ul>
                </li>
                <li class="submenu active"><a href="#"><i
                        class="fas fa-user-graduate"></i><span>商品详情</span><span
                        class="menu-arrow"></span></a>
                    <ul>
                        <li><a href="/manage/prod/add" class="active">新增商品</a></li>
                        <li><a href="/manage/prod/list">商品管理</a></li>
                    </ul>
                </li>
                <li class="submenu"><a href="#"><i class="fas fa-building"></i><span>订单管理</span><span
                        class="menu-arrow"></span></a>
                    <ul>
                        <li><a href="/shoppingCart/list">订单管理</a></li>
                    </ul>
                </li>
                <li class="submenu"><a href="#"><i class="fas fa-book-reader"></i><span>新闻管理</span><span
                        class="menu-arrow"></span></a>
                    <ul>
                        <li><a href="/manage/news/list">新闻管理</a></li>
                    </ul>
                </li>
            </ul>
        </div>
    </div>
</div>
<!-- /Sidebar --><!-- Page Wrapper -->

<!-- MAIN CONTENT-->
<div class="main-content">
    <div class="section__content section__content--p30">
        <div class="container-fluid">
            <div class="row" style="background-color: white;transform: translate(550px,60px);opacity: 0.85">
                <div class="col-md-12">
                    <!-- DATA TABLE -->
                    <h3 class="title-5 m-b-35">商品列表</h3>
                    <div class="table-data__tool">
                        <div class="table-data__tool-left">
                            <div class="rs-select2--light rs-select2--md">
                            </div>
                        </div>
                        <div class="table-data__tool-right">
                        </div>
                    </div>
                    <div class="table-responsive table-responsive-data2">
                        <table class="table table-data2">
                            <thead>
                            <tr>
                                <th>订单编号</th>
                                <th>总价</th>
                                <th>收获地址</th>
                                <th>订单时间</th>
                                <th></th>
                            </tr>
                            </thead>
                            <tbody>
                            <c:forEach items="${orders}" var="order">
                                <tr class="tr-shadow line-seprate">
                                    <td>${order.id}</td>
                                    <td>
                                            ${order.cost}
                                    </td>
                                    <td>${order.cost}</td>
                                    <td>${order.createtime}</td>
                                    <td></td>
                                </tr>

                                <tr>
                                    <td></td>
                                    <td>明细编号</td>
                                    <td>商品名称</td>
                                    <td>数量</td>
                                    <td>小计</td>
                                </tr>
                                <c:forEach items="${order.details}" var="detail">

                                    <tr class="tr-shadow">
                                        <td></td>
                                        <td>${detail.id}</td>
                                        <td>
                                                ${detail.productName}
                                        </td>
                                        <td>${detail.quantity}</td>
                                        <td>${detail.cost}</td>
                                    </tr>
                                </c:forEach>
                            </c:forEach>
                            </tbody>
                        </table>
                    </div>


                    <!-- END DATA TABLE -->
                </div>
            </div>

        </div>
    </div>
</div>
<!-- END MAIN CONTENT-->
<!-- END PAGE CONTAINER-->
</div>

</div>

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
<script>
    function getUserList(pageNo) {
        var pageSize = $("#pageSize").val();
        window.location = "${pageContext.request.contextPath}/manage/prod/list?pageNo=" + pageNo + "&pageSize=" + pageSize;
    }
</script>
<script src="../../../assets2/dist/scripts/Vidage.min.js"></script>
<script>
    new Vidage('#VidageVideo');
</script>

</body>
<script>
    function change() {
        document.getElementById("pic").style.color = "green"
    }

</script>
</body>

</html>
<!-- end document-->
