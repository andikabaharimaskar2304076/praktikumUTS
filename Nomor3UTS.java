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
public class Nomor3UTS {
    
    public static int reverse(int number){
        int reversed = 0;
        while(number != 0){
            int temp = number % 10;
            reversed = reversed * 10 + temp;
            number = number / 10;
        }
        return reversed;
    }
    
    public static boolean isPalindrome(int number){
        return number == reverse(number);
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nomor 3");
        System.out.print("Input : ");
        int number = input.nextInt();
        
        if(isPalindrome(number)){
            System.out.println(number + " adalah palindrom");
        }else{
            System.out.println(number + " bukan palindrom");
        }
    }
}
