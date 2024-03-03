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

        try (Connection conn = Tools.GetCon())
        {
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
            conn.close();
        } 
        catch (SQLException e) {
        }

        return hocVienList;
    }
    
    public static void fillTable(JTable table, ArrayList<HocVien> list) {
        String[] columnNames = {"MaHV", "MaKH", "MaNH", "Diem"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0){
            @Override
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

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
    
    public static ArrayList<HocVien> filterHocVien(ArrayList<HocVien> list, String attribute, String condition) {
        ArrayList<HocVien> filteredList = new ArrayList<>();

        for (HocVien hv : list) {
            switch (attribute) {
                case "maHV" -> {
                    if (String.valueOf(hv.getMaHV()).equals(condition)) {
                        filteredList.add(hv);
                    }
                }
                case "maKH" -> {
                    if (String.valueOf(hv.getMaKH()).equals(condition)) {
                        filteredList.add(hv);
                    }
                }
                case "maNH" -> {
                    if (hv.getMaNH().equals(condition)) {
                        filteredList.add(hv);
                    }
                }
                case "diem" -> {
                    if (String.valueOf(hv.getDiem()).equals(condition)) {
                        filteredList.add(hv);
                    }
                }
            }
        }

        return filteredList;
    }
    
    public static void removeStudent(int MaHV)
    {
        try (Connection conn = Tools.GetCon())
        {
            PreparedStatement stm = conn.prepareStatement("Delete HocVien where MaHV = ?");
            stm.setInt(1, MaHV);
            stm.executeQuery();
            conn.close();
        }
        catch (SQLException ex)
        {
            
        }
    }
    
    public static void addStudent(int MaKH, String MaNH)
    {
        try (Connection conn = Tools.GetCon())
        {
            PreparedStatement stm = conn.prepareStatement("Insert into HocVien(MaKH, MaNH, Diem) values (?, ?, ?)");
            stm.setInt(1, MaKH);
            stm.setString(2, MaNH);
            stm.setFloat(3, 0);
            stm.executeQuery();
            conn.close();
        }
        catch(SQLException ex)
        {
            
        }
    }
    
    public static void updateScore(int MaHV, float Score)
    {
        try (Connection conn = Tools.GetCon())
        {
            PreparedStatement stm = conn.prepareStatement("update HocVien set Diem = ? where MaHV = ?");
            stm.setFloat(1, Score);
            stm.setInt(2, MaHV);
            stm.executeQuery();
            conn.close();
        }
        catch(SQLException ex)
        {
            
        }
    }
}
