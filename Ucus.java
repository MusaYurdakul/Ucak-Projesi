package entities;

import java.time.LocalDateTime;

public class Ucus {
    private Lokasyon kalkis;
    private Lokasyon varis;
    private LocalDateTime saat;
    private Ucak ucak;
    private int doluKoltuk;

    public Ucus(Lokasyon kalkis, Lokasyon varis, LocalDateTime saat, Ucak ucak) {
        this.kalkis = kalkis;
        this.varis = varis;
        this.saat = saat;
        this.ucak = ucak;
        this.doluKoltuk = 0;
    }

    public boolean yerVarMi() {
        return doluKoltuk < ucak.getKoltukKapasitesi();
    }

    public void rezervasyonYap() {
        if (yerVarMi()) {
            doluKoltuk++;
        }
    }

    public Ucak getUcak() { return ucak; }

    @Override
    public String toString() {
        return kalkis + " -> " + varis + " | Saat: " + saat + " | Uçak: " + ucak.getModel();
    }
}
