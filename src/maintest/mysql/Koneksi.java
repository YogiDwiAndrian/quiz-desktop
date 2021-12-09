/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintest.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author arief
 */
public class Koneksi {
    
    private static Connection koneksi;
    
    public static Connection getKoneksi(){
        try{
            String DB = "jdbc:mysql://localhost/game";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            
            koneksi = (Connection) DriverManager.getConnection(DB, user, pass);
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Tidak ada koneksi", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        
        return koneksi;
    }
}
