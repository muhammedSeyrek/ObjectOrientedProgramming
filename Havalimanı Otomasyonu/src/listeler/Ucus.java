
package listeler;

public class Ucus {
    private String ucusNo;
    private String kalkisSaat;
    private String sure;
    private String varisSaat;
    private Havaalani kalkis;
    private Havaalani varis;
    private Ucak ucak;
    private HavayoluSirketi havayoluSirketi;
    private String durum;

    public Ucus(String ucusNo, String kalkisSaat, String sure, String varisSaat, 
            Havaalani kalkis, Havaalani varis, Ucak ucak, HavayoluSirketi havayoluSirketi, String durum) {
        this.ucusNo = ucusNo;
        this.kalkisSaat = kalkisSaat;
        this.sure = sure;
        this.varisSaat = varisSaat;
        this.kalkis = kalkis;
        this.varis = varis;
        this.ucak = ucak;
        this.havayoluSirketi = havayoluSirketi;
        this.durum = durum;
    }

    @Override
    public String toString() {
        return ucusNo + ", " + kalkisSaat + ", "
                + sure + ", " + varisSaat + ", " + 
                kalkis + ", " + varis + ", " + ucak + ", " +
                havayoluSirketi + ", " + durum;
    }
    

    public String getUcusNo() {
        return ucusNo;
    }

    public void setUcusNo(String ucusNo) {
        this.ucusNo = ucusNo;
    }

    public String getKalkisSaat() {
        return kalkisSaat;
    }

    public void setKalkisSaat(String kalkisSaat) {
        this.kalkisSaat = kalkisSaat;
    }

    public String getSure() {
        return sure;
    }

    public void setSure(String sure) {
        this.sure = sure;
    }

    public String getVarisSaat() {
        return varisSaat;
    }

    public void setVarisSaat(String varisSaat) {
        this.varisSaat = varisSaat;
    }

    public Havaalani getKalkis() {
        return kalkis;
    }

    public void setKalkis(Havaalani kalkis) {
        this.kalkis = kalkis;
    }

    public Havaalani getVaris() {
        return varis;
    }

    public void setVaris(Havaalani varis) {
        this.varis = varis;
    }

    public Ucak getUcak() {
        return ucak;
    }

    public void setUcak(Ucak ucak) {
        this.ucak = ucak;
    }

    public HavayoluSirketi getHavayoluSirketi() {
        return havayoluSirketi;
    }

    public void setHavayoluSirketi(HavayoluSirketi havayoluSirketi) {
        this.havayoluSirketi = havayoluSirketi;
    }

    public String getDurum() {
        return durum;
    }

    public void setDurum(String durum) {
        this.durum = durum;
    }

    
    
}
