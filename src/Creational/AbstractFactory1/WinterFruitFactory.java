
package Creational.AbstractFactory1;


public class WinterFruitFactory extends AbstractFactory{
    
@Override
public Fruit getFruit(String x){
        if(x.equalsIgnoreCase("banana") ) return new Banana();
        else if(x.equalsIgnoreCase("Orange")) return new Orange();
        else{
            return new Apple();
        }
    }
    
    
    
}
