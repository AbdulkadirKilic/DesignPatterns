package Structural.Composite;

import java.util.ArrayList;
public class Mudurlukler extends FirmaBilesen {
    private String mudurlukAdi;
     private ArrayList< FirmaBilesen>arrayList =new ArrayList<>();
     public Mudurlukler(){
         mudurlukAdi=null;
         arrayList=null;
     }
     public Mudurlukler(String mudurlukadi){
         this.mudurlukAdi=mudurlukadi;
         
     }

    public void ekle(FirmaBilesen bilesen){
        arrayList.add(bilesen);
        
    }

    /**
     * @return the mudurlukAdi
     */
    public String getMudurlukAdi() {
        return mudurlukAdi;
    }

    /**
     * @param mudurlukAdi the mudurlukAdi to set
     */
    public void setMudurlukAdi(String mudurlukAdi) {
        this.mudurlukAdi = mudurlukAdi;
    }

    /**
     * @return the arrayList
     */
    public ArrayList< FirmaBilesen> getArrayList() {
        return arrayList;
    }

    /**
     * @param arrayList the arrayList to set
     */
    public void setArrayList(ArrayList< FirmaBilesen> arrayList) {
        this.arrayList = arrayList;
    }

    @Override
    public int maliyet() {
        int toplam=0;
        for(int i=0;i<arrayList.size();i++){
            if(arrayList.get(i) instanceof Mudurlukler){
                toplam+=arrayList.get(i).maliyet();
            }
            else{
                toplam+=((Calisan) arrayList.get(i)).getMaas();
            }
           
        }
        return toplam;   
    }
}
