/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package örn3;

import java.util.Scanner;

public class Örn3 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double tutar , kdvPrice1 ,kdvPrice2 , kdvOran1=18 ,kdvOran2=8 , total1, total2;
        
        System.out.println("Tutar Giriniz: ");
        tutar = scan.nextDouble();
        kdvPrice1=tutar * (kdvOran1/100);
        kdvPrice2=tutar * (kdvOran2/100);

        total1= kdvPrice1 + tutar;
        total2=kdvPrice2+ tutar;
        
      /*  System.out.println("KDV Oranı:" +kdvOran );
        System.out.println("KDV Tutarı: " +kdvPrice);
        System.out.println("KDV'li Tutar: "+total); */
        
        if(tutar>0 && tutar <= 500 ){
            System.out.println("KDV Oranı:" +kdvOran1 );
            System.out.println("KDV Tutarı: " +kdvPrice1);
            System.out.println("KDV'li Tutar: "+total1);
        }
        else{
            System.out.println("KDV Oranı:" +kdvOran2 );
            System.out.println("KDV Tutarı: " +kdvPrice2);
            System.out.println("KDV'li Tutar: "+total2);
        
    }
        
    }
    
}
