/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.AbstractFactory2;


public class TenisballBall implements Ball{

    @Override
    public double price() {
        return 77;
    }

    @Override
    public int size() {
        return 4;
    }
    
}
