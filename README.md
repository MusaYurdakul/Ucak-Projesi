# Uçak Bilet Rezervasyon Sistemi (Java Console App)

Bu proje, Java ile nesneye dayalı programlama (OOP) prensipleri kullanılarak geliştirilmiş bir uçak bilet rezervasyon sistemidir.

## Özellikler

- Uçak, Lokasyon, Uçuş ve Rezervasyon sınıfları
- Uçuş seçme ve koltuk kapasitesine göre rezervasyon
- Yapılan rezervasyonları `rezervasyonlar.json` dosyasına kaydetme
- GSON kütüphanesiyle JSON formatında kayıt

## Kullanım

1. GSON kütüphanesini `libs/` klasörüne ekleyin (örn: `gson-2.8.6.jar`)
2. Projeyi derleyin ve çalıştırın:

```bash
javac -cp "libs/gson-2.8.6.jar" -d out src/**/*.java
java -cp "libs/gson-2.8.6.jar:out" app.Main
