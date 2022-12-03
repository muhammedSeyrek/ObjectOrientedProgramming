
package listeler;

import java.util.ArrayList;
import java.util.Scanner;

public class Yonetici extends Kisi{
    private String departman;
    Scanner in = new Scanner(System.in);
    public Yonetici(String kisiTc, String adSoyad, String adres, String dogumT, String kategori, String departman) {
        super(kisiTc, adSoyad, adres, dogumT, kategori);
        this.departman = departman;
    }

    public ArrayList <Ucak> getirUcak(ArrayList <Ucak> ucak){
        for(int i = 0; i < ucak.size(); i++){
            System.out.println(ucak.toString());
        }
        return ucak;
    }
    public ArrayList <Ucak> ucakEkle(ArrayList <Ucak> ucak){
        System.out.println("Adini, kapasitesini ve uretim yilini sirayla giriniz.");
        String uName = in.next();
        int uKapasite = in.nextInt();
        int uYil = in.nextInt();
        Ucak u = new Ucak(uName, uKapasite, uYil);
        ucak.add(u);
        return ucak;
    }
    public ArrayList <Ucus> getirUcus(ArrayList <Ucus> ucus){
        for(int i = 0; i < ucus.size(); i++){
            System.out.println(ucus.toString());
        }
        return ucus;
    }
    public ArrayList <Ucus> ucusEkle(ArrayList <Ucus> ucus){
        System.out.println("Ucus no, Binis Tarihi (Orn 2021/07/12;13:15 seklinde), Ucus suresini, "
                + "\nNerden kalktigini = ulke, sehir ve havalimani adini, Nereye indigini = ulke, sehir ve havalimani adini\n"
                + "Binis Tarihi (Orn 2021/07/12;13:15 seklinde), Hangi ucak oldugunu, \n"
                + "Durumunu(1:Planlandı,2:Ertelendi,3:Ayrıldı;4:Tamamlandi,5:iptal)");
                String ucusGir[] = new String[13];
                for(int i = 0; i < 13; i++){
                    ucusGir[i] = in.next();
                }
                Havaalani kalkis = new Havaalani(ucusGir[3], ucusGir[4], ucusGir[5]);
                Havaalani varis = new Havaalani(ucusGir[6], ucusGir[7], ucusGir[8]);
                Ucak ucak = new Ucak(ucusGir[10]);
                HavayoluSirketi hSirketi = new HavayoluSirketi(ucusGir[11]);
                String durum = null;
                if(ucusGir[12].equals("1")){
                    durum = "Planlandi";
                }
                if(ucusGir[12].equals("2")){
                    durum = "Ertelendi";
                }
                if(ucusGir[12].equals("3")){
                    durum = "Ayrildi";
                }
                if(ucusGir[12].equals("4")){
                    durum = "Tamamlandi";
                }
                if(ucusGir[12].equals("5")){
                    durum = "Iptal";
                }
                Ucus ucuslar = new Ucus(ucusGir[0], ucusGir[1], ucusGir[2], ucusGir[9], 
                        kalkis, varis, ucak, hSirketi, durum);
                ucus.add(ucuslar);
        return ucus;
    }
    public ArrayList <Havaalani> getirHavalimani(ArrayList<Havaalani> havalimani){
        for(int i = 0; i < havalimani.size(); i++){
            System.out.println(havalimani.toString());
        }
        return havalimani;
    }
    public ArrayList <Havaalani> havaalaniEkle(ArrayList <Havaalani> havalimani){
        System.out.println("Havayolu adi, ulke ve sehri teker teker giriniz.");
        String hAdi = in.next();
        String hUlke = in.next();
        String hSehri = in.next();
        Havaalani hAlani = new Havaalani(hAdi, hUlke, hSehri);
        havalimani.add(hAlani);
        return havalimani;
    }
    public ArrayList <HavayoluSirketi> getirHavayoluSirketi(ArrayList<HavayoluSirketi> hYoluSirketi){
        for(int i = 0; i < hYoluSirketi.size(); i++){
            System.out.println(hYoluSirketi.toString());
        }
        return hYoluSirketi;
    }
    public ArrayList <HavayoluSirketi> havayoluSirketiEkle(ArrayList <HavayoluSirketi> hYoluSirketi){
        System.out.println("Havayolu sirketini kodu ile giriniz.(1, TurkHAvayollari) gibi");
        String ad = in.next();
        HavayoluSirketi hSirketi = new HavayoluSirketi(ad);
        hYoluSirketi.add(hSirketi);
        return hYoluSirketi;
    }
    public String getDepartman() {
        return departman;
    }

    public void setDepartman(String departman) {
        this.departman = departman;
    }
    
}
