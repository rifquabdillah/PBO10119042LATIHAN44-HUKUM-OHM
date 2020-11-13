/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10119042latihan44;

/**
 *
 * @author 
 *  Nama    :Muhammad Rifqu Abdillah
 * Kelas    :IF-1
 * NIM      :10119042
 * Deskripsi: Program ini berisi program untuk menampilkan KUAT ARUS
 */
public class Baterai {
    private float kuatArus, hambatan;
    
    public Baterai(){
        System.out.println("=====Hukum Ohm=====");
        System.out.println(
        "Kuat arus yang mengalir pada suatu kawan penghantar\n"
         + "akan berbading lurus dengan beda potensial\n"
         + "pada ujung-ujung kawat penghantar tersebut\n"
         + "asalkan suhu kawat dijaga konstan.\n");
    }
    
    public Baterai(float kuatArus, float hambatan){
        this.kuatArus = kuatArus;
        this.hambatan = hambatan;
    }
    
    public float getkuatArus(){
        return kuatArus;
    }
    
    public float getHambatan(){
        return hambatan;
    }
    
    public float hitungTegangan(){
        return kuatArus * hambatan;
    }
}
