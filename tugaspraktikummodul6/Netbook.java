/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikummodul6;

/**
 *
 * @author TAUFIQ
 */
public class Netbook  extends Komputer implements Mouse, Keyboard, Printer{

        @Override
    void hidupkan_os() {
        System.out.println("Hidupkan Netbook...!");
        
    }

    @Override
    void matikan_os() {
        System.out.println("Matikkan Netbook...!");
       
    }

     @Override
    public void klik_kanan() {
        System.out.println("Klik kanan");
    }

    @Override
    public void klik_kiri() {
        System.out.println("Klik kiri");
    }

    @Override
    public void tekan_enter() {
        System.out.println("Tekan enter!!!");
    }

    @Override
    public void cetak_data() {
         System.out.println("\n========== Netbook ==========");
       
    }
    
}