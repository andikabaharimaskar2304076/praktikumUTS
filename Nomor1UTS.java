/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan8;

import java.util.Scanner;

/**
 *
 * @author Acer Nitro 5
 */
public class Nomor1UTS {
    public static void main(String[] args) {
        int number, digit1, digit2;
        Scanner Input = new Scanner(System.in);
        System.out.println("Nomor 1");
        System.out.println();
        
        System.out.print("Masukan tiga digit integer : ");
        number = Input.nextInt();
        digit1 = number / 100;
        digit2 = number % 10;
        
        if(number / 1000 >= 1 || number / 100 < 1){
            System.out.println("Masukan 3 digit");   
        }else if(digit1 == digit2){
            System.out.println(number + " adalah palindrom");
        }else{
            System.out.println(number + " bukan palindrom");
        }
    }
}
