
package Creational.AbstractFactory2;


public class FactoryProducer {
    
    public static AbstractFactory getFactory(boolean war){
        if(war) return new WarFactory();
        else{
            return  new SportFactory();
        }
    }
    
}
