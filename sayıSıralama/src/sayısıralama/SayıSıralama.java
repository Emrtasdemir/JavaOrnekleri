/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sayısıralama;

import java.util.Scanner;

/**
 *
 * @author emir_
 */
public class SayıSıralama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
   
    System.out.println("Sayilari kücükten büyüge siralama:");
    System.out.println("3 Sayi giriniz:");
    System.out.println("1.Sayiyi girin:");
    int a= scan.nextInt();
    System.out.println("2.Sayiyi girin:");
    int b= scan.nextInt();
    System.out.println("3.Sayiyi girin:");
    int c= scan.nextInt();
    
    if(a>b && a>c){
        // a en büyük
        if(b>c){
            System.out.println("Siralama: a > b > c");
        }else{
            System.out.println("Siralama: a > c > b");
        }
    }else if(b>a && b>c){
        //b ne büyük
        if(a>c){
            System.out.println("Siralama: b > a > c");
        }else{
            System.out.println("Siralama: b > c >a");
        }
        
    }else if(c>a && c>b){
        //c en büyük
        if(a>b){
            System.out.println("Siralama: c > a > b");
            
        }else{
            System.out.println("Siralama: c > b > a");
        }
    }
       
    }
    
    
}
