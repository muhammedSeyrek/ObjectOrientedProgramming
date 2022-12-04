
package maincontact;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class MainContact {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        ArrayList <Contact> contact = new ArrayList<>();
        Iterator <Contact> contactIter;
        HashSet  contactHash = new HashSet();
        TreeSet tree = new TreeSet();//Siralamadan gondermek icin ici bos
        TreeSet contactTree = new TreeSet(new LastNameComparator());//Siralamak icin icine fonksiyon classi ile gonderiyoruz.
        HashMap contactMap = new HashMap();
        File fileC = new File("contacts.txt");
        FileReader fileR = new FileReader(fileC);
        BufferedReader bufRC = new BufferedReader(fileR);
        String line;
        
        while((line = bufRC.readLine())!= null){
            String[] last = line.split(" ");
            Contact cont = new Contact(last[0], last[1], last[2], last[3]);
            contact.add(cont);
            contactHash.add(cont);
            contactTree.add(cont);
            tree.add(String.valueOf(cont));
            //Telefon numarasina gore key aliyoruz.
            contactMap.put(last[3], cont);
        }
        //contactTree.comparator();
        contactIter = contact.listIterator();
        //1.kismi yapalim.
        File contactsArray = new File("contactArrayList.txt");
        contactsArray.createNewFile();
        FileWriter FileRcontactsArray = new FileWriter("contactArrayList.txt");
        BufferedWriter bufContactArray = new BufferedWriter(FileRcontactsArray);
        for(int i = 0; contactIter.hasNext(); i++){
            //iter ile döndürüyoruz.    
            String temp = contactIter.next().toString();
            bufContactArray.write(temp);
            bufContactArray.newLine();
        }
        bufContactArray.close();
        
        //2.kisim.
        //Neden arraylisti tanimlarken atmadik?
        //Cunku ilk sirasiz arraylisti dosyaya aktardik sonra siraladik.
        //alttaki kod'da Collections sinifini kullaniyoruz.
        //arrayi LastNameComparator sinifina goturerek orda ki compareTo fonksiyonnuyla siralamasini sagliyor.
        Collections.sort(contact, new LastNameComparator());
        
        File contactsArrayOrderLast = new File("contactArrayListOrderByLastName.txt");
        contactsArrayOrderLast.createNewFile();
        FileWriter FileRcontactsArrayOrderLast = new FileWriter("contactArrayListOrderByLastName.txt");
        BufferedWriter bufContactArrayOrderLast = new BufferedWriter(FileRcontactsArrayOrderLast);
        for(int i = 0; i < contact.size(); i++){
            //iter ile döndürüyoruz.
            String temp = contact.get(i).toString();
            //adim adim atiyoruz dosyaya
            bufContactArrayOrderLast.write(temp);
            bufContactArrayOrderLast.newLine();
        }
        bufContactArrayOrderLast.close();

        //3.kisim.
        Iterator hashC = contactHash.iterator();
        File fileHash = new File("contactHashSet.txt");
        fileHash.createNewFile();
        FileWriter FileHashSet = new FileWriter("contactHashSet.txt");
        BufferedWriter bufHashSet = new BufferedWriter(FileHashSet);
        while(hashC.hasNext()){
            //iter ile döndürüyoruz.
            String temp = hashC.next().toString();
            bufHashSet.write(temp);
            bufHashSet.newLine();
        }
        bufHashSet.close();

        //4.kisim
        Iterator Itree = tree.iterator();
        File fileTree = new File("contactTreeSet.txt");
        fileHash.createNewFile();
        FileWriter FileTreeSet = new FileWriter("contactTreeSet.txt");
        BufferedWriter bufTreeSet = new BufferedWriter(FileTreeSet);
        while(Itree.hasNext()){
            //iter ile döndürüyoruz.
            String temp = Itree.next().toString();
            bufTreeSet.write(temp);
            bufTreeSet.newLine();
        }
        bufTreeSet.close();

        //5.kisim
        Iterator treeC = contactTree.iterator();
        File fileTreeO = new File("contactTreeSetOrderByLastName.txt");
        fileTreeO.createNewFile();
        FileWriter FileTreeSetOrder = new FileWriter("contactTreeSetOrderByLastName.txt");
        BufferedWriter bufTreeSetOrder = new BufferedWriter(FileTreeSetOrder);
        while(treeC.hasNext()){
            //iter ile döndürüyoruz.
            //ayni sekilde atama islemi.
            String temp = treeC.next().toString();
            bufTreeSetOrder.write(temp);
            bufTreeSetOrder.newLine();
        }
        bufTreeSetOrder.close();

        //6.kisim.
        //ilk once set haline getiriyoruz.
        Set s = contactMap.entrySet();
        Iterator mapC = s.iterator();
        File fileM = new File("file.txt");
        fileM.createNewFile();
        FileWriter FileMap = new FileWriter("file.txt");
        BufferedWriter bufMap = new BufferedWriter(FileMap);
        while(mapC.hasNext()){
            //map icin bu kismi set'lerde kullanmadik.
            Map.Entry item = (Map.Entry) mapC.next();
            String temp = item.getValue().toString();
            bufMap.write(temp);
            bufMap.newLine();
        }
        bufMap.close();

    }
    
}
