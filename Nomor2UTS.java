/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pertemuan8;

/**
 *
 * @author Acer Nitro 5
 */
public class Nomor2UTS {
    public static void main(String[] args) {
        System.out.println("Nomor 2");
        System.out.println("Pattern A");
        for(int i = 1; i <= 6; i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("Pattern B");
        for(int i = 6; i >= 1; i--)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("Pattern C");
        for(int i = 1; i <= 6; i++)
        {
            for(int j = 6; j >= 1; j--)
            {
                if(j <= i){
                    System.out.print(" " + j);
                }else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println("");
        }
        System.out.println();
        System.out.println("Pattern D");
        for(int i = 1; i <= 6; i++)
        {
            int k = 1;
            for(int j = 1; j <= 6; j++)
            {
                if(j >= i){
                    System.out.print(" " + k);
                    k++;
                }else{
                    System.out.print(" " + " ");
                }
            }
            System.out.println("");
        }
    }
}
