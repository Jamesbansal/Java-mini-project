/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package school_management_system;
import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author james
 */
public class connector {
    public static void main(String[] args) {
         try {
                Class.forName("com.mysql.cj.jdbc.Driver");
                System.out.println("Loaded driver");
                Connection con = DriverManager.getConnection("jdbc:mysql://localhost/school?user=root&password=root");
                System.out.println("Connected to MySQL");
                con.close();
         } 
         catch (Exception ex) {
                ex.printStackTrace();
         }
    }
}

