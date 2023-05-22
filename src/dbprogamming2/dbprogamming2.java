/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbprogamming2;

import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Connection;
import java.sql.Statement;
/**
 *
 * @author Bromean
 */
public class dbprogamming2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String  url = "jdbc:mysql://127.0.0.1:3306/mydb2";
        String  username = "root";
        String  password = "123456";
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("Driver Loaded");
            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Database Connected");
            Statement statement = connection.createStatement();
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(dbprogamming2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(dbprogamming2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
