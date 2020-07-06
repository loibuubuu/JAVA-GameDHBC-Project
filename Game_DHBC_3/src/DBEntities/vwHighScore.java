/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBEntities;

import java.sql.Date;
import java.util.Vector;

/**
 *
 * @author ThienKim
 */
public class vwHighScore {
    private int Rank,PlayerScore, quesId;
    private String PlayerID;
    private Date PlayedDate;

    public vwHighScore() {
    }

    public vwHighScore(int Rank, int PlayerScore, int quesId, String PlayerID, Date PlayedDate) {
        this.Rank = Rank;
        this.PlayerScore = PlayerScore;
        this.quesId = quesId;
        this.PlayerID = PlayerID;
        this.PlayedDate = PlayedDate;
    }

    
    
    public Vector toVector(){
        Vector v = new Vector();
        v.add(Rank);
        v.add(PlayerScore);
        v.add(quesId);
        v.add(PlayerID);
        v.add(PlayedDate);
        return v;
        }
    
    public int getRank(){
        return Rank;
    }
    
    public int getPlayerScore(){
        return PlayerScore;
    }
    
    public int getquesId(){
        return quesId;
    }
    
    public String getPlayerID(){
        return PlayerID;
    }
    
    public Date getPlayedDate(){
        return PlayedDate;
    }
    
    public void setRank(int Rank){
        this.Rank = Rank;
    }
    
    public void setPlayerScore(int PlayerScore){
        this.PlayerScore = PlayerScore;
    }
    
    public void setquesId(int quesId){
        this.quesId = quesId;
    }
    
    public void setPlayerID(String PlayerID){
        this.PlayerID = PlayerID;
    }
    
    public void setPlayedDate(Date PlayedDate){
        this.PlayedDate = PlayedDate;
    }
}
