<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/1/4
  Time: 3:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt" %>
<html lang="en">
<head>
    <!-- Required meta tags-->
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <meta name="description" content="au theme template">
    <meta name="author" content="Hau Nguyen">
    <meta name="keywords" content="au theme template">

    <!-- Title Page-->
    <title>首页</title>

    <!-- Fontfaces CSS-->
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
    <link rel="shortcut icon" href="assets8/img/favicon.png" type="image/x-icon">

    <!-- Stylesheets -->
    <link rel="stylesheet" href="assets8/css/style.css">
    <link rel="stylesheet" href="assets8/css/responsive.css">
    <link rel="stylesheet" href="assets/css/swiper.min.css">
    <link rel="stylesheet" type="text/css" href="../../assets8/css/default.css">


    <style>


        /*@import url(https://fonts.googleapis.com/css?family=Montserrat);*/

        li {
            list-style-type: none;
        }

        .grid {
            float: left;
            width: 980px;
            margin: 0 auto;
        }

        .grid > li {
            width: 285px;
            height: 500px;
            overflow: hidden;
            float: left;
            margin: 20px 0 20px 30px;
            position: relative;
        }

        .grid > li:hover {
            box-shadow: 0 0 15px 0 rgba(0, 0, 0, 0.5);
        }


        .grid > li section {
            position: relative;
            transition: all 0.25s;
            width: 100%;
        }

        .grid > li h2 {
            font: bold 14px montserrat;
            color: #fff;
            text-transform: uppercase;
            position: absolute;
            text-align: center;
            width: 60%;
            left: 20%;
            top: 100px;
            padding: 10px 0;
            border: 2px solid white;
            border-radius: 4px;
        }


        .sidenav {
            position: absolute;
            top: 0;
            left: 0;
            bottom: 0;
            background: linear-gradient(rgba(50, 60, 60, 1), rgba(50, 60, 60, 0.7));
            width: 50px;
            transition: all 0.25s;
            overflow: hidden;
            padding-top: 100px;
        }

        .sidenav li {
            _overflow: hidden;
            width: 150px;
        }

        .sidenav a {
            text-decoration: none;
            color: #eee;
            display: block;
            line-height: 48px;
        }

        .sidenav span {
            display: block;
        }

        .sidenav b {
            padding-left 10px;
            display: block;
            color: white;
            /*font-family: Montserrat, serif;*/
            font-size: 12px;
            line-height: 4;
            opacity: 0;
        }

        .sidenav a i {
            display: block;
            float: left;
            font-size: 16px;
            line-height: 48px;
            width: 50px;
            text-align: center;
        }


        /*All instances*/

        .grid > li:hover .sidenav {
            width: 150px;
        }

        .grid > li:hover section {
            margin-left: 150px;
        }

        .grid > li:hover b {
            opacity: 1;
        }


        .sidenav li:nth-child(1) b,
        .sidenav li:nth-child(1) a {
            transition-delay: .08s;
        }

        .sidenav li:nth-child(2) b,
        .sidenav li:nth-child(2) a {
            transition-delay: .16s;
        }

        .sidenav li:nth-child(3) b,
        .sidenav li:nth-child(3) a {
            transition-delay: .24s;
        }

        .sidenav li:nth-child(4) b,
        .sidenav li:nth-child(4) a {
            transition-delay: .32s;
        }

        .sidenav li:nth-child(5) b,
        .sidenav li:nth-child(5) a {
            transition-delay: .40s;
        }

        .sidenav li:nth-child(6) b,
        .sidenav li:nth-child(6) a {
            transition-delay: .48s;
        }


        /*Three*/

        .three .w {
            transform: perspective(100px) translateZ(-24px);
        }

        .three b {
            transform: perspective(100px) rotateY(180deg) translateZ(24px) scale(0.5);
        }

        .three:hover b {
            transform: perspective(100px) rotateY(0) translateZ(24px) scale(1);
            transition: all 0.8s cubic-bezier(0.175, 0.885, 0.32, 1.275);
            background: transparent;
        }

        .three .sidenav {
            width: 150px;
        }


        /*Two*/

        .two .w {
            transform: perspective(100px) translateZ(-24px);
        }

        .two b {
            transform: perspective(100px) rotateX(90deg) translateZ(24px) scale(1.5);
            opacity: 0;
        }

        .two:hover b {
            transform: perspective(100px) rotateX(0) translateZ(24px) scale(1);
            transition: all .4s;
            opacity: 1;
        }

        .two .sidenav {
            width: 150px;
        }


        /*One*/

        .one .w {
            transform: perspective(100px);
        }

        .one b {
            transform: perspective(100px) rotateY(90deg);
            _opacity: 0;
            transform-origin: left center;
            _border: 1px solid white;
        }

        .one:hover b {
            transform: perspective(100px) rotateX(0);
            transition: all .4s;
            opacity: 1;
        }

        .one .sidenav {
            width: 150px;
        }

        .one .sidenav span {
            float: left;
            width: 100px;
        }


        body {
            position: relative;
            height: 500px;
            width: 1000px;
            margin: auto;
        }

        body {
            /* background: #000; */
            font-family: Helvetica Neue, Helvetica, Arial, sans-serif;
            font-size: 14px;
            color: #000;
            margin: 0;
            padding: 0;
        }

        .swiper-container {
            width: 100%;
            /*height: 00px;*/
            margin-left: auto;
            margin-right: auto;
            transform: translate(500px, 150px);
        }

        .swiper-slide {
            background-size: cover;
            background-position: center;
        }

        .gallery-top {
            height: 80%;
            width: 100%;
        }

        .gallery-thumbs {
            height: 20%;
            box-sizing: border-box;
            padding: 10px 0;
        }

        .gallery-thumbs .swiper-slide {
            height: 100%;
            opacity: 0.4;
        }

        .gallery-thumbs .swiper-slide-thumb-active {
            opacity: 1;
        }

        .text {
            position: relative;
            z-index: 999;
            transform: translateY(-25px);
        }

        .img-fluid img {
            z-index: -10;
        }

        .navbar-sidebar {
            position: relative;
            width: 2000px;
            height: 1000px;
            transform: translate(0px, 10px);
            /*background-color: pink;*/

        }

        .page-container {
            position: absolute;
            background-color: #fff;
        }

        .product {
            width: 1px;

            background-color: p;
        }

        .product #max {
            /*background-color: #f5f5f5;*/
            width: 1px !important;
            height: 1px;
            background-color: #fcfdff;
        }

        #bbn {
            width: 100px;
            height: 40px;
            transform: translate(340px, -55px);
        }

        .product-action {
            z-index: -9999;
        }

        .hero-section {
            width: 2100px;
        }


        #logo {
            width: 200px;
            height: 80px;
        }

        #thing {
            transform: translate(230px);
        }


    </style>

