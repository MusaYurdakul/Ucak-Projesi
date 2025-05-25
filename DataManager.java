package services;

import entities.Rezervasyon;
import interfaces.ISaveable;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataManager implements ISaveable {
    private List<Rezervasyon> rezervasyonlar;

    public DataManager(List<Rezervasyon> rezervasyonlar) {
        this.rezervasyonlar = rezervasyonlar;
    }

    @Override
    public void saveToFile(String fileName) {
        try (FileWriter writer = new FileWriter(fileName)) {
            for (Rezervasyon r : rezervasyonlar) {
                writer.write(r.toCSV() + "\n");
            }
            System.out.println("Rezervasyonlar kaydedildi: " + fileName);
        } catch (IOException e) {
            System.out.println("Dosya kaydedilirken hata oluştu.");
        }
    }
}
