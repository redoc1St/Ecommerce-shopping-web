/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Entity.Cart;
import Entity.Customer;
import Entity.Item;
import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalTime;

/**
 *
 * @author ACER
 */
public class OrderDAO extends DBContext{
     public void addOrder(Customer u, Cart cart) throws Exception {
        LocalDate curDate = java.time.LocalDate.now();
          String date = curDate.toString();
        
        try{
            //add vào bảng Order
            String sql="insert into [order] values(?,?,?)";
            PreparedStatement st=getConnection().prepareStatement(sql);
            st.setString(1, date);
            st.setInt(2, u.getId());
            st.setDouble(3, cart.getTotalMoney());
            st.executeUpdate();
            //lấy ra id của Order vừa add
            String sql1="select top 1 id from [Order] order by id desc";
            PreparedStatement st1=getConnection().prepareStatement(sql1);
            ResultSet rs=st1.executeQuery();
            //add vào bảng OrderLine
            if(rs.next()){
                int oid=rs.getInt(1);
                for(Item i:cart.getItems()){
                String sql2="insert into [orderline] values(?,?,?,?)";
                PreparedStatement st2=getConnection().prepareStatement(sql2);
                st2.setInt(1, oid);
                st2.setInt(2, i.getProduct().getId());
                st2.setInt(3, i.getQuantity());
                st2.setDouble(4, i.getPrice());
                st2.executeUpdate();
            }
            }
            
        }catch(SQLException e){
            System.out.println(e);
        }
    }
    
}
