/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Valkyrie.Enigma.EP.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author cmjd
 */
public class DBConnection {
    private Connection conn;
    private static DBConnection dbConnection;
    
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/enigma2","hesh","123");
    }
    public static DBConnection getDBConnection() throws ClassNotFoundException, SQLException{
        if(dbConnection==null){
            dbConnection=new DBConnection();
        }
        return  dbConnection;
    } 
    public Connection getConnection(){
        return conn;
    }
}
