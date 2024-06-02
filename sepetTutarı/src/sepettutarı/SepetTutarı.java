/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sepettutarı;

import java.util.Scanner;

/**
 *
 * @author emir_
 */
public class SepetTutarı {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        double salatalik = 3.14;
        double elma = 4.11;
        double kabak = 2.22;
        double domates = 0.95;
        double patlican = 7.00;
        
        System.out.println("Salatalik kac kilo?");
        double salatalikKilo = scan.nextDouble();
        
        System.out.println("Elma kac kilo?");
        double elmaKilo = scan.nextDouble();
        
        System.out.println("Kabak kac kilo?");
        double kabakKilo = scan.nextDouble();
        
        System.out.println("Domates kac kilo?");
        double domatesKilo = scan.nextDouble();
        
        System.out.println("Patlican kac kilo?");
        double patlicanKilo = scan.nextDouble();
        
        double toplam = 0.0;
        toplam += (salatalik * salatalikKilo);
        toplam += (patlican * patlicanKilo);
        toplam += (elma * elmaKilo);
        toplam += (kabak * kabakKilo);
        toplam += (domates * domatesKilo);
        System.out.println("Toplam Tutar:" +toplam + "TL");
               
    }
    
}
