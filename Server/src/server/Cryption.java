package server; 

public class Cryption {

    private static String reverse (String str){
        String reverse = "";

        int length = str.length();

        for (int i = length - 1 ; i >= 0 ; i--)
            reverse = reverse + str.charAt(i);

        return reverse ;
    }

    public static String encryption(String str) {
        str = reverse(str);
        StringBuilder result = new StringBuilder();
        for (int i  =0 ; i < str.length() ; i++) {
            int ch = (str.charAt(i)+7)*3;
            if(i != str.length()-1) result.append(ch + "/");
            else result.append(ch);
        }
        return result.toString();
    }
    public static String decryption(String str){
        String [] splits = str.split("/");
        int ascii ;
        StringBuilder result = new StringBuilder();
        for(String s : splits){
            ascii = (Integer.parseInt(s)/3)-7;
            char ch = (char) ascii;
            result.append(ch);
        }
        return  reverse(result.toString());
    }

}
