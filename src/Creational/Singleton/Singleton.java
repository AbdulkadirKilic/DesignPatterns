
package Creational.Singleton;


public class Singleton {
    
    private static Singleton singleton;
    
     private Singleton(){
         System.out.println("Cagirildi");
                                
    }
     public static Singleton getSingleton(){
         if(singleton==null) singleton = new Singleton();
         return singleton;
     }
     
    
    
}
