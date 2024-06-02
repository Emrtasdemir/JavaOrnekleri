/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package simplesorting;

import java.util.Arrays;

/**
 *
 * @author emir_
 */
public class Sorting {
    int[] dizi;
    
    public Sorting(int[] d){
        dizi = d;
    }
    public void BubbleSort(){
        int temp=0;
        
        for(int i=0 ; i< dizi.length ; i++){
            for( int j=0 ; j < (dizi.length-1) ; j++){
            if(dizi[j] > dizi[j+1]){
                temp=dizi[j];
                dizi[j]=dizi[j+1];
                dizi[j+1]=temp;
            }
        }
        }
    }
        public void SelectionSort(){
            int min=0;
            int temp=0;
            for(int i=0 ; i < dizi.length ; i++ ){
                min=i;
                
                for( int j=i+1 ; j <dizi.length ; j++){
                    if(dizi[j]< dizi[min]){
                        min=j;
                    }
                }
                if(min != i){
                    temp = dizi[min];
                    dizi[min]=dizi[i];
                    dizi[i]= temp;
                }
            }
        }
        public void InsertionSort(){
               int temp=0;
               int i=0;
               int j=0;
               
               for(i=0; i<dizi.length ; i++){
                   temp=dizi[i];
                   
                   for(j=i ; j > 0 && dizi[j-1] > temp ; j--){
                     dizi[j]=dizi[j-1];
               }
                   dizi[j]=temp;
               }
               
        }
        public void print(){
            System.out.println(Arrays.toString(dizi));
        
    }
}
