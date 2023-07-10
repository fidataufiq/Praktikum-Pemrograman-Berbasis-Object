/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikummodul6;

/**
 *
 * @author TAUFIQ
 */
public class KomputerCetak {
    private static void cetak(Komputer[] obj) {
        obj[0] = new PC();
        obj[1] = new Netbook();
        obj[2] = new Laptop();
        
        for (Komputer obj1 : obj) {
            obj1.cetak_data();
            obj1.hidupkan_os(); 
            obj1.klik_kanan();
            obj1.klik_kiri();
            obj1.tekan_enter();
            obj1.matikan_os();
            
        }
    }
    
    public static void main(String[] args) {
        Komputer[] ssd = new Komputer[3];
        cetak(ssd);
    }
}