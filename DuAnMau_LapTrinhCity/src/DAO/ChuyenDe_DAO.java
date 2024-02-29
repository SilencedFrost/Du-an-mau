/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Models.ChuyenDe;
import Utils.Tools;
import java.util.ArrayList;
import java.sql.*;
import java.util.stream.Collectors;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author SIlencedFrost
 */
public  class ChuyenDe_DAO {
    
    public static ArrayList<ChuyenDe> getAllChuyenDe() {
        ArrayList<ChuyenDe> chuyenDeList = new ArrayList<>();

        try (Connection conn = Tools.GetCon())
        {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ChuyenDe");

            while (rs.next()) {
                ChuyenDe cd = new ChuyenDe();
                cd.setMaCD(rs.getString("MaCD"));
                cd.setTenCD(rs.getString("TenCD"));
                cd.setHocPhi(rs.getFloat("HocPhi"));
                cd.setThoiLuong(rs.getInt("ThoiLuong"));
                cd.setHinh(rs.getString("Hinh"));
                cd.setMoTa(rs.getString("MoTa"));
                chuyenDeList.add(cd);
            }
            conn.close();
        } 
        catch (SQLException e) {
        }

        return chuyenDeList;
    }
    
    public static void fillTable(JTable table, ArrayList<ChuyenDe> list) {
        String[] columnNames = {"MaCD", "TenCD", "HocPhi", "ThoiLuong", "Hinh", "MoTa"};

        DefaultTableModel model = new DefaultTableModel(columnNames, 0);

        for (ChuyenDe cd : list) {
            Object[] row = new Object[6];
            row[0] = cd.getMaCD();
            row[1] = cd.getTenCD();
            row[2] = cd.getHocPhi();
            row[3] = cd.getThoiLuong();
            row[4] = cd.getHinh();
            row[5] = cd.getMoTa();

            model.addRow(row);
        }

        table.setModel(model);
    }
    
    public static ArrayList<String> getColumn(String columnName) {
        ArrayList<String> columnData = new ArrayList<>();

        try (Connection conn = Tools.GetCon()) {
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT " + columnName + " FROM ChuyenDe");

            while (rs.next()) {
                columnData.add(rs.getString(columnName));
            }
            conn.close();
        } catch (SQLException e) {
        }

        return columnData;
    }
    
    public static void fillComboBox(JComboBox comboBox, ArrayList<String> data) {
        comboBox.removeAllItems();

        for (String item : data) {
            comboBox.addItem(item);
        }
    }
    
    public static ArrayList<ChuyenDe> filterChuyenDe(ArrayList<ChuyenDe> list, String attribute, String condition) {
        ArrayList<ChuyenDe> filteredList = new ArrayList<>();

        for (ChuyenDe cd : list) {
            switch (attribute) {
                case "maCD" -> {
                    if (cd.getMaCD().equals(condition)) {
                        filteredList.add(cd);
                    }
                }
                case "tenCD" -> {
                    if (cd.getTenCD().equals(condition)) {
                        filteredList.add(cd);
                    }
                }
                case "hinh" -> {
                    if (cd.getHinh().equals(condition)) {
                        filteredList.add(cd);
                    }
                }
                case "moTa" -> {
                    if (cd.getMoTa().equals(condition)) {
                        filteredList.add(cd);
                    }
                }
            }
        }

        return filteredList;
    }
}
