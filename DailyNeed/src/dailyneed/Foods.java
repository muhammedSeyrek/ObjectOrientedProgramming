
package dailyneed;

public class Foods {
    public String foodId;
    public String nameOfFood;
    public int calorieCount;
    
    Foods(String a, String b, String c){
        foodId = a;
        nameOfFood = b;
        calorieCount = Integer.parseInt(c);
    }
}
