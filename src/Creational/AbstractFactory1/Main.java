/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.AbstractFactory1;

/**
 *
 * @author Apoahh
 */
public class Main {
    public static void main(String[] args) {
        AbstractFactory winterObject = FactoryProducer.getFactory("winter");
        AbstractFactory summerObject = FactoryProducer.getFactory("summer");
        
        Fruit muz = winterObject.getFruit("banana");
        System.out.println("Calorie= "+muz.calories()
                          +" Sugar rate= "+muz.sugarRate());
        
        
        Fruit strawberry = summerObject.getFruit("strawberry");
        System.out.println("Calorie= "+strawberry.calories()
                          +" Sugar rate= "+strawberry.sugarRate());
        
         
        
        
    }
}
