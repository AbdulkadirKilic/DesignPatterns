
package Behavioral.Command;


public class UstAlma implements Islem{

    @Override
    public double islem(double x, double y) {
        return Math.pow(x, y);
    }
    
}
