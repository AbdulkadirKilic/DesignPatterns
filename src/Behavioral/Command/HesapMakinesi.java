
package Behavioral.Command;


public class HesapMakinesi {
    public void hesapla(Islem nesne,double x, double y){
        double sonuc=nesne.islem(x, y);
        System.out.println("Sonuç= "+sonuc);
        
        
    }
    
}
