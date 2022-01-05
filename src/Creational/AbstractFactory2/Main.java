/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.AbstractFactory2;

/**
 *
 * @author Apoahh
 */
public class Main {
    
    public static void main(String[] args) {
        
        //War Ball Factory
        AbstractFactory warFactory= FactoryProducer.getFactory(true);
        
        Ball russianBall =warFactory.getBall("russian");
        System.out.println("Price= "+russianBall.price()+" Size= "+russianBall.size());
        
        Ball germanBall=warFactory.getBall("german");
        System.out.println("Price= "+germanBall.price()+" Size= "+germanBall.size());
         
         
        //Sport Ball Factory
        AbstractFactory sportFactory= FactoryProducer.getFactory(false);
         
        Ball tenisBall=sportFactory.getBall("tenis");
        System.out.println("Price= "+tenisBall.price()+" Size= "+tenisBall.size());
         
        Ball basketballBall=sportFactory.getBall("basketball");
        System.out.println("Price= "+basketballBall.price()+" Size= "+basketballBall.size());
         
         
        
        
        
    }
    
}
