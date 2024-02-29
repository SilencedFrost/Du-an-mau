/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import Models.KhoaHoc;
import Utils.Tools;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SIlencedFrost
 */
public class KhoaHoc_DAO {
    public static ArrayList<KhoaHoc> getAllKhoaHoc() {
        ArrayList<KhoaHoc> khoaHocList = new ArrayList<>();

        try {
            Connection conn = Tools.GetCon();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM KhoaHoc");

            while (rs.next()) {
                KhoaHoc kh = new KhoaHoc();
                kh.setMaKH(rs.getInt("MaKH"));
                kh.setMaCD(rs.getString("MaCD"));
                kh.setHocPhi(rs.getFloat("HocPhi"));
                kh.setThoiLuong(rs.getInt("ThoiLuong"));
                kh.setNgayKG(rs.getDate("NgayKG"));
                kh.setGhiChu(rs.getString("GhiChu"));
                kh.setMaNV(rs.getString("MaNV"));
                kh.setNgayTao(rs.getDate("NgayTao"));
                khoaHocList.add(kh);
            }
        } 
        catch (SQLException e) 
        {
        }

        return khoaHocList;
    }
    
    public static void fillTable(JTable table, ArrayList<KhoaHoc> list) {
        String[] columnNames = {"MaKH", "MaCD", "HocPhi", "ThoiLuong", "NgayKG", "GhiChu", "MaNV", "NgayTao"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (KhoaHoc kh : list) {
            Object[] row = new Object[8];
            row[0] = kh.getMaKH();
            row[1] = kh.getMaCD();
            row[2] = kh.getHocPhi();
            row[3] = kh.getThoiLuong();
            row[4] = kh.getNgayKG();
            row[5] = kh.getGhiChu();
            row[6] = kh.getMaNV();
            row[7] = kh.getNgayTao();
            model.addRow(row);
        }

        table.setModel(model);
    }
}
