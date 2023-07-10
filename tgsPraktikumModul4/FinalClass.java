/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tgsPraktikumModul4;

/**
 *
 * @author TAUFIQ
 */
public class FinalClass {
    private static void CetakSemua(operasibilangan[]OB,double a, double b){
        OB[0] = new operasipembagian();
        OB[1] = new operasipengurangan();
        OB[2] = new operasipenjumlahan();
        OB[3] = new operasiperkalian();
        
       for (operasibilangan OB1 : OB) {
           OB1.setA(a);
           OB1.setB(b);
           OB1.setC();
           OB1.tampil();
       }
        
    }
    
    public static void main(String[] args) {
        operasibilangan[] angka = new operasibilangan[4];
        CetakSemua(angka,9.25, 1.25);
    }
    
}
