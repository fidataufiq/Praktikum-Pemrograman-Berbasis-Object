/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenKeuanganPribadi;

import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author TAUFIQ
 */
public class Setoran implements Transaksi {
    String deskripsi;
    long jumlah;

    public Setoran(String deskripsi, long jumlah) {
        this.deskripsi = deskripsi;
        this.jumlah = jumlah;
    }

    @Override
    public void jalankan() {
         System.out.println("Setoran berhasil \t\t: " + formatJumlah(jumlah));
    }

    @Override
    public String getDeskripsi() {
        return deskripsi;
    }

    @Override
    public long getJumlah() {
        return jumlah;   
    } 

    private String formatJumlah(long jumlah) {
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return format.format(jumlah);
    }
}
