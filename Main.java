package com.ifstatement;

import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Scanner userInput = new Scanner(System.in);
    
    System.out.print("masukkan nilai = ");
    int x = userInput.nextInt();
    
    if (x %2 == 0) {
        System.out.println("nilai anda adalah genap");
    } else {
            System.out.println("nilai anda adalah ganjil");
            }
    }
        
}
