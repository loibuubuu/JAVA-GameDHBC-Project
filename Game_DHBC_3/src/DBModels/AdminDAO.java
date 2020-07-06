/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBModels;

import DBEntities.Admin;
import DBConnection.*;
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
public class AdminDAO {

    public static int insert(String Name, String Password, String Email, String DOB, String Phone) {
        int r = -1;
        Connection cn = LoginDatabase.getConnect();
        try {
            String sql = "insert into Admins (AdID,AdPassword,AdEmail,AdDOB,AdPhone) values(?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            //set gia tri cho cac tham so
            pst.setString(1, Name);
            pst.setString(2, Password);
            pst.setString(3, Email);
            pst.setString(4, DOB);
            pst.setString(5, Phone);
            r = pst.executeUpdate();
            pst.close();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }

    public ArrayList<Admin> getList() {
        ArrayList<Admin> ds = new ArrayList<>();
        Admin pl = null;
        Connection cn = LoginDatabase.getConnect();
        try {
            String s = "select * from Admins";
            Statement sta = cn.createStatement();
            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                pl = new Admin();
                pl.setName(rs.getString(1));
                pl.setEmail(rs.getString(3));
                pl.setDOB(rs.getString(4));
                pl.setPhone(rs.getString(5));
                pl.setCreatedate(rs.getString(6));
                ds.add(pl);
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
            String sql = "delete from Admins where AdID=?";
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

    public static int changePass(String Pass, String user) {
        int r = -1;
        //1. tao ket noi tu ung dung java den sql server
        Connection cn = LoginDatabase.getConnect();
        try {
            //2. tao doi tuong statement chua linh update SQL
            String sql = "update Admins set AdPassword=? where AdID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            //3. set gia tri cho cac tham so ? trong linh update           
            pst.setString(1, Pass);
            pst.setString(2, user);
            //4. thuc hinh linh update SQL
            r = pst.executeUpdate();
            //5. dong cac resources
            pst.close();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }

    public ArrayList<Admin> Checkinsert() {
        ArrayList<Admin> ds = new ArrayList<>();
        Admin pl = null;
        Connection cn = LoginDatabase.getConnect();
        try {
            String s = "select AdID, AdEmail, AdPhone from Admins";
            Statement sta = cn.createStatement();
            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                pl = new Admin();
                pl.setName(rs.getString(1));
                pl.setEmail(rs.getString(2));
                pl.setPhone(rs.getString(3));
                ds.add(pl);
            }
            sta.close();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public ArrayList<Admin> getlogin() {
        ArrayList<Admin> ds = new ArrayList<>();
        Admin Am = null;
        Connection cn = LoginDatabase.getConnect();
        try {
            String s = "select AdID, AdPassword from Admins ";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                Am = new Admin();
                Am.setName(rs.getString(1));
                Am.setPassword(rs.getString(2));
                ds.add(Am);
            }
            sta.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static int changeAdmin(Admin ad) {
        int r = -1;
        //1. tao ket noi tu ung dung java den sql server
        Connection cn = LoginDatabase.getConnect();
        try {
            //2. tao doi tuong statement chua linh update SQL
            String sql = "update Admins set AdEmail=?, AdDOB=?, AdPhone=? where AdID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            //3. set gia tri cho cac tham so ? trong linh update           
            pst.setString(1, ad.getEmail());
            pst.setString(2, ad.getDOB());
            pst.setString(3, ad.getPhone());
            pst.setString(4, ad.getName());
            //4. thuc hinh linh update SQL
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
