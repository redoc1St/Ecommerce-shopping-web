/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Control;

import Entity.Account;
import Entity.Customer;
import dao.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import javafx.scene.control.RadioButton;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
@WebServlet(name = "SignupServlet", urlPatterns = {"/signup"})
public class SignupServlet extends HttpServlet {

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
        String username = request.getParameter("user");
        String password = request.getParameter("pass");
        String name = request.getParameter("name");
        String CusOrAdm = request.getParameter("acc");
        int cateId = 0;
//        RadioButton rd = new RadioButton();
//        rd = request.getParameter("acc");
        if (CusOrAdm.equals("1")) {
            cateId = 1;
        } else if (CusOrAdm.equals("2")) {
            cateId = 2;
        }
        DAO dao = new DAO();
        HttpSession session = request.getSession();

        Account a = dao.checkExist(username);
        if (a == null) {
            //dc sign up
//            String newPassword = dao.convertPassWord(password);
            if (session.getAttribute("account") == null) {

                dao.signUP(name, username, password, 1);
                response.sendRedirect("AdminLogin.jsp");
            } else {
                dao.signUP(name, username, password, cateId);
                response.sendRedirect("AdminLogin.jsp");
            }
        } else {
            String er = "username: " + username + " is existed";
            request.setAttribute("errorr", er);
//            JOptionPane.showMessageDialog(null, "Username existed");
            request.getRequestDispatcher("AdminRegister.jsp").forward(request, response);
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
