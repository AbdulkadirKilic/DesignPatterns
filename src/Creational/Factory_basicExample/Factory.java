/*




*/

package Creational.Factory_basicExample;

public class Factory {
    public static Hayvan create(String type) {
        if(type==null) return null;
        
        if(type.equals("kedi") ) return new Kedi();
        
        else if(type.equals("ahtapot")) return new Ahtapot();
        
        else{
                return null;
                }
    }
    
    
    
}
