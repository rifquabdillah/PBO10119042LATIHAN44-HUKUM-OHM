/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan44;

/**
 *
 * @author 
 *  Nama     :Muhammad Rifqu Abdillah
 * Kelas    :IF-1
 * NIM      :10119042
 * Deskripsi : Program ini berisi program untuk menampilkan KUAT ARUS
 */
public class PBO10119042LATIHAN44 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Baterai batre = new Baterai();
        Baterai batre1 = new Baterai(3,12);
        
        System.out.println("Kuat Arus       : " + batre1.getkuatArus() + " Ampere");
        System.out.println("Hambatan        : " + batre1.getHambatan() + " Ohm");
        System.out.println("Hasil Tegangan  : " + batre1.hitungTegangan() + " Volt");
    }
    
}
