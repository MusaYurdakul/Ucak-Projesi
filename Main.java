import entities.*;
import services.*;
import java.time.LocalDateTime;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Ucak ucak = new Ucak("737", "Boeing", "SN123", 2);
        Lokasyon kalkis = new Lokasyon("Türkiye", "İstanbul", "IST", true);
        Lokasyon varis = new Lokasyon("Almanya", "Berlin", "BER", true);
        Ucus ucus = new Ucus(kalkis, varis, LocalDateTime.now().plusHours(3), ucak);

        RezervasyonManager manager = new RezervasyonManager();

        System.out.println("Uçuş Bilgisi:");
        System.out.println(ucus);

        System.out.println("Ad: ");
        String ad = scanner.nextLine();

        System.out.println("Soyad: ");
        String soyad = scanner.nextLine();

        System.out.println("Yaş: ");
        int yas = Integer.parseInt(scanner.nextLine());

        if (manager.rezervasyonYap(ucus, ad, soyad, yas)) {
            DataManager dataManager = new DataManager(manager.getRezervasyonlar());
            dataManager.saveToFile("data/rezervasyonlar.csv");
        }

        scanner.close();
    }
}
