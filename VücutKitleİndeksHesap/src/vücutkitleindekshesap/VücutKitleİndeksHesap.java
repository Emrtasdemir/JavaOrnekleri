/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package vücutkitleindekshesap;

import java.util.Scanner;

/**
 *
 * @author emir_
 */
public class VücutKitleİndeksHesap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double kilo , boy ;
        double indeks;
        System.out.print("Lutfen Boyunuzu m Cinsinden Girin (orn:1,76):");
        boy = scan.nextDouble();
        
        System.out.print("Lutfen Kilonuzu (kg) Cinsinden Girin (orn:55,3):");
        kilo = scan.nextDouble();
        
        indeks = kilo / (boy * boy);
        System.out.println("Indeksiniz:" +indeks);
       // indeks = scan.nextDouble();
       
       if(indeks<18.5){
        System.out.println("Zayif");
        }
        else if(indeks>18.5 && indeks<24.9){
                System.out.println("Ideal");
        }
        else if(indeks>25 && indeks<29.9){
                System.out.println("Sisman");
        }
       else if(indeks>29.9 && indeks<34.9){
                System.out.println("obez");
        }
       else if(indeks>35 ){
                System.out.println("Asiri Obez");
        }
    }
    
}
