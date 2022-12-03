
package listeler;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Listeler {

    public static void main(String[] args) throws IOException {
        Random rn = new Random();
        ArrayList <Ucus> ucus = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        File fileU = new File( "Ucuslar.txt");
        try{
            FileReader fileUR = new FileReader(fileU);
            BufferedReader bufUR = new BufferedReader(fileUR); 
            String line;
            while((line = bufUR.readLine()) != null){
                String last[] = line.split(",");
                Havaalani kalkis = new Havaalani(last[3], last[4], last[5]);
                Havaalani varis = new Havaalani(last[6], last[7], last[8]);
                Ucak ucak = new Ucak(last[10]);
                HavayoluSirketi hSirketi = new HavayoluSirketi(last[11]);
                String durum = null;
                if(last[12].equals("1")){
                    durum = "Planlandi";
                }
                if(last[12].equals("2")){
                    durum = "Ertelendi";
                }
                if(last[12].equals("3")){
                    durum = "Ayrildi";
                }
                if(last[12].equals("4")){
                    durum = "Tamamlandi";
                }
                if(last[12].equals("5")){
                    durum = "Iptal";
                }
                Ucus ucuslar = new Ucus(last[0], last[1], last[2], last[9], 
                        kalkis, varis, ucak, hSirketi, durum);
                ucus.add(ucuslar);
            }
            
        }catch(FileNotFoundException ex){
            
        }
        ArrayList <Yolcu> yolcu = new ArrayList<>();
        ArrayList <Yonetici> yonetici = new ArrayList<>();
        ArrayList <KabinGorevlisi> kUyesi = new ArrayList<>();
        File fileY = new File( "Kisiler.txt");
        try{
            FileReader fileYR = new FileReader(fileY);
            BufferedReader bufYR = new BufferedReader(fileYR);
            String line;
            int yNo = 1;
            while((line = bufYR.readLine()) != null){
                String last[] = line.split(";");
                int no = rn.nextInt(12345) + 11223;
                if(last[3].equals("Yolcu")){
                    Yolcu kisi = new Yolcu(last[0], last[1], "Ankara", last[2], last[3],
                            no, (Integer.toString(yNo)));
                    yNo++;  
                    yolcu.add(kisi);
                }
                else if(last[3].equals("Yonetici")){
                    Yonetici manager = new Yonetici(last[0], last[1], "Ankara", last[2], 
                            last[3], "Yonetici");
                    yonetici.add(manager);
                }
                else if(last[3].equals("KabinUyesi")){
                    KabinGorevlisi kGorevlisi = new KabinGorevlisi(last[0], last[1], "Ankara"
                            , last[2], last[3], 0, 0, false);
                    kUyesi.add(kGorevlisi);
                }
               
            }
        }catch(FileNotFoundException ex){
            
        }
        ArrayList <Ucak> ucak = new ArrayList<>();
        File fileUc = new File("Ucaklar.txt");
        try {
            FileReader fileUCR = new FileReader(fileUc);
            BufferedReader bufUCR = new BufferedReader(fileUCR);
            String line;
            while((line = bufUCR.readLine()) != null){
                String last[] = line.split(";");
                Ucak u = new Ucak(last[0], Integer.parseInt(last[1]), 
                        Integer.parseInt(last[2]));
                ucak.add(u);
            }
        }catch (FileNotFoundException ex){

        }
        ArrayList <HavayoluSirketi> hSirketi = new ArrayList<>();
        File fileHS = new File("HavayoluSirketleri.txt");
        try{
            FileReader fileHSR = new FileReader(fileHS);
            BufferedReader bufHSR = new BufferedReader(fileHSR);
            String line;
            while((line = bufHSR.readLine()) != null){
                HavayoluSirketi hS = new HavayoluSirketi(line);
                hSirketi.add(hS);
            }
        }catch(FileNotFoundException ex){

        }
        ArrayList <Havaalani> havaA = new ArrayList<>();
        File fileH = new File("Havalimanlari.txt");
        try{
            FileReader fileHR = new FileReader(fileH);
            BufferedReader bufHR = new BufferedReader(fileHR);
            String line;
            while((line = bufHR.readLine()) != null){
                String last[] = line.split(",");
                Havaalani hAlani = new Havaalani(last[0], last[1], last[2]);
                havaA.add(hAlani);
            }
        }catch(FileNotFoundException ex){
            
        }
        String moveOn = "Countuine";
        int rezervasyonSayisi = 0;
        ArrayList <UcusRezervasyonu> rezervasyonlar = new ArrayList<>();
        while(!moveOn.equals("quit")){
            System.out.println("1 - Yolcu\n2 - Yonetici\n3 - Kabin Uyesi\n");
            int proccess = in.nextInt();
            int rezerveYolcu = 0;
            if(proccess == 1){
                for(int i = 0; i < yolcu.size(); i++){
                    System.out.println((i + 1) + "-" + yolcu.get(i).getAdSoyad());
                }
                System.out.println("Hangi kişisiniz.(Orn. 1)");
                proccess = in.nextInt();
                System.out.println("Ne yapmak istersiniz ? 1 - Rezervasyon yap "
                        + "veya 2 - Rezervasyon guncelle");
                int index = in.nextInt();
                if(index == 1){
                   rezervasyonSayisi++; 
                   yolcu.get(index).getirUcuslar(ucus);
                    System.out.println("Hangi ucusu tercih edeceksiniz. (Orn 1)");
                    int choice = in.nextInt();
                    System.out.println("Koltuk Sinifiniz = (Economy , Business)");
                    String koltukS = in.next();
                    int ucret = 200;
                    if(koltukS.equals("Business")){
                        ucret += 100;
                    }
                    int flag = 1;
                    for(int i = 0; i < rezervasyonlar.size(); i++){
                        if(rezervasyonlar.get(i).getYolcu().getAdSoyad().equals(yolcu.get(proccess - 1))){
                            System.out.println("Bu kisinin rezervasyonu var!");
                            flag = 0;
                        }
                    }
                    if(flag == 1){
                        UcusKoltugu uK = new UcusKoltugu(String.valueOf(choice), 
                            koltukS, ucret, String.valueOf(rezervasyonSayisi));
                        UcusRezervasyonu uR = new UcusRezervasyonu(String.valueOf(proccess), 
                            ucus.get(choice), uK, yolcu.get(proccess - 1), 
                            "Gerceklestirildi.");
                        rezervasyonlar.add(uR);
                        for(int j = 0; j < rezervasyonlar.size(); j++){
                            System.out.println(rezervasyonlar.get(j).getRezervasyonD());
                        }
                    }     
                }
                else{
                    UcusRezervasyonu ucR = new UcusRezervasyonu();
                    System.out.println("Hangi siradaki sizin rezervasyonunuz");
                    ucR.getirRezervasyon(rezervasyonlar);
                    int which = in.nextInt();
                    ucR.guncelleRezervasyon(rezervasyonlar, which - 1);
                }
            }
            else if(proccess == 2){
                System.out.print("Sifre giriniz (12345)= ");
                int sifre = in.nextInt();
                if(sifre == 12345){
                    for(int i = 0; i < yonetici.size(); i++){
                        System.out.println((i + 1) + "-" + yonetici.get(i).getAdSoyad());
                    }
                    System.out.println("Hangi yoneticisiniz = (Orn. 1)");
                    int index = in.nextInt();
                    System.out.println("Yonetici " + yonetici.get(index - 1).getAdSoyad());
                    System.out.println("Yapabileceginiz Islemler");
                    System.out.println("1-Ucaklari listele");
                    System.out.println("2-Ucaklari Ekle");
                    System.out.println("3-Ucuslari listele");
                    System.out.println("4-Ucus Ekle");
                    System.out.println("5-Havalimanlarini listele");
                    System.out.println("6-Havalimani Ekle");
                    System.out.println("7-Havayolu Sirketlerini listele");
                    System.out.println("8-Havayolu Sirketi Ekle");
                    int whichFunc = in.nextInt();
                    switch(whichFunc){
                        case 1:
                            yonetici.get(index - 1).getirUcak(ucak);
                            break;
                        case 2:
                            yonetici.get(index - 1).ucakEkle(ucak);
                            break;
                        case 3:
                            for(int j = 0; j < ucus.size(); j++){
                                System.out.println(ucus.get(j).toString());
                            } 
                            break;
                        case 4:
                            yonetici.get(index - 1).ucusEkle(ucus);
                            break;
                        case 5:
                            for(int j = 0; j < havaA.size(); j++){
                                System.out.println(havaA.get(j).toString());
                            } 
                            break;
                        case 6:
                            yonetici.get(index - 1).havaalaniEkle(havaA);
                            break;
                        case 7:
                            for(int j = 0; j < hSirketi.size(); j++){
                                System.out.println(hSirketi.get(j).toString());
                            } 
                            break;
                        case 8:
                            yonetici.get(index - 1).havayoluSirketiEkle(hSirketi);
                            break;
                    }
                }
            }
            else if(proccess == 3){
                for(int i = 0; i < kUyesi.size(); i++){
                    System.out.println(kUyesi.get(i).getAdSoyad());
                }
                System.out.println("Hangi uyesiniz.");
                int choice = in.nextInt();
                System.out.println("Ucus saatiniz nedir");
                int ucusSaati = in.nextInt();
                System.out.println("Kac ucusunuz var");
                int ucusMiktari = in.nextInt();
                System.out.println("Pilotmusunuz(Evet ise - true, Degil ise - false yaziniz)");
                boolean yesNo = in.nextBoolean();
                kUyesi.get(choice - 1).setToplamSaat(ucusSaati);
                kUyesi.get(choice - 1).setToplamUcus(ucusMiktari);
                kUyesi.get(choice - 1).setPilot(yesNo);
                for(int i = 0; i < kUyesi.size(); i++){
                    System.out.println(kUyesi.get(i).toString());
                }
            }
            System.out.println("Contuine or quit");
            moveOn = in.next();
        }
        File file = new File("Rezervasyonlar.txt");
        if(file.createNewFile()){
            System.out.println("Rezervasyon dosyasi olusturuldu.");
        }
        FileWriter fileR = new FileWriter("Rezervasyonlar.txt", true);
        BufferedWriter bufR = new BufferedWriter(fileR);
        for(int i = 0; i < rezervasyonlar.size(); i++){
            String temp = rezervasyonlar.get(i).toString();
            bufR.write(temp);
            bufR.newLine();
        }
        bufR.close();
        File fileK = new File("KabinUyeleri.txt");
        fileK.createNewFile();
        FileWriter fileRKU = new FileWriter("KabinUyeleri.txt");
        BufferedWriter bufRKU = new BufferedWriter(fileRKU);
        for(int i = 0; i < kUyesi.size(); i++){
            String temp = kUyesi.get(i).toString();
            bufRKU.write(temp);
            bufRKU.newLine();
        }
        bufRKU.close();
        File fileWU = new File("Ucuslar.txt");
        fileWU.createNewFile();
        FileWriter filewU = new FileWriter("Ucuslar.txt");
        BufferedWriter bufwU = new BufferedWriter(filewU);
        for(int i = 0; i < ucus.size(); i++){
            String temp = ucus.get(i).toString();
            bufwU.write(temp);
            bufwU.newLine();
        }
        bufwU.close();
        File fileUcak = new File("Ucaklar.txt");
        fileUcak.createNewFile();
        FileWriter fileWUcak = new FileWriter("Ucaklar.txt");
        BufferedWriter bufwUcak = new BufferedWriter(fileWUcak);
        for(int i = 0; i < ucus.size(); i++){
            String temp = ucak.get(i).toString();
            bufwUcak.write(temp);
            bufwUcak.newLine();
        }
        bufwUcak.close();
        File fileHavalimani = new File("Havalimanlari.txt");
        fileHavalimani.createNewFile();
        FileWriter fileWHavalimani = new FileWriter("Havalimanlari.txt");
        BufferedWriter bufwHavalimani = new BufferedWriter(fileWHavalimani);
        for(int i = 0; i < havaA.size(); i++){
            String temp = havaA.get(i).toString();
            bufwHavalimani.write(temp);
            bufwHavalimani.newLine();
        }
        bufwHavalimani.close();
        File fileHavayoluSir = new File("HavayoluSirketleri.txt");
        fileHavayoluSir.createNewFile();
        FileWriter fileWHavayoluSir = new FileWriter("HavayoluSirketleri.txt");
        BufferedWriter bufwHavayolu = new BufferedWriter(fileWHavayoluSir);
        for(int i = 0; i < hSirketi.size(); i++){
            String temp = hSirketi.get(i).toString();
            bufwHavayolu.write(temp);
            bufwHavayolu.newLine();
        }
        bufwHavayolu.close();
    }  
}

 