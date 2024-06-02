/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package simplesorting;

import java.util.Random;

/**
 *
 * @author emir_
 */
public class Simplesorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] d = new int[10];
        Random r = new Random();
        
        for(int i=0 ; i<10 ; i++){
            d[i]=r.nextInt(100);
            
        }
        Sorting s =new Sorting(d);
        
        s.print();
        
        s.InsertionSort();
        s.print();
    }
    
}
