/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan8;

/**
 *
 * @author Acer Nitro 5
 */
public class Balok {
    private int panjang, lebar, tinggi;
    
    Balok(){
        panjang = 1;
        lebar = 1;
        tinggi = 1;
    }
    
    Balok(int panjang, int lebar, int tinggi){
        this.panjang = panjang;
        this.lebar = lebar;
        this.tinggi = tinggi;
    }
    
    public int getLuas(){
        return 2 * ((panjang * lebar) + (panjang*tinggi) + (lebar * tinggi));
    }
    
    public int getKeliling(){
        return 4 * (panjang + lebar + tinggi);
    }
    
    public int getVolume(){
        return panjang * lebar * tinggi;
    }
    
    public void setPanjang(int panjang){
        this.panjang = panjang;
    }
    
    public void setLebar(int lebar){
        this.lebar = lebar;
    }
    
    public void setTinggi(int tinggi){
        this.tinggi = tinggi;
    }
}
