
package Behavioral.Command;


public class Main {
    
    public static void main(String[] args) {
        
        HesapMakinesi hesapMakinesi= new HesapMakinesi();
        
        hesapMakinesi.hesapla(new Toplama(), 6, 3);
        hesapMakinesi.hesapla(new Cikarma(), 6, 3);
        hesapMakinesi.hesapla(new Bolme(), 6, 3);
        hesapMakinesi.hesapla(new Carpma(), 6, 3);
        hesapMakinesi.hesapla(new UstAlma(), 6, 3);
       
        
        
        
        
        
    }
    
}
