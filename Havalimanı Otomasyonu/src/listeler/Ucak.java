
package listeler;

public class Ucak {
    private String adi;
    private int kapasite = 0;
    private int uretimYili = 0;

    public Ucak(String adi) {
        this.adi = adi;
    }
    public Ucak(String adi, int kapasite, int uretimYili) {
        this.adi = adi;
        this.kapasite = kapasite;
        this.uretimYili = uretimYili;
    }

    @Override
    public String toString() {
        return adi + ";" + kapasite + ";" + uretimYili;
    }
    
}
