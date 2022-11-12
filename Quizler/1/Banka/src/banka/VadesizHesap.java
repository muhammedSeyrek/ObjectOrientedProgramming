
package banka;

public class VadesizHesap extends BankaHesabi{
    private int islemSayisi;
    private static final int ucretsizIslemAdedi = 3;
    private static final int transferUcreti = 20;

    public VadesizHesap(String no, String ad) {
        super(no, ad);
        this.islemSayisi = 0;
    }
    public void setIslem(){
        islemSayisi++;
    }
    public int getIslem(){
        return islemSayisi;
    }
    public void kesintiUcretiHesaplama(){
        double ucret = (double)(ucretsizIslemAdedi - islemSayisi) * (-transferUcreti);
        paraCekme(ucret);
    }
    
}
