/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package dairealanıveçevre;

import java.util.Scanner;

/**
 *
 * @author emir_
 */
public class DaireAlanıVeÇevre {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Dairenin yaricap degerini girin: ");
        int r = scan.nextInt();
        double alan = Math.PI * r * r ;
        double cevre = 2 * Math.PI * r ;
        
        System.out.println("Dairenin Alani : " + alan);
        System.out.println("Dairenin Cevresi:"+cevre );
    }
    
}
