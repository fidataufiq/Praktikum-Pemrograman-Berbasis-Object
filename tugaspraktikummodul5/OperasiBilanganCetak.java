/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikummodul5;

/**
 *
 * @author TAUFIQ
 */
public class OperasiBilanganCetak {
    private static void CetakSemua(OperasiBilangan[]OB,double a, double b, double c){
        
        for (OperasiBilangan OB1  :OB) {
        OB1.set_A(a);
        OB1.set_B(b);
        OB1.set_C(c);
        OB1.set_D(0);
        OB1.tampil();
        }
    
    }
    
    public static void main(String[] args) {
         OperasiPenjumlahan tambah = new OperasiPenjumlahan();
         OperasiPengurangan kurang = new OperasiPengurangan();
         OperasiPerkalian kali = new OperasiPerkalian();
         OperasiPembagian bagi = new OperasiPembagian();         
        
        OperasiBilangan[] OB = { tambah, kurang, kali, bagi};
        CetakSemua(OB,10.5,0.5,1.25);
    } 
}
