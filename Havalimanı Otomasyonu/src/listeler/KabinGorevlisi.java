
package listeler;

public class KabinGorevlisi extends Kisi{
    private float toplamSaat;
    private int toplamUcus;
    private boolean pilot;

    public KabinGorevlisi(String kisiTc, String adSoyad, String adres, String dogumT, String kategori
    ,float toplamSaat, int toplamUcus, boolean pilot) {
        super(kisiTc, adSoyad, adres, dogumT, kategori);
        this.toplamSaat = toplamSaat;
        this.toplamUcus = toplamUcus;
        this.pilot = pilot;
    }

    @Override
    public String toString() {
        return "KabinGorevlisi{ " + super.toString() + "toplamSaat=" + toplamSaat + ", toplamUcus=" 
                + toplamUcus + ", pilot=" + pilot + '}';
    }
    

    public float getToplamSaat() {
        return toplamSaat;
    }

    public void setToplamSaat(float toplamSaat) {
        this.toplamSaat = toplamSaat;
    }

    public int getToplamUcus() {
        return toplamUcus;
    }

    public void setToplamUcus(int toplamUcus) {
        this.toplamUcus = toplamUcus;
    }

    public boolean isPilot() {
        return pilot;
    }

    public void setPilot(boolean pilot) {
        this.pilot = pilot;
    }
    
}