</head>

<body>
<header class="main-header">
    <div class="container">
        <div class="header-inner">
            <div class="logo">
                <a href="index.jsp"><img src="index/yg.png" alt="Main Logo" id="logo"></a>
            </div>


            <form action="/" class="menu-search">
                <select name="searchKey" id="cate">
                    <c:forEach items="${easybuyProductVo.easybuyCategorList}" var="easy">
                        <option value="${easy.id}">${easy.name}</option>
                    </c:forEach>
                </select>
                <input type="search" id="searchKeyValue" name="searchKeyValue" placeholder="Search" required>
                <button type="submit" onclick="searchProduct()">Search</button>
            </form>

        </div>
    </div>
    <div class="collection-close"></div>
</header>


<section class="hero-section">
    <div class="hero-slider">

        <!-- hero-slide-item -->
        <div class="hero-slide-item" style="background-image:url(assets8/img/hero/bg1.jpg);">
            <div class="container">
                <div class="hero-inner">
                    <h1 class="mb-20 light">易购 ，<span>改变</span> 你的生活 <span> Gou! </span> com</h1>
                    <p class="mb-40 mr-120 light">勇敢，是当你知道注定会输而依然要去那么做~</p>
                    <div class="hero-btn">
                        <a href="/" class="theme-btn">首 页</a>
                    </div>
                </div>

            </div>
        </div>
    </div>
</section>

