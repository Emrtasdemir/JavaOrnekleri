/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package diziimpl;

/**
 *
 * @author emir_
 */
public class Dizi {

    int[] dizi;
    int es;

    public Dizi(int boyut) {
        dizi = new int[boyut];
        es = 0;
    }

    public void ekle(int a) {
        if (es >= dizi.length) {
            System.out.println("Dizi dolu!");
        } else {

            int i = 0;
            for (i = (es - 1); i >= 0 && dizi[i] > a; i--) {
                dizi[i + 1] = dizi[i];
            }
            dizi[i + 1] = a;
            es++;
        }
    }

    public int arama(int a) {
        for (int i = 0; i < es; i++) {
            if (dizi[i] == a) {
                return i;
            }
        }
        return -1;
    }

    public void sil(int a) {
        int indis = this.arama(a);

        if (indis == -1) {
            System.out.println("silmek istediğiniz sayı bulunamadı!");
        } else {

            for (int i = indis; i < es - 1; i++) {
                dizi[i] = dizi[i + 1];
            }
            dizi[--es] = 0;
        }
    }

    public void guncelle(int eski, int yeni) {
        int indis = this.arama(eski);

        if (indis == -1) {
            System.out.println("Güncellemek istediğiniz sayı bulunamadı!");
        } else {
            dizi[indis] = yeni;

        }
    }

    public void yazdir() {
        System.out.print("[");
        for (int i = 0; i < dizi.length; i++) {
            System.out.print(dizi[i] + ",");
        }
        System.out.print("]\n");
    }
}
