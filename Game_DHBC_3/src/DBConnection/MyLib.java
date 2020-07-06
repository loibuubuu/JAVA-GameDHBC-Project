
//Day la lop thu vien de nap du lieu


package DBConnection;

import java.sql.*;



public class MyLib {
//    Nap jdbc va dang ky driver den csdl
    public static java.sql.Connection getConnect(){
        java.sql.Connection  cn = null;
        
        try {
//                    Nap va dang ky Driver
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            
//            Mo ket noi den SQL server,lam viec voi database sim2-demo
            String url  = "jdbc:sqlserver://localhost:1433; database  = Game_DHBC";
            cn = DriverManager.getConnection(url,"sa","123");
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
            return cn;
    }
       public static void main(String[] args) {
        Connection d = MyLib.getConnect(); 

         
         if(d != null){
             System.out.println("Success");
         }
    }
}
