/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Factory_basicExample;


public class  Ahtapot implements Hayvan{
    static int sayi;
    
    @Override
    public void Yas(int yas){
        System.out.println("Ahtapotun yaşı: "+yas);
    }
    
    @Override
    public void ayakSayisi(int ayak){
        System.out.println("Ahtapotun ayak sayisi: "+ayak);
    }
    
     public Ahtapot(){
         sayi++;
        System.out.println(sayi+"."+" Ahtapot oluşturuldu.");
    }
    
}
