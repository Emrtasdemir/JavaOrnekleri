/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package diziimpl;

/**
 *
 * @author emir_
 */
public class Diziimpl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Stack d = new Stack(10);
        /* Yazılan koda göre komutları gir farklı komutlar olabilir*/
        d.yazdir();

        d.push(10);
        d.push(5);
        d.push(15);
        d.push(1);
        d.push(13);
        d.push(8);
        d.push(20);
        d.push(35);
        d.push(50);
        d.push(23);

        d.yazdir();

        d.pop();

        d.yazdir();

        d.pop();

        d.yazdir();

    }

}
