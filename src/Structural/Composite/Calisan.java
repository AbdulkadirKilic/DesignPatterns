package Structural.Composite;


public class Calisan extends FirmaBilesen {
    private String adSoyad;
    private int maas;
    
    public Calisan(){
        adSoyad=null;
        maas=0;
    }
    public Calisan(String adSoyad, int maas){
        this.adSoyad=adSoyad;
        this.maas=maas;
    }

    public int maliyet() {
        return this.getMaas();
        
    }

    /**
     * @return the adSoyad
     */
    public String getAdSoyad() {
        return adSoyad;
    }

    /**
     * @param adSoyad the adSoyad to set
     */
    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    /**
     * @return the maas
     */
    public int getMaas() {
        return maas;
    }

    /**
     * @param maas the maas to set
     */
    public void setMaas(int maas) {
        this.maas = maas;
    }

   
    
    
}
