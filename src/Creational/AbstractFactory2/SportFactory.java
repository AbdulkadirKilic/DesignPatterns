/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.AbstractFactory2;


public class SportFactory extends AbstractFactory {
    
    

    @Override
    public Ball getBall(String x) {
        if(x.equalsIgnoreCase("basketball")) return new BasketballBall();
        else if(x.equalsIgnoreCase("volleyball")) return new VolleyballBall();
        else{
            return new TenisballBall();
        }
    }
    
}
