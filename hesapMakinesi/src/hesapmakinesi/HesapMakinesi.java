/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hesapmakinesi;

import java.util.Scanner;

/**
 *
 * @author emir_
 */
public class HesapMakinesi {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("1.Sayiyi girin: ");
        int a = scan.nextInt();
        System.out.print("2.Sayiyi girin:");
        int b = scan.nextInt();
        
        System.out.println("işlem seciniz: ");
        System.out.println("1) Toplama ");
        System.out.println("2) Cıkarma ");
        System.out.println("3) Carpma ");
        System.out.println("4) Bolme ");
        System.out.print("Isleminiz:");
        int select = scan.nextInt();
        double sonuc=0;
        switch (select) {
            case 1:
                sonuc = a+b;
                System.out.println("Toplam = "+ sonuc);
                break;
            case 2:
                sonuc = a-b;
                System.out.println("Toplam = " + sonuc);
                break;
            case 3:
                sonuc = a*b;
                System.out.println("Toplam = " + sonuc);
                break;
            case 4:
                sonuc = a/(double)b;
                if(b==0){
                    System.out.println("Gecersiz islem");
                }else{
                System.out.println("Toplam = " + sonuc);
                }
                
            default:
                break;
        }
        }

    }
    

