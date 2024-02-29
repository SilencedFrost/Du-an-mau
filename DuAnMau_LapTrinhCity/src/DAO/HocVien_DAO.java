/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.HocVien;
import Utils.Tools;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SIlencedFrost
 */
public class HocVien_DAO {
    public static ArrayList<HocVien> getAllHocVien() {
        ArrayList<HocVien> hocVienList = new ArrayList<>();

        try {
            Connection conn = Tools.GetCon();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM HocVien");

            while (rs.next()) {
                HocVien hv = new HocVien();
                hv.setMaHV(rs.getInt("MaHV"));
                hv.setMaKH(rs.getInt("MaKH"));
                hv.setMaNH(rs.getString("MaNH"));
                hv.setDiem(rs.getFloat("Diem"));
                hocVienList.add(hv);
            }
        } 
        catch (SQLException e) {
        }

        return hocVienList;
    }
    
    public static void fillTable(JTable table, ArrayList<HocVien> list) {
        String[] columnNames = {"MaHV", "MaKH", "MaNH", "Diem"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (HocVien hv : list) {
            Object[] row = new Object[4];
            row[0] = hv.getMaHV();
            row[1] = hv.getMaKH();
            row[2] = hv.getMaNH();
            row[3] = hv.getDiem();
            model.addRow(row);
        }

        table.setModel(model);
    }
}
