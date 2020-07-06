/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBModels;

import DBEntities.Player;
import DBEntities.GamePlayInfo;
import DBConnection.*;
import DBEntities.PlayerInfo;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ThienKim
 */
public class GamePlayInfoDAO {

    public static int insert(GamePlayInfo gameplayinfo) {
        int r = -1;

        //1. Tao ket noi tu ung dung java den sql server
        Connection cn = MyLib.getConnect();
        //2.tao doi tuong Statement chua ling sql server

        try {
            String sql = "insert GamePlayInfo values(?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            //set gia tri cho cac tham so

            pst.setString(1, gameplayinfo.getPlayerID());
            pst.setInt(2, gameplayinfo.getquesId());
            pst.setInt(5, gameplayinfo.getPlayerScore());
            pst.setInt(4, gameplayinfo.getPlayerGem());
            pst.setDate(3, new Date(gameplayinfo.getPlayedDate().getTime()));
            r = pst.executeUpdate();
            //5.dong cac resourses
            pst.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }

    public ArrayList<GamePlayInfo> getList() {
        ArrayList<GamePlayInfo> ds = new ArrayList<>();
        GamePlayInfo gameplayinfo = null;

        Connection cn = MyLib.getConnect();

        try {

            String s = "select * from GamePlayInfo";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                gameplayinfo = new GamePlayInfo();
                gameplayinfo.setPlayerID(rs.getString(1));
                gameplayinfo.setquesId(rs.getInt(2));
                gameplayinfo.setPlayerScore(rs.getInt(5));
                gameplayinfo.setPlayerGem(rs.getInt(4));
                gameplayinfo.setPlayedDate(rs.getDate(3));
                ds.add(gameplayinfo);

            }
            sta.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }

    public static int updateGamePlayInfo(GamePlayInfo gameplayinfo) {
        int s = -1;

        Connection cn = MyLib.getConnect();

        try {
            //2.Tạo lệnh update để gọi lệnh sql
            String sql = "update GamePlayInfo set quesId=?, PlayedDate=?, PlayerGem=?, PlayerScore=? where PlayerID=?";
            PreparedStatement pst = cn.prepareStatement(sql);

            //3. Gán giá trị thuộc tính của các đối tượng cho các tham số ?
            pst.setInt(1, gameplayinfo.getquesId());
            pst.setDate(2, new Date(gameplayinfo.getPlayedDate().getTime()));
            pst.setInt(3, gameplayinfo.getPlayerGem());
            pst.setInt(4, gameplayinfo.getPlayerScore());
            pst.setString(5, gameplayinfo.getPlayerID());
            //4. Thi hành lệnh delete sql
            s = pst.executeUpdate();

            //5. Đóng các tài nguyên
            pst.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }

        return s;
    }

    public static int changeGem(int gem, String ID) {
        int r = -1;
        //1. tao ket noi tu ung dung java den sql server
        Connection cn = MyLib.getConnect();
        try {
            //2. tao doi tuong statement chua linh update SQL
            String sql = "update GamePlayInfo set PlayerGem=? where PlayerID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            //3. set gia tri cho cac tham so ? trong linh update 
            pst.setInt(1, gem);
            pst.setString(2, ID);

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

    public static int delete(int maID) {
        int r = -1;
        //1. tao ket noi tu ung dung java den sql server
        Connection cn = MyLib.getConnect();
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
    
    public ArrayList<GamePlayInfo> checkGem() {
        ArrayList<GamePlayInfo> ds = new ArrayList<>();
        GamePlayInfo gameplayinfo = null;

        Connection cn = MyLib.getConnect();

        try {

            String s = "select PlayerID, PlayerGem from GamePlayInfo";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                gameplayinfo = new GamePlayInfo();
                gameplayinfo.setPlayerID(rs.getString(1));
                gameplayinfo.setPlayerGem(rs.getInt(2));
                ds.add(gameplayinfo);

            }
            sta.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }
      public static int updateGem(int gem, String name) {
        int r = -1;
        //1. tao ket noi tu ung dung java den sql server
        Connection cn = MyLib.getConnect();
        try {
            //2. tao doi tuong statement chua linh update SQL
            // PlayerInfo.,PlayerInfo.PlayerGem, PlayerInfo.PlayerScore, PlayerInfo.PlayedDate
            String sql = "update GamePlayInfo set   PlayerGem=? where PlayerID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            //3. set gia tri cho cac tham so ? trong linh update           
           
            pst.setInt(1, gem);
           
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
}
