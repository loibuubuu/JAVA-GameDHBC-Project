package DBModels;

import DBEntities.Player;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import DBConnection.*;

public class PlayerDAO {


    public ArrayList<Player> getList() {
        ArrayList<Player> ds = new ArrayList<>();
        Player pl = null;

        Connection cn = MyLib.getConnect();

        try {

            String s = "select PlayerID, PlayerEmail, PlayerDOB, PlayerPhone, JoinDate from Players ";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                pl = new Player();
                pl.setName(rs.getString(1));
                pl.setEmail(rs.getString(2));
                pl.setDOB(rs.getString(3));
                pl.setPhone(rs.getString(4));
                pl.setJoinDate(rs.getDate(5));
                ds.add(pl);
            }
            sta.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public ArrayList<Player> getlogin() {
        ArrayList<Player> ds = new ArrayList<>();
        Player pl = null;
        Connection cn = MyLib.getConnect();
        try {
            String s = "select PlayerID, PlayerPassword from Players ";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                pl = new Player();
                pl.setName(rs.getString(1));
                pl.setPassword(rs.getString(2));
                ds.add(pl);
            }
            sta.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static int insertRegister(Player player) {
        int r = -1;
        Connection cn = MyLib.getConnect();
        try {
            String sql = "insert into Players (PlayerID,PlayerPassword,PlayerEmail,PlayerDOB,PlayerPhone) values(?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            //set gia tri cho cac tham so
            pst.setString(1, player.getName());
            pst.setString(2, player.getPassword());
            pst.setString(3, player.getEmail());
            pst.setString(4, player.getDOB());
            pst.setString(5, player.getPhone());
            r = pst.executeUpdate();
            pst.close();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }

    public static ArrayList<Player> CheckRegister() {
        ArrayList<Player> ds = new ArrayList<>();
        Player pl = null;
        Connection cn = MyLib.getConnect();
        try {
            String s = "select PlayerID, PlayerEmail, PlayerDOB, PlayerPhone from Players";
            Statement sta = cn.createStatement();
            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                pl = new Player();
                pl.setName(rs.getString(1));
                pl.setEmail(rs.getString(2));
                pl.setDOB(rs.getString(3));
                pl.setPhone(rs.getString(4));
                ds.add(pl);
            }
            sta.close();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }
//          public  ArrayList<Player> getList1() {
//        ArrayList<Player> ds = new ArrayList<>();
//        Player player = null;
//
//        Connection cn = MyLib.getConnect();
//
//        try {
//
//            String s = "select * from Players";
//            Statement sta = cn.createStatement();
//
//            ResultSet rs = sta.executeQuery(s);
//            while (rs.next()) {
//                player = new Player();
//                player.setName(rs.getString(1));
//                player.setPassword(rs.getString(2)); 
//                player.setEmail(rs.getString(4)); 
//                player.setDOB(rs.getString(5));
//                player.setPhone(rs.getString(6)); 
//                player.setJoidate(rs.getDate(7));
//                player.setGem(rs.getInt(8));
//               
//                ds.add(player);
//
//            }
//            sta.close();
//            cn.close();
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        return ds;
//    }

    public static int changeavata(String picture, String name) {
        int r = -1;
        //1. tao ket noi tu ung dung java den sql server
        Connection cn = MyLib.getConnect();
        try {
            //2. tao doi tuong statement chua linh update SQL
            String sql = "update Players set PlayerAvatar=? where PlayerID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            //3. set gia tri cho cac tham so ? trong linh update           
            pst.setString(1, picture);
            pst.setString(2, name);
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

    public static int changeProfile(Player pl) {
        int r = -1;
        //1. tao ket noi tu ung dung java den sql server
        Connection cn = MyLib.getConnect();
        try {
            //2. tao doi tuong statement chua linh update SQL
            String sql = "update Players set PlayerEmail=?, PlayerDOB=?, PlayerPhone=? where PlayerID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            //3. set gia tri cho cac tham so ? trong linh update           
            pst.setString(1, pl.getEmail());
            pst.setString(2, pl.getDOB());
            pst.setString(3, pl.getPhone());
            pst.setString(4, pl.getName());
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

    public static ArrayList<Player> picture() {
        ArrayList<Player> ds = new ArrayList<>();
        Player pl = null;
        Connection cn = MyLib.getConnect();
        try {
            String s = "select PlayerID, PlayerAvatar from Players";
            Statement sta = cn.createStatement();
            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                pl = new Player();
                pl.setName(rs.getString(1));
                pl.setPicture(rs.getString(2));
                ds.add(pl);
            }
            sta.close();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static int changePass(String Pass, String user) {
        int r = -1;

        Connection cn = MyLib.getConnect();
        try {

            String sql = "update Players set PlayerPassword=? where PlayerID=?";
            PreparedStatement pst = cn.prepareStatement(sql);

            pst.setString(1, Pass);
            pst.setString(2, user);

            r = pst.executeUpdate();

            pst.close();
            cn.close();
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }
}
