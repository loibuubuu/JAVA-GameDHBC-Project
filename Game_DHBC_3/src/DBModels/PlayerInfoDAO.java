/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBModels;

import DBConnection.*;
import DBEntities.PlayerInfo;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ThienKim
 */
public class PlayerInfoDAO {
    
    public ArrayList<PlayerInfo> getlogin() {
        ArrayList<PlayerInfo> ds = new ArrayList<>();
        PlayerInfo pl = null;
        Connection cn = LoginDatabase.getConnect();
        try {
            String sql = "select Players.PlayerID, Players.PlayerPassword, GamePlayInfo.quesId,GamePlayInfo.PlayerGem, GamePlayInfo.PlayerScore, GamePlayInfo.PlayedDate from GamePlayInfo\n"
                    + "join Players\n"
                    + "on GamePlayInfo.PlayerID = Players.PlayerID";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(sql);
            while (rs.next()) {
                pl = new PlayerInfo();
                pl.setName(rs.getString(1));
                pl.setPassword(rs.getString(2));
                pl.setquesId(rs.getInt(3));
                pl.setPlayerGem(rs.getInt(4));
                pl.setPlayerScore(rs.getInt(5));
                pl.setPlayedDate(rs.getDate(6));
                ds.add(pl);
            }
            sta.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }
    
    public static int update(PlayerInfo playerinfo) {
        int r = -1;
        //1. tao ket noi tu ung dung java den sql server
        Connection cn = LoginDatabase.getConnect();
        try {
            //2. tao doi tuong statement chua linh update SQL
            // PlayerInfo.,PlayerInfo.PlayerGem, PlayerInfo.PlayerScore, PlayerInfo.PlayedDate
            String sql = "update GamePlayInfo set quesId =? , PlayerGem=?, PlayerScore=?, PlayedDate= GETDATE() where PlayerID=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            //3. set gia tri cho cac tham so ? trong linh update           
            pst.setInt(1, playerinfo.getquesId());
            pst.setInt(2, playerinfo.getPlayerGem());
            pst.setInt(3, playerinfo.getPlayerScore());
            pst.setString(4, playerinfo.getName());
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
    
    public ArrayList<PlayerInfo> checkGem() {
        ArrayList<PlayerInfo> ds = new ArrayList<>();
        PlayerInfo gameplayinfo = null;

        Connection cn = LoginDatabase.getConnect();

        try {

            String s = "select PlayerID, PlayerGem from GamePlayInfo";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                gameplayinfo = new PlayerInfo();
                gameplayinfo.setName(rs.getString(1));
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
    
    public static int changeGem(int gem, String ID) {
        int r = -1;
        //1. tao ket noi tu ung dung java den sql server
        Connection cn = LoginDatabase.getConnect();
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
    
   
}
