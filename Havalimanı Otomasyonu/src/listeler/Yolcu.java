
package listeler;

import java.util.ArrayList;

public class Yolcu extends Kisi{
    private int yolcuNo;
    private String pasaportNo;

    public Yolcu(String kisiTc, String adSoyad, String adres, String dogumT, String kategori, int yolcuNo, String pasaportNo) {
        super(kisiTc, adSoyad, adres, dogumT, kategori);
        this.yolcuNo = yolcuNo;
        this.pasaportNo = pasaportNo;
    }

    @Override
    public String toString() {
        return super.toString() + "Yolcu{" + "yolcuNo=" + yolcuNo + ", pasaportNo=" + pasaportNo + '}';
    }
    
    public ArrayList<Ucus> getirUcuslar(ArrayList <Ucus> ucus){
        for(int i = 0; i < ucus.size(); i++){
            System.out.println(ucus.get(i).toString());
        }
        return ucus;
    }

    public int getYolcuNo() {
        return yolcuNo;
    }

    public void setYolcuNo(int yolcuNo) {
        this.yolcuNo = yolcuNo;
    }

    public String getPasaportNo() {
        return pasaportNo;
    }

    public void setPasaportNo(String pasaportNo) {
        this.pasaportNo = pasaportNo;
    }
    
}
