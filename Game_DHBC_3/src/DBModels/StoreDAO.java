/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBModels;

import DBConnection.*;

import DBEntities.Store;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author LENOVO
 */
public class StoreDAO {

    public ArrayList<Store> getList() {
        ArrayList<Store> ds = new ArrayList<>();
        Store st = null;

        Connection cn = LoginDatabase.getConnect();

        try {

            String s = "select * from Store";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                st = new Store();
                st.setCardID(rs.getString(1));
                st.setSeri(rs.getString(2));
                st.setCard_value(rs.getInt(3));
                st.setGem(rs.getInt(4));
                ds.add(st);

            }
            sta.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }
        public static int delete(String maID) {
        int r = -1;
        //1. tao ket noi tu ung dung java den sql server
        Connection cn = LoginDatabase.getConnect();
        try {
            String sql = "delete from Store where CardID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            //3. set gia tri cho cac tham so ? trong linh delete
            pst.setString(1, maID);
            //4. thuc hinh linh delete SQL
            r = pst.executeUpdate();
            //5. dong cac resources
            pst.close();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }
}
