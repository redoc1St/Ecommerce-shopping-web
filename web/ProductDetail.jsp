<%--<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>


<html lang="zxx">
    <head>
<!--        <link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
        <script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>-->
        <script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link href="css/style.css" rel="stylesheet" type="text/css"/>
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
        <link href="css/detail.css" rel="stylesheet" type="text/css"/>


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
<!-- Header Inner -->
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

                                                        <li><a href="index.jsp">Trang chủ</a></li>
                                                        <li><a href="shop">Sản phẩm</a></li>	
                                                        <li><a href="cart.jsp">Giỏ hàng</a></li>	
                                                        <li><a href="checkout.jsp">Thanh toán</a></li>	
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
            <!--/ End Header Inner -->

        <!-- Slider Area -->
        <br>
        
        <div class="container bootdey">
<div class="col-md-12">
<section class="panel">
      <div class="panel-body">
          <div class="col-md-6">
              <div class="pro-img-details">
                  <img src="${pp.img}" alt="">
              </div>
<!--              <div class="pro-img-list">
                  <a href="#">
                      <img src="${pp.img2}" alt="">
                  </a>
                  <a href="#">
                      <img src="${pp.img2}" alt="">
                  </a>
                  <a href="#">
                      <img src="${pp.img2}" alt="">
                  </a>
                  <a href="#">
                      <img src="${pp.img2}" alt="">
                  </a>
              </div>-->
          </div>
                  <br>
          <div class="col-md-6">
              <h4 class="pro-d-title">
                  <a href="#" class="">
                      ${pp.pname}
                  </a>
              </h4>
              <p>
                  ${pp.desc}
              </p>
              <div class="product_meta">
                  <!--<span class="posted_in"> <strong>Categories:</strong> <a rel="tag" href="#">Jackets</a>, <a rel="tag" href="#">Men</a>, <a rel="tag" href="#">Shirts</a>, <a rel="tag" href="#">T-shirt</a>.</span>-->
                  <span class="tagged_as"><strong>Tags:</strong> <a rel="tag" href="#">mens</a>, <a rel="tag" href="#">womens</a>.</span>
              </div>
              
              <%--<%= //${pp.price}; %>--%>
              <c:if test="${pp.price!=AfterPrice}" >
              <div class="m-bot15" > <strong>Price : </strong> <span class="amount-old">${pp.price}00VND</span>  
                  <span class="pro-price">${AfterPrice}00VND</span></div>
                  </c:if>
              <c:if test="${pp.price==AfterPrice}" >
              <div class="m-bot15" > <strong>Price : </strong>   
                  <span class="pro-price">${AfterPrice}00VND</span></div>
                  </c:if>
              
<!--              <div class="form-group">
                  <label>Quantity</label>
                  <input type="quantiy" placeholder="1" class="form-control quantity">
              </div>-->
              <p>
                  <button class="btn btn-round btn-danger" type="button"><i class="fa fa-shopping-cart" ></i><a href="buy?pid=${pp.id}"> Add to Cart</a></button>
              </p>
          </div>
      </div>
  </section>
  </div>
  </div>
        
       
            <!-- Footer Top -->
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
								<a href="index.html"><img src="https://scontent.xx.fbcdn.net/v/t1.15752-9/154640526_873912376519301_2530168015040702389_n.png?_nc_cat=107&ccb=3&_nc_sid=58c789&_nc_ohc=BTeYTr6OoEUAX-Fmg4M&_nc_ad=z-m&_nc_cid=0&_nc_ht=scontent.xx&oh=fed3d9f0dd690cf4985a1a3b2be5510e&oe=6060A669" alt="#"></a>
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
								<li><a href="#"><i class="ti-instagram"></i></a></li>
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
								<p>Copyright Â© 2020 <a href="http://www.wpthemesgrid.com" target="_blank">Wpthemesgrid</a>  -  All Rights Reserved.</p>
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
