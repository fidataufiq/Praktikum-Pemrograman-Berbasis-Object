/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenKeuanganPribadi;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/**
 *
 * @author TAUFIQ
 */
public abstract class Akun {
    protected String nama;
    protected long saldo;
    protected List<Transaksi> transaksi;
    protected long batasPeringatan;

    public Akun(String nama, long saldo, long batasPeringatan) {
        this.nama = nama;
        this.saldo = saldo;
        this.transaksi = new ArrayList<>();
        this.batasPeringatan = batasPeringatan;
    }

    public abstract void setor(long jumlah, String deskripsi);
    public abstract void tarik(long jumlah, String deskripsi);
    public abstract void cekPeringatan();

    public void tampilkanTransaksi() {
        System.out.println("Riwayat transaksi \t\t:");
        for (Transaksi transaksi : transaksi) {
            String jumlahTransaksi = transaksi.getJumlah() >= 0 ? " " + formatJumlah(transaksi.getJumlah()) : formatJumlah(transaksi.getJumlah());
            System.out.println(transaksi.getDeskripsi() + ": " + jumlahTransaksi);
        }
    }

    public void tampilkanSaldo() {
        System.out.println("Saldo saat ini \t\t\t: " + formatJumlah(saldo));
    }

    protected String formatJumlah(long jumlah) {
        NumberFormat format = NumberFormat.getCurrencyInstance(new Locale("id", "ID"));
        return format.format(jumlah);
    }
    
}
