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
public class NhanVien_DAO {
    public static boolean login(String MaNV, String MatKhau)
    {
        
        try
        {
            Connection conn = Tools.GetCon();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select dbo.UserLogin('" + MaNV + "', '" + MatKhau + "') as status");
            rs.next();
            boolean result = rs.getBoolean("status");
            conn.close();
            return result;
            
        }
        catch(Exception ex)
        {
            
        }
        return false;
    }
}
