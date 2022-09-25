/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ControlUseAjax;

import Entity.Product;
import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author ACER
 */
@WebServlet(name = "CategoriesAjax", urlPatterns = {"/categoryajax"})
public class CategoriesAjax extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        DAO dao = new DAO();
        String id= request.getParameter("pid");
        List<Product> list= dao.getByCate(id);
        PrintWriter out = response.getWriter();
        for (Product p : list) {
            out.println("<div class=\"col-lg-4 col-md-6 col-12\">\n" +
"                                    <div class=\"single-product\">\n" +
"                                        <div class=\"product-img\">\n" +
"                                            <a href=\"detail?pid="+p.getId()+"\">\n" +
"                                                <img class=\"default-img\" src=\""+p.getImg()+"\" alt=\"#\">\n" +
"                                                <img class=\"hover-img\" src=\""+p.getImg2()+"\" alt=\"#\">\n" +
"                                                <!--<span class=\"new\">New</span>-->\n" +
"                                            </a>\n" +
"                                            <div class=\"button-head\">\n" +
"                                                <div class=\"product-action\">\n" +
"                                                    <a data-toggle=\"modal\" data-target=\"#exampleModal\" title=\"Quick View\" href=\"#\"><i class=\" ti-eye\"></i><span>Quick Shop</span></a>\n" +
"                                                    <a title=\"Wishlist\" href=\"#\"><i class=\" ti-heart \"></i><span>Add to Wishlist</span></a>\n" +
"                                                    <a title=\"Compare\" href=\"#\"><i class=\"ti-bar-chart-alt\"></i><span>Add to Compare</span></a>\n" +
"                                                </div>\n" +
"                                                <div class=\"product-action-2\">\n" +
"                                                    <a title=\"Add to cart\" href=\"buy?pid="+p.getId()+"\">Add to cart</a>\n" +
"                                                </div>\n" +
"                                            </div>\n" +
"                                        </div>\n" +
"                                        <div class=\"product-content\">\n" +
"                                            <h3><a href=\"detail?pid=${o.id}\">"+p.getPname()+"</a></h3>\n" +
"                                            <div class=\"product-price\">\n" +
"                                                <span>"+p.getPrice()+"00VND</span>\n" +
"                                            </div>\n" +
"                                        </div>\n" +
"                                    </div>\n" +
"                                </div>");
        }
        
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
