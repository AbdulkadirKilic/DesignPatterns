package Behavioral.TemplateMethod;


public class TestTemplate {
    
    public static void main(String[] args) {
        
        //İlgili nesnelerin oluşturulup test edilmesi.
        BogaziciDilekce bogaziciDilekce = new BogaziciDilekce("Bilgisayar Mühendisliği", "05150000657", "Abdulkadir Kılıç","4");
        EgeDilekce egeDilekce = new EgeDilekce("6", "05120000617", "Remzi Kerem", "TIP");

        bogaziciDilekce.dilekceYazdir();
        System.out.println("\n");
        egeDilekce.dilekceYazdir();
    }
    
}
