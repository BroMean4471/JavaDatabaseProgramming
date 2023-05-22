/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbprogamming2;

import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.PreparedStatement;

/**
 *
 * @author Bromean
 */
public class LAB12 {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        String  url = "jdbc:mysql://127.0.0.1:3306/mydb2";
        String  username = "root";
        String  password = "123456";
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            
            String sql = "INSERT INTO student (studentID,firstName,lastName,email,deptID) values (?,?,?,?,?)";
            PreparedStatement preparedStatement= connection.prepareStatement(sql);
            
            preparedStatement.setString(1, "64111");
            preparedStatement.setString(2, "Phachara");
            preparedStatement.setString(3, "Boonlamai");
            preparedStatement.setString(4, "phachara.boon@gmail.com");
            preparedStatement.setString(5, "IT");
            
            preparedStatement.executeUpdate();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(LAB8.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
