<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8"> 
<html lang="zxx">
    <head>
        <!-- Meta Tag -->
        <meta charset="utf-8">
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name='copyright' content=''>
        <meta http-equiv="X-UA-Compatible" content="IE=edge">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
        <!-- Title Tag  -->
        <title>Eshop - eCommerce HTML5 Template.</title>
        <!-- Favicon -->
        <link rel="icon" type="image/png" href="images/favicon.png">
        <!-- Web Font -->
        <link href="https://fonts.googleapis.com/css?family=Poppins:200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap" rel="stylesheet">

        <!-- StyleSheet -->

        <!-- Bootstrap -->
        <link rel="stylesheet" href="css/bootstrap.css">
        <!-- Magnific Popup -->
        <link rel="stylesheet" href="css/magnific-popup.min.css">
        <!-- Font Awesome -->
        <link rel="stylesheet" href="css/font-awesome.css">
        <!-- Fancybox -->
        <link rel="stylesheet" href="css/jquery.fancybox.min.css">
        <!-- Themify Icons -->
        <link rel="stylesheet" href="css/themify-icons.css">
        <!-- Nice Select CSS -->
        <link rel="stylesheet" href="css/niceselect.css">
        <!-- Animate CSS -->
        <link rel="stylesheet" href="css/animate.css">
        <!-- Flex Slider CSS -->
        <link rel="stylesheet" href="css/flex-slider.min.css">
        <!-- Owl Carousel -->
        <link rel="stylesheet" href="css/owl-carousel.css">
        <!-- Slicknav -->
        <link rel="stylesheet" href="css/slicknav.min.css">

        <!-- Eshop StyleSheet -->
        <link rel="stylesheet" href="css/reset.css">
        <link rel="stylesheet" href="css/style.css">
        <link rel="stylesheet" href="css/responsive.css">
        <%--<jsp:useBean id="p" class="dao.D"></jsp:useBean>--%>
        <jsp:useBean id="p" class="dao.DAO"></jsp:useBean>


        </head>
        <body class="js">

            <!-- Preloader -->
            <div class="preloader">
                <div class="preloader-inner">
                    <div class="preloader-icon">
                        <span></span>
                        <span></span>
                    </div>
                </div>
            </div>
            <!-- End Preloader -->


            <!-- Header -->
        <jsp:include page="header.jsp"></jsp:include>
            <!--/ End Header -->
            <header class="header shop">
                <!-- Header Inner -->
                <div class="header-inner">
                    <div class="container">
                        <div class="cat-nav-head">
                            <div class="row">

                                <div class="col-lg-9 col-12">
                                    <div class="menu-area">
                                        <!-- Main Menu -->
                                        <nav class="navbar navbar-expand-lg">
                                            <div class="navbar-collapse">	
                                                <div class="nav-inner">	
                                                    <ul class="nav main-menu menu navbar-nav">

                                                        <li class="active"><a href="index.jsp">Trang chủ</a></li>
                                                        <li><a href="shop">Sản phẩm</a></li>	
                                                        <li><a href="cart.jsp">Giỏ hàng</a></li>	
                                                        <!--<li><a href="checkout.jsp">Thanh toán</a></li>-->	
                                                        <li><a href="blog-single-sidebar.jsp">Blog</a></li>	
                                                        <li><a href="contact.jsp">Liên hệ</a></li>

                                                    </ul>
                                                </div>
                                            </div>
                                        </nav>
                                        <!--/ End Main Menu -->	
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--/ End Header Inner -->
            </header>

            <!-- Slider Area -->
            <section class="hero-slider" >
                <!-- Single Slider -->
                <div class="single-slider" >
                    <img src="images/anhnen.jpeg" width="1900" height="700"/>

                    <div class="container">
                        <div class="row no-gutters">
                            <div class="col-lg-9 offset-lg-3 col-12">
                                <div class="text-inner">
                                    <div class="row">
                                        <div class="col-lg-7 col-12">
                                            <div class="hero-text" >

                                                <h1><span>UP TO 50% OFF </span>Shirt For Man</h1>
                                                <p>Luôn đồng hành cùng quý ông quý bà <br> trên mọi nẻo đường <br> Do cách bạn chọn</p>
                                                <div class="button">
                                                    <a href="shop" class="btn">Mua ngay!</a>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <!--/ End Single Slider -->
            </section>
            <!--/ End Slider Area -->

            <!-- Start Small Banner  -->

            <!-- End Small Banner -->

            <!-- Start Product Area -->
            <div class="product-area section">
                <div class="container">
                    <div class="row">
                        <div class="col-12">
                            <div class="section-title">
                                <h2>Trending Item</h2>
                            </div>
                        </div>
                    </div>
                    <div class="row">
                        <div class="col-12">
                            <div class="product-info">
                                <!--                            <div class="nav-main">
                                                                 Tab Nav 
                                                                <ul class="nav nav-tabs" id="myTab" role="tablist">
                                                                    <li class="nav-item"><a class="nav-link active" data-toggle="tab" href="#man" role="tab">All Categories</a></li>
                            <c:forEach items="${p.allCate}" var="o">
                                <li class="nav-item"><a class="nav-link" role="tab" data-toggle="tab" href="cart?pid=#${o.cid}" >${o.cname}</a></li>
                            </c:forEach>
                        <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#women" role="tab">Woman</a></li>
                                                                                                <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#kids" role="tab">Kids</a></li>
                                                                                                <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#accessories" role="tab">Accessories</a></li>
                                                                                                <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#essential" role="tab">Essential</a></li>
                                                                                                <li class="nav-item"><a class="nav-link" data-toggle="tab" href="#prices" role="tab">Prices</a></li>
                    </ul>
                    / End Tab Nav 
                </div>-->

                            <div class="tab-content" id="myTabContent">
                                <!-- Start Single Tab -->

                                <div class="tab-pane fade show active" id="man" role="tabpanel">
                                    <div class="tab-single">
                                        <div  class="row">
                                            <c:forEach items="${p.allProduct}" var="n">
                                                <div class="col-xl-3 col-lg-4 col-md-4 col-12">

                                                    <div class="single-product">

                                                        <div class="product-img">
                                                            <a href="detail?pid=${n.id}">
                                                                <img class="default-img" src="${n.img}" alt="#">
                                                                <img class="hover-img" src="${n.img2}" alt="#">
                                                            </a>
                                                            <div class="button-head">
                                                                <div class="product-action">
                                                                    <!--<a data-toggle="modal" data-target="#exampleModal" title="Quick View" href="quick?pid=${n.id}"><i class=" ti-eye"></i><span>Quick Shop</span></a>-->
                                                                    <!--                                                                    <a title="Wishlist" href="#"><i class=" ti-heart "></i><span>Add to Wishlist</span></a>
                                                                                                                                        <a title="Compare" href="#"><i class="ti-bar-chart-alt"></i><span>Add to Compare</span></a>-->
                                                                </div>
                                                                <div class="product-action-2">
                                                                    <a title="Add to cart" href="buy?pid=${n.id}">Add to cart</a>
                                                                </div>
                                                            </div>
                                                        </div>
                                                        <div class="product-content">
                                                            <h3><a href="detail?pid=${n.id}">${n.pname}</a></h3>
                                                            <div class="product-price">
                                                                <span>${n.price}00VND</span>
                                                            </div>
                                                        </div>

                                                    </div>

                                                </div>
                                            </c:forEach>
                                        </div>
                                    </div>
                                </div>
                                <%--<c:forEach items="${listP}" var="p">--%>            
                                <div class="tab-pane fade" id="" role="tabpanel">
                                    <div class="tab-single"> 
                                        <div class="row">
                                            <div class="col-xl-3 col-lg-4 col-md-4 col-12">
                                                <div class="single-product">
                                                    <div class="product-img">
                                                        <a href="product-details.html">
                                                            <img class="default-img" src="" alt="#">
                                                            <img class="hover-img" src="https://via.placeholder.com/550x750" alt="#">
                                                            <span class="out-of-stock">Hot</span>
                                                        </a>
                                                        <div class="button-head">
                                                            <!--                                                            <div class="product-action">
                                                                                                                            <a data-toggle="modal" data-target="#exampleModal" title="Quick View" href="#"><i class=" ti-eye"></i><span>Quick Shop</span></a>
                                                                                                                            <a title="Wishlist" href="#"><i class=" ti-heart "></i><span>Add to Wishlist</span></a>
                                                                                                                            <a title="Compare" href="#"><i class="ti-bar-chart-alt"></i><span>Add to Compare</span></a>
                                                                                                                        </div>-->
                                                            <div class="product-action-2">
                                                                <a title="Add to cart" href="#">Add to cart</a>
                                                            </div>
                                                        </div>
                                                    </div>
                                                    <div class="product-content">
                                                        <h3><a href="product-details.html">Black Sunglass For Women</a></h3>
                                                        <div class="product-price">
                                                            <span class="old">$60.00</span>
                                                            <span>$50.00</span>
                                                        </div>
                                                    </div>
                                                </div>
                                            </div>

                                        </div>

                                    </div>
                                </div>
                                <%--</c:forEach>--%>
                                <!--/ End Single Tab -->
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- End Product Area -->

        <!-- Start Midium Banner  -->

        <!-- End Midium Banner -->

        <!-- Start Most Popular -->
        <hr>

        <div class="product-area most-popular section">
            <div class="container">
                <div class="row">
                    <div class="col-12">
                        <div class="section-title">
                            <h2>Hot Item</h2>
                        </div>
                    </div>
                </div>
                <div class="row">

                    <div class="col-12">

                        <div class="owl-carousel popular-slider">
                            <!-- Start Single Product -->
                            <c:forEach items="${p.hotItems}" var="o">
                                <div class="single-product">
                                    <div class="product-img">
                                        <a href="detail?pid=${o.id}">
                                            <img class="default-img" src="${o.img}" alt="#">
                                            <img class="hover-img" src="${o.img2}" alt="#">
                                        </a>
                                        <div class="button-head">
                                            <!--                                            <div class="product-action">
                                                                                            <a data-toggle="modal" data-target="#exampleModal" title="Quick View" href="#"><i class=" ti-eye"></i><span>Quick Shop</span></a>
                                                                                            <a title="Wishlist" href="#"><i class=" ti-heart "></i><span>Add to Wishlist</span></a>
                                                                                            <a title="Compare" href="#"><i class="ti-bar-chart-alt"></i><span>Add to Compare</span></a>
                                                                                        </div>-->
                                            <div class="product-action-2">
                                                <a title="Add to cart" href="buy?pid=${o.id}">Add to cart</a>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="product-content">
                                        <h3><a href="detail?pid=${o.id}">${o.pname}</a></h3>
                                        <div class="product-price">
                                            <span>${o.price}00VND</span>
                                        </div>
                                    </div>
                                </div>
                            </c:forEach>
                            <!-- End Single Product -->
                        </div>

                    </div>

                </div>
            </div>
        </div>
        <!-- End Most Popular Area -->

        <!-- Start Shop Home List  -->

        <!-- End Shop Home List  -->

        <!-- Start Cowndown Area -->
        <section class="cown-down">
            <div class="section-inner ">
                <div class="container-fluid">
                    <div class="row">
                        <%--<c:forEach items="${p.saleMax}" var="j">--%>
                        <div class="col-lg-6 col-12 padding-right">
                            <div class="image">
                                <!--<img src="images/combo.jpg" alt=""/>-->
                                <img src="${p.saleMax.img}" alt="#">
                            </div>	
                        </div>	

                        <div class="col-lg-6 col-12 padding-left">
                            <div class="content">
                                <div class="heading-block">
                                    <p class="small-title">Deal of day</p>
                                    <h3 class="title">${p.saleMax.pname}</h3>
                                    <p class="text">${p.saleMax.desc} </p>
                                    <h1 class="price">$1200 <s>${p.saleMax.price}</s></h1>
                                    <div class="coming-time">
                                        <div class="clearfix" data-countdown="2021/03/30"></div>
                                    </div>
                                </div>
                            </div>	
                        </div>	
                        <%--</c:forEach>--%>
                    </div>
                </div>
            </div>
        </section>
        <!-- /End Cowndown Area -->

        <!-- Start Shop Blog  -->
        <!--        <section class="shop-blog section">
                    <div class="container">
                        <div class="row">
                            <div class="col-12">
                                <div class="section-title">
                                    <h2>From Our Blog</h2>
                                </div>
                            </div>
                        </div>
                        <div class="row">
                            <div class="col-lg-4 col-md-6 col-12">
                                 Start Single Blog  
                                <div class="shop-single-blog">
                                    <img src="https://via.placeholder.com/370x300" alt="#">
                                    <div class="content">
                                        <p class="date">22 July , 2020. Monday</p>
                                        <a href="#" class="title">Sed adipiscing ornare.</a>
                                        <a href="#" class="more-btn">Continue Reading</a>
                                    </div>
                                </div>
                                 End Single Blog  
                            </div>
                            <div class="col-lg-4 col-md-6 col-12">
                                 Start Single Blog  
                                <div class="shop-single-blog">
                                    <img src="https://via.placeholder.com/370x300" alt="#">
                                    <div class="content">
                                        <p class="date">22 July, 2020. Monday</p>
                                        <a href="#" class="title">Manâs Fashion Winter Sale</a>
                                        <a href="#" class="more-btn">Continue Reading</a>
                                    </div>
                                </div>
                                 End Single Blog  
                            </div>
                            <div class="col-lg-4 col-md-6 col-12">
                                 Start Single Blog  
                                <div class="shop-single-blog">
                                    <img src="https://via.placeholder.com/370x300" alt="#">
                                    <div class="content">
                                        <p class="date">22 July, 2020. Monday</p>
                                        <a href="#" class="title">Women Fashion Festive</a>
                                        <a href="#" class="more-btn">Continue Reading</a>
                                    </div>
                                </div>
                                 End Single Blog  
                            </div>
                        </div>
                    </div>
                </section>-->
        <!-- End Shop Blog  -->

        <!-- Start Shop Services Area -->
        <section class="shop-services section home">
            <div class="container">
                <div class="row">
                    <div class="col-lg-3 col-md-6 col-12">
                        <!-- Start Single Service -->
                        <div class="single-service">
                            <i class="ti-rocket"></i>
                            <h4>Miễn phí vận chuyển</h4>
                            <p>Cho hóa đơn trên 100$</p>
                        </div>
                        <!-- End Single Service -->
                    </div>
                    <div class="col-lg-3 col-md-6 col-12">
                        <!-- Start Single Service -->
                        <div class="single-service">
                            <i class="ti-reload"></i>
                            <h4>Miễn phí hoàn về</h4>
                            <p>trong vòng 3 ngày</p>
                        </div>
                        <!-- End Single Service -->
                    </div>
                    <div class="col-lg-3 col-md-6 col-12">
                        <!-- Start Single Service -->
                        <div class="single-service">
                            <i class="ti-lock"></i>
                            <h4>An toàn tiện lợi</h4>
                            <p>100% bằng thẻ</p>
                        </div>
                        <!-- End Single Service -->
                    </div>
                    <div class="col-lg-3 col-md-6 col-12">
                        <!-- Start Single Service -->
                        <div class="single-service">
                            <i class="ti-tag"></i>
                            <h4>Giá tốt nhất</h4>
                            <p>giá hời toàn thị trường</p>
                        </div>
                        <!-- End Single Service -->
                    </div>
                </div>
            </div>
        </section>
        <!-- End Shop Services Area -->
        <!-- Modal -->
        <div class="modal fade" id="exampleModal" tabindex="-1" role="dialog">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span class="ti-close" aria-hidden="true"></span></button>
                    </div>
                    <div class="modal-body">
                        <div class="row no-gutters">
                            <div class="col-lg-6 col-md-12 col-sm-12 col-xs-12">
                                <!-- Product Slider -->
                                <div class="product-gallery">
                                    <div class="quickview-slider-active">
                                        <div class="single-slider">
                                            <img src="https://via.placeholder.com/569x528" alt="#">
                                        </div>
                                        <div class="single-slider">
                                            <img src="https://via.placeholder.com/569x528" alt="#">
                                        </div>
                                        <div class="single-slider">
                                            <img src="https://via.placeholder.com/569x528" alt="#">
                                        </div>
                                        <div class="single-slider">
                                            <img src="https://via.placeholder.com/569x528" alt="#">
                                        </div>
                                    </div>
                                </div>
                                <!-- End Product slider -->
                            </div>
                            <div class="col-lg-6 col-md-12 col-sm-12 col-xs-12">
                                <div class="quickview-content">
                                    <h2>Flared Shift Dress</h2>
                                    <div class="quickview-ratting-review">
                                        <div class="quickview-ratting-wrap">
                                            <div class="quickview-ratting">
                                                <i class="yellow fa fa-star"></i>
                                                <i class="yellow fa fa-star"></i>
                                                <i class="yellow fa fa-star"></i>
                                                <i class="yellow fa fa-star"></i>
                                                <i class="fa fa-star"></i>
                                            </div>
                                            <a href="#"> (1 customer review)</a>
                                        </div>
                                        <div class="quickview-stock">
                                            <span><i class="fa fa-check-circle-o"></i> in stock</span>
                                        </div>
                                    </div>
                                    <h3>${quickProduct.price}</h3>
                                    <div class="quickview-peragraph">
                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia iste laborum ad impedit pariatur esse optio tempora sint ullam autem deleniti nam in quos qui nemo ipsum numquam.</p>
                                    </div>
                                    <div class="size">
                                        <div class="row">
                                            <div class="col-lg-6 col-12">
                                                <h5 class="title">Size</h5>
                                                <select>
                                                    <option selected="selected">s</option>
                                                    <option>m</option>
                                                    <option>l</option>
                                                    <option>xl</option>
                                                </select>
                                            </div>
                                            <div class="col-lg-6 col-12">
                                                <h5 class="title">Color</h5>
                                                <select>
                                                    <option selected="selected">orange</option>
                                                    <option>purple</option>
                                                    <option>black</option>
                                                    <option>pink</option>
                                                </select>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="quantity">
                                        <!-- Input Order -->
                                        <div class="input-group">
                                            <div class="button minus">
                                                <button type="button" class="btn btn-primary btn-number" disabled="disabled" data-type="minus" data-field="quant[1]">
                                                    <i class="ti-minus"></i>
                                                </button>
                                            </div>
                                            <input type="text" name="quant[1]" class="input-number"  data-min="1" data-max="1000" value="1">
                                            <div class="button plus">
                                                <button type="button" class="btn btn-primary btn-number" data-type="plus" data-field="quant[1]">
                                                    <i class="ti-plus"></i>
                                                </button>
                                            </div>
                                        </div>
                                        <!--/ End Input Order -->
                                    </div>
                                    <div class="add-to-cart">
                                        <a href="#" class="btn">Add to cart</a>
                                        <a href="#" class="btn min"><i class="ti-heart"></i></a>
                                        <a href="#" class="btn min"><i class="fa fa-compress"></i></a>
                                    </div>
                                    <div class="default-social">
                                        <h4 class="share-now">Share:</h4>
                                        <ul>
                                            <li><a class="facebook" href="#"><i class="fa fa-facebook"></i></a></li>
                                            <li><a class="twitter" href="#"><i class="fa fa-twitter"></i></a></li>
                                            <li><a class="youtube" href="#"><i class="fa fa-pinterest-p"></i></a></li>
                                            <li><a class="dribbble" href="#"><i class="fa fa-google-plus"></i></a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- Modal end -->

        <!-- Start Footer Area -->
        <footer class="footer">
            <!-- Footer Top -->
            <div class="footer-top section">
                <div class="container">
                    <div class="row">
                        <div class="col-lg-5 col-md-6 col-12">
                            <!-- Single Widget -->
                            <div class="single-footer about">
                                <div class="logo">

                                    <a href="index.html"><img src="images/logo.png" alt="#"></a>
                                </div>
                                <p class="text">Thu đến và đi như những gì đã sắp đặt, trang giấy trắng đâu thể mờ đi từng màu buồn của nắng. Giống như cách bạn trắng tay khi mua sản phẩm bên tôi.</p>
                                <p class="call">Hãy liên hệ với chúng tôi 24/7.<span><a href="tel:123456789">+0123 456 789</a></span></p>
                            </div>
                            <!-- End Single Widget -->
                        </div>
                        <div class="col-lg-2 col-md-6 col-12">
                            <!-- Single Widget -->

                            <!-- End Single Widget -->
                        </div>
                        <div class="col-lg-2 col-md-6 col-12">
                            <!-- Single Widget -->

                            <!-- End Single Widget -->
                        </div>
                        <div class="col-lg-3 col-md-6 col-12">
                            <!-- Single Widget -->
                            <div class="single-footer social">
                                <h4>Liên lạc</h4>
                                <!-- Single Widget -->
                                <div class="contact">
                                    <ul>
                                        <li>Đại học Kinh Tế FBT</li>
                                        <li>Khu công nghệ cao Hòa Lạc</li>
                                        <li>fpt@fpt.com</li>
                                        <li>+032 3456 7890</li>
                                    </ul>
                                </div>
                                <!-- End Single Widget -->
                                <ul>
                                    <li><a href="#"><i class="ti-facebook"></i></a></li>
                                    <li><a href="#"><i class="ti-twitter"></i></a></li>
                                    <li><a href="#"><i class="ti-flickr"></i></a></li>
                                    <li><a href="https://www.instagram.com/ducquangg1412/"><i class="ti-instagram"></i></a></li>
                                </ul>
                            </div>
                            <!-- End Single Widget -->
                        </div>
                    </div>
                </div>
            </div>
            <!-- End Footer Top -->
            <div class="copyright">
                <div class="container">
                    <div class="inner">
                        <div class="row">
                            <div class="col-lg-6 col-12">
                                <div class="left">
                                    <p>Copyright Â©SSSusterSSS 2020 <a href="https://ssstutter.com/" target="_blank">SSSusterSSS&Look</a>  -  All Rights Reserved.</p>
                                </div>
                            </div>
                            <div class="col-lg-6 col-12">
                                <div class="right">
                                    <img src="images/payments.png" alt="#">
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </footer>
        <!-- /End Footer Area -->
        <script src="jquery-3.5.1.min.js"></script>

        <!-- Jquery -->
        <script src="js/jquery.min.js"></script>
        <script src="js/jquery-migrate-3.0.0.js"></script>
        <script src="js/jquery-ui.min.js"></script>
        <!-- Popper JS -->
        <script src="js/popper.min.js"></script>
        <!-- Bootstrap JS -->
        <script src="js/bootstrap.min.js"></script>
        <!-- Color JS -->
        <script src="js/colors.js"></script>
        <!-- Slicknav JS -->
        <script src="js/slicknav.min.js"></script>
        <!-- Owl Carousel JS -->
        <script src="js/owl-carousel.js"></script>
        <!-- Magnific Popup JS -->
        <script src="js/magnific-popup.js"></script>
        <!-- Waypoints JS -->
        <script src="js/waypoints.min.js"></script>
        <!-- Countdown JS -->
        <script src="js/finalcountdown.min.js"></script>
        <!-- Nice Select JS -->
        <script src="js/nicesellect.js"></script>
        <!-- Flex Slider JS -->
        <script src="js/flex-slider.js"></script>
        <!-- ScrollUp JS -->
        <script src="js/scrollup.js"></script>
        <!-- Onepage Nav JS -->
        <script src="js/onepage-nav.min.js"></script>
        <!-- Easing JS -->
        <script src="js/easing.js"></script>
        <!-- Active JS -->
        <script src="js/active.js"></script>
    </body>
</html>