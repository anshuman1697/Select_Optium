/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login.gui;

import com.mysql.jdbc.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Majey
 */
public class MySQLConnection {
    public static Connection getConnection() throws Exception{
        String dbRoot = "jdbc:mysql://";
        String hostName = "localhost:3306/";
        String dbName = "lnct";
        String dbUrl = dbRoot+hostName+dbName;
        
        String hostUsername = "root";
        String hostPassword = "Anshu1697";
        
        Class.forName("com.mysql.jdbc.Driver");
        Connection myConn = (Connection)DriverManager.getConnection(dbUrl, hostUsername, hostPassword);

        return myConn;
    }
}
