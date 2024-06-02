    public class Asansor {
    private int mevcutKat;
    private final int MIN_KAT = 1;  // Asansörün gidebileceği minimum kat
    private final int MAX_KAT = 8;  // Asansörün gidebileceği maksimum kat
    private final int kapasite;
    private int mevcutYuk;

    // Asansör sınıfının kurucu metodu
    public Asansor(int kapasite) {
        this.kapasite = kapasite;
        this.mevcutKat = 1;  // Asansör başlangıç katı
        this.mevcutYuk = 0;
    }

    
    public int getMevcutKat() { // Mevcut kat bilgisini döndüren metot
        return mevcutKat;
    }

    
    public int getKapasite() { // Kapasite bilgisini döndüren metot
        return kapasite;
    }

    
    public int getMevcutYuk() {// Mevcut yük bilgisini döndüren metot
        return mevcutYuk;
    }

    
    public void yukariGit(int hedefKat) { // Yukarı gitme işlemini gerçekleştiren metot
        if (isValidKat(hedefKat) && hedefKat > mevcutKat) {
            hareketEt(hedefKat);
        } else {
            System.out.println("Gecerli bir hedef kat seciniz.");
        }
    }

    
    public void asagiGit(int hedefKat) { // Aşağı gitme işlemini gerçekleştiren metot
        if (isValidKat(hedefKat) && hedefKat < mevcutKat) {
            hareketEt(hedefKat);
        } else {
            System.out.println("Gecerli bir hedef kat seciniz.");
        }
    }

    
    private void hareketEt(int hedefKat) { // Hareket etme işlemini gerçekleştiren metot
        System.out.println("Asansor " + (hedefKat > mevcutKat ? "yukari" : "asagi") + " hareket ediyor...");
        mevcutKat = hedefKat;
        System.out.println("Asansor " + mevcutKat + ". kata ulastı.");
    }

    
    public void kisiEkle(int kisiSayisi) { // Kişi ekleme işlemini gerçekleştiren metot
        if (mevcutYuk + kisiSayisi <= kapasite) {
            mevcutYuk += kisiSayisi;
            System.out.println(kisiSayisi + " kisi asansöre binildi.");
        } else {
            System.out.println("Yük kapasitesi aşıldı. Kapı kapanmadı!");
        }
    }

    
    boolean isValidKat(int kat) { // Geçerli kat kontrolünü metot
        if (kat >= MIN_KAT && kat <= MAX_KAT) {
            return true;
        } else {
            System.out.println("Gecerli bir kat girin!");
            return false;
        }
    }

    
}
