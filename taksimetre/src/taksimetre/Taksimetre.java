/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taksimetre;

import java.util.Scanner;

/**
 *
 * @author emir_
 */
public class Taksimetre {

    
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    System.out.println("kaç km gidilecek: ");
    double km = scan.nextInt();
    
    double price = 10 + (km * 2.20);
    price = (price < 20) ? 20 : price;
    System.out.println("Taksimetre: "+ price);
    
    
    
    
    
   
    
    }
    
}
