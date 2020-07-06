/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBModels;

import DBConnection.*;
import DBEntities.QA;
import DBEntities.GamePlayInfo;
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
public class QADAO {
    public static int insert(QA caudo){
        int r = -1;
                 

        //1. Tao ket noi tu ung dung java den sql server
        Connection cn = LoginDatabase.getConnect();
        //2.tao doi tuong Statement chua ling sql server

        try {
            String sql = "insert QA values(?,?,?,?,?,?)";
            PreparedStatement pst = cn.prepareStatement(sql);
            //set gia tri cho cac tham so
         
            pst.setInt(1, caudo.getquesId());
            pst.setString(2, caudo.getquesContent());
            pst.setString(3, caudo.getansContent());
            pst.setInt(4, caudo.getScenNo());
            pst.setInt(5, caudo.getquesGem());
            pst.setInt(6, caudo.getquesScore());
            r = pst.executeUpdate();
            //5.dong cac resourses
            pst.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
                return r;
    }
    
    public ArrayList<QA> getList() {
        ArrayList<QA> ds = new ArrayList<>();
        QA caudo = null;

        Connection cn = LoginDatabase.getConnect();

        try {

            String s = "select * from QA";
            Statement sta = cn.createStatement();

            ResultSet rs = sta.executeQuery(s);
            while (rs.next()) {
                caudo = new QA();
                caudo.setquesId(rs.getInt(1));
                caudo.setquesContent(rs.getString(2));
                caudo.setansContent(rs.getString(3));
                caudo.setScenNo(rs.getInt(4));
                caudo.setquesGem(rs.getInt(5));
                caudo.setquesScore(rs.getInt(6));
                ds.add(caudo);

            }
            sta.close();
            cn.close();

        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return ds;
    }
    
    public static int updateQA(QA qa) {
        int r = -1;
        //1. tao ket noi tu ung dung java den sql server
        Connection cn = LoginDatabase.getConnect();
        try {
            //2. tao doi tuong statement chua linh update SQL
            String sql = "update QA set quesContent=?, ansContent=?, ScenNo=?,quesGem =?, quesScore=? where quesId=?";
            PreparedStatement pst = cn.prepareStatement(sql);
            //3. set gia tri cho cac tham so ? trong linh update           
            pst.setString(1, qa.getquesContent());
            pst.setString(2, qa.getansContent());
            pst.setInt(3, qa.getquesScore());
            pst.setInt(4, qa.getquesGem());
            pst.setInt(5, qa.getquesScore());
            pst.setInt(6, qa.getquesId());
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
