/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;
import java.sql.*;

/**
 *
 * @author thnrg
 */
public class SqlCon {
    public static Connection GetCon()
    {
        try
        {
            Connection conn = DriverManager.getConnection(ReadProps.getInfo());
            return conn;
        }
        catch (SQLException ex)
        {
        }
        return null;
    }
}
