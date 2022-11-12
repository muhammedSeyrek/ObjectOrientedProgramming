
package banka;

public class Banka {

    public static void main(String[] args) {
        BankaHesabi seyrek = new BankaHesabi("2103030", "Muhammed Seyrek");
        seyrek.paraYatirma(100);
        System.out.println(seyrek.getAd() + " adli kulanicinin bakiyesi = " + seyrek.getBakiye());
        TasarrufHesabi ozkan = new TasarrufHesabi("2103042", "Ahmet Hamdi Ozkan", 10);
        ozkan.paraYatirma(500);
        System.out.println(ozkan.getAd() + " adli kullanicinin faizden onceki"
                + " bakiyesi = " + ozkan.getBakiye());
        ozkan.faizEkle();
        System.out.println(ozkan.getAd() + " adli kullanicinin faizden sonraki"
                + " bakiyesi = " + ozkan.getBakiye());
        VadesizHesap akkoyuncu = new VadesizHesap("2103097", "Abdullah Akkoyuncu");
        akkoyuncu.paraYatirma(500);
        akkoyuncu.setIslem();
        System.out.println(akkoyuncu.getAd() + " adli kullanicinin para yatirildiktan"
                + " sonraki bakiyesi = " + akkoyuncu.getBakiye());
        akkoyuncu.paraCekme(200);
        akkoyuncu.setIslem();
        System.out.println(akkoyuncu.getAd() + " adli kullanicinin para cekildikten"
                + " sonraki bakiyesi = " + akkoyuncu.getBakiye());
        akkoyuncu.paraYatirma(700);
        akkoyuncu.setIslem();
        System.out.println(akkoyuncu.getAd() + " adli kullanicinin para yatirildiktan"
                + " sonraki bakiyesi = " + akkoyuncu.getBakiye());
        akkoyuncu.kesintiUcretiHesaplama();
        System.out.println(akkoyuncu.getAd() + " adli kullanici " + akkoyuncu.getIslem() + 
                " kadar islem yapmistir. Mevcut bakiyesi = " + akkoyuncu.getBakiye());
        akkoyuncu.paraYatirma(200);
        akkoyuncu.setIslem();
        akkoyuncu.kesintiUcretiHesaplama(); 
        System.out.println(akkoyuncu.getAd() + " adli kullanici " + akkoyuncu.getIslem() + 
                " kadar islem yapmistir. Mevcut bakiyesi = " + akkoyuncu.getBakiye());
    }
    
}
