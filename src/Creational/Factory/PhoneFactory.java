/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Factory;


public class PhoneFactory {
    
    
    public static Phone createPhone(String marka) {
        
        if(marka.equalsIgnoreCase("Oppo")) return new Oppo();
        
        else if(marka.equalsIgnoreCase("Samsung")) return new Samsung();
        else if(marka.equalsIgnoreCase("Huawei")) return new Huawei();
        
        return null;
        
    }
    
}
