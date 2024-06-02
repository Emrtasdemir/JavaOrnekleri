/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package otobusbileti;
import java.util.Scanner;
/**
 *
 * @author emir_
 */
public class OtobusBileti {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int km = 0;
        int age = 0;
        int type = 1;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Bilet uygulaması");
        
        System.out.print("Kac km yol gidilecek: ");
        km = input.nextInt();
        
        System.out.print("Yas girin: ");
        age = input.nextInt();
     
        System.out.println("Yolculuk tipi seciniz: 1=> Tek Yön , 2 => Gidis-Donus");
        type = input.nextInt();
       
        if(km > 0 && age >0 && (type == 1 || type == 2)){
            double price = km * 0.10;
            double ageDiscountPrice = 0;
            double ageDiscountRate = 0;
            double tripDiscount = 0;
            
            if(age <12 ){
                ageDiscountRate = 0.50;
                
            }else if(age>12 && age<24){
                ageDiscountRate = 0.10;
                
            }else if(age>65 ){
                ageDiscountRate = 0.30;
            }
            
            ageDiscountPrice = price * ageDiscountRate ;
            double ticketDiscountPrice = price - ageDiscountPrice;
            
            if(type == 2){
                ticketDiscountPrice -= ticketDiscountPrice * 0.20;
                ticketDiscountPrice *= 2;
            }
            System.out.println("Toplam Tutar: " + ticketDiscountPrice);
            
        }else{
            System.out.println("Hatali Veri Girdiniz!");
        }
           /* price = km * 0.10;
            price = input.nextDouble();
            System.out.println("Mesafeye Gore Ucret: " +price);*/
        
            
        }    
    }

