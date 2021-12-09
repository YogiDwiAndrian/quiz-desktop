/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintest.mysql;

import maintest.Objek.Activity;

import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import maintest.guiadmin.LoginAdmin;
import maintest.guiadmin.admin;
/**
 *
 * @author arief
 */
public class Query {
    public static boolean mulaiTest(String nama){
 
        try{
            Connection conn = Koneksi.getKoneksi();
            Statement stt = conn.createStatement();
            stt.executeUpdate("INSERT INTO user VALUES(NULL, '"+ nama +"')");
            
            ResultSet rs = stt.executeQuery("SELECT * FROM user ORDER BY id_user DESC LIMIT 1");
            
            while(rs.next()){
                Activity user = new Activity();
                user.setIdUser(rs.getInt(1));
                user.setNama(rs.getString(2));
                
            }

                    
                    
            return true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            
            return false;
        }
    }
    
    
    public static String[] getSoal(int id_kategori, int no){
        try{
            Connection conn = Koneksi.getKoneksi();
            Statement stt = conn.createStatement();
            ResultSet rs = stt.executeQuery(
                    "SELECT text_soal, jawaban_a, jawaban_b, jawaban_c, jawaban_d, kunci_jawaban FROM `soal_jawaban` "
                    
                    + "WHERE id_kategori = "+ id_kategori
                    + " LIMIT 1 OFFSET " + no);
            
            String[] data = new String[6];
            

            while(rs.next()){
                
                data[0] = rs.getString("text_soal");
                data[1] = rs.getString("jawaban_a");
                data[2] = rs.getString("jawaban_b");
                data[3] = rs.getString("jawaban_c");
                data[4] = rs.getString("jawaban_d");
                data[5] = rs.getString("kunci_jawaban");
    
                
            }
            
            Activity user = new Activity();
            user.setKunciJawaban(data[5]);
            
            user.setIdKategori(id_kategori);
            
            return data;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            return null;
        }
    }
    
    public static boolean mulaiRank(int id_user, int id_kategori){
        
        try{
            Connection conn = Koneksi.getKoneksi();
            Statement stt = conn.createStatement();
            
            stt.executeUpdate("INSERT INTO rank VALUES(NULL, NOW(), 0, 0, "+ id_user +", "+ id_kategori +" )");
            
            ResultSet rs = stt.executeQuery("SELECT id_rank, id_kategori FROM rank ORDER BY id_rank DESC LIMIT 1");
            
            while(rs.next()){
                Activity user = new Activity();
                user.setIdRank(rs.getInt("id_rank"));
                
            }
            
            return true;
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            
            return false;
        }
    }
    
    public static void setDurasi(int id_kategori){
        try{
            
            Connection conn = Koneksi.getKoneksi();
            Statement stt = conn.createStatement();
            
            ResultSet rs = stt.executeQuery("SELECT durasi FROM kategori_soal WHERE id_kategori = " + id_kategori);
            
            while(rs.next()){
                Activity user = new Activity();
                user.setDurasi(rs.getInt("durasi"));
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
        }
    }
    
    public static void updateSkorDanSisa(int id_rank, int skor, int sisa){
        
        try{
            
            Connection conn = Koneksi.getKoneksi();
            Statement stt = conn.createStatement();
            String query = "UPDATE rank SET skor = "+ skor +", sisa_durasi = "+ sisa +" WHERE id_rank = " + id_rank;
            stt.executeUpdate(query);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
        }
    }
    
    public static void updateSkor(int id_rank, int skor){
        
        
        
        try{
            
            Connection conn = Koneksi.getKoneksi();
            Statement stt = conn.createStatement();
            String query = "UPDATE rank SET skor = "+ skor +" WHERE id_rank = " + id_rank;
            stt.executeUpdate(query);
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
        }
    }
    
    
    
    public static String getSkorIQ(int id_user){
        try{
            
            Connection conn = Koneksi.getKoneksi();
            Statement stt = conn.createStatement();
            String query = "SELECT skor from rank WHERE id_user = "+ id_user +" and id_kategori = 1";
            ResultSet rs =  stt.executeQuery(query);
            
            String data;
            
            if(rs.next()){
                data = rs.getString("skor");
                
                
                return data;
            }else{
                return null;
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            
            return null;
        }
        
    }
    
    public static String getSkorUmum(int id_user){
        try{
            
            Connection conn = Koneksi.getKoneksi();
            Statement stt = conn.createStatement();
            String query = "SELECT skor from rank WHERE id_user = "+ id_user +" and id_kategori = 4";
            ResultSet rs =  stt.executeQuery(query);
            
            String data;
            
            if(rs.next()){
                data = rs.getString("skor");
                
                
                return data;
            }else{
                return null;
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            
            return null;
        }
        
    }
    
    public static String getSkorPsikotes(int id_user){
        try{
            
            Connection conn = Koneksi.getKoneksi();
            Statement stt = conn.createStatement();
            String query = "SELECT skor from rank WHERE id_user = "+ id_user +" and id_kategori = 2";
            ResultSet rs =  stt.executeQuery(query);
            
            String data;
            
            if(rs.next()){
                data = rs.getString("skor");
                
                
                return data;
            }else{
                return null;
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            
            return null;
        }
        
    }
    
    public static String getSkorLogika(int id_user){
        try{
            
            Connection conn = Koneksi.getKoneksi();
            Statement stt = conn.createStatement();
            String query = "SELECT skor from rank WHERE id_user = "+ id_user +" and id_kategori = 3";
            ResultSet rs =  stt.executeQuery(query);
            
            String data;
            
            if(rs.next()){
                data = rs.getString("skor");
                
                
                return data;
            }else{
                return null;
            }
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            
            return null;
        }
        
    }
    
    public static ResultSet getTopRank(int id_kategori){
        
        try{
            
            Connection conn = Koneksi.getKoneksi();
            Statement stt = conn.createStatement();
            String query = "SELECT user.nama_user ,skor, sisa_durasi FROM rank" +
                            " INNER JOIN user USING(id_user)" +
                            " WHERE id_kategori = " + id_kategori + 
                            " ORDER BY skor DESC LIMIT 3";
            ResultSet rs =  stt.executeQuery(query);
            
            return rs;
            
            
        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
            
            return null;
        }
    }
    
    //INSERT DATA
    public Boolean add(String soal, String a, String b, String c, String d, String jawaban, String kategori){
        //SQL STATEMENT
        String sql = 
                "INSERT INTO soal_jawaban(text_soal,jawaban_a,jawaban_b,jawaban_c,jawaban_d,kunci_jawaban,id_kategori) VALUES('" + soal + "','" + a + "','" + b + "','" + c+ "','" + d + "','" + jawaban + "','" + kategori + "')";
                
             try {
            //GET COONECTION
            Connection con = Koneksi.getKoneksi();

            // PREPARED STMT
            Statement s = con.prepareStatement(sql);

            s.execute(sql);

            return true;

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
        }
        return false;
    }
    
     //RETRIEVE DATA
    public DefaultTableModel getData(String kategori) {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Soal");
        dm.addColumn("A");
        dm.addColumn("B");
        dm.addColumn("C");
        dm.addColumn("D");
        dm.addColumn("Jawaban");

        //SQL STATEMENT
        String sql = "SELECT `id_soal_jawaban` as `ID`, `text_soal` as `Soal`, `jawaban_a` as `A`,`jawaban_b` as `B`,`jawaban_c` as `C`,`jawaban_d` as `D`,`kunci_jawaban` as `Jawaban` FROM soal_jawaban WHERE id_kategori = '" + kategori + "'";

        try {
             Connection con = Koneksi.getKoneksi();

            //PREPARED STMT
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);

            //LOOP THRU GETTING ALL VALUES
            while (rs.next()) {
                //GET VALUES
                String id = rs.getString("ID");
                String soal = rs.getString("Soal");
                String a = rs.getString("A");
                String b = rs.getString("B");
                String c = rs.getString("C");
                String d = rs.getString("D");
                String jawaban = rs.getString("Jawaban");
                 

                dm.addRow(new String[]{id, soal, a, b, c, d, jawaban});
            }

            return dm;

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    //HISTORY
    public DefaultTableModel getDataHistory () {
        //ADD COLUMNS TO TABLE MODEL
        DefaultTableModel dm = new DefaultTableModel();
        dm.addColumn("ID");
        dm.addColumn("Soal Lama");
        dm.addColumn("Soal Baru");
        dm.addColumn("A Lama");
        dm.addColumn("A Baru");
        dm.addColumn("B Lama");
        dm.addColumn("B Baru");
        dm.addColumn("C Lama");
        dm.addColumn("C Baru");
        dm.addColumn("D Lama");
        dm.addColumn("D Baru");
        dm.addColumn("Jawaban Lama");
        dm.addColumn("Jawaban Baru");
        dm.addColumn("Waktu Perubahan");

        //SQL STATEMENT
        String sql = "SELECT `id`, `soal_lama`, `soal_baru`, `jawaban_a_lama`, `jawaban_a_baru`, `jawaban_b_lama`, `jawaban_b_baru`, `jawaban_c_lama`, `jawaban_c_baru`, `jawaban_d_lama`, `jawaban_d_baru`, `kunci_jawaban_lama`, `kunci_jawaban_baru`, `waktu_perubahan` FROM `hist_soal_jawaban`" ;

        try {
             Connection con = Koneksi.getKoneksi();

            //PREPARED STMT
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);

            //LOOP THRU GETTING ALL VALUES
            while (rs.next()) {
                //GET VALUES
                String id = rs.getString("id");
                String soal_lama = rs.getString("soal_lama");
                String soal_baru = rs.getString("soal_baru");
                String jawaban_a_lama = rs.getString("jawaban_a_lama");
                String jawaban_a_baru = rs.getString("jawaban_a_baru");
                String jawaban_b_lama = rs.getString("jawaban_b_lama");
                String jawaban_b_baru = rs.getString("jawaban_b_baru");
                String jawaban_c_lama = rs.getString("jawaban_c_lama");
                String jawaban_c_baru = rs.getString("jawaban_c_baru");
                String jawaban_d_lama = rs.getString("jawaban_d_lama");
                String jawaban_d_baru = rs.getString("jawaban_d_baru");
                String kunci_jawaban_lama = rs.getString("kunci_jawaban_lama");
                String kunci_jawaban_baru = rs.getString("kunci_jawaban_baru");
                String waktu_perubahan = rs.getString("waktu_perubahan");                 

                dm.addRow(new String[]{id, soal_lama, soal_baru, jawaban_a_lama, jawaban_a_baru,
                jawaban_b_lama, jawaban_b_baru, jawaban_c_lama, jawaban_c_baru, jawaban_d_lama, jawaban_d_baru,
                kunci_jawaban_lama, kunci_jawaban_baru, waktu_perubahan});
            }

            return dm;

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
        }
        return null;
    }
    
    
    
    //UPDATE DATA
    public Boolean update(String id, String soal, String a, String b, String c, String d, String jawaban) {
        //SQL STMT
        String sql = "UPDATE soal_jawaban SET text_soal ='" + soal + "',jawaban_a ='" + a + "',jawaban_b ='" + b + "',jawaban_c ='" + c + "',jawaban_d ='" + d + "',kunci_jawaban ='" + jawaban + "' WHERE id_soal_jawaban ='" + id + "'";

        try {
            //GET COONECTION
            Connection con = Koneksi.getKoneksi();

            //STATEMENT
            Statement s = con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());

            return false;
        }
    }

    //DELETE DATA
    public Boolean delete(String id)
    {
        //SQL STMT
        String sql="DELETE FROM soal_jawaban WHERE id_soal_jawaban ='"+id+"'";

        try
        {
            //GET COONECTION
            Connection con = Koneksi.getKoneksi();

            //STATEMENT
            Statement s = con.prepareStatement(sql);

            //EXECUTE
            s.execute(sql);

            return true;

        }catch(SQLException e){
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
        
            return false;
        }
    }
    
    public boolean login_validation( String username, String passwords){
        
        String sql = "SELECT * FROM admin WHERE username='"+username+"' AND password='"+passwords+"'";
         try {
            
            Connection con = Koneksi.getKoneksi();

            //PREPARED STMT
            Statement s = con.prepareStatement(sql);
            ResultSet rs = s.executeQuery(sql);
            if(rs.next()){
                if(username.equals(rs.getString("username")) && passwords.equals(rs.getString("password"))){
                    JOptionPane.showMessageDialog(null, "berhasil login");
                    String a;
                    
                     //pindah jendela
                    admin loginLayout = new admin(username);
                    loginLayout.setVisible(true);
                    return true;
                }
            }else{
                    JOptionPane.showMessageDialog(null, "username atau password salah");
                   
                }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Terjadi Erorr", "Error", JOptionPane.INFORMATION_MESSAGE);
            System.err.println(e.getMessage());
        
            
        }
        return false;
        
         
    }
    
    
    
    
}