<nav class="navbar-sidebar" style="">
    <%--    <ul id="nav-categroy" class="list-unstyled navbar__list" style="width: 200px;float: left;">--%>
    <%--        <ul class="list-unstyled navbar__sub-list js-sub-list">--%>
    <%--            <c:forEach items="${level.level1}" var="l1">--%>
    <%--                <li class="has-sub">--%>
    <%--                <a class="js-arrow open" href="#">--%>
    <%--                    <i class="fas fa-table"></i>--%>
    <%--                        ${l1.name}--%>
    <%--                </a>--%>
    <%--                <c:forEach items="${level.level2}" var="l2">--%>
    <%--                    <c:if test="${l2.parentid==l1.id}">--%>
    <%--                        <li><a href="/prod/search?c=' + data.level2[i].id + '">${l2.name}</a>--%>
    <%--                            <ul class="list-unstyled navbar__sub-list js-sub-list">--%>
    <%--                            </ul>--%>
    <%--                        </li>--%>
    <%--                    </c:if>--%>
    <%--                </c:forEach>--%>
    <%--                </li>--%>
    <%--            </c:forEach>--%>
    <%--        </ul>--%>
    <%--    </ul>--%>
    <ul class="grid" style="width: 50px;height:1000px ;transform: translate(-55px,100px)">
        <li class="three" style="height: 500px">
            <ul class="sidenav" style="height: 500px">
                <li><a><i class="fa fa-check"></i><span class="w"><b>化妆品</b></span></a></li>
                <li><a><i class="fa fa-inbox"></i><span class="w"><b>进口食品</b></span></a></li>
                <li><a><i class="fa fa-pencil"></i><span class="w"><b>海鲜</b></span></a></li>
                <li><a><i class="fa fa-cog"></i><span class="w"><b>电脑</b></span></a></li>
                <li><a><i class="fa fa-star"></i><span class="w"><b>保健食品</b></span></a></li>
                <li><a><i class="fa fa-power-off"></i><span class="w"><b>零食，糖果</b></span></a></li>
            </ul>
            <section style="height: 500px">
                <h2 style="color: palevioletred;font-size: 24px; transform: translateY(-110px)">今日商品推荐</h2>
                <img style="height: 500px" src="../../assets8/img/sp.jpg"/>
            </section>
        </li>
    </ul>

    <ul class="list-unstyled navbar__list" id="thing">
        <c:if test="${empty easybuyProductVo.easybuyProductList}">
            <span>没有查询到商品信息！<a href="/">返回首页</a></span>
        </c:if>

        <c:forEach items="${easybuyProductVo.easybuyProductList}" var="ep">
            <li style="margin-right: 20px;float: left;" id="min">
                <div class="overview-box clearfix">
                    <a href="/prod/' + data.easybuyProductList[i].id + '">
                        <div class="img-fluid">
                            <img src="${ep.filename}" style="width: 380px;height: 200px">
                        </div>
                        <div class="text" style="margin-top: -50px;margin-left: 10px;">
                            <h2>￥${ep.price}</h2>
                            <span style="color: #fff;font-size: 24px"> ${ep.name}</span>
                        </div>
                    </a>
                    <div class="product" style="width: 120px;height: 23px">
                        <div class="product-action">
                            <a class="add-to-btn small-btn"
                               style="width: 100px;height: 25px;position: relative;top: -30px;left: -100px;" id="bbn">
                                <i class="flaticon-shopping-cart"></i>
                                <span id="car" style="cursor: pointer"
                                      onclick="addShoppingCart(${ep.id})">加入购物车</span>
                            </a>
                        </div>
                    </div>
                </div>
            </li>
        </c:forEach>
    </ul>
</nav>


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
<!-- jequery plugins -->
<script src="${pageContext.request.contextPath}/assets8/js/jquery.min.js"></script>
<script src="${pageContext.request.contextPath}/assets8/js/bootstrap-v4.1.3.min.js"></script>
<script src="${pageContext.request.contextPath}/assets8/js/jquery.nice-select.min.js"></script>
<script src="${pageContext.request.contextPath}/assets8/js/jquery.simpleLoadMore.min.js"></script>
<script src="${pageContext.request.contextPath}/assets8/js/slick.min.js"></script>
<script src="${pageContext.request.contextPath}/assets8/js/appear.js"></script>

