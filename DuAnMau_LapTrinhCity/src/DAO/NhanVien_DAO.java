/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import java.sql.*;
import Utils.Tools;

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
            System.out.println("select dbo.UserLogin('" + MaNV + "', '" + MatKhau + "') as status");
            rs.next();
            boolean result = rs.getBoolean("status");
            conn.close();
            return result;
            
        }
        catch(SQLException ex)
        {
            ex.printStackTrace();
        }
        return false;
    }
}
