/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Models.NhanVien;
import Utils.Tools;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author thnrg
 */
public class NhanVien_DAO {
    public static boolean login(String MaNV, String MatKhau)
    {
        boolean result = false;
        try(Connection conn = Tools.GetCon())
        {
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("select dbo.UserLogin('" + MaNV + "', '" + MatKhau + "') as status");
            rs.next();
            result = rs.getBoolean("status");
            conn.close();
        }
        catch(SQLException ex)
        {
        }
        return result;
    }
    
    public static ArrayList<NhanVien> getAllNhanVien() {
        ArrayList<NhanVien> nhanVienList = new ArrayList<>();

        try (Connection conn = Tools.GetCon())
        {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM NhanVien");

            while (rs.next()) {
                NhanVien nv = new NhanVien();
                nv.setHoTen(rs.getString("HoTen"));
                nv.setMaNV(rs.getString("MaNV"));
                nv.setVaiTro(rs.getBoolean("VaiTro"));
                nhanVienList.add(nv);
            }
            conn.close();
        } catch (SQLException e) {
        }

        return nhanVienList;
    }
    
    public static void fillTable(JTable table, ArrayList<NhanVien> list) {
        String[] columnNames = {"MaNV", "HoTen", "VaiTro"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (NhanVien nv : list) {
            Object[] row = new Object[3];
            row[0] = nv.getMaNV();
            row[1] = nv.getHoTen();
            row[2] = nv.isVaiTro();

            model.addRow(row);
        }

        table.setModel(model);
    }
}
