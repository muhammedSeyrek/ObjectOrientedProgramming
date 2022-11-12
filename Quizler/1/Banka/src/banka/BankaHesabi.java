
package banka;

public class BankaHesabi implements BankaIslemleri{
    private final String hesapAdi;
    private final String hesapNumarasi;
    private double bakiye = 0;
    public BankaHesabi(String no, String ad) {
        this.hesapAdi = ad;
        this.hesapNumarasi = no;
    }
    public String getAd(){
        return hesapAdi;
    }
    public void setBakiye(double bakiye){
        this.bakiye = bakiye;
    }
    public double getBakiye(){
        return bakiye;
    }
    public String getHesapNo(){
        return hesapNumarasi;
    }
    public boolean paraCekme(double miktar){
        if(bakiye >= miktar){
            bakiye -= miktar;
            return true;
        }
        else{
            return false;
        }
    }
    public boolean paraYatirma(double miktar){
        if(miktar != 0){
            bakiye += miktar;
            return true;
        }
        else{
            return false;
        }
    }
    

}
