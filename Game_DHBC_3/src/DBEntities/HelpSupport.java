/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DBEntities;

import java.util.Vector;

/**
 *
 * @author LENOVO
 */
public class HelpSupport {
    public int caseid;
    public String Name;
    public String casetitle;
    public String messages;
    public byte[] image;
    public String ReceivedDate;

    public HelpSupport() {
    }

    public HelpSupport(int caseid, String Name, String casetitle, String messages, byte[] image, String ReceivedDate ) {
        this.caseid = caseid;
        this.Name = Name;
        this.casetitle = casetitle;
        this.messages = messages;
        this.image = image;
        this.ReceivedDate = ReceivedDate;
    }

    public int getCaseid() {
        return caseid;
    }

    public void setReceivedDate(String ReceivedDate) {
        this.ReceivedDate = ReceivedDate;
    }

    public String getReceivedDate() {
        return ReceivedDate;
    }

    public String getName() {
        return Name;
    }

    public String getCasetitle() {
        return casetitle;
    }

    public String getMessages() {
        return messages;
    }

    public byte[] getIMage() {
        return image;
    }

    public void setCaseid(int caseid) {
        this.caseid = caseid;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setCasetitle(String casetitle) {
        this.casetitle = casetitle;
    }

    public void setMessages(String messages) {
        this.messages = messages;
    }

    public void setImage(byte[] image) {
        this.image = image;
    }
        public Vector toVector() {
        Vector v = new Vector();
       
        v.add(getCaseid());
         v.add(getName());
        v.add(getCasetitle());
        v.add(getMessages());
        v.add(getReceivedDate());
        
        return v;
    }
    
}
