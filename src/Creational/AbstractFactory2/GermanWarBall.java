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
public class GermanWarBall implements Ball{

    @Override
    public double price() {
        return 5500;
    }

    @Override
    public int size() {
        return 12;
    }
    
}
