
package listeler;

public class UcusKoltugu extends Koltuk{
    private float ucret;
    private String rezervasyonNo;

    public UcusKoltugu(String koltukNo, String koltukSinifi, float ucret, String rezervasyonNo) {
        super(koltukNo, koltukSinifi);
        this.ucret = ucret;
        this.rezervasyonNo = rezervasyonNo;
    }
 
    
}
