
package banka;

public interface BankaIslemleri{
    
    public boolean paraCekme(double miktar);
    public boolean paraYatirma(double miktar);
    public double getBakiye();
    public String getHesapNo();
}
