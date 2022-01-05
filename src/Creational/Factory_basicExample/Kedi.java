/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Factory_basicExample;

/**
 *
 * @author Apoahh
 */
public class Kedi implements Hayvan{
    static int sayi;

    @Override
    public void Yas(int yas) {
        System.out.println("Kedinin yaşı: "+yas);
        
    }

    @Override
    public void ayakSayisi(int ayak) {
        System.out.println("Kedinin ayak sayısı: "+ayak);
        
    }
    
    public Kedi(){
        sayi++;
        System.out.println(sayi+"."+" Kedi oluşturuldu.");
    }
    
    
}
