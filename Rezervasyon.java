package entities;

public class Rezervasyon {
    private Ucus ucus;
    private String ad;
    private String soyad;
    private int yas;

    public Rezervasyon(Ucus ucus, String ad, String soyad, int yas) {
        this.ucus = ucus;
        this.ad = ad;
        this.soyad = soyad;
        this.yas = yas;
    }

    public String toCSV() {
        return ad + "," + soyad + "," + yas + "," + ucus.toString();
    }

    @Override
    public String toString() {
        return ad + " " + soyad + " (" + yas + ") - " + ucus;
    }
}
