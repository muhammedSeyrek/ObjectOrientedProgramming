
package listeler;

public class Kisi {
    private String kisiTc;
    private String adSoyad;
    private String adres;
    private String dogumT; // Date sınıfı kullanılmıyor artık.
    private String kategori;

    public Kisi(String kisiTc, String adSoyad, String adres, String dogumT, String kategori) {
        this.kisiTc = kisiTc;
        this.adSoyad = adSoyad;
        this.adres = adres;
        this.dogumT = dogumT;
        this.kategori = kategori;
    }

    @Override
    public String toString() {
        return kisiTc + ", " + adSoyad + ", "
                + adres + "," + dogumT + ", " + kategori;
    }
    
    public String getKisiTc() {
        return kisiTc;
    }

    public void setKisiTc(String kisiTc) {
        this.kisiTc = kisiTc;
    }

    public String getAdSoyad() {
        return adSoyad;
    }

    public void setAdSoyad(String adSoyad) {
        this.adSoyad = adSoyad;
    }

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public String getDogumT() {
        return dogumT;
    }

    public void setDogumT(String dogumT) {
        this.dogumT = dogumT;
    }

    public String getKategori() {
        return kategori;
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }
    
}
