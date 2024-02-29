/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import Models.ChuyenDe;
import Utils.Tools;
import java.util.ArrayList;
import java.sql.*;
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
                System.out.println("got data");
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
}
