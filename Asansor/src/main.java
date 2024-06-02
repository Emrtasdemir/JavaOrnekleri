
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Asansorün kapasitesini giriniz: ");
        int kapasite = scanner.nextInt();
        scanner.nextLine(); 

        Asansor asansor = new Asansor(kapasite);

        while (true) {
            System.out.println("\n----- MENÜ -----");
            System.out.println("1. Yukari Git");
            System.out.println("2. Asagi Git");
            System.out.println("3. Asansor Bilgileri");
            System.out.println("4. Cikis");
            System.out.print("Seciminizi yapınız: ");

            int secim = scanner.nextInt();
            scanner.nextLine();  

            switch (secim) {
                case 1:
                    System.out.print("Hedef katı giriniz: ");
                    int yukariHedef = scanner.nextInt();
                    scanner.nextLine();  
                    if (asansor.isValidKat(yukariHedef)) {
                        System.out.println("Yük kapasitesi kontrol ediliyor...");
                        System.out.print("Kac kisi binilecek: ");
                        int yukariKisiSayisi = scanner.nextInt();
                        scanner.nextLine();  
                        if (asansor.getMevcutYuk() + yukariKisiSayisi <= asansor.getKapasite()) {
                            asansor.yukariGit(yukariHedef);
                            asansor.kisiEkle(yukariKisiSayisi);
                        } else {
                            System.out.println("Yük kapasitesi asıldı. Kapı kapanmadı!");
                        }
                    }
                    break;
                case 2:
                    System.out.print("Hedef katı giriniz: ");
                    int asagiHedef = scanner.nextInt();
                    scanner.nextLine();  
                    if (asansor.isValidKat(asagiHedef)) {
                        System.out.println("Yük kapasitesi kontrol ediliyor...");
                        System.out.print("Kac kisi binilecek: ");
                        int asagiKisiSayisi = scanner.nextInt();
                        scanner.nextLine();  
                        if (asansor.getMevcutYuk() + asagiKisiSayisi <= asansor.getKapasite()) {
                            asansor.asagiGit(asagiHedef);
                            asansor.kisiEkle(asagiKisiSayisi);
                        } else {
                            System.out.println("Yük kapasitesi asıldı. Kapı kapanmadı!");
                        }
                    }
                    break;
                case 3:
                    System.out.println("\nAsansor Bilgileri:");
                    System.out.println("Su anki kat: " + asansor.getMevcutKat());
                    System.out.println("Kapasite: " + asansor.getKapasite());
                    System.out.println("Su anki yük: " + asansor.getMevcutYuk());
                    break;
                case 4:
                    System.out.println("Cıkıs yapılıyor...");
                    System.exit(0);
                default:
                    System.out.println("Gecersiz secim! Tekrar deneyin.");
            }
        }
    }
}
