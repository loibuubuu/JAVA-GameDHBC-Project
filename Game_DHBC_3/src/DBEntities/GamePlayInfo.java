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
public class GamePlayInfo {

 public String PlayerID;
    public int quesId, PlayerScore, PlayerGem;
    public Date PlayedDate;

    public GamePlayInfo() {
    }

    public GamePlayInfo(String PlayerID, int quesId, int PlayerScore, int PlayerGem, Date PlayedDate) {
        this.PlayerID = PlayerID;
        this.quesId = quesId;
        this.PlayerScore = PlayerScore;
        this.PlayerGem = PlayerGem;
        this.PlayedDate = PlayedDate;
    }

    

    public Vector toVector(){
        Vector v = new Vector();
        v.add(PlayerID);
        v.add(quesId);
        v.add(PlayerScore);
        v.add(PlayerGem);
        v.add(PlayedDate);
        return v;
    }
    
    public String getPlayerID() {
        return PlayerID;
    }

    public int getquesId() {
        return quesId;
    }

    public int getPlayerScore() {
        return PlayerScore;
    }
    
    public int getPlayerGem() {
        return PlayerGem;
    }

    public Date getPlayedDate() {
        return PlayedDate;
    }

    public void setPlayerID(String PlayerID) {
        this.PlayerID = PlayerID;
    }

    public void setquesId(int quesId) {
        this.quesId = quesId;
    }

    public void setPlayerScore(int PlayerScore) {
        this.PlayerScore = PlayerScore;
    }
    
    public void setPlayerGem(int PlayerGem) {
        this.PlayerGem = PlayerGem;
    }

    public void setPlayedDate(Date PlayedDate) {
        this.PlayedDate = PlayedDate;
    }
}
