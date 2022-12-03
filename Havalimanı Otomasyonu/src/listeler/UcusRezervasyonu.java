
package listeler;

import java.util.ArrayList;

public class UcusRezervasyonu {
    private String rezervasyonNo;
    private Ucus ucusNo;
    private UcusKoltugu koltukNo;
    private Yolcu yolcu;
    private String rezervasyonD;

    public UcusRezervasyonu(String rezervasyonNo, Ucus ucusNo, UcusKoltugu koltukNo, Yolcu yolcu, String rezervasyonD) {
        this.rezervasyonNo = rezervasyonNo;
        this.ucusNo = ucusNo;
        this.koltukNo = koltukNo;
        this.yolcu = yolcu;
        this.rezervasyonD = rezervasyonD;
    }
    public UcusRezervasyonu(){
        
    }
    @Override
    public String toString() {
        return "UcusRezervasyonu{" + "rezervasyonNo=" + rezervasyonNo + ", ucusNo=" + ucusNo 
                + ", koltukNo=" + koltukNo + ", yolcu=" + yolcu + ", rezervasyonD=" + rezervasyonD + '}';
    }
    public ArrayList <Yolcu> yolcuListele(ArrayList<Yolcu> yolcu, int proccess){
        System.out.println(yolcu.get(proccess).toString());
        return yolcu;
    }
    public ArrayList <UcusRezervasyonu> getirRezervasyon(ArrayList<UcusRezervasyonu> rezervasyonlar){
        for(int i = 0; i < rezervasyonlar.size(); i++){
            System.out.println(rezervasyonlar.get(i).yolcu.getAdSoyad());
        }
        return rezervasyonlar;
    }
    public boolean ekleRezervasyon(ArrayList <UcusRezervasyonu> rezervasyonlar){
        for(int i = 0; i < rezervasyonlar.size(); i++){
            if(yolcu.getAdSoyad().equals(rezervasyonlar.get(i).yolcu.getAdSoyad())){
                return false;
            }
            else{
                return true;
            }
        }
        return true;
    }
    public boolean guncelleRezervasyon(ArrayList <UcusRezervasyonu> rezervasyonlar ,int which){
        rezervasyonlar.get(which).rezervasyonD = "Iptal";
        return true;
    }

    public String getRezervasyonNo() {
        return rezervasyonNo;
    }

    public void setRezervasyonNo(String rezervasyonNo) {
        this.rezervasyonNo = rezervasyonNo;
    }

    public Ucus getUcusNo() {
        return ucusNo;
    }

    public void setUcusNo(Ucus ucusNo) {
        this.ucusNo = ucusNo;
    }

    public UcusKoltugu getKoltukNo() {
        return koltukNo;
    }

    public void setKoltukNo(UcusKoltugu koltukNo) {
        this.koltukNo = koltukNo;
    }

    public Yolcu getYolcu() {
        return yolcu;
    }

    public void setYolcu(Yolcu yolcu) {
        this.yolcu = yolcu;
    }

    public String getRezervasyonD() {
        return rezervasyonD;
    }

    public void setRezervasyonD(String rezervasyonD) {
        this.rezervasyonD = rezervasyonD;
    }
    
}
