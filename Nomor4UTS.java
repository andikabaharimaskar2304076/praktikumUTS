/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan8;

/**
 *
 * @author Acer Nitro 5
 */
public class Nomor4UTS {
    public static void main(String[] args) {
        System.out.println("Nomor 4");
        
        Balok Balok1 = new Balok();
        System.out.println("Balok dengan panjang : 1, lebar : 1 dan tinggi : 1. " + "Luasnya : " 
                + Balok1.getLuas() + ", sedangkan kelilingnya : " + Balok1.getKeliling() + " dan volumenya : " + Balok1.getVolume());
        Balok Balok2 = new Balok(30, 40, 50);
        System.out.println("Balok dengan panjang : 30, lebar : 40 dan tinggi : 50. " + "Luasnya : " 
                + Balok2.getLuas() + ", sedangkan kelilingnya : " + Balok2.getKeliling() + " dan volumenya : " + Balok2.getVolume());
        Balok Balok3 = new Balok();
        Balok3.setPanjang(25);
        Balok3.setLebar(35);
        Balok3.setTinggi(45);
        System.out.println("Balok dengan panjang : 25, lebar : 35 dan tinggi : 45. " + "Luasnya : " 
                + Balok3.getLuas() + ", sedangkan kelilingnya : " + Balok3.getKeliling() + " dan volumenya : " + Balok3.getVolume());
    }
}
