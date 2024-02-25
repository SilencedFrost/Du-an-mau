/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author SIlencedFrost
 */
public class Connection {
    protected String dbname;
    protected String username;
    protected String pass;
    
    public static String getUrl()
    {
        try
        {
            FileReader reader = new FileReader("src/main/connection.properties");
            Properties prop = new Properties();
            prop.load(reader);
            return "jdbc:sqlserver//localhost/" + prop.getProperty("dbname");
        }
        catch (IOException ex)
        {
        }
        return null;
    }
    
    public static String getUser()
    {
        try
        {
            FileReader reader = new FileReader("src/main/connection.properties");
            Properties prop = new Properties();
            prop.load(reader);
            return prop.getProperty("username");
        }
        catch (IOException ex)
        {
        }
        return null;
    }
    
    public static String getPass()
    {
        try
        {
            FileReader reader = new FileReader("src/main/connection.properties");
            Properties prop = new Properties();
            prop.load(reader);
            return prop.getProperty("pass");
        }
        catch (IOException ex)
        {
        }
        return null;
    }
}
