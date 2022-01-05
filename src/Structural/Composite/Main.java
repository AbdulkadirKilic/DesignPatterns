package Structural.Composite;


import java.util.ArrayList;




public class Main {
    public static void main(String[] args) {
        
        //İZMİR İL MÜDÜRLÜĞÜ
        Mudurlukler izmir_il_mudurlugu= new Mudurlukler("İzmir İl Müdürlüğü");
        Calisan selim = new Calisan("Selim",2000);
        Calisan murat = new Calisan("Murat",1500);
        Calisan zeynep = new Calisan("Zeynep",2500);
        
        izmir_il_mudurlugu.ekle(selim);
        izmir_il_mudurlugu.ekle(murat);
        izmir_il_mudurlugu.ekle(zeynep);
        System.out.println("İzmir İl Müdürlüğü Maliyet= "+izmir_il_mudurlugu.maliyet());
        
        //EGE BÖLGE MÜDÜRLÜĞÜ
        Mudurlukler ege_bolge_mudurlugu = new Mudurlukler("Ege Bölge Müdürlüğü");
        ege_bolge_mudurlugu.ekle(izmir_il_mudurlugu);//Ege bölge müdürlüğünün içinde izmir il müdürlüğü de olmalı ve eklendi.  
        
        Calisan ayse = new Calisan("Ayse",4000);
        Calisan can = new Calisan("Can",3000);
        
        ege_bolge_mudurlugu.ekle(ayse);
        ege_bolge_mudurlugu.ekle(can);
        System.out.println("Ege Bölge Müdürlüğü Maliyet= "+ege_bolge_mudurlugu.maliyet());
        
        
        //ANTALYA İL MÜDÜRLÜĞÜ
        Mudurlukler antalya_il_mudurlugu= new Mudurlukler("Antalya İl Müdürlüğü");
        
        Calisan bahar = new Calisan("Bahar",2500);
        Calisan sedat = new Calisan("Sedat",1500);
        Calisan vedat = new Calisan("Vedat",2500);
        
        antalya_il_mudurlugu.ekle(bahar);
        antalya_il_mudurlugu.ekle(sedat);
        antalya_il_mudurlugu.ekle(vedat);
        System.out.println("Antalya İl Müdürlüğü Maliyet= "+antalya_il_mudurlugu.maliyet());
        
        //AKDENİZ BÖLGE MÜDÜRLÜĞÜ
        Mudurlukler akdeniz_bolge_mudurlugu= new Mudurlukler("Akdeniz Bölge Müdürlüğü");
        akdeniz_bolge_mudurlugu.ekle(antalya_il_mudurlugu);// Akdeniz bölge müdürlüğüne antalya il müdürlüğü de dahil. 
        
        Calisan emre = new Calisan("Emre",3000);
        Calisan ahmet = new Calisan("Ahmet",4000);
        
        akdeniz_bolge_mudurlugu.ekle(emre);
        akdeniz_bolge_mudurlugu.ekle(ahmet);
        System.out.println("Akdeniz Bölge Müdürlüğü Maliyet= "+akdeniz_bolge_mudurlugu.maliyet());
        
        
        //GENEL MÜDÜRLÜK
        Mudurlukler genel_mudurluk = new Mudurlukler("Genel Müdürlük");
        
        genel_mudurluk.ekle(ege_bolge_mudurlugu);
        genel_mudurluk.ekle(akdeniz_bolge_mudurlugu);
        
        Calisan ali = new Calisan("Ali",5000);
        Calisan veli = new Calisan("Veli",6000);
        
        genel_mudurluk.ekle(ali);
        genel_mudurluk.ekle(veli);
        System.out.println("Genel Müdürlük Maliyet= "+genel_mudurluk.maliyet());
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
