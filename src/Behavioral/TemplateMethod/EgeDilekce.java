package Behavioral.TemplateMethod;

import java.util.Date;


public class EgeDilekce extends DevamsizlikDilekceTemplate {

    private String sinif;
    private String numara;
    private String isim;
    private String bolum;

    public EgeDilekce(String sinif, String numara, String isim, String bolum) {
        this.sinif = sinif;
        this.numara = numara;
        this.isim = isim;
        this.bolum = bolum;
    }
    
    //Classa göre sabit olmasını istediğimiz veya şablon içinde değişiklik yapabileceğimiz değişkenlerin metotları
    public Date getTarih() {
        return new Date();
    }

    public String getKurumAdi() {
        return "Ege Üniversitesi";
    }
  
    public String getSehir() {
        return "İzmir";
    }

    public String getBolumAdi() {
        return bolum;
    }

    public String getOkulNumarasi() {
        return this.numara;
    }

    public String getOgrenimYili() {
        return "2021-2022";
    }

    public String getYariyil() {
        return "Güz";
    }

    public String getOgrenciAdSoyad() {
        return this.isim;
    }
    public String getSinif(){
        return this.sinif;
    }
}