<!-- Custom script -->
<script src="assets/js/script.js"></script>
<script>
    // $(function () {
    //   load()
    // })

    $(function () {
        $("#nav-categroy > li").click(function () {
            $(this).find("ul").toggle();
        })
    })


    // //加载首页信息的方法
    // function load() {
    //   //获取商品信息
    //   $.getJSON("http://localhost:8080/index/prod", function (data) {
    //     $.each(data.easybuyCategorList,function (i) {
    //       var strs = '<option value='+data.easybuyCategorList[i].id+'>'
    //               +data.easybuyCategorList[i].name
    //               +"</option>"
    //       $("#cate").append(strs);
    //     })
    //
    //     //循环商品信息，拼接html,填充到nav中
    //     $.each(data.easybuyProductList, function (i) {
    //       var prod_li = '<li style="margin-right: 20px" id="min">'
    //               + '<div class="overview-box clearfix">'
    //               + '<a href="/prod/' + data.easybuyProductList[i].id + '">'
    //               + '<div class="img-fluid">'
    //               + '<img src="' + data.easybuyProductList[i].filename + '" style="width: 480px;height: 200px">'
    //               + '</div>'
    //               + '<div class="text" >'
    //               + '<h2>￥' + data.easybuyProductList[i].price + '</h2>'
    //               + '<span style="color: #fff;font-size: 24px">' + data.easybuyProductList[i].name + '</span>'
    //               + ' </div></a>'
    //               // + '<div class="product" style="width: 120px;height: 23px">'
    //               + ' <div class="product product-content-wrap" id="max">'
    //               + '<a href="#" class="add-to-btn small-btn" style="width: 100px;height: 25px" id="bbn">'
    //               + ' <i class="flaticon-shopping-cart"></i>'
    //               + '<span id="car" onclick="addShoppingCart(' + data.easybuyProductList[i].id + ')">加入购物车</span>'
    //               + ' </a>'
    //               + '</div>'
    //               + '</div>'
    //               + '</div>'
    //               + '</div></li>';
    //       $("#prod-list").append(prod_li);
    //     })
    //   })
    //   // //获取新闻
    //   // $.getJSON("http://localhost:8080/index/news",function (data){
    //   //
    //   // })
    //
    //   //获取商品分类，ajax异步加载
    //   $.getJSON("http://localhost:8080/index/categorys", function (data) {
    //     //使用jquery each进行循环，循环level1一级分类
    //     $.each(data.level1, function (index) {
    //       //字符串拼接html
    //       var strl1 = '<li class="has-sub">'
    //               + '<a class="js-arrow open" href="#"><i class="fas fa-table"></i>'
    //               + data.level1[index].name + '</a>'
    //
    //       var strl2 = '<ul class="list-unstyled navbar__sub-list js-sub-list">'
    //       $.each(data.level2, function (i) {
    //         if (data.level2[i].parentid == data.level1[index].id) {
    //           strl2 += '<li><a href="/prod/search?c=' + data.level2[i].id + '">' + data.level2[i].name + '</a></li>'
    //         }
    //       })
    //       strl2 += '</ul>';
    //       strl1 += strl2;
    //       strl1 += '</li>';
    //       $("#nav-categroy").append(strl1);
    //     })
    //
    //     //绑定点击事件，现实下一级

    //   })
    // }


    function addShoppingCart(id) {
        window.location = "/shoppingCart/add?pid=" + id + "&num=1";
    }

</script>
</body>
<script src="assets/js/swiper.min.js"></script>

<!-- Initialize Swiper -->
<script>
    var galleryThumbs = new Swiper('.gallery-thumbs', {
        spaceBetween: 10,
        slidesPerView: 4,
        loop: true,
        freeMode: true,
        loopedSlides: 5, //looped slides should be the same
        watchSlidesVisibility: true,
        watchSlidesProgress: true,
    });
    var galleryTop = new Swiper('.gallery-top', {
        spaceBetween: 10,
        loop: true,
        loopedSlides: 5, //looped slides should be the same
        navigation: {
            nextEl: '.swiper-button-next',
            prevEl: '.swiper-button-prev',
        },
        thumbs: {
            swiper: galleryThumbs,
        },
    });
</script>

</html>
<!-- end document-->




