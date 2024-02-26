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
public class ReadProps {
    protected String dbname;
    protected String username;
    protected String pass;
    
    public static String getInfo()
    {
        try
        {
            FileReader reader = new FileReader("src/main/connection.properties");
            Properties prop = new Properties();
            prop.load(reader);
            return "jdbc:sqlserver://localhost:1433;databaseName=" + prop.getProperty("dbname") + ";username=" + prop.getProperty("username") + ";password=" + prop.getProperty("pass");
        }
        catch (IOException ex)
        {
        }
        return null;
    }
}
