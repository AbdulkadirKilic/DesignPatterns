/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Factory;

/**
 *
 * @author Apoahh
 */
public class Huawei implements Phone{
    @Override
    public void name(){
        
        System.out.println("Huawei");
    }
    @Override
     public void hafiza(){
        System.out.println("167 GB");
    }
    @Override
    public void model(){
        System.out.println("8005");
    }

    
    
}
