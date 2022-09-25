/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import Entity.Account;
import Entity.Bill;
import Entity.Category;
import Entity.Comment;
import Entity.Product;
import context.DBContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
//import javax.;

/**
 *
 * @author ACER
 */
public class DAO extends DBContext {

    Connection conn = null;
    PreparedStatement ps = null;
    ResultSet rs = null;

    public List<Category> getAllCate() {
        String query = "select * from category";
        List<Category> list = new ArrayList<>();
        try {
            conn = (Connection) new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Category(rs.getInt(1),
                        rs.getString(2)));
            }
//            return list;
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getAllProduct() {
        String query = "select * from product";
        List<Product> list = new ArrayList<>();
        try {
            conn = (Connection) new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9)));
            }
//            return list;
        } catch (Exception e) {
        }
        return list;
    }
    //tại vì có viết sql = order by (String truyền vào là pname vs price nhưng k được nên tách ra hai

    public List<Product> getSortProduct2() {
        String query = "select * from product order by price";
        List<Product> list = new ArrayList<>();
        try {
            conn = (Connection) new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
//            ps.setString(1, kind);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9)));
            }
//            return list;
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getSortProduct1() {
        String query = "select * from product order by pname";
        List<Product> list = new ArrayList<>();
        try {
            conn = (Connection) new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
//            ps.setString(1, kind);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9)));
            }
//            return list;
        } catch (Exception e) {
        }
        return list;
    }

    public Product getProductbyID(String id) {
        String query = "select * from product where id = ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, id);
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> getHotItems() {
        String query = "select top 5* from product order by SalePricePercent ";
        List<Product> list = new ArrayList<>();
        try {
            conn = (Connection) new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9)));
            }
//            return list;
        } catch (Exception e) {
        }
        return list;
    }

    public List<Product> getByCate(String id) {
        String query = "SELECT * FROM Product WHERE cid=?";
        List<Product> list = new ArrayList<>();
        try {
            conn = (Connection) new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, id);
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9)));
            }
//            return list;
        } catch (Exception e) {
        }
        return list;
    }

    public Product getSaleMax() {
        String query = "select top 1* from product order by SalePricePercent desc";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            rs = ps.executeQuery();
            while (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public List<Product> searchByName(String txt) {
        List<Product> list = new ArrayList<>();
        String query = "select * from product where pname like ?";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, "%" + txt + "%");
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                list.add(new Product(rs.getInt(1),
                        rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9)));

            }

        } catch (Exception e) {
        }
        return list;
    }
//    public static void main(String[] args) {
//        DAO dao = new DAO();
//        List<Product> list = dao.searchByName("");
//        for (Product product : list) {
//            System.out.println(list);
//        }
//List<Product> list = dao.getSortProduct1();
//List<Product list = dao.getAllProduct()

//            for (Product o : list) {
//                System.out.println(o);
//        }
//            dao.message("quang", "sfdsf@fpt.d", 123456, "hay đó");
//        Product p = dao.getSaleMax();
//        System.out.println(p);
//System.out.println(list);
//    }
//giống hàm get trên nhưng phục vụ riêng cho processServlet2 với biến truyền vào là int
    public Product getProductbyID(int id) throws Exception {
        String sql = "select * from Product where id=?";
        try {
            PreparedStatement st = getConnection().prepareStatement(sql);
            st.setInt(1, id);
            ResultSet rs = st.executeQuery();
            if (rs.next()) {
                return new Product(rs.getInt(1),
                        rs.getString(2), rs.getDouble(3), rs.getString(4), rs.getString(5), rs.getString(6), rs.getInt(7), rs.getInt(8), rs.getInt(9));

            }

        } catch (SQLException e) {
            System.out.println(e);
        }
        return null;
    }

    public Account checkExist(String user) {
        String query = "select * from customer\n"
                + "where [username] = ?\n";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, user);
            rs = ps.executeQuery();//chay cau lenh query, nhan ket qua tra ve
            while (rs.next()) {
                return new Account(rs.getInt(1),
                        rs.getString(2),
                        rs.getString(3),
                        rs.getString(4), rs.getInt(5));

            }
        } catch (Exception e) {
        }
        return null;
    }

    public void signUP(String name, String username, String password, int cateId) {
        String query = "INSERT INTO Customer VALUES (?,?,?,?)";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, name);
            ps.setString(2, username);
            ps.setString(3, password);
            ps.setInt(4, cateId);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void message(String name, String email, int phoneNumber, String mess) {
        String query = "INSERT INTO message VALUES (?,?,?,?)";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, name);
            ps.setString(2, email);
            ps.setInt(3, phoneNumber);
            ps.setString(4, mess);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public List<Comment> getAllComment() {
        String query = "select * from comment";
        List<Comment> list = new ArrayList<>();
        try {
            conn = (Connection) new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Comment(rs.getString(1),
                        rs.getString(2), rs.getString(3)));
            }
//            return list;
        } catch (Exception e) {
        }
        return list;
    }

    public void SaveComment(String username, String comment, String commentTime) {
        String query = "INSERT INTO comment VALUES (?,?,?)";
        try {
            conn = new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            ps.setString(1, username);
            ps.setString(2, comment);
            ps.setString(3, commentTime);
            ps.executeUpdate();
        } catch (Exception e) {
        }
    }

    public void updateProduct(String price, String desc, String salePer, String id) {
        String query = " UPDATE dbo.Product SET price = ?, [description] = ?,  SalePricePercent=? WHERE id =?";
        try {
            conn = new DBContext().getConnection();
            ps = conn.prepareStatement(query);
            ps.setString(1, price);
            ps.setString(2, desc);
            ps.setString(3, salePer);
            ps.setString(4, id);
            ps.executeUpdate();
        } catch (Exception e) {
        }

    }

    public List<Bill> getAllBill() {
        String query = "   \n"
                + "   SELECT rOW_NUMBER() OVER (ORDER BY date) AS [Id],c.username,o.totalmoney,o.[date]\n"
                + "     FROM dbo.[Order] AS o  JOIN dbo. Customer AS c ON c.id = o.cid";
        List<Bill> list = new ArrayList<>();
        try {
            conn = (Connection) new DBContext().getConnection(); //mo ket noi toi sql
            ps = conn.prepareStatement(query);//nem cau lenh query sang sql
            rs = ps.executeQuery();
            while (rs.next()) {
                list.add(new Bill(rs.getInt(1),
                        rs.getString(2),rs.getDouble(3),rs.getString(4)));
            }
//            return list;
        } catch (Exception e) {
        }
        return list;
    }

    public static void main(String[] args) {
        DAO ad = new DAO();
        List<Bill> list = ad.getAllBill();
        for (Bill author : list) {
            System.out.println(author.toString());
        }
//        ad.updateProduct("100", "giày quảng châu", "20", "11");
//        ad.SaveComment("vai an", "qua tot", "12-15-200");
    }
}
