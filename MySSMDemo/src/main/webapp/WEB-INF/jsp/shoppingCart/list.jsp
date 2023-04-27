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
    <link href="${pageContext.request.contextPath}/template/css/font-face.css" rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/template/vendor/font-awesome-4.7/css/font-awesome.min.css"
          rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/template/vendor/font-awesome-5/css/fontawesome-all.min.css"
          rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/template/vendor/mdi-font/css/material-design-iconic-font.min.css"
          rel="stylesheet" media="all">

    <!-- Bootstrap CSS-->
    <link href="${pageContext.request.contextPath}/template/vendor/bootstrap-4.1/bootstrap.min.css" rel="stylesheet"
          media="all">

    <!-- Vendor CSS-->
    <link href="${pageContext.request.contextPath}/template/vendor/animsition/animsition.min.css" rel="stylesheet"
          media="all">
    <link href="${pageContext.request.contextPath}/template/vendor/bootstrap-progressbar/bootstrap-progressbar-3.3.4.min.css"
          rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/template/vendor/wow/animate.css" rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/template/vendor/css-hamburgers/hamburgers.min.css" rel="stylesheet"
          media="all">
    <link href="${pageContext.request.contextPath}/template/vendor/slick/slick.css" rel="stylesheet" media="all">
    <link href="${pageContext.request.contextPath}/template/vendor/select2/select2.min.css" rel="stylesheet"
          media="all">
    <link href="${pageContext.request.contextPath}/template/vendor/perfect-scrollbar/perfect-scrollbar.css"
          rel="stylesheet" media="all">

    <!-- Main CSS-->
    <link href="${pageContext.request.contextPath}/template/css/theme.css" rel="stylesheet" media="all">
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
    <link rel="stylesheet" type="text/css" href="../../../assets9/css/bootstrap.css"/>
    <link href="http://cdn.bootcss.com/font-awesome/4.6.3/css/font-awesome.min.css" rel="stylesheet">
    <link rel="stylesheet" type="text/css" href="../../../assets9/css/htmleaf-demo.css">
    <link rel="stylesheet" type="text/css" href="../../../assets9/css/build.css">

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
            width: 600px;
        }

        .sidebar {
            z-index: 1;
            background-color: #00000060;
        }

        .row {
            width: 800px;

            transform: translate(700px, 60px);
            z-index: 1;
            opacity: 0.85;
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

        .index {
            display: block;
            width: 40px;
            height: 40px;
            color: #fff3cd;
            font-size: 20px;
            transform: translate(250px, 0px);
        }

        .img-tx {
            float: left;
            transform: translate(200px, -40px);
        }

        .pname {
            transform: translate(30px);
        }

        .price {
            transform: translate(-120px);
        }


        #kuang {
            width: 20px;
        }

        .cg {
            transform: translate(-120px);
        }

        .op > div {
            margin-top: 15px;
        }

        .au-checkbox {
            width: 50px;
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
                <a href="/" class="index">首页</a>
                <li class="menu-title"><span>后台 管理</span></li>
                <li class="submenu"><a href="index.jsp"><i
                        class="fas fa-chalkboard-teacher"></i><span>用户管理</span><span
                        class="menu-arrow"></span></a>
                    <ul>
                        <li><a href="/adduser">新增用户</a></li>
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
                <li class="submenu active"><a href="#"><i class="fas fa-building"></i><span>订单管理</span><span
                        class="menu-arrow"></span></a>
                    <ul>
                        <li><a href="/shoppingCart/list" class="active">订单管理</a></li>
                    </ul>
                </li>
                <li class="submenu"><a href="#"><i class="fas fa-building"></i><span>结算管理</span><span
                        class="menu-arrow"></span></a>
                    <ul>
                        <li><a href="/manage/order/list">结算管理</a></li>
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
<div class="row" style="background-color: white; ">
    <div class="col-md-12">
        <div class="table-data__tool">
            <div class="table-data__tool-left">
                <div class="rs-select2--light rs-select2--md">

                </div>
            </div>
            <div class="table-data__tool-right">

                <div class="rs-select2--dark rs-select2--sm rs-select2--dark2">
                    <div class="dropDownSelect2"></div>
                </div>
            </div>
        </div>
        <form id="frm" name="frm" method="post" action="/order/save">
            <div class="table-responsive table-responsive-data2">
                <tbody>
                <c:if test="${empty easybuyGwcList}">
                    <span> <p style="color: red;"> 购物车为空！请添加商品</p> <a href="/">跳转商品首页</a></span>
                </c:if>

                <c:forEach items="${easybuyGwcList}" var="gwc">
                    <div class="op" style="color: black;">
                        <div style="opacity: 0">${gwc.id}</div>
                        <div class="pname">商品名字：${gwc.product_name}</div>
                        <div class="img-tx"><img src="${gwc.product_img}" alt="" width="150px" height="150px"></div>
                        <div class="price">商品价格：${gwc.product_price}</div>
                        <div class="cg">添加减少：<a href="/shoppingCart/add?pid=${gwc.product_id}&num=1">+</a>&nbsp;&nbsp;
                            <input id="kuang" type="text" name="num" readonly
                                   value="${gwc.num}">&nbsp;<a
                                    href="/shoppingCart/reduceByProductId?pid=${gwc.product_id}&num=1">-</a>
                        </div>
                        <div class="checkbox checkbox-success" style="transform: translate(-120px)">
                            请选择：
                            <input type="checkbox" name="pid"
                                   value="${gwc.product_id}" id="checkbox3" class="styled">
                            <label for="checkbox3" style="transform: translate(10px)">

                            </label>
                        </div>
                        <div class="btn-group"
                             style="background-color: red;float: right;width: 40px; height:30px;
                             transform: translate(-5px,-15px);border-radius: 8px">
                            <button class="button" type="button" title="del"
                                    onclick="del(${gwc.id})" style="transform: translate(3px)">
                                <i style="color: white" class="">删除</i>
                            </button>
                        </div>
                    </div>
                </c:forEach>
                </tbody>

                <div class="qx" style="width: 50px; margin-top: 20px">
                    <span style="position: absolute;color: green;display: block;transform: translate(28px)">全选：</span>
                    <label class="au-checkbox" style="transform: translate(70px)">
                        <input type="checkbox" checked="false" id="chkAll">
                        <span class="au-checkmark"></span>
                    </label>
                </div>
            </div>

            <div class="table-data__tool-right">
                <button class="au-btn au-btn--block au-btn--green m-b-20" type="submit">购物结算
                </button>
                <c:if test="${not empty easybuyGwcList}">
                    <span> <a href="/">跳转商品首页</a></span>
                </c:if>
                <br/>
                <span style="color: red;"><%
                    String msg = request.getParameter("msg");
                    if (msg != null) {
                        out.print(msg);
                    }


                %></span>

            </div>
        </form>
        <!-- END DATA TABLE -->
    </div>
</div>
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
<script src="https://www.jq22.com/jquery/jquery-3.3.1.js"></script><!-- Bootstrap Core JS -->
<script src="../../../assets/js/popper.min.js"></script>
<script src="../../../assets/plugins/bootstrap/js/bootstrap.min.js"></script><!-- Slimscroll JS -->
<script src="../../../assets/plugins/slimscroll/jquery.slimscroll.min.js"></script><!-- Custom JS -->
<script src="../../../assets/js/script.js"></script>
<script src="../../../assets2/dist/scripts/Vidage.min.js"></script>
<script>
    new Vidage('#VidageVideo');
</script>

<script>
    function del(id) {
        // window.location = "/shoppingCart/reduce?pid=" + pid + "&num=" + num;
        if (window.confirm("确定要删除吗？")) {
            $.ajax({
                url: "/shoppingCart/deleteShoppingCartById",
                type: "get",
                data: {"id": id},
                dataType: "json",
                success: function (data) {
                    if (data.msg == "ok") {
                        alert("删除成功!")
                        window.location.href = "/shoppingCart/list"
                    } else {
                        alert("删除失败！")
                    }
                }
            })
        }
    }

    $(function () {
        //全选功能  start
        $(":checkbox").attr('checked', false);

        $("#chkAll").click(function () {
            var flag = $("#chkAll").get(0).checked;
            $("input[name='pid']").attr('checked', flag);
        })
        //全选功能  end
    })

</script>
<script type="text/javascript">
    function changeState(el) {
        if (el.readOnly) el.checked = el.readOnly = false;
        else if (!el.checked) el.readOnly = el.indeterminate = true;
    }
</script>

</body>

</html>
<!-- end document-->