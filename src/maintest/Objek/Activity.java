/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package maintest.Objek;

import java.util.prefs.Preferences;

/**
 *
 * @author arief
 */
public final class Activity {
    
    Preferences pref = Preferences.userNodeForPackage(maintest.Objek.Activity.class);

    // setter
    public void setSkor(int skor){
        pref.putInt("skor", skor);
    }
    
    public void setSisaDurasi(int durasi){
        pref.putInt("sisa_durasi", durasi);
    }
    
    public void setIdUser(int id){
        pref.putInt("id_user", id);
    }
    
    public void setNama(String nama){
        pref.put("nama", nama);
    }
    
    public void setIdKategori(int id){
        pref.putInt("id_kategori", id);
    }
    
    public void setIdRank(int id){
        pref.putInt("id_rank", id);
    }
    
    public void setIndexSoal(int index){
        pref.putInt("index_soal", index);
    }
    
    public void setDurasi(int durasi){
        pref.putInt("durasi", durasi);
    }
    
    public void setKunciJawaban(String kunci){
        pref.put("kunci_jawaban", kunci);
    }
    
    public void setPsikotesEnable(boolean b){
        pref.putBoolean("cek_psikotes", b);
    }
    
    public void setUmumEnable(boolean b){
        pref.putBoolean("cek_umum", b);
    }
    
    public void setLogikaEnable(boolean b){
        pref.putBoolean("cek_logika", b);
    }
    
    public void setIQEnable(boolean b){
        pref.putBoolean("cek_iq", b);
    }
    
    
    public void setSkorUmum(int skor){
        pref.putInt("skor_umum", skor);
    }
    
    public void setSkorIQ(int skor){
        pref.putInt("skor_iq", skor);
    }
    
    public void setSkorLogika(int skor){
        pref.putInt("skor_logika", skor);
    }
    
    public void setSkorPsikotes(int skor){
        pref.putInt("skor_psikotes", skor);
    }
    
    // getter
    
    public int getSkor(){
        return pref.getInt("skor", 0);
    }
    
    public int getSisaDurasi(){
        return pref.getInt("sisa_durasi", 0);
    }
    
    public int getIdUser(){
        return pref.getInt("id_user", 0);
    }
    
    public String getNama(){
        return pref.get("nama", "");
    }
    
    public int getIdKategori(){
        return pref.getInt("id_kategori", 0);
    }
    
    public int getIdRank(){
        return pref.getInt("id_rank", 0);
    }
    
    public int getIndexSoal(){
        return pref.getInt("index_soal", 0);
    }
    
    public int getDurasi(){
        return pref.getInt("durasi", 60);
    }
    
    public String getKunciJawaban(){
        return pref.get("kunci_jawaban", "");
    }
    
    
    public boolean isPsikotesEnable(){
        return pref.getBoolean("cek_psikotes", true);
    }
    
    public boolean isUmumEnable(){
        return pref.getBoolean("cek_umum", true);
    }
    
    public boolean isLogikaEnable(){
        return pref.getBoolean("cek_logika", true);
    }
    
    public boolean isIQEnable(){
        return pref.getBoolean("cek_iq", true);
    }
    
    public int getSkorUmum(){
        return pref.getInt("skor_umum", 0);
    }
    
    public int getSkorIQ(){
        return pref.getInt("skor_iq", 0);
    }
    
    public int getSkorLogika(){
        return pref.getInt("skor_logika", 0);
    }
    
    public int getSkorPsikotes(){
        return pref.getInt("skor_psikotes", 0);
    }
}
