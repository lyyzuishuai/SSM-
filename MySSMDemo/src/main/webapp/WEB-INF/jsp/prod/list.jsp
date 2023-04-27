<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2022/12/23
  Time: 9:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0, user-scalable=0">
    <title>Preskool - 用户管理</title>
    <!-- Favicon -->
    <link rel="shortcut icon" href="../../assets/img/favicon.png">
    <link rel="stylesheet"
          href="https://fonts.googleapis.com/css2?family=Poppins:ital,wght@0,500;0,600;0,700;1,400&amp;display=swap">
    <!-- Bootstrap CSS -->
    <link rel="stylesheet" type="text/css" href="https://www.jq22.com/jquery/bootstrap-5.0.0.css">
    <!-- Fontawesome CSS -->
    <link rel="stylesheet" href="../../assets/plugins/fontawesome/css/fontawesome.min.css">
    <link rel="stylesheet" href="../../assets/plugins/fontawesome/css/all.min.css">
    <!-- Datatables CSS -->
    <link rel="stylesheet" href="../../assets/plugins/datatables/datatables.min.css">
    <!-- Main CSS -->
    <link rel="stylesheet" href="../../assets/css/style.css">
    <link rel="shortcut icon" href="../favicon.ico">

    <link rel="stylesheet" type="text/css" href="../../../assets2css/style3.css"/>
    <script src="../../../assets2/js/modernizr.custom.63321.js"></script>
    <link rel="stylesheet" href="../../../assets/css/bootstrap.css"/>
    <link rel="stylesheet" type="text/css" href="../../../assets2/css/htmleaf-demo.css">
    <link rel="stylesheet" href="../../../assets2/css/demo.css"/>
    <link rel="stylesheet" href="../../../assets2/dist/styles/Vidage.css"/>
    <link rel="stylesheet" href="../../../assets5/css/style.css">
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

        * {
            margin: 0;
            padding: 0;
        }

        li {
            list-style: none;
        }

        #main {
            width: 770px;
            height: 190px;
            position: relative;
            margin: 0 auto;
            overflow: hidden;
        }

        .pics {
            width: 1560px;
            height: 160px;
            position: relative;
            transform: translateY(-20px);
        }

        .pics ul li {
            float: left;
        }

        .leftSee {
            opacity: 1;
        }

        .rightSee {
            opacity: 0;
        }

        .btn3 {
            position: relative;
            text-align: center;
            line-height: 30px;
            background: #c7c7c7;
            bottom: 50px;
        }

        .btn3 a {
            display: inline-block;
            font-size: 12px;
            cursor: pointer;
            margin-right: 50px;
            color: #757575;
            height: 30px;
        }

        .btn3 .active {
            color: black;
        }

        .header .header-left .logo img {
            transform: translateY(5px) !important;
        }

        .com {
            color: #ae3535;
            font-size: 24px;
            transform: translate(-5px, 10px);
        }

        .bbn {
            position: relative;
            width: 100%;
            height: 152px;
            transform: translateY(-20px);
        }

        .bvn {
            position: absolute;
            display: flex;
            width: 60px;
            height: 28px;
            left: 58px;
            top: 95px;
        }

        .sel {
            position: absolute;
            display: block;
            top: 110px;
            width: 200px;
            height: 30px;
            transform: translateX(-10px);
        }

        .none {
            visibility: hidden;
        }

        .main-wrapper {
            background: transparent;
        }

        .Vidage {
            z-index: -100;
        }

        .sidebar {
            z-index: 1;
            background-color: #00000060;
        }

        .row {
            opacity: 0.8;
            transform: translateY(-10px);
        }

        .bgc {
            opacity: 0.8;
            background: transparent;
        }

        .btn2 {
            opacity: 0;
        }

        .form-control.weiyi {
            border: 1px solid #18aefa;
        }

        .icoon {
            display: block;
            color: #ffa400;
            font-family: 'icomoon';
            z-index: 99;
            font-size: 30px;
            transform: translate(45px, -30px);
        }

        .clock {
            width: 1000px;
            transform: translateX(500px);
        }

        .header-left {
            mso-build-after-color: pink;
        }

        .nav.user-menu {
            transform: translate(-1380px, -55px);
            z-index: 100;
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
<div class="main-wrapper"><!-- Header -->
    <div class="header"><!-- Logo -->
        <div class="header-left"><
            <img src="../../../assets/img/3.png" width="200" height="60" alt=""><span class="com">com</span>
        </div>
        <!-- /Logo --><a href="javascript:void(0);" id="toggle_btn"><i class="fas fa-align-left"></i></a>

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
        <!-- /Search Bar --><!-- Mobile Menu Toggle --><a class="mobile_btn" id="mobile_btn"><i
                class="fas fa-bars"></i></a>
        <!-- /Mobile Menu Toggle --><!-- Header Right Menu -->
        <ul class="nav user-menu">
            <!-- Notifications -->
            <li class="nav-item dropdown noti-dropdown"><a href="#" class="dropdown-toggle nav-link"
                                                           data-toggle="dropdown"><i class="far fa-bell"></i><span
                    class="badge badge-pill">3</span></a>
                <div class="dropdown-menu notifications">
                    <div class="topnav-dropdown-header"><span class="notification-title">Notifications</span><a
                            href="javascript:void(0)" class="clear-noti">Clear All </a></div>
                    <div class="noti-content">
                        <ul class="notification-list">
                            <li class="notification-message"><a href="#">
                                <div class="media"><span class="avatar avatar-sm"><img
                                        class="avatar-img rounded-circle"
                                        alt="User Image"
                                        src="assets/img/profiles/avatar-02.jpg"></span>
                                    <div class="media-body">
                                        <p class="noti-details"><span class="noti-title">Carlson Tech</span>has
                                            approved
                                            <span class="noti-title">your estimate</span></p>
                                        <p class="noti-time"><span class="notification-time">4 mins ago</span></p>
                                    </div>
                                </div>
                            </a></li>
                            <li class="notification-message"><a href="#">
                                <div class="media"><span class="avatar avatar-sm"><img
                                        class="avatar-img rounded-circle"
                                        alt="User Image"
                                        src="assets/img/profiles/avatar-11.jpg"></span>
                                    <div class="media-body">
                                        <p class="noti-details"><span
                                                class="noti-title">International Software Inc</span>has sent you a
                                            invoice in the amount of <span class="noti-title">$218</span></p>
                                        <p class="noti-time"><span class="notification-time">6 mins ago</span></p>
                                    </div>
                                </div>
                            </a></li>
                            <li class="notification-message"><a href="#">
                                <div class="media"><span class="avatar avatar-sm"><img
                                        class="avatar-img rounded-circle"
                                        alt="User Image"
                                        src="assets/img/profiles/avatar-17.jpg"></span>
                                    <div class="media-body">
                                        <p class="noti-details"><span class="noti-title">John Hendry</span>sent a
                                            cancellation request <span class="noti-title">Apple iPhone XR</span></p>
                                        <p class="noti-time"><span class="notification-time">8 mins ago</span></p>
                                    </div>
                                </div>
                            </a></li>
                            <li class="notification-message"><a href="#">
                                <div class="media"><span class="avatar avatar-sm"><img
                                        class="avatar-img rounded-circle"
                                        alt="User Image"
                                        src="assets/img/profiles/avatar-13.jpg"></span>
                                    <div class="media-body">
                                        <p class="noti-details"><span class="noti-title">Mercury Software Inc</span>added
                                            a new product <span class="noti-title">Apple MacBook Pro</span></p>
                                        <p class="noti-time"><span class="notification-time">12 mins ago</span></p>
                                    </div>
                                </div>
                            </a></li>
                        </ul>
                    </div>
                    <div class="topnav-dropdown-footer"><a href="#">View all Notifications</a></div>
                </div>
            </li>
            <!-- /Notifications --><!-- User Menu -->
            <li class="nav-item dropdown has-arrow"><a href="#" class="dropdown-toggle nav-link"
                                                       data-toggle="dropdown"><span
                    class="user-img"><img class="rounded-circle" src="../../../assets4/img/8.jpg"
                                          width="31"
                                          alt="Ryan Taylor"></span></a>
                <div class="dropdown-menu">
                    <div class="user-header">
                        <div class="avatar avatar-sm"><img src="../../../assets4/img/8.jpg"
                                                           alt="User Image"
                                                           class="avatar-img rounded-circle"></div>
                        <div class="user-text">
                            <h6>Ryan Taylor</h6>
                            <p class="text-muted mb-0">Administrator</p>
                        </div>
                    </div>
                    <a class="dropdown-item" href="profile.html">My Profile</a><a class="dropdown-item"
                                                                                  href="inbox.html">Inbox</a><a
                        class="dropdown-item" href="login.html">Logout</a>
                </div>
            </li>
            <!-- /User Menu -->
        </ul>
        <!-- /Header Right Menu --></div>
    <!-- /Header --><!-- Sidebar -->
    <div class="sidebar" id="sidebar">
        <div class="sidebar-inner slimscroll">
            <div id="sidebar-menu" class="sidebar-menu">
                <ul>
                    <li class="menu-title"><span>后台 管理</span></li>
                    <li class="submenu"><a href="#"><i
                            class="fas fa-chalkboard-teacher"></i><span>用户管理</span><span
                            class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/manage/user/add">新增用户</a></li>
                            <li><a href="/manage/user/list">用户管理</a></li>
                            <%--                            <li><a href="teacher-details.html">Teacher View</a></li>--%>
                            <%--                            <li><a href="edit-teacher.html">Teacher Edit</a></li>--%>
                        </ul>
                    </li>
                    <li class="submenu"><a href="#"><i
                            class="fas fa-user-graduate"></i><span>分类管理</span><span
                            class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/manage/category/add">新增分类</a></li>
                            <li><a href="/manage/category/list">分类管理</a></li>
                            <%--                            <li><a href="student-details.html">商品 视图</a></li>--%>
                            <%--                            <li><a href="edit-student.html">商品 修改</a></li>--%>
                        </ul>
                    </li>

                    <li class="submenu active"><a href="#"><i
                            class="fas fa-chalkboard-teacher"></i><span>商品详情</span><span
                            class="menu-arrow"></span></a>
                        <ul>
                            <li><a href="/manage/prod/add">新增商品</a></li>
                            <li><a href="list" class="active">商品管理</a></li>
                            <%--                            <li><a href="teacher-details.html">Teacher View</a></li>--%>
                            <%--                            <li><a href="edit-teacher.html">Teacher Edit</a></li>--%>
                        </ul>
                    </li>
                    <li class="submenu"><a href="/manage/shoppingCart/list"><i
                            class="fas fa-building"></i><span>订单管理</span><span
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
    <div class="page-wrapper">
        <div class="content container-fluid"><!-- Page Header -->
            <div class="bbn">
                <div id="main">
                    <div class="pics">
                        <ul class="bgc">
                            <li class="leftSee"><a href="#"><img src="../../../assets3/images/apple1.jpg" alt=""></a>
                            </li>
                            <li class="leftSee"><a href="#"><img src="../../../assets3/images/apple2.jpg" alt=""></a>
                            </li>
                            <li class="leftSee"><a href="#"><img src="../../../assets3/images/apple3.jpg" alt=""></a>
                            </li>
                            <li class="leftSee"><a href="#"><img src="../../../assets3/images/apple4.jpg" alt=""></a>
                            </li>
                            <li class="leftSee"><a href="#"><img src="../../../assets3/images/apple5.jpg" alt=""></a>
                            </li>
                            <li class="leftSee"><a href="#"><img src="../../../assets3/images/apple6.jpg" alt=""></a>
                            </li>
                            <li class="rightSee"><a href="#"><img src="../../../assets3/images/apple7.jpg" alt=""></a>
                            </li>
                            <li class="rightSee"><a href="#"><img src="../../../assets3/images/apple8.jpg" alt=""></a>
                            </li>
                            <li class="rightSee"><a href="#"><img src="../../../assets3/images/apple9.jpg" alt=""></a>
                            </li>
                            <li class="rightSee"><a href="#"><img src="../../../assets3/images/apple10.jpg" alt=""></a>
                            </li>
                            <li class="rightSee"><a href="#"><img src="../../../assets3/images/apple11.jpg" alt=""></a>
                            </li>
                            <li class="rightSee"><a href="#"><img src="../../../assets3/images/apple12.jpg" alt=""></a>
                            </li>
                        </ul>
                    </div>
                    <div class="btn3">
                        <span class="caret"></span>
                        <a class="active">Product</a>
                        <a>More</a>
                    </div>
                </div>
                
                <div class="sel">
                    <select id="type" name="type" class="btn2 ">
                        <option value="-1" ${page.params.get("type")==0?"selected":""}>
                        </option>
                        <option value="1" ${page.params.get("type")==1?"selected":""}>一级分类
                        </option>
                        <option value="2" ${page.params.get("type")==2?"selected":""}>二级分类
                        </option>
                        <option value="3" ${page.params.get("type")==3?"selected":""}>三级分类
                        </option>
                    </select>

                </div>
                <div class="bvn">
                    <div id="header" class="top-nav-search">
                        <form class="form">
                            <input type="text" class="input_key form-control weiyi" maxlength="100"
                                   autocomplete="on"
                                   value="${page.key==null?"":page.key}"
                                   id="hotkey" name="hotkey"/>
                            <button type="button" class="btn" onclick="getPage(1)"><i class="fas fa-search"></i>
                            </button>
                        </form>
                    </div>
                </div>

                <div class="none">
                    <div class="rs-select2--dark rs-select2--sm rs-select2--dark2">
                        <select class="none" name="pageSize" id="pageSize">
                            <option value="5" ${page.pageSize==5?"selected":""}>5</option>
                            <option value="10"${page.pageSize==10?"selected":""}>10</option>
                            <option value="20"${page.pageSize==20?"selected":""}>20</option>
                            <option value="30"${page.pageSize==30?"selected":""}>30</option>
                        </select>
                    </div>
                </div>
            </div>
        </div>
        <!-- /Page Header -->
        <div class="row">
            <div class="col-sm-12">
                <div class="card card-table">
                    <div class="card-body">
                        <div class="table-responsive">
                            <table class="table table-hover table-center mb-0 datatable">
                                <thead>
                                <tr>
                                    <th>编号</th>
                                    <th>名称</th>
                                    <th>单价</th>
                                    <th>库存</th>
                                    <th>一级分类</th>
                                    <th>二级分类</th>
                                    <th>三级分类</th>
                                    <th class="text-right">操作</th>
                                </tr>
                                </thead>
                                <tbody>
                                <c:forEach items="${prods}" var="product">
                                    <tr>
                                        <td>${product.id}</td>
                                        <td>${product.name}</td>
                                        <td>${product.price}</td>
                                        <td>${product.stock}</td>
                                        <td>${product.categorylevel1id}</td>
                                        <td>${product.categorylevel2id}</td>
                                        <td>${product.categorylevel3id}</td>

                                        <td class="text-right">
                                            <div class="actions"><a
                                                    href="/manage/prod/prod/returnProductEditPage?id=${product.id}"
                                                    class="btn btn-sm bg-success-light mr-2"><i
                                                    class="fas fa-pen"></i></a><a href="#"
                                                                                  onclick="deleteByProdId(${product.id})"
                                                                                  class="btn btn-sm bg-danger-light"><i
                                                    class="fas fa-trash"></i></a>
                                            </div>
                                        </td>
                                    </tr>
                                </c:forEach>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Footer -->

        <!-- /Footer --></div>
    <!-- /Page Wrapper --></div>

<!-- /Main Wrapper --><!-- jQuery -->
<script>
    function getPage(pageNo) {
        var pageSize = $("#pageSize").val();
        var url = "${pageContext.request.contextPath}/manage/prod/list?pageNo=" + pageNo + "&pageSize=" + pageSize;
        //判断是否选择了分类级别
        if ($("#type").val() != 0) {
            url += "&type=" + $("#type").val();
        }
        //判断是否填入了搜索词
        if ($("#hotkey").val() != "") {
            url += "&key=" + $("#hotkey").val();
        }
        window.location = url;
    }
</script>

<script src="http://www.jq22.com/jquery/1.8.3/jquery.min.js"></script>
<script type="text/javascript" src="../../../assets2/js/jquery.dropdown.js"></script>
<script type="text/javascript">
    $(function () {
        $('#cd-dropdown').dropdown({
            gutter: 5,
            delay: 40,
            rotated: 'left'
        });
    });
</script>
<script src="https://www.jq22.com/jquery/jquery-3.3.1.js"></script><!-- Bootstrap Core JS -->
<script src="../../../assets/js/popper.min.js"></script>
<script src="../../../assets/plugins/bootstrap/js/bootstrap.min.js"></script><!-- Slimscroll JS -->
<script src="../../../assets/plugins/slimscroll/jquery.slimscroll.min.js"></script><!-- Datatables JS -->
<script src="../../../assets/plugins/datatables/datatables.min.js"></script><!-- Custom JS -->
<script src="../../../assets/js/script.js"></script>
<script src="../../../assets/js/jquery-3.5.1.min.js"></script>
<script>
    (function () {
        function p() {
            window.requestAnimFrame(p), a = d(0, 360), s.globalCompositeOperation = "destination-out", s.fillStyle = "rgba(0, 0, 0, 0.5)", s.fillRect(0, 0, e, t), s.globalCompositeOperation = "source-over";
            var n = u.length;
            while (n--) u[n].draw(), u[n].update(n)
        }

        function d(e, t) {
            return Math.random() * (t - e) + e
        }

        function v() {
            i = $('<canvas width="' + e + '" height="' + t + '" />').appendTo(n).css({
                position: "absolute",
                left: -20,
                top: -44,
                zIndex: 999,
                pointerEvents: "none"
            }), s = i[0].getContext("2d"), r = $("<div />").appendTo(n).css({
                fontSize: "16px",
                fontFamily: "arial",
                height: 1,
                position: "absolute",
                left: 15,
                top: 50,
                zIndex: 0,
                visibility: "hidden",
                whiteSpace: "nowrap"
            })
        }

        if (/msie/i.test(navigator.userAgent)) return;
        var e = 600,
            t = 100,
            n = $("#header .form"),
            r = null,
            i = null,
            s = null,
            o = !1,
            u = [],
            a = 120,
            f = 8,
            l = 0,
            c = 0,
            h = function (e, t, n) {
                var r = this;
                r.x = e, r.y = t, r.dir = n, r.coord = {}, r.angle = d(0, -Math.PI), r.speed = d(2, 8), r.friction = .95, r.gravity = 1, r.hue = d(a - 10, a + 10), r.brightness = d(50, 80), r.alpha = 1, r.decay = d(.03, .05), r.init()
            };
        h.prototype = {
            init: function () {
                var e = this;
                e.coord = {
                    x: e.x,
                    y: e.y
                }
            },
            update: function (e) {
                var t = this;
                t.coord = {
                    x: t.x,
                    y: t.y
                }, t.speed *= t.friction, t.x += Math.cos(t.angle) * t.speed + t.dir, t.y += Math.sin(t.angle) * t.speed + t.gravity, t.alpha -= t.decay, t.alpha <= t.decay && u.splice(e, 1)
            },
            draw: function () {
                var e = this;
                s.fillStyle = "hsla(" + e.hue + ", 100%, " + e.brightness + "%, " + e.alpha + ")", s.beginPath(), s.arc(e.coord.x, e.coord.y, 2, 0, 2 * Math.PI, !0), s.closePath(), s.fill()
            }
        }, window.requestAnimFrame = function () {
            return window.requestAnimationFrame || window.webkitRequestAnimationFrame || window.mozRequestAnimationFrame || window.oRequestAnimationFrame || function (e) {
                window.setTimeout(e, 1e3 / 60)
            }
        }(), $(".input_key").on("focus", function () {
            o || (v(), o = !0, p());
            var e = $(this.form),
                t = -20,
                n = -44;
            i.appendTo(e), e.attr("name") == "f3" && ($("body").hasClass("layout1") ? t = 97 : t = -20), i.css({
                left: t,
                top: n
            })
        }).on("keydown", function (e) {
            var t = $(this.form);
            if (!(this.selectionStart >= 0 && r)) return;
            var n = this.selectionStart,
                i = this.value.substring(0, n).replace(/ /g, "&nbsp;"),
                s = r.html(i).width(),
                o = 0;
            i.length > c ? o = -2 : o = 2, c = i.length, s >= 500 && (s = 500);
            var a = f;
            while (a--) u.push(new h(s + 50, 60, o));
            //  这里是控制输入框都抖动的
            t.css({
                "-webkit-transform": "translate(-1px, 1px)",
                "-moz-transform": "translate(-1px, 1px)",
                "-MS-transform": "translate(-1px, 1px)",
                "-o-transform": "translate(-1px, 1px)",
                transform: "translate(-1px, 1px)"
            }),
                setTimeout(function () {
                    t.css({
                        "-webkit-transform": "none",
                        "-moz-transform": "none",
                        "-MS-transform": "none",
                        "-o-transform": "none",
                        transform: "none"
                    })
                }, 10)
        })
    })();
</script>
<script type="text/javascript" src="../../../assets/js/jquery-1.8.3.js"></script>
<script type="text/javascript">
    $(function () {
        var j = 0;
        var liPos = [];//存放li的初始位置
        var myLi = $('.pics').find('li');
        var liWidth = myLi.eq(0).width();
        for (var i = 0; i < myLi.length; i++) {
            liPos[i] = myLi[i].offsetLeft;//存每一个li的位置
        }
        for (var i = 0; i < myLi.length; i++) {
            myLi[i].style.position = 'absolute';
            myLi[i].style.left = liPos[i] + 'px';//不要忘记px
        }
        $('.btn3').find('a').eq(0).on('click', function () {
            var n = 0;
            for (var k = 0; k < myLi.length; k++) {
                if (myLi.eq(k).is(':animated')) {
                    n++;
                }
            }
            if (n == 0) {
                $(this).addClass('active');
                $(this).siblings().removeClass('active');
                $('.caret').animate({left: 315 + 'px'}, 350);
                j = myLi.length - 2;
                myLi.eq(myLi.length - 1).animate({left: liWidth * 7 + 'px', opacity: '0'}, 350);
                var rightGo1 = setInterval(function () {
                    myLi.eq(j).animate({left: liWidth * 7 + 'px', opacity: '0'}, 350);
                    j--;
                    if (j < myLi.length / 2) {
                        clearInterval(rightGo1);
                        picPrev();
                    }
                }, 70);

                function picPrev() {
                    var rightGo2 = setInterval(function () {
                        myLi.eq(j).animate({left: liPos[j] + 'px', opacity: '1'}, 350);
                        j--;
                        if (j < 0) {
                            clearInterval(rightGo2);
                        }
                    }, 70);
                }
            }
        });
        $('.btn3').find('a').eq(1).on('click', function () {
            var n = 0;
            for (var k = 0; k < myLi.length; k++) {
                if (myLi.eq(k).is(':animated')) {
                    n++;
                }
            }
            if (n == 0) {
                $(this).addClass('active');
                $(this).siblings().removeClass('active');
                $('.caret').animate({left: 405 + 'px'}, 350);
                j = 1;
                myLi.eq(0).animate({left: -liWidth * 2 + 'px', opacity: '0'}, 350);
                var leftGo1 = setInterval(function () {
                    myLi.eq(j).animate({left: -liWidth * 2 + 'px', opacity: '0'}, 350);
                    j++;
                    if (j >= myLi.length / 2) {
                        clearInterval(leftGo1);
                        picNext();
                    }
                }, 70);

                function picNext() {
                    var leftGo2 = setInterval(function () {
                        myLi.eq(j).animate({left: liPos[j - myLi.length / 2] + 'px', opacity: '1'}, 350);
                        j++;
                        if (j >= myLi.length) {
                            clearInterval(leftGo2);
                        }
                    }, 70);
                }
            }
        });
    });

</script>
<script src="../../../assets2/dist/scripts/Vidage.min.js"></script>
<script>
    new Vidage('#VidageVideo');
</script>
<script src="../../../assets5/js/script.js"></script>
<script src="../../../assets4/js/myfocus-2.0.4.min.js"></script>
<script>
    myFocus.set({
        id: 'boxID',
        pattern: 'mF_fancy',//风格应用的名称 mF_fancy
        time: 3,//切换时间间隔(秒)
        trigger: 'click',//触发切换模式:'click'(点击)/'mouseover'(悬停)
        width: 400,//设置图片区域宽度(像素)
        height: 220,//设置图片区域高度(像素)
        txtHeight: '35'//文字层高度设置(像素),'default'为默认高度，0为隐藏
    });

    function deleteByProdId(id) {
        if (confirm('确实要删除吗?')) {
            $.ajax({
                url: "/manage/prod/prod/deleteProductById",
                type: "get",
                data: {"id": id},
                dataType: 'json',
                success: function (data) {
                    if (data.msg == "ok") {
                        alert("删除成功！")
                        window.location.href = "/manage/prod/list";
                    } else {
                        alert("删除失败！")
                    }
                }
            })
        }
    }
</script>
</body>
</html>

