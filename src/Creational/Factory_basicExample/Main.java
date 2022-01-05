/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Creational.Factory_basicExample;

/**
 *
 * @author Apoahh
 */
public class Main {
    
    public static void main(String[] args)  {
        Factory factory = new Factory();
        factory.create("kedi");
        factory.create("kedi");
        
        factory.create("ahtapot");
        factory.create("ahtapot");
        
        factory.create("random string fqeqwr");     //oluşturulmadı.
        
        
        
        
        
    }
    
}
