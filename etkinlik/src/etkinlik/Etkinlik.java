/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package etkinlik;

import java.util.Scanner;

/**
 *
 * @author emir_
 */
public class Etkinlik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        
        System.out.println("Hava durumuna göre etkinlik önerme");
        System.out.print("Hava Sicakligini giriniz:");
        double temp = scan.nextDouble();
        if(temp<5){
            System.out.println("Kayak Yapmaya Gidebilirsiniz.");
        }else if(temp>5 && temp<15){
            System.out.println("Tiyatroya gidebilirsiniz");
        }else if(temp>15 && temp<25){
            System.out.println("Mangal yapmaya gidebilirsiniz");
        }else if(temp>25){
            System.out.println("Yüzmeye gidebilirsiniz");
        }
    
    }
}
