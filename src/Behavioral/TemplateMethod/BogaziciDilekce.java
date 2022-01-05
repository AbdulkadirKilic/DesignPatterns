package Behavioral.TemplateMethod;

import java.util.Date;


public class BogaziciDilekce extends DevamsizlikDilekceTemplate {
    //Dilekçede farklılık gösterebilecek değişkenler
    private String bolum;
    private String numara;
    private String isim;
    private String sinif;
  

    public BogaziciDilekce(String bolum, String numara, String isim, String sinif) {
        this.bolum = bolum;
        this.numara = numara;
        this.isim = isim;
        this.sinif=sinif;
    }

    public Date getTarih() {
        return new Date();
    }
    
    //Classa göre sabit olmasını istediğimiz veya şablon içinde değişiklik yapabileceğimiz değişkenlerin metotları
    // Sabit olmasını istediğimiz değişkenleri Boğaziçi Üniversitesi Örneğindeki gibi tanımlayabiliriz.
    public String getKurumAdi() {
        return "Boğaziçi Üniversitesi";
    }

    public String getSehir() {
        return "İstanbul";
    }

    public String getBolumAdi() {
        return this.bolum;
    }

    public String getOkulNumarasi() {
        return this.numara;
    }

    public String getOgrenimYili() {
        return "2021";
    }

    public String getYariyil() {
        return "Bahar";
    }

    public String getOgrenciAdSoyad() {
        return this.isim;
    }
    public String getSinif(){
        return this.sinif;
    }
}