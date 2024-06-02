/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hipotenüshesap;

import java.util.Scanner;

/**
 *
 * @author emir_
 */
public class HipotenüsHesap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k1=0, k2=0 ;
        double çevre;
        System.out.print("1. Kenarı Giriniz: ");
        k1 = scan.nextInt();
        System.out.print("2.kenarı Giriniz: ");
        k2 = scan.nextInt();
        
        double k3= Math.sqrt(k1*k1 + k2*k2);
        System.out.println("Hipotenüs: " +k3);
        
        çevre=k1+k2+k3;
        System.out.println("Çevre uzunlugu:" +çevre );
        çevre = scan.nextDouble();
        
            
        
        
    }
    
}
