/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author thnrg
 */
public class Tools 
{
    public static Icon GetScaledIcon(String path, JLabel scalefor)
    {
        ImageIcon icon = new ImageIcon(path);
        Image image = icon.getImage();
        Image scaled = image.getScaledInstance(scalefor.getWidth(), scalefor.getHeight(), java.awt.Image.SCALE_SMOOTH);
        return new ImageIcon(scaled);
    }
    
    public static void SetFrameToCenter (JFrame frame)
    {
        Dimension dim = Toolkit.getDefaultToolkit().getScreenSize();
        frame.setLocation(dim.width/2-frame.getSize().width/2, dim.height/2-frame.getSize().height/2);
    }
    
    public static Connection GetCon()
    {
        try
        {
            Connection conn = DriverManager.getConnection(getConInfo());
            return conn;
        }
        catch (SQLException ex)
        {
        }
        return null;
    }
    
    public static String getConInfo()
    {
        return "jdbc:sqlserver://localhost:1433;databaseName=" + ReadProps.getDBName() + ";username=" + ReadProps.getUsername() + ";password=" + ReadProps.getPassword();
    }
}
