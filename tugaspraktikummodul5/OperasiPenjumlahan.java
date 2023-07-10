/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugaspraktikummodul5;

/**
 *
 * @author TAUFIQ
 */
public class OperasiPenjumlahan extends OperasiBilangan {
//    protected double a,b,c,d;

    @Override
    protected void set_A(double a) {
        this.a = a;
    }
    @Override
    protected  void set_B(double b) {
        this.b = b;
    }
    @Override
    protected  void set_C(double c) {
        this.c = c;
    }
    @Override
    protected  void set_D(double d){
        this.d = a + b + c;
    }
    
    @Override
      protected  double get_A() {
        return a;
    }
    @Override
    protected  double get_B() {
        return b;
    }
    @Override
    protected  double get_C() {
        return c;
    }
    @Override
    protected  double get_D() {
        return d;
    }
    @Override
    protected void tampil(){
        System.out.println("Operasi Penjumlahan");
        System.out.println(this.get_A() +"+"+ this.get_B() +"+"+ this.get_C()+ "="+ this.get_D());
    }   
    
}
