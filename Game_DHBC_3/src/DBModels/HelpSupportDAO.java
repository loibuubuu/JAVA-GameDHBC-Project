/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBModels;

import DBEntities.Admin;
import DBEntities.HelpSupport;
import DBConnection.*;
import java.io.FileOutputStream;
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
public class HelpSupportDAO {

    public ArrayList<HelpSupport> getList() {
        ArrayList<HelpSupport> ds = new ArrayList<>();
        HelpSupport hp = null;
        Connection cn = LoginDatabase.getConnect();
        try {
            String s = "select CaseID, PlayerID, CaseTitle, Messages, ReceivedDate from HelpSupport";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                hp = new HelpSupport();
                hp.setCaseid(rs.getInt(1));
                hp.setName(rs.getString(2));
                hp.setCasetitle(rs.getString(3));
                hp.setMessages(rs.getString(4));
                hp.setReceivedDate(rs.getString(5));
                ds.add(hp);
            }
            sta.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public ArrayList<HelpSupport> getview() {
        ArrayList<HelpSupport> ds = new ArrayList<>();
        HelpSupport HelpSupport = null;
        Connection cn = LoginDatabase.getConnect();
        try {
            String s = "select CaseID, PlayerID,CaseTitle, Messages, Images from HelpSupport ";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                HelpSupport = new HelpSupport();
                HelpSupport.setCaseid(rs.getInt(1));
                HelpSupport.setName(rs.getString(2));
                HelpSupport.setCasetitle(rs.getString(3));
                HelpSupport.setMessages(rs.getString(4));
                HelpSupport.setImage(rs.getBytes(5));
                ds.add(HelpSupport);
            }
            sta.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static int delete(int maID) {
        int r = -1;
        //1. tao ket noi tu ung dung java den sql server
        Connection cn = LoginDatabase.getConnect();
        try {
            String sql = "delete from HelpSupport where CaseID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            //3. set gia tri cho cac tham so ? trong linh delete
            pst.setInt(1, maID);
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

    public ArrayList<HelpSupport> Downlimg() {
        ArrayList<HelpSupport> ds = new ArrayList<>();
        HelpSupport hp = null;
        Connection cn = LoginDatabase.getConnect();
        try {
            String s = "select CaseID, CaseTitle, Images from HelpSupport";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                hp = new HelpSupport();
                hp.setCaseid(rs.getInt(1));
                hp.setCasetitle(rs.getString(2));
            //    FileOutputStream fileOutputStream = new FileOutputStream("./src/images/"+  hp.setCasetitle(rs.getString(2)));
                hp.setImage(rs.getBytes(3));

                ds.add(hp);
            }
            sta.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }
}
