<%-- 
    Document   : header
    Created on : Mar 12, 2021, 12:47:02 AM
    Author     : ACER
--%>

<%@page import="Entity.Cart"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<header class="header shop">
    <!-- Topbar -->
    <div class="topbar">
        <div class="container">
            <div class="row">
                <div class="col-lg-4 col-md-12 col-12">
                    <!-- Top Left -->
                    <div class="top-left">
                        <ul class="list-main">
                            <li><i class="ti-headphone-alt"></i> +0988 60 3389</li>
                            <li><i class="ti-email"></i> quangddhe141474@fpt.edu.vn</li>
                        </ul>
                    </div>
                    <!--/ End Top Left -->
                </div>
                <div class="col-lg-8 col-md-12 col-12">
                    <!-- Top Right -->
                    <div class="right-content">
                        <ul class="list-main">
                            <li><i class="ti-bag"></i> Xin chào ${sessionScope.account.name}</li>
                            <li><i class="ti-location-pin"></i> Đại học FPT</li>
                            <!--<li><i class="ti-alarm-clock"></i> <a href="#">Daily deal</a></li>-->
                            <!--<li><i class="ti-user"></i> <a href="#">Tài khoản</a></li>-->
                            <c:if test="${sessionScope.account==null}">
                                <li><i class="ti-power-off"></i><a href="AdminLogin.jsp">Đăng nhập</a></li>
                                    </c:if>
                                    <c:if test="${sessionScope.account!=null}">
                                <li><i class="ti-power-off"></i><a href="logout">Đăng xuất</a></li>
                                    </c:if>

                        </ul>
                    </div>
                    <!-- End Top Right -->
                </div>
            </div>
        </div>
    </div>
    <!-- End Topbar -->
    <div class="middle-inner">
        <div class="container">
            <div class="row">
                <div class="col-lg-2 col-md-2 col-12">
                    <!-- Logo -->
                    <div class="logo">

                        <a href="index.jsp"><img src="images/logo.png" alt="logo"></a>
                    </div>
                    <!--/ End Logo -->
                    <!-- Search Form -->
                    <div class="search-top">
                        <div class="top-search"><a href="#0"><i class="ti-search"></i></a></div>
                        <!-- Search Form -->
                        <div class="search-top">
                            <form action="search" class="search-form">
                                <input  type="text" placeholder="Search here..." name="search">
                                <button value="search" type="submit"><i class="ti-search"></i></button>
                            </form>
                        </div>
                        <!--/ End Search Form -->
                    </div>
                    <!--/ End Search Form -->
                    <div class="mobile-nav"></div>
                </div>
                <div class="col-lg-8 col-md-7 col-12">
                    <div class="search-bar-top">
                        <div class="search-bar">
                            <!--                                        <select>
                            
                                                                        <option selected="selected">All Category</option>
                            <c:forEach items="${p.allCate}" var="o">
                                <option>${o.cname}</option>
                            </c:forEach>

                                                                    <option>mobile</option>
                                                                    <option>kidâs item</option>
                            <%--</jsp:useBean>--%>
                        </select>-->
                            <form  action="search" method="post">
                                <input oninput="searchByName(this)" value="${txt}" name="txt" placeholder="Tìm kiếm sản phẩm ở đây" type="Tìm kiếm">
                                <button class="btnn"><i class="ti-search"></i></button>
                            </form>
                        </div>
                    </div>
                </div>
                <%
                    Cart o = (Cart) session.getAttribute("cart");
                    double totalPrice = 0;

                    try {

                        totalPrice += o.getTotalMoney();
                    } catch (Exception e) {
                    }

                %>
                <div class="col-lg-2 col-md-3 col-12">
                    <div class="right-bar">

                        <c:set var="size" value="${sessionScope.size}"> </c:set>
                            <div class="sinlge-bar shopping">
                                <a href="cart.jsp" class="single-icon"><i class="ti-bag"></i> <span class="total-count">${size}</span></a>
                            <!-- Shopping Item -->
                            <div class="shopping-item">
                                <div class="dropdown-cart-header">
                                    <span>${size} item/items</span>
                                    <a href="cart.jsp">Giỏ hàng</a>
                                </div>
                                <c:set var="o" value="${sessionScope.cart}"/>
                                <c:forEach items="${o.items}" var="i">
                                    <ul class="shopping-list">
                                        <li>
                                            <a href="#" class="remove" title="Remove this item"><i class="fa fa-remove"></i></a>
                                            <a class="cart-img" href="#"><img src="${i.product.img}" alt="#"></a>
                                            <h4><a href="#">${i.product.pname}</a></h4>
                                            <p class="quantity">${i.quantity}x - <span class="amount">${i.price}00VND</span></p>
                                        </li>
                                    </ul>
                                </c:forEach>
                                <div class="bottom">
                                    <div class="total">
                                        <span>Tổng</span>
                                        <span class="total-amount"><%=totalPrice%>00VND</span>
                                    </div>
                                    <a href="checkout" class="btn animate">Thanh toán</a>
                                </div>
                            </div>
                            <!--/ End Shopping Item -->
                        </div>
                    </div>
                </div>
            </div>
        </div>
    </div>

</header>