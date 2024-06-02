/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package alıştırmalar2;

/**
 *
 * @author emir_
 */
import java.util.Scanner;
public class Alıştırmalar2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner reader=new Scanner(System.in);
        double yazili1,yazili2,ortalama=0;
        System.out.print("1. Yazılı : ");
        yazili1=reader.nextDouble();
        System.out.print("2. Yazılı : ");
        yazili2=reader.nextDouble();
        ortalama=(yazili1+yazili2)/2;
        System.out.println("Ortalamanız : "+ortalama);
        
        if(yazili2>=50 && 50<=ortalama){
            System.out.println("Geçtiniz");
    }
        else{
            System.out.println("Kaldınız!");
        }
    }
    
}
