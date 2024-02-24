/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package TestPackage;
import java.sql.*;

/**
 *
 * @author SIlencedFrost
 */
public class databaseconnect {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            String url = "jdbc:sqlserver://localhost/LapTrinhCity_NguyenQuocMinh_TS00553";
            String username = "sa";
            String password = "12345678";
            
            Connection conn = DriverManager.getConnection(url, username, password);
            conn.close();
            System.out.println("connection successful");
        }
        catch(SQLException ex) {
            System.err.println("nope!");
            System.exit(0);
        }
    }
}
