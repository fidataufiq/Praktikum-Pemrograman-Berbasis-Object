/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenKeuanganPribadi;

/**
 *
 * @author TAUFIQ
 */
public class AkunTabungan extends Akun {
        public AkunTabungan(String nama, long saldo, long batasPeringatan) {
        super(nama, saldo, batasPeringatan);
    }
          
    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

   
    public long getSaldo() {
        return saldo;
    }

    public void setSaldo(long saldo) {
        this.saldo = saldo;
    }

  
    public long getBatasPeringatan() {
        return batasPeringatan;
    }

    public void setBatasPeringatan(long batasPeringatan) {
        this.batasPeringatan = batasPeringatan;
    }

    @Override
    public void setor(long jumlah, String deskripsi) {
        Transaksi transaksi = new Setoran(deskripsi, jumlah);
        transaksi.jalankan();
        this.transaksi.add(transaksi); // Menambahkan transaksi ke daftar transaksi
        saldo += jumlah;
    }

    @Override
    public void tarik(long jumlah, String deskripsi) {
        if (saldo >= jumlah) {
            Transaksi transaksi = new Penarikan(deskripsi, jumlah);
            transaksi.jalankan();
            this.transaksi.add(transaksi); // Menambahkan transaksi ke daftar transaksi
            saldo -= jumlah;
            cekPeringatan();
        } else {
            System.out.println("Saldo tidak mencukupi");
        }
    }

    @Override
    public void cekPeringatan() {
        if (saldo < batasPeringatan) {
            System.out.println("Peringatan: Saldo anda rendah !!!");
        }
    }
    
}
