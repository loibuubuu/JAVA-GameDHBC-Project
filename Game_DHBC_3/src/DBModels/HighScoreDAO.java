/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBModels;

import DBConnection.*;
import DBEntities.vwHighScore;
import java.sql.*;
import java.util.ArrayList;

/**
 *
 * @author ThienKim
 */
public class HighScoreDAO {

    public static int insert(vwHighScore vwhighscore) {
        int r = -1;

        //1. Tao ket noi tu ung dung java den sql server
        Connection cn = MyLib.getConnect();
        //2.tao doi tuong Statement chua ling sql server

        try {
            String sql = "insert vwHighScore values(?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            //set gia tri cho cac tham so

            pst.setInt(1, vwhighscore.getRank());
            pst.setInt(2, vwhighscore.getPlayerScore());
            pst.setInt(3, vwhighscore.getquesId());
            pst.setString(4, vwhighscore.getPlayerID());
            pst.setDate(5, new Date(vwhighscore.getPlayedDate().getTime()));
            r = pst.executeUpdate();
            //5.dong cac resourses
            pst.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return r;
    }

    public ArrayList<vwHighScore> getList() {
        ArrayList<vwHighScore> ds = new ArrayList<>();
        vwHighScore vwhighscore = null;

        Connection cn = MyLib.getConnect();

        try {

            String s = "select * from vwHighScore";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                vwhighscore = new vwHighScore();
                vwhighscore.setRank(rs.getInt(1));
                vwhighscore.setPlayerID(rs.getString(2));
                vwhighscore.setPlayerScore(rs.getInt(3));
                vwhighscore.setquesId(rs.getInt(4));
                vwhighscore.setPlayedDate(rs.getDate(5));
                ds.add(vwhighscore);

            }
            sta.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }
}
