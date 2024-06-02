/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diziimpl;

import java.util.Arrays;

/**
 *
 * @author emir_
 */
public class Queue {

    int[] q;
    int es;

    public Queue(int boyut) {
        q = new int[boyut];
        es = 0;
    }

    public void push(int a) {
        if (es == q.length) {
            System.out.println("Kuyruk Dolu");
        } else {
            q[es++] = a;
        }
    }

    public int pop() {
        int r = q[0];

        for (int i = 0; i < es - 1; i++) {
            q[i] = q[i + 1];
        }
        q[--es] = 0;
        return r;

    }

    public void yazdir() {
        System.out.println(Arrays.toString(q));
    }
}
