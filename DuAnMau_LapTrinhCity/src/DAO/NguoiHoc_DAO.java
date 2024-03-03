/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Models.NguoiHoc;
import Utils.Tools;
import java.util.ArrayList;
import java.sql.*;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author SIlencedFrost
 */
public class NguoiHoc_DAO {
    public static ArrayList<NguoiHoc> getAllNguoiHoc() {
        ArrayList<NguoiHoc> nguoiHocList = new ArrayList<>();

        try {
            Connection conn = Tools.GetCon();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM NguoiHoc");

            while (rs.next()) {
                NguoiHoc nh = new NguoiHoc();
                nh.setMaNH(rs.getString("MaNH"));
                nh.setHoTen(rs.getString("HoTen"));
                nh.setNgaySinh(rs.getDate("NgaySinh"));
                nh.setGioiTinh(rs.getBoolean("GioiTinh"));
                nh.setDienThoai(rs.getString("DienThoai"));
                nh.setEmail(rs.getString("Email"));
                nh.setGhiChu(rs.getString("GhiChu"));
                nh.setMaNV(rs.getString("MaNV"));
                nh.setNgayDK(rs.getDate("NgayDK"));
                nguoiHocList.add(nh);
            }
        } 
        catch (SQLException e) {
        }

        return nguoiHocList;
    }
    
    public static void fillTable(JTable table, ArrayList<NguoiHoc> list) {
        String[] columnNames = {"MaNH", "HoTen", "NgaySinh", "GioiTinh", "DienThoai", "Email", "GhiChu", "MaNV", "NgayDK"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        for (NguoiHoc nh : list) {
            Object[] row = new Object[9];
            row[0] = nh.getMaNH();
            row[1] = nh.getHoTen();
            row[2] = nh.getNgaySinh();
            row[3] = (nh.isGioiTinh())?"Nam":"Nữ";
            row[4] = nh.getDienThoai();
            row[5] = nh.getEmail();
            row[6] = nh.getGhiChu();
            row[7] = nh.getMaNV();
            row[8] = nh.getNgayDK();
            model.addRow(row);
        }

        table.setModel(model);
    }
    
    public static ArrayList<NguoiHoc> filterNguoiHoc(ArrayList<NguoiHoc> list, String attribute, String condition) {
        ArrayList<NguoiHoc> filteredList = new ArrayList<>();

        for (NguoiHoc nh : list) {
            switch (attribute) {
                case "maNH" -> {
                    if (nh.getMaNH().equals(condition)) {
                        filteredList.add(nh);
                    }
                }
                case "hoTen" -> {
                    if (nh.getHoTen().equals(condition)) {
                        filteredList.add(nh);
                    }
                }
                case "dienThoai" -> {
                    if (nh.getDienThoai().equals(condition)) {
                        filteredList.add(nh);
                    }
                }
                case "email" -> {
                    if (nh.getEmail().equals(condition)) {
                        filteredList.add(nh);
                    }
                }
                case "ghiChu" -> {
                    if (nh.getGhiChu().equals(condition)) {
                        filteredList.add(nh);
                    }
                }
                case "maNV" -> {
                    if (nh.getMaNV().equals(condition)) {
                        filteredList.add(nh);
                    }
                }
            }
        }

        return filteredList;
    }
}
