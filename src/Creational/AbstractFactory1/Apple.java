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
public class Apple implements Fruit{

    @Override
    public double sugarRate() {
       return 67.5;
    }

    @Override
    public double calories() {
        return 80;
    }
    
}
