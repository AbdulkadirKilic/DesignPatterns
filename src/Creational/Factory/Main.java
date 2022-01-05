
package Creational.Factory;


public class Main {
    
    
    public static void main(String[] args) {
        
       Phone telefon1 = PhoneFactory.createPhone("oppo");
       Phone telefon2 = PhoneFactory.createPhone("huawei");
       Phone telefon3 = PhoneFactory.createPhone("samsung");
       
        telefon1.name();
        telefon1.model();
        
        telefon2.name();
        telefon2.model();
        
        telefon3.name();
        telefon3.model();
        
        
        
        
        
        
    }
    
}
