package DBEntities;


import java.util.Vector;

public class Admin {

    public String Name;
    public String Password;
    public String Email;
    public String DOB;
    public String Phone;
    public String Createdate;

    public Admin() {
    }
    public Admin(String Password, String Name, String Email, String DOB, String Phone, String Createdate) {
        this.Name = Name;
        this.Password = Password;
        this.Email = Email;
        this.DOB = DOB;
        this.Phone = Phone;
        this.Createdate = Createdate;

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

    public String getCreatedate() {
        return Createdate;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public void setCreatedate(String Joidate) {
        this.Createdate = Joidate;
    }

    public Vector toVector() {
        Vector v = new Vector();
        v.add(getName());
   
        v.add(getEmail());
        v.add(getDOB());
        v.add(getPhone());
        v.add(getCreatedate());

        return v;
    }
}
