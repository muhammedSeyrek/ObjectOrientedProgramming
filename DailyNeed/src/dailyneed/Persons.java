
package dailyneed;

public class Persons {
    public String personId;
    public String name;
    public String gender;
    public int weight;
    public int height;
    public int dateOfBirth;
    public int dailyNeeds = 0;
    public int top = 0;
    public int burnedSpor;
    
    Persons(String a, String b, String c, String d, String e, String f){
        personId = a;
        name = b;
        gender = c;
        weight = Integer.parseInt(d);
        height = Integer.parseInt(e);
        dateOfBirth = Integer.parseInt(f);
        
        if(gender.equals("male")){
            dailyNeeds = (int) ((66 + (13.75 * weight) + (5 * height)) - (6.8 * (2022 - dateOfBirth)));
        }
        else{
            dailyNeeds = (int) ((665 + (9.6 * weight) + (1.7 * height)) - (4.7 * (2022 - dateOfBirth)));
        }
    }
}
