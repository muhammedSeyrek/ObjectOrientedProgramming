
package banka;

public class TasarrufHesabi extends BankaHesabi{
    private double faizOrani;

    public TasarrufHesabi(String no, String ad, double oran) {
        super(no, ad);
        this.faizOrani = oran;
    }
    public void faizEkle(){
        double faiz = getBakiye() * faizOrani / 100;
        setBakiye(getBakiye() - faiz);
    }
    
}
