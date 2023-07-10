/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modul3;

/**
 *
 * @author TAUFIQ
 */
import java.util.ArrayList;
import java.util.Scanner;

 class Universitas {
    private static String namaUniversitas;

    public static String getNamaUniversitas() {
        return namaUniversitas;
    }

    public static void setNamaUniversitas(String namaUniversitas) {
        Universitas.namaUniversitas = namaUniversitas;
    }
}

class Mahasiswa extends Universitas {
    private String nim;
    private String nama;
    private String alamat;
    private String jurusan;

    public Mahasiswa(String nim, String nama, String alamat, String jurusan) {
        this.nim = nim;
        this.nama = nama;
        this.alamat = alamat;
        this.jurusan = jurusan;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }
}

class DaftarMahasiswa extends Universitas {
    private final ArrayList<Mahasiswa> daftarMahasiswa = new ArrayList<>();

    public void tambahMahasiswa() {
        Scanner scanner = new Scanner(System.in);
        String jawaban;
        do {
            System.out.print("Masukkan NIM: ");
            String nim = scanner.nextLine();

            System.out.print("Masukkan Nama: ");
            String nama = scanner.nextLine();

            System.out.print("Masukkan Alamat: ");
            String alamat = scanner.nextLine();

            System.out.println("Masukkan Jurusan: ");
            System.out.println("61 = MATEMATIKA");
            System.out.println("62 = BIOLOGI");
            System.out.println("63 = KIMIA");
            System.out.println("64 = FISIKA");
            System.out.println("65 = TEKNIK INFORMATIKA");
            System.out.println("66 = SISTEM INFORMASI");

            String jurusan = scanner.nextLine();

            Mahasiswa mahasiswa = new Mahasiswa(nim, nama, alamat, jurusan);
            daftarMahasiswa.add(mahasiswa);

            System.out.println("Apakah ingin memasukkan data lagi? (Y/T)");
            jawaban = scanner.nextLine();
        } while (jawaban.equalsIgnoreCase("Y"));
    }

    public void tampilDaftarMahasiswa() {
        System.out.println("Daftar Mahasiswa " + getNamaUniversitas());
        System.out.println("==========================================");
        System.out.println("NIM\tNama\tAlamat\tJurusan");
        for (Mahasiswa mahasiswa : daftarMahasiswa) {
            System.out.println(mahasiswa.getNim() + "\t" + mahasiswa.getNama() + "\t" + mahasiswa.getAlamat() + "\t" + mahasiswa.getJurusan());
        }
    }
}

public class DataMahasiswa {
    public static void main(String[] args) {
        DaftarMahasiswa daftarMahasiswa = new DaftarMahasiswa();

        Universitas.setNamaUniversitas("Universitas Trunojoyo Madura");

        daftarMahasiswa.tambahMahasiswa();
        daftarMahasiswa.tampilDaftarMahasiswa();
    }
}


