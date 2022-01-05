
package Creational.AbstractFactory1;


public class FactoryProducer  {
    
    public static AbstractFactory getFactory(String x){
        if(x.equalsIgnoreCase("summer")) return new SummerFruitFactory();
        
        else{
            return new WinterFruitFactory();
        }
    }

   
}
