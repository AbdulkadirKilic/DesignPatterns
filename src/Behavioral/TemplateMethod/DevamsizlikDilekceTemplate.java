package Behavioral.TemplateMethod;

import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DevamsizlikDilekceTemplate {
    //abstract metotlar
    
    public abstract Date getTarih();

    public abstract String getKurumAdi();

    public abstract String getSehir();

    public abstract String getBolumAdi();

    public abstract String getOkulNumarasi();

    public abstract String getOgrenimYili();

    public abstract String getYariyil();

    public abstract String getOgrenciAdSoyad();
    
    public abstract String getSinif();
    
    //Dilekçeye konulacak olan tarihin gün/ay/yıl şeklinde formatlama metodu
     private String getFormatliTarih() {

        SimpleDateFormat format = new SimpleDateFormat("dd/MM/yyyy");

        return format.format(getTarih());
    }
          
    //sub classlara şablon oluşturacak olan dilekçe tasarımı
    private String dilekceMetni(){

        StringBuilder dilekceMetni = new StringBuilder();

        String formatliTarih = getFormatliTarih();
               
        dilekceMetni.append("\t\t\t\t\t\t\t\t\t\t\t\t\t\t" + formatliTarih);
        dilekceMetni.append("\n");
        dilekceMetni.append("\t\t\t\t" + getKurumAdi() + " Müdürlüğüne");
        dilekceMetni.append("\n");
        dilekceMetni.append("\t\t\t\t\t\t\t\t\t\t\t\t" + getSehir());
        dilekceMetni.append("\n");
        dilekceMetni.append("  ");
        dilekceMetni.append("Üniversitenizin " + getBolumAdi() + " bölümünde " + getOkulNumarasi());
        dilekceMetni.append(" numaralı "+getSinif()+". sınıf öğrencisi olarak\n");
        dilekceMetni.append("öğrenimime devam etmekteyim. " + getOgrenimYili());
        dilekceMetni.append(" eğitim öğretim yılı " + getYariyil() + " dönemi \n");
        dilekceMetni.append("içerisindeki devamsızlık durumunun tarafıma bildirilmesini,\n");
        dilekceMetni.append("Saygılarımla arz ederim.");

        dilekceMetni.append("\n\n");

        dilekceMetni.append("\t\t\t\t\t\t\t\t\t\t\t\t" + getOgrenciAdSoyad());
        dilekceMetni.append("\n");
        dilekceMetni.append("-----------------------------------------------------------------------------------------------------------------------------");

        return dilekceMetni.toString();
    }
    
    public void dilekceYazdir(){
            System.out.println(dilekceMetni());
    }       
   

   
}