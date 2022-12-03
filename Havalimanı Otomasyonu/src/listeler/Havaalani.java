
package listeler;

public class Havaalani {
    private String ad;
    private String ulke;
    private String sehir;

    public Havaalani(String ad, String ulke, String sehir) {
        this.ad = ad;
        this.ulke = ulke;
        this.sehir = sehir;
    }

    @Override
    public String toString() {
        return ad + ", " + ulke + ", " + sehir;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getUlke() {
        return ulke;
    }

    public void setUlke(String ulke) {
        this.ulke = ulke;
    }

    public String getSehir() {
        return sehir;
    }

    public void setSehir(String sehir) {
        this.sehir = sehir;
    }
    
}
