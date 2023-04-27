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
            height: 900px;
            transform: translate(340px, -10px);
            z-index: 1;
        }

        .card {
            opacity: 0.8;
            transform: translate(100px, 20px);
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
            color: green;
        }

        .col-md-9:active {
            color: green;
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

        .login-btn button {
            border-radius: 3px;
            background: transparent;
            border: 2px solid #4FA1D9;
            color: #4FA1D9;
            text-transform: uppercase;
            font-size: 24px;
            cursor: pointer;
            position: absolute;
            top: 50px;
            left: 0;
            right: 0;
            margin: auto;
            width: 600px;
            height: 40px;
            transition-property: background, color;
            -webkit-transition-duration: .2s;
            transition-duration: .2s;
            transform: translate(0, 500px);
        }

        .login-btn button:hover {
            color: white !important;
            background: #4FA1D9;
            cursor: pointer;
            -webkit-transition-property: background, color;
            transition-property: background, color;
            -webkit-transition-duration: .2s;
            transition-duration: .2s;
        }

        .clock {
            transform: translate(880px, 5px);
        }

        .card-body {
            height: 600px;
            box-shadow: -15px 15px 15px rgba(6, 17, 47, 0.7);
            transform: translate(220px, 130px);
            z-index: -1000;
        }

        .form-control {
            background: transparent;
            border: 0;
            border-left: 1px solid #fff5d9;
        }

        .card-title h3 {
            color: #808080;
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
                <li class="submenu active"><a href="index.jsp"><i
                        class="fas fa-chalkboard-teacher"></i><span>用户管理</span><span
                        class="menu-arrow"></span></a>
                    <ul>
                        <li><a href="list" class="active">新增用户</a></li>
                        <li><a href="/manage/user/list">用户管理</a></li>
                        <%--                            <li><a href="teacher-details.html">Teacher View</a></li>--%>
                        <%--                            <li><a href="edit-teacher.html">Teacher Edit</a></li>--%>
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
                <li class="submenu"><a href="#"><i
                        class="fas fa-user-graduate"></i><span>商品详情</span><span
                        class="menu-arrow"></span></a>
                    <ul>
                        <li><a href="/manage/prod/add">新增商品</a></li>
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
<div class="row">
    <div class="col-sm-12">

        <div class="card-body">
            <div class="card-title"><h3 class="text-center title-2">用户信息</h3>
            </div>
            <form action="${pageContext.request.contextPath}/manage/user/save" method="post">
                <div class="form-group">
                    <label for="loginName">登录名</label>
                    <input id="loginName" name="loginName" type="text" class="form-control" placeholder="登录名">
                </div>
                <div class="form-group">
                    <label for="userName">用户名</label>
                    <input id="userName" name="userName" type="text"
                           class="form-control" placeholder="用户名">
                </div>

                <div class="form-group">
                    <label for="email">电子邮箱</label>
                    <input id="email" name="email" type="text"
                           class="form-control" placeholder="电子邮箱">
                </div>

                <div class="form-group">
                    <label for="mobile">电话</label>
                    <input id="mobile" name="mobile" type="text"
                           class="form-control" placeholder="电话">
                </div>
                <div class="form-group">
                    <label for="type">是否删除</label>
                    <select name="type" class="form-control">
                        <option value="1">是</option>
                        <option value="0">否</option>
                    </select>
                    <%--                    <input id="type" name="type" type="number"--%>
                    <%--                           class="form-control" placeholder="是否删除">--%>
                </div>

                <div class="login-btn">
                    <button type="submit"
                            class="login-btn">
                        添加用户
                    </button>
                </div>
            </form>
        </div>
    </div>
</div>
</div>


<!-- END MAIN CONTENT-->
<!-- END PAGE CONTAINER-->

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
<script>
    //将model中的值
    var level1 =
    ${level1}
    var level2 =
    ${level2}
    var level3 = ${level3}

        $(function () {

            $("#level1").append("<option value='0'>--请选择--</option>");
            //使用jq的 each进行循环，将level1的数据填入下拉框
            $.each(level1, function (index) {
                $("#level1").append("<option value='" + level1[index].id + "'>" + level1[index].name + "</option>")
            })

            //下拉框值改变事件
            $("#level1").change(function () {
                var l1 = $(this).val();//取下拉框的选中值
                $("#level2").html("");//清空下拉框中的html内容
                //根据level1选中的值，level2填入相应的选项
                $("#level2").append("<option value='0'>--请选择--</option>");
                //循环level2json集合，
                $.each(level2, function (index) {
                    if (level2[index].parentid == l1) {
                        $("#level2").append("<option value='" + level2[index].id + "'>" + level2[index].name + "</option>");
                    }
                })
            })
            //level2下拉框值改变事件
            $("#level2").change(function () {
                var l2 = $(this).val();//取level2下拉框选中值
                $("#level3").html("");//清空level3下拉框选中值

                $("#level3").append("<option value='0'>--请选择--</option>");
                $.each(level3, function (index) {
                    if (level3[index].parentid == l2) {
                        $("#level3").append("<option value='" + level3[index].id + "'>" + level3[index].name + "</option>");
                    }
                })
            })

            //按钮点击事件
            $("#btn").click(function () {
                var formData = new FormData();
                formData.append("pFile", $("#pic")[0].files[0]);
                $.ajax({
                    method: "post",
                    url: ${pageContext.request.contextPath}"/upload",
                    data: formData,
                    //jquery不处理表单数据
                    contentType: false,
                    processData: false,
                    dataType: "json",
                    //回调函数
                    success: function (data) {
                        $("#picImage").attr("src", data.img);
                        $("#picUrl").val(data.img);
                    }
                })
            })
        })
</script>
<script src="../../../assets2/dist/scripts/Vidage.min.js"></script>
<script>
    new Vidage('#VidageVideo');
</script>
<script src="https://www.jq22.com/jquery/jquery-1.10.2.js"></script>

</body>

</html>
<!-- end document-->

