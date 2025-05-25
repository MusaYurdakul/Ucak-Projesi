package services;

import entities.Rezervasyon;
import entities.Ucus;

import java.util.ArrayList;
import java.util.List;

public class RezervasyonManager {
    private List<Rezervasyon> rezervasyonList = new ArrayList<>();

    public boolean rezervasyonYap(Ucus ucus, String ad, String soyad, int yas) {
        if (ucus.yerVarMi()) {
            ucus.rezervasyonYap();
            Rezervasyon r = new Rezervasyon(ucus, ad, soyad, yas);
            rezervasyonList.add(r);
            System.out.println("Rezervasyon başarılı!");
            return true;
        } else {
            System.out.println("Uçakta yer yok.");
            return false;
        }
    }

    public List<Rezervasyon> getRezervasyonlar() {
        return rezervasyonList;
    }
}
