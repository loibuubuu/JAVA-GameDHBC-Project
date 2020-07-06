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
 * @author LENOVO
 */
public class Player {

    public String Password;
    public String Name;
    public String Email;
    public String DOB;
    public String Phone;
    public Date JoinDate;
    public String picture;

    public Player() {
    }

    public Player(String Password, String Name, String Email, String DOB, String Phone, Date JoinDate, String picture) {
        this.Password = Password;
        this.Name = Name;
        this.Email = Email;
        this.DOB = DOB;
        this.Phone = Phone;
        this.JoinDate = JoinDate;
        this.picture = picture;
    }

    

    public String getPicture() {
        return picture;
    }

    public String getPassword() {
        return Password;
    }

    public String getName() {
        return Name;
    }

    public String getEmail() {
        return Email;
    }

    public String getDOB() {
        return DOB;
    }

    public String getPhone() {
        return Phone;
    }

    public Date getJoinDate() {
        return JoinDate;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setJoinDate(Date JoinDate) {
        this.JoinDate = JoinDate;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public Vector toVector() {
        Vector v = new Vector();
        v.add(getName());
        v.add(getEmail());
        v.add(getDOB());
        v.add(getPhone());
        v.add(getJoinDate());
        return v;
    }

}
