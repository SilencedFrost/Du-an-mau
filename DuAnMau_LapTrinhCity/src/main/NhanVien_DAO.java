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
    public boolean login(String MaNV, String MatKhau)
    {
        
        try
        {
            Connection conn = SqlCon.GetCon();
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select dbo.UserLogin()");
            return rs.first();
        }
        catch(Exception ex)
        {
            
        }
        return false;
    }
}
