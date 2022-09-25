
package dao;

import Entity.Customer;
import context.DBContext;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author ACER
 */
public class CustomerDAO extends DBContext{
    public Customer getAcount(String user,String pass){
        String sql="select * from customer where "
                + "username=? and password=?";
        try {
            PreparedStatement st = getConnection().prepareStatement(sql);
            st.setString(1, user);
            st.setString(2, pass);
            ResultSet rs= st.executeQuery();
            if(rs.next()){
                return new Customer(rs.getInt(1), rs.getString(2), rs.getString(3), rs.getString(4), rs.getInt(5));
            }
        } catch (Exception e) {
        }
        
        return null;
        
    }
}
