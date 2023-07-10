/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ManajemenKeuanganPribadi;

import java.util.Scanner;

/**
 *
 * @author TAUFIQ
 */

public class Run{
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.println("============ Selamat Datang ============");
        
        System.out.print("Masukkan nama \t\t\t: ");
        String nama = scanner.nextLine();

        System.out.print("Masukkan saldo awal \t\t: ");
        long saldo = scanner.nextLong();

        System.out.print("Masukkan batas peringatan \t: ");
        long batasPeringatan = scanner.nextLong();

        Akun akun = new AkunTabungan(nama, saldo, batasPeringatan);

        int pilihan = 0;
        while (pilihan != 5) {
            System.out.println();
            System.out.println("Manajer Keuangan Pribadi");
            System.out.println("------------------------");
            System.out.println("1. Deposit");
            System.out.println("2. Tarik Uang");
            System.out.println("3. Tampilkan transaksi");
            System.out.println("4. Tampilkan saldo");
            System.out.println("5. Keluar");
            System.out.print("Masukkan pilihan Anda \t\t: ");
            pilihan = scanner.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan jumlah setoran \t: ");
                    long jumlahSetoran = scanner.nextLong();
                    scanner.nextLine(); // mengonsumsi karakter newline
                    System.out.print("Masukkan deskripsi setoran \t: ");
                    String deskripsiSetoran = scanner.nextLine();
                    akun.setor(jumlahSetoran, deskripsiSetoran);
                    break;
                case 2:
                    System.out.print("Masukkan jumlah penarikan \t: ");
                    long jumlahPenarikan = scanner.nextLong();
                    scanner.nextLine(); // mengonsumsi karakter newline
                    System.out.print("Masukkan deskripsi penarikan \t: ");
                    String deskripsiPenarikan = scanner.nextLine();
                    akun.tarik(jumlahPenarikan, deskripsiPenarikan);
                    break;
                case 3:
                    akun.tampilkanTransaksi();
                    break;
                case 4:
                    akun.tampilkanSaldo();
                    break;
                case 5:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid");
                    break;
            }
        }

        scanner.close();
    }
}