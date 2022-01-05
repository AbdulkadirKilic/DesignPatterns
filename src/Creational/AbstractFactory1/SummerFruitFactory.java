
package Creational.AbstractFactory1;


public class SummerFruitFactory extends AbstractFactory {
    //@Override
    public Fruit getFruit(String x){
        if(x.equalsIgnoreCase("grapes") ) return new Grapes();
        else{
            return new Strawberry();
        }
    }

   
    
}
