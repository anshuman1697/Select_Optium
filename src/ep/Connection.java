/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ep;

import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 *
 * @author SMART
 */
public class Connection {
    public static void main(String args[])
    {
        try{
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/lnct","root","Anshu1697");
            System.out.println("Connection Estlablish");
            conn.close();
        }catch (Exception e){
            System.out.println("Connection Failed");
        }
    }

    PreparedStatement prepareStatement(String sql) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
