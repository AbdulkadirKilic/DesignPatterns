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
public class WarFactory extends AbstractFactory{

    @Override
    public Ball getBall(String x) {
        
        if(x.equalsIgnoreCase("Russian")) return new RussianWarBall();
        
        else{
            return new GermanWarBall();
        }
        
    }
    
}
