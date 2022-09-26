package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class shop_002dgrid_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_var_items;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_var_items.release();
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\"> \r\n");
      out.write("<html lang=\"zxx\">\r\n");
      out.write("    <head>\r\n");
      out.write("        <!-- Meta Tag -->\r\n");
      out.write("        <meta charset=\"utf-8\">\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name='copyright' content=''>\r\n");
      out.write("        <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\r\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\r\n");
      out.write("        <!-- Title Tag  -->\r\n");
      out.write("        <title>Eshop - eCommerce HTML5 Template.</title>\r\n");
      out.write("        <!-- Favicon -->\r\n");
      out.write("        <link rel=\"icon\" type=\"image/png\" href=\"images/favicon.png\">\r\n");
      out.write("        <!-- Web Font -->\r\n");
      out.write("        <link href=\"https://fonts.googleapis.com/css?family=Poppins:200i,300,300i,400,400i,500,500i,600,600i,700,700i,800,800i,900,900i&display=swap\" rel=\"stylesheet\">\r\n");
      out.write("\r\n");
      out.write("        <!-- StyleSheet -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Bootstrap -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap.css\">\r\n");
      out.write("        <!-- Magnific Popup -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/magnific-popup.min.css\">\r\n");
      out.write("        <!-- Font Awesome -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/font-awesome.css\">\r\n");
      out.write("        <!-- Fancybox -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery.fancybox.min.css\">\r\n");
      out.write("        <!-- Themify Icons -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/themify-icons.css\">\r\n");
      out.write("        <!-- Jquery Ui -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/jquery-ui.css\">\r\n");
      out.write("        <!-- Nice Select CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/niceselect.css\">\r\n");
      out.write("        <!-- Animate CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/animate.css\">\r\n");
      out.write("        <!-- Flex Slider CSS -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/flex-slider.min.css\">\r\n");
      out.write("        <!-- Owl Carousel -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/owl-carousel.css\">\r\n");
      out.write("        <!-- Slicknav -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/slicknav.min.css\">\r\n");
      out.write("\r\n");
      out.write("        <!-- Eshop StyleSheet -->\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/reset.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/style.css\">\r\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/responsive.css\">\r\n");
      out.write("        ");
      out.write("\r\n");
      out.write("        ");
      dao.DAO p = null;
      synchronized (_jspx_page_context) {
        p = (dao.DAO) _jspx_page_context.getAttribute("p", PageContext.PAGE_SCOPE);
        if (p == null){
          p = new dao.DAO();
          _jspx_page_context.setAttribute("p", p, PageContext.PAGE_SCOPE);
        }
      }
      out.write("\r\n");
      out.write("\r\n");
      out.write("        </head>\r\n");
      out.write("        <body class=\"js\">\r\n");
      out.write("\r\n");
      out.write("            <!-- Preloader -->\r\n");
      out.write("            <div class=\"preloader\">\r\n");
      out.write("                <div class=\"preloader-inner\">\r\n");
      out.write("                    <div class=\"preloader-icon\">\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                        <span></span>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- End Preloader -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Header -->\r\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\r\n");
      out.write("            <!--/ End Header -->\r\n");
      out.write("            <header class=\"header shop\">\r\n");
      out.write("                <!-- Header Inner -->\r\n");
      out.write("                <div class=\"header-inner\">\r\n");
      out.write("                    <div class=\"container\">\r\n");
      out.write("                        <div class=\"cat-nav-head\">\r\n");
      out.write("                            <div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                                <div class=\"col-lg-9 col-12\">\r\n");
      out.write("                                    <div class=\"menu-area\">\r\n");
      out.write("                                        <!-- Main Menu -->\r\n");
      out.write("                                        <nav class=\"navbar navbar-expand-lg\">\r\n");
      out.write("                                            <div class=\"navbar-collapse\">\t\r\n");
      out.write("                                                <div class=\"nav-inner\">\t\r\n");
      out.write("                                                    <ul class=\"nav main-menu menu navbar-nav\">\r\n");
      out.write("\r\n");
      out.write("                                                        <li><a href=\"index.jsp\">Trang chủ</a></li>\r\n");
      out.write("                                                        <li class=\"active\"><a href=\"shop\">Sản phẩm</a></li>\t\r\n");
      out.write("                                                        <li><a href=\"cart.jsp\">Giỏ hàng</a></li>\t\r\n");
      out.write("                                                        <!--<li><a href=\"checkout.jsp\">Thanh toán</a></li>-->\t\r\n");
      out.write("                                                        <li><a href=\"blog-single-sidebar.jsp\">Blog</a></li>\t\r\n");
      out.write("                                                        <li><a href=\"contact.jsp\">Liên hệ</a></li>\r\n");
      out.write("\r\n");
      out.write("                                                    </ul>\r\n");
      out.write("                                                </div>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </nav>\r\n");
      out.write("                                        <!--/ End Main Menu -->\t\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("                <!--/ End Header Inner -->\r\n");
      out.write("            </header>\r\n");
      out.write("\r\n");
      out.write("            <!-- Breadcrumbs -->\r\n");
      out.write("            <div class=\"breadcrumbs\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-12\">\r\n");
      out.write("                            <div class=\"bread-inner\">\r\n");
      out.write("                                <ul class=\"bread-list\">\r\n");
      out.write("                                    <li><a href=\"index1.html\">Trang chủ<i class=\"ti-arrow-right\"></i></a></li>\r\n");
      out.write("                                    <li class=\"active\"><a href=\"blog-single.html\">Sản phẩm</a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- End Breadcrumbs -->\r\n");
      out.write("\r\n");
      out.write("            <!-- Product Style -->\r\n");
      out.write("            <section class=\"product-area shop-sidebar shop section\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-3 col-md-4 col-12\">\r\n");
      out.write("                            <div class=\"shop-sidebar\">\r\n");
      out.write("                                <!-- Single Widget -->\r\n");
      out.write("                                <div class=\"single-widget category\">\r\n");
      out.write("                                    <h3 class=\"title\">Categories</h3>\r\n");
      out.write("                                    <ul class=\"categor-list\">\r\n");
      out.write("                                    ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"single-widget recent-post\">\r\n");
      out.write("                                <h3 class=\"title\">Recent post</h3>\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                                <!-- End Single Post -->\r\n");
      out.write("                            </div>\r\n");
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-9 col-md-8 col-12\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-12\">\r\n");
      out.write("                                <!-- Shop Top -->\r\n");
      out.write("                                <div class=\"shop-top\">\r\n");
      out.write("                                    <div class=\"shop-shorter\">\r\n");
      out.write("<!--                                        <div class=\"single-shorter\">\r\n");
      out.write("                                            <label>Show :</label>\r\n");
      out.write("                                            <select>\r\n");
      out.write("                                                <option selected=\"selected\">09</option>\r\n");
      out.write("                                                <option>15</option>\r\n");
      out.write("                                                <option>25</option>\r\n");
      out.write("                                                <option>30</option>\r\n");
      out.write("                                            </select>\r\n");
      out.write("                                        </div>-->\r\n");
      out.write("                                        <div class=\"single-shorter\">\r\n");
      out.write("                                            <label>Sort By :</label>\r\n");
      out.write("                                            <form action=\"sort\">\r\n");
      out.write("                                                <select name=\"sort\"  onchange=\"this.form.submit()\">\r\n");
      out.write("                                                    <option value=\"0\">------</option>\r\n");
      out.write("                                                    <option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag==1?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"1\">Name</option>\r\n");
      out.write("                                                    <option ");
      out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${tag==2?\"selected\":\"\"}", java.lang.String.class, (PageContext)_jspx_page_context, null));
      out.write(" value=\"2\">Price</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                            </form>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("<!--                                    <ul class=\"view-mode\">\r\n");
      out.write("                                        <li class=\"active\"><a href=\"shop-grid.html\"><i class=\"fa fa-th-large\"></i></a></li>\r\n");
      out.write("                                        <li><a href=\"shop-list.html\"><i class=\"fa fa-th-list\"></i></a></li>\r\n");
      out.write("                                    </ul>-->\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!--/ End Shop Top -->\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div id class=\"row\">\r\n");
      out.write("\r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("                            <!--<h10>----------------------------------------</h10>--> \r\n");
      out.write("                            <div id=\"content1234\">\r\n");
      out.write("                                ");
      if (_jspx_meth_c_forEach_3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!--<h10>----------------------------------------</h10>--> \r\n");
      out.write("                            ");
      if (_jspx_meth_c_forEach_4(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!--/ End Product Style 1  -->\t\r\n");
      out.write("\r\n");
      out.write("        <!-- Start Shop Newsletter  -->\r\n");
      out.write("        <section class=\"shop-newsletter section\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"inner-top\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-8 offset-lg-2 col-12\">\r\n");
      out.write("                            <!-- Start Newsletter Inner -->\r\n");
      out.write("                            <div class=\"inner\">\r\n");
      out.write("                                <h4>Newsletter</h4>\r\n");
      out.write("                                <p> Subscribe to our newsletter and get <span>10%</span> off your first purchase</p>\r\n");
      out.write("                                <form action=\"mail/mail.php\" method=\"get\" target=\"_blank\" class=\"newsletter-inner\">\r\n");
      out.write("                                    <input name=\"EMAIL\" placeholder=\"Your email address\" required=\"\" type=\"email\">\r\n");
      out.write("                                    <button class=\"btn\">Subscribe</button>\r\n");
      out.write("                                </form>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- End Newsletter Inner -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- End Shop Newsletter -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("        <!-- Modal -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\">\r\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span class=\"ti-close\" aria-hidden=\"true\"></span></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\" id=\"content12345\">\r\n");
      out.write("                        <div class=\"row no-gutters\">\r\n");
      out.write("                            <div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                                <!-- Product Slider -->\r\n");
      out.write("                                <div class=\"product-gallery\">\r\n");
      out.write("                                    <div class=\"quickview-slider-active\">\r\n");
      out.write("                                        <div class=\"single-slider\">\r\n");
      out.write("                                            <img src=\"https://via.placeholder.com/569x528\" alt=\"#\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"single-slider\">\r\n");
      out.write("                                            <img src=\"https://via.placeholder.com/569x528\" alt=\"#\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"single-slider\">\r\n");
      out.write("                                            <img src=\"https://via.placeholder.com/569x528\" alt=\"#\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"single-slider\">\r\n");
      out.write("                                            <img src=\"https://via.placeholder.com/569x528\" alt=\"#\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- End Product slider -->\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12\" >\r\n");
      out.write("                                <div class=\"quickview-content\">\r\n");
      out.write("                                    <h2>Flared Shift vay</h2>\r\n");
      out.write("                                    <div class=\"quickview-ratting-review\">\r\n");
      out.write("                                        <div class=\"quickview-ratting-wrap\">\r\n");
      out.write("                                            <div class=\"quickview-ratting\">\r\n");
      out.write("                                                <i class=\"yellow fa fa-star\"></i>\r\n");
      out.write("                                                <i class=\"yellow fa fa-star\"></i>\r\n");
      out.write("                                                <i class=\"yellow fa fa-star\"></i>\r\n");
      out.write("                                                <i class=\"yellow fa fa-star\"></i>\r\n");
      out.write("                                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <a href=\"#\"> (1 customer review)</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"quickview-stock\">\r\n");
      out.write("                                            <span><i class=\"fa fa-check-circle-o\"></i> in stock</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3>$29.00</h3>\r\n");
      out.write("                                    <div class=\"quickview-peragraph\">\r\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia iste laborum ad impedit pariatur esse optio tempora sint ullam autem deleniti nam in quos qui nemo ipsum numquam.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"size\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-lg-6 col-12\">\r\n");
      out.write("                                                <h5 class=\"title\">Size</h5>\r\n");
      out.write("                                                <select>\r\n");
      out.write("                                                    <option selected=\"selected\">s</option>\r\n");
      out.write("                                                    <option>m</option>\r\n");
      out.write("                                                    <option>l</option>\r\n");
      out.write("                                                    <option>xl</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-lg-6 col-12\">\r\n");
      out.write("                                                <h5 class=\"title\">Color</h5>\r\n");
      out.write("                                                <select>\r\n");
      out.write("                                                    <option selected=\"selected\">orange</option>\r\n");
      out.write("                                                    <option>purple</option>\r\n");
      out.write("                                                    <option>black</option>\r\n");
      out.write("                                                    <option>pink</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"quantity\">\r\n");
      out.write("                                        <!-- Input Order -->\r\n");
      out.write("                                        <div class=\"input-group\">\r\n");
      out.write("                                            <div class=\"button minus\">\r\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-primary btn-number\" disabled=\"disabled\" data-type=\"minus\" data-field=\"quant[1]\">\r\n");
      out.write("                                                    <i class=\"ti-minus\"></i>\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <input type=\"text\" name=\"quant[1]\" class=\"input-number\"  data-min=\"1\" data-max=\"1000\" value=\"1\">\r\n");
      out.write("                                            <div class=\"button plus\">\r\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-primary btn-number\" data-type=\"plus\" data-field=\"quant[1]\">\r\n");
      out.write("                                                    <i class=\"ti-plus\"></i>\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!--/ End Input Order -->\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"add-to-cart\">\r\n");
      out.write("                                        <a href=\"#\" class=\"btn\">Add to cart</a>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn min\"><i class=\"ti-heart\"></i></a>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn min\"><i class=\"fa fa-compress\"></i></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"default-social\">\r\n");
      out.write("                                        <h4 class=\"share-now\">Share:</h4>\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li><a class=\"facebook\" href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                                            <li><a class=\"twitter\" href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                                            <li><a class=\"youtube\" href=\"#\"><i class=\"fa fa-pinterest-p\"></i></a></li>\r\n");
      out.write("                                            <li><a class=\"dribbble\" href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Modal end -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Start Footer Area -->\r\n");
      out.write("        <section class=\"shop-services section home\">\r\n");
      out.write("            <div class=\"container\">\r\n");
      out.write("                <div class=\"row\">\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 col-12\">\r\n");
      out.write("                        <!-- Start Single Service -->\r\n");
      out.write("                        <div class=\"single-service\">\r\n");
      out.write("                            <i class=\"ti-rocket\"></i>\r\n");
      out.write("                            <h4>Miễn phí vận chuyển</h4>\r\n");
      out.write("                            <p>Cho hóa đơn trên 100$</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- End Single Service -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 col-12\">\r\n");
      out.write("                        <!-- Start Single Service -->\r\n");
      out.write("                        <div class=\"single-service\">\r\n");
      out.write("                            <i class=\"ti-reload\"></i>\r\n");
      out.write("                            <h4>Miễn phí hoàn về</h4>\r\n");
      out.write("                            <p>trong vòng 3 ngày</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- End Single Service -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 col-12\">\r\n");
      out.write("                        <!-- Start Single Service -->\r\n");
      out.write("                        <div class=\"single-service\">\r\n");
      out.write("                            <i class=\"ti-lock\"></i>\r\n");
      out.write("                            <h4>An toàn tiện lợi</h4>\r\n");
      out.write("                            <p>100% bằng thẻ</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- End Single Service -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"col-lg-3 col-md-6 col-12\">\r\n");
      out.write("                        <!-- Start Single Service -->\r\n");
      out.write("                        <div class=\"single-service\">\r\n");
      out.write("                            <i class=\"ti-tag\"></i>\r\n");
      out.write("                            <h4>Giá tốt nhất</h4>\r\n");
      out.write("                            <p>giá hời toàn thị trường</p>\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <!-- End Single Service -->\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </section>\r\n");
      out.write("        <!-- End Shop Services Area -->\r\n");
      out.write("        <!-- Modal -->\r\n");
      out.write("        <div class=\"modal fade\" id=\"exampleModal\" tabindex=\"-1\" role=\"dialog\">\r\n");
      out.write("            <div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("                <div class=\"modal-content\">\r\n");
      out.write("                    <div class=\"modal-header\">\r\n");
      out.write("                        <button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span class=\"ti-close\" aria-hidden=\"true\"></span></button>\r\n");
      out.write("                    </div>\r\n");
      out.write("                    <div class=\"modal-body\" id=\"content12345\">\r\n");
      out.write("                        <div class=\"row no-gutters\">\r\n");
      out.write("                            <div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                                <!-- Product Slider -->\r\n");
      out.write("                                <div class=\"product-gallery\">\r\n");
      out.write("                                    <div class=\"quickview-slider-active\">\r\n");
      out.write("                                        <div class=\"single-slider\">\r\n");
      out.write("                                            <img src=\"https://via.placeholder.com/569x528\" alt=\"#\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"single-slider\">\r\n");
      out.write("                                            <img src=\"https://via.placeholder.com/569x528\" alt=\"#\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"single-slider\">\r\n");
      out.write("                                            <img src=\"https://via.placeholder.com/569x528\" alt=\"#\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"single-slider\">\r\n");
      out.write("                                            <img src=\"https://via.placeholder.com/569x528\" alt=\"#\">\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- End Product slider -->\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-lg-6 col-md-12 col-sm-12 col-xs-12\">\r\n");
      out.write("                                <div class=\"quickview-content\">\r\n");
      out.write("                                    <h2>Flared Shift Dress</h2>\r\n");
      out.write("                                    <div class=\"quickview-ratting-review\">\r\n");
      out.write("                                        <div class=\"quickview-ratting-wrap\">\r\n");
      out.write("                                            <div class=\"quickview-ratting\">\r\n");
      out.write("                                                <i class=\"yellow fa fa-star\"></i>\r\n");
      out.write("                                                <i class=\"yellow fa fa-star\"></i>\r\n");
      out.write("                                                <i class=\"yellow fa fa-star\"></i>\r\n");
      out.write("                                                <i class=\"yellow fa fa-star\"></i>\r\n");
      out.write("                                                <i class=\"fa fa-star\"></i>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <a href=\"#\"> (1 customer review)</a>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <div class=\"quickview-stock\">\r\n");
      out.write("                                            <span><i class=\"fa fa-check-circle-o\"></i> in stock</span>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <h3>$29.00</h3>\r\n");
      out.write("                                    <div class=\"quickview-peragraph\">\r\n");
      out.write("                                        <p>Lorem ipsum dolor sit amet, consectetur adipisicing elit. Mollitia iste laborum ad impedit pariatur esse optio tempora sint ullam autem deleniti nam in quos qui nemo ipsum numquam.</p>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"size\">\r\n");
      out.write("                                        <div class=\"row\">\r\n");
      out.write("                                            <div class=\"col-lg-6 col-12\">\r\n");
      out.write("                                                <h5 class=\"title\">Size</h5>\r\n");
      out.write("                                                <select>\r\n");
      out.write("                                                    <option selected=\"selected\">s</option>\r\n");
      out.write("                                                    <option>m</option>\r\n");
      out.write("                                                    <option>l</option>\r\n");
      out.write("                                                    <option>xl</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <div class=\"col-lg-6 col-12\">\r\n");
      out.write("                                                <h5 class=\"title\">Color</h5>\r\n");
      out.write("                                                <select>\r\n");
      out.write("                                                    <option selected=\"selected\">orange</option>\r\n");
      out.write("                                                    <option>purple</option>\r\n");
      out.write("                                                    <option>black</option>\r\n");
      out.write("                                                    <option>pink</option>\r\n");
      out.write("                                                </select>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"quantity\">\r\n");
      out.write("                                        <!-- Input Order -->\r\n");
      out.write("                                        <div class=\"input-group\">\r\n");
      out.write("                                            <div class=\"button minus\">\r\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-primary btn-number\" disabled=\"disabled\" data-type=\"minus\" data-field=\"quant[1]\">\r\n");
      out.write("                                                    <i class=\"ti-minus\"></i>\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                            <input type=\"text\" name=\"quant[1]\" class=\"input-number\"  data-min=\"1\" data-max=\"1000\" value=\"1\">\r\n");
      out.write("                                            <div class=\"button plus\">\r\n");
      out.write("                                                <button type=\"button\" class=\"btn btn-primary btn-number\" data-type=\"plus\" data-field=\"quant[1]\">\r\n");
      out.write("                                                    <i class=\"ti-plus\"></i>\r\n");
      out.write("                                                </button>\r\n");
      out.write("                                            </div>\r\n");
      out.write("                                        </div>\r\n");
      out.write("                                        <!--/ End Input Order -->\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"add-to-cart\">\r\n");
      out.write("                                        <a href=\"#\" class=\"btn\">Add to cart</a>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn min\"><i class=\"ti-heart\"></i></a>\r\n");
      out.write("                                        <a href=\"#\" class=\"btn min\"><i class=\"fa fa-compress\"></i></a>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                    <div class=\"default-social\">\r\n");
      out.write("                                        <h4 class=\"share-now\">Share:</h4>\r\n");
      out.write("                                        <ul>\r\n");
      out.write("                                            <li><a class=\"facebook\" href=\"#\"><i class=\"fa fa-facebook\"></i></a></li>\r\n");
      out.write("                                            <li><a class=\"twitter\" href=\"#\"><i class=\"fa fa-twitter\"></i></a></li>\r\n");
      out.write("                                            <li><a class=\"youtube\" href=\"#\"><i class=\"fa fa-pinterest-p\"></i></a></li>\r\n");
      out.write("                                            <li><a class=\"dribbble\" href=\"#\"><i class=\"fa fa-google-plus\"></i></a></li>\r\n");
      out.write("                                        </ul>\r\n");
      out.write("                                    </div>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </div>\r\n");
      out.write("        <!-- Modal end -->\r\n");
      out.write("\r\n");
      out.write("        <!-- Start Footer Area -->\r\n");
      out.write("        <footer class=\"footer\">\r\n");
      out.write("            <!-- Footer Top -->\r\n");
      out.write("            <div class=\"footer-top section\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"row\">\r\n");
      out.write("                        <div class=\"col-lg-5 col-md-6 col-12\">\r\n");
      out.write("                            <!-- Single Widget -->\r\n");
      out.write("                            <div class=\"single-footer about\">\r\n");
      out.write("                                <div class=\"logo\">\r\n");
      out.write("                                    <a href=\"index.html\"><img src=\"images/logo.png\" alt=\"#\"></a>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <p class=\"text\">Thu đến và đi như những gì đã sắp đặt, trang giấy trắng đâu thể mờ đi từng màu buồn của nắng. Giống như cách bạn trắng tay khi mua sản phẩm bên tôi.</p>\r\n");
      out.write("                                <p class=\"call\">Hãy liên hệ với chúng tôi 24/7.<span><a href=\"tel:123456789\">+0123 456 789</a></span></p>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- End Single Widget -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-2 col-md-6 col-12\">\r\n");
      out.write("                            <!-- Single Widget -->\r\n");
      out.write("\r\n");
      out.write("                            <!-- End Single Widget -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-2 col-md-6 col-12\">\r\n");
      out.write("                            <!-- Single Widget -->\r\n");
      out.write("\r\n");
      out.write("                            <!-- End Single Widget -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                        <div class=\"col-lg-3 col-md-6 col-12\">\r\n");
      out.write("                            <!-- Single Widget -->\r\n");
      out.write("                            <div class=\"single-footer social\">\r\n");
      out.write("                                <h4>Liên lạc</h4>\r\n");
      out.write("                                <!-- Single Widget -->\r\n");
      out.write("                                <div class=\"contact\">\r\n");
      out.write("                                    <ul>\r\n");
      out.write("                                        <li>Đại học Kinh Tế FBT</li>\r\n");
      out.write("                                        <li>Khu công nghệ cao Hòa Lạc</li>\r\n");
      out.write("                                        <li>fpt@fpt.com</li>\r\n");
      out.write("                                        <li>+032 3456 7890</li>\r\n");
      out.write("                                    </ul>\r\n");
      out.write("                                </div>\r\n");
      out.write("                                <!-- End Single Widget -->\r\n");
      out.write("                                <ul>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"ti-facebook\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"ti-twitter\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"ti-flickr\"></i></a></li>\r\n");
      out.write("                                    <li><a href=\"#\"><i class=\"ti-instagram\"></i></a></li>\r\n");
      out.write("                                </ul>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <!-- End Single Widget -->\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("            <!-- End Footer Top -->\r\n");
      out.write("            <div class=\"copyright\">\r\n");
      out.write("                <div class=\"container\">\r\n");
      out.write("                    <div class=\"inner\">\r\n");
      out.write("                        <div class=\"row\">\r\n");
      out.write("                            <div class=\"col-lg-6 col-12\">\r\n");
      out.write("                                <div class=\"left\">\r\n");
      out.write("                                    <p>Copyright Â© 2020 <a href=\"http://www.wpthemesgrid.com\" target=\"_blank\">Wpthemesgrid</a>  -  All Rights Reserved.</p>\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                            <div class=\"col-lg-6 col-12\">\r\n");
      out.write("                                <div class=\"right\">\r\n");
      out.write("                                    <img src=\"images/payments.png\" alt=\"#\">\r\n");
      out.write("                                </div>\r\n");
      out.write("                            </div>\r\n");
      out.write("                        </div>\r\n");
      out.write("                    </div>\r\n");
      out.write("                </div>\r\n");
      out.write("            </div>\r\n");
      out.write("        </footer>\r\n");
      out.write("        <!-- /End Footer Area -->\r\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js\"></script>\r\n");
      out.write("\r\n");
      out.write("        <script>\r\n");
      out.write("                                                    function searchByName(param) {\r\n");
      out.write("                                                        var txtSearch = param.value;\r\n");
      out.write("\r\n");
      out.write("                                                        $.ajax({\r\n");
      out.write("                                                            url: \"/PRJProject/searchajax\",\r\n");
      out.write("                                                            type: \"get\",\r\n");
      out.write("                                                            data: {\r\n");
      out.write("                                                                txt: txtSearch\r\n");
      out.write("                                                            },\r\n");
      out.write("\r\n");
      out.write("                                                            success: function (data) {\r\n");
      out.write("                                                                var row = document.getElementById(\"content1234\");\r\n");
      out.write("                                                                row.innerHTML = data;\r\n");
      out.write("                                                            },\r\n");
      out.write("                                                            error: function (passParams) {\r\n");
      out.write("                                                                // code here\r\n");
      out.write("                                                            }\r\n");
      out.write("                                                        });\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                    function Categories(param) {\r\n");
      out.write("//                                                        var id = param.value;\r\n");
      out.write("//                alert(\"pp\");\r\n");
      out.write("//alert(param)\r\n");
      out.write("//                                                        if (id == 2) {\r\n");
      out.write("//                                                                alert(\"chuan roi\");\r\n");
      out.write("//                                                        }else{\r\n");
      out.write("//                                                            alert('k phai');\r\n");
      out.write("//                                                        }\r\n");
      out.write("                                                        $.ajax({\r\n");
      out.write("                                                            url: \"/PRJProject/categoryajax\",\r\n");
      out.write("                                                            type: \"get\",\r\n");
      out.write("                                                            data: {\r\n");
      out.write("                                                                pid: param\r\n");
      out.write("                                                            },\r\n");
      out.write("\r\n");
      out.write("                                                            success: function (data) {\r\n");
      out.write("                                                                var row = document.getElementById(\"content1234\");\r\n");
      out.write("                                                                row.innerHTML = data;\r\n");
      out.write("                                                            },\r\n");
      out.write("                                                            error: function (passParams) {\r\n");
      out.write("                                                                // code here\r\n");
      out.write("                                                            }\r\n");
      out.write("                                                        });\r\n");
      out.write("                                                    }\r\n");
      out.write("                                                    function QuickShop(param){\r\n");
      out.write("                                                        $.ajax({\r\n");
      out.write("                                                            url: \"/PRJProject/quickshopajax\",\r\n");
      out.write("                                                            type: \"get\",\r\n");
      out.write("                                                            data: {\r\n");
      out.write("                                                                id: param\r\n");
      out.write("                                                            },\r\n");
      out.write("\r\n");
      out.write("                                                            success: function (data) {\r\n");
      out.write("                                                                var row = document.getElementById(\"content12345\");\r\n");
      out.write("                                                                row.innerHTML = data;\r\n");
      out.write("                                                            },\r\n");
      out.write("                                                            error: function (passParams) {\r\n");
      out.write("                                                                // code here\r\n");
      out.write("                                                            }\r\n");
      out.write("                                                        });\r\n");
      out.write("                                                    }\r\n");
      out.write("        </script>\r\n");
      out.write("\r\n");
      out.write("        <!-- Jquery -->\r\n");
      out.write("        <script src=\"js/jquery.min.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery-migrate-3.0.0.js\"></script>\r\n");
      out.write("        <script src=\"js/jquery-ui.min.js\"></script>\r\n");
      out.write("        <!-- Popper JS -->\r\n");
      out.write("        <script src=\"js/popper.min.js\"></script>\r\n");
      out.write("        <!-- Bootstrap JS -->\r\n");
      out.write("        <script src=\"js/bootstrap.min.js\"></script>\r\n");
      out.write("        <!-- Color JS -->\r\n");
      out.write("        <script src=\"js/colors.js\"></script>\r\n");
      out.write("        <!-- Slicknav JS -->\r\n");
      out.write("        <script src=\"js/slicknav.min.js\"></script>\r\n");
      out.write("        <!-- Owl Carousel JS -->\r\n");
      out.write("        <script src=\"js/owl-carousel.js\"></script>\r\n");
      out.write("        <!-- Magnific Popup JS -->\r\n");
      out.write("        <script src=\"js/magnific-popup.js\"></script>\r\n");
      out.write("        <!-- Fancybox JS -->\r\n");
      out.write("        <script src=\"js/facnybox.min.js\"></script>\r\n");
      out.write("        <!-- Waypoints JS -->\r\n");
      out.write("        <script src=\"js/waypoints.min.js\"></script>\r\n");
      out.write("        <!-- Countdown JS -->\r\n");
      out.write("        <script src=\"js/finalcountdown.min.js\"></script>\r\n");
      out.write("        <!-- Nice Select JS -->\r\n");
      out.write("        <script src=\"js/nicesellect.js\"></script>\r\n");
      out.write("        <!-- Ytplayer JS -->\r\n");
      out.write("        <script src=\"js/ytplayer.min.js\"></script>\r\n");
      out.write("        <!-- Flex Slider JS -->\r\n");
      out.write("        <script src=\"js/flex-slider.js\"></script>\r\n");
      out.write("        <!-- ScrollUp JS -->\r\n");
      out.write("        <script src=\"js/scrollup.js\"></script>\r\n");
      out.write("        <!-- Onepage Nav JS -->\r\n");
      out.write("        <script src=\"js/onepage-nav.min.js\"></script>\r\n");
      out.write("        <!-- Easing JS -->\r\n");
      out.write("        <script src=\"js/easing.js\"></script>\r\n");
      out.write("        <!-- Active JS -->\r\n");
      out.write("        <script src=\"js/active.js\"></script>\r\n");
      out.write("    </body>\r\n");
      out.write("</html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.allCate}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("o");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                        <li><a onclick=\"Categories(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\">  \r\n");
          out.write("                                                <!--href=\"cate?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cid}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" thay vao onclick-->\r\n");
          out.write("                                                ");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.cname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></li>\r\n");
          out.write("                                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_1(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_1 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_1.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_1.setParent(null);
    _jspx_th_c_forEach_1.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${p.hotItems}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_1.setVar("o");
    int[] _jspx_push_body_count_c_forEach_1 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_1 = _jspx_th_c_forEach_1.doStartTag();
      if (_jspx_eval_c_forEach_1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <div class=\"single-post first\">\r\n");
          out.write("                                        <div class=\"image\">\r\n");
          out.write("                                            <img src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"#\">\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                        <div class=\"content\">\r\n");
          out.write("                                            <h5><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h5>\r\n");
          out.write("                                            <p class=\"price\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</p>\r\n");
          out.write("                                            <ul class=\"reviews\">\r\n");
          out.write("                                                <li class=\"yellow\"><i class=\"ti-star\"></i></li>\r\n");
          out.write("                                                <li class=\"yellow\"><i class=\"ti-star\"></i></li>\r\n");
          out.write("                                                <li class=\"yellow\"><i class=\"ti-star\"></i></li>\r\n");
          out.write("                                                <li class=\"yellow\"><i class=\"ti-star\"></i></li>\r\n");
          out.write("                                                <li class=\"yellow\"><i class=\"ti-star\"></i></li>\r\n");
          out.write("                                            </ul>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_1[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_1.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_1.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_1);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_2(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_2 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_2.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_2.setParent(null);
    _jspx_th_c_forEach_2.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listP}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_2.setVar("o");
    int[] _jspx_push_body_count_c_forEach_2 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_2 = _jspx_th_c_forEach_2.doStartTag();
      if (_jspx_eval_c_forEach_2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                <!--                                <div class=\"col-lg-4 col-md-6 col-12\">\r\n");
          out.write("                                                                    <div class=\"single-product\">\r\n");
          out.write("                                                                        <div class=\"product-img\">\r\n");
          out.write("                                                                            <a href=\"product-details.html\">\r\n");
          out.write("                                                                                <img class=\"default-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"#\">\r\n");
          out.write("                                                                                <img class=\"hover-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"#\">\r\n");
          out.write("                                                                                <span class=\"new\">New</span>\r\n");
          out.write("                                                                            </a>\r\n");
          out.write("                                                                            <div class=\"button-head\">\r\n");
          out.write("                                                                                <div class=\"product-action\">\r\n");
          out.write("                                                                                    <a data-toggle=\"modal\" data-target=\"#exampleModal\" title=\"Quick View\" href=\"#\"><i class=\" ti-eye\"></i><span>Quick Shop</span></a>\r\n");
          out.write("                                                                                    <a title=\"Wishlist\" href=\"#\"><i class=\" ti-heart \"></i><span>Add to Wishlist</span></a>\r\n");
          out.write("                                                                                    <a title=\"Compare\" href=\"#\"><i class=\"ti-bar-chart-alt\"></i><span>Add to Compare</span></a>\r\n");
          out.write("                                                                                </div>\r\n");
          out.write("                                                                                <div class=\"product-action-2\">\r\n");
          out.write("                                                                                    <a title=\"Add to cart\" href=\"#\">Add to cart</a>\r\n");
          out.write("                                                                                </div>\r\n");
          out.write("                                                                            </div>\r\n");
          out.write("                                                                        </div>\r\n");
          out.write("                                                                        <div class=\"product-content\">\r\n");
          out.write("                                                                            <h3><a href=\"product-details.html\">");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\r\n");
          out.write("                                                                            <div class=\"product-price\">\r\n");
          out.write("                                                                                <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("00VND</span>\r\n");
          out.write("                                                                            </div>\r\n");
          out.write("                                                                        </div>\r\n");
          out.write("                                                                    </div>\r\n");
          out.write("                                                                </div>-->\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_2[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_2.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_2.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_2);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_3(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_3 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_3.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_3.setParent(null);
    _jspx_th_c_forEach_3.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${allProductSearch}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_3.setVar("o");
    int[] _jspx_push_body_count_c_forEach_3 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_3 = _jspx_th_c_forEach_3.doStartTag();
      if (_jspx_eval_c_forEach_3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("                                    <div class=\"col-lg-4 col-md-6 col-12\">\r\n");
          out.write("                                        <div class=\"single-product\">\r\n");
          out.write("                                            <div class=\"product-img\">\r\n");
          out.write("                                                <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                    <img class=\"default-img\"  src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"#\">\r\n");
          out.write("                                                    <img class=\"hover-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"#\">\r\n");
          out.write("                                                    <!--<span class=\"new\">New</span>-->\r\n");
          out.write("                                                </a>\r\n");
          out.write("                                                <div class=\"button-head\">\r\n");
          out.write("                                                    <div class=\"product-action\">\r\n");
          out.write("                                                        <a data-toggle=\"modal\" onclick=\"QuickShop(");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write(")\" data-target=\"#exampleModal\" title=\"Quick View\" href=\"#\"><i class=\" ti-eye\"></i><span>Quick Shop</span></a>\r\n");
          out.write("                                                        <a title=\"Wishlist\" href=\"#\"><i class=\" ti-heart \"></i><span>Add to Wishlist</span></a>\r\n");
          out.write("                                                        <a title=\"Compare\" href=\"#\"><i class=\"ti-bar-chart-alt\"></i><span>Add to Compare</span></a>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                    <div class=\"product-action-2\">\r\n");
          out.write("                                                        <a title=\"Add to cart\" href=\"buy?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Add to cart</a>\r\n");
          out.write("                                                    </div>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                            <div class=\"product-content\">\r\n");
          out.write("                                                <h3><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\r\n");
          out.write("                                                <div class=\"product-price\">\r\n");
          out.write("                                                    <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("00VND</span>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                ");
          int evalDoAfterBody = _jspx_th_c_forEach_3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_3[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_3.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_3.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_3);
    }
    return false;
  }

  private boolean _jspx_meth_c_forEach_4(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_4 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_4.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_4.setParent(null);
    _jspx_th_c_forEach_4.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${listSort}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_4.setVar("o");
    int[] _jspx_push_body_count_c_forEach_4 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_4 = _jspx_th_c_forEach_4.doStartTag();
      if (_jspx_eval_c_forEach_4 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("<!--                                <div class=\"col-lg-4 col-md-6 col-12\">\r\n");
          out.write("                                    <div class=\"single-product\">\r\n");
          out.write("                                        <div class=\"product-img\">\r\n");
          out.write("                                            <a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">\r\n");
          out.write("                                                <img class=\"default-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"#\">\r\n");
          out.write("                                                <img class=\"hover-img\" src=\"");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.img2}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\" alt=\"#\">\r\n");
          out.write("                                                <span class=\"new\">New</span>\r\n");
          out.write("                                            </a>\r\n");
          out.write("                                            <div class=\"button-head\">\r\n");
          out.write("                                                <div class=\"product-action\">\r\n");
          out.write("                                                    <a data-toggle=\"modal\" data-target=\"#exampleModal\" title=\"Quick View\" href=\"#\"><i class=\" ti-eye\"></i><span>Quick Shop</span></a>\r\n");
          out.write("                                                    <a title=\"Wishlist\" href=\"#\"><i class=\" ti-heart \"></i><span>Add to Wishlist</span></a>\r\n");
          out.write("                                                    <a title=\"Compare\" href=\"#\"><i class=\"ti-bar-chart-alt\"></i><span>Add to Compare</span></a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                                <div class=\"product-action-2\">\r\n");
          out.write("                                                    <a title=\"Add to cart\" href=\"buy?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("\">Add to cart</a>\r\n");
          out.write("                                                </div>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                        <div class=\"product-content\">\r\n");
          out.write("                                            <h3><a href=\"detail?pid=");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.id}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write('"');
          out.write('>');
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.pname}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("</a></h3>\r\n");
          out.write("                                            <div class=\"product-price\">\r\n");
          out.write("                                                <span>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${o.price}", java.lang.String.class, (PageContext)_jspx_page_context, null));
          out.write("00VND</span>\r\n");
          out.write("                                            </div>\r\n");
          out.write("                                        </div>\r\n");
          out.write("                                    </div>\r\n");
          out.write("                                </div>-->\r\n");
          out.write("                            ");
          int evalDoAfterBody = _jspx_th_c_forEach_4.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_4.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_4[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_4.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_4.doFinally();
      _jspx_tagPool_c_forEach_var_items.reuse(_jspx_th_c_forEach_4);
    }
    return false;
  }
}
