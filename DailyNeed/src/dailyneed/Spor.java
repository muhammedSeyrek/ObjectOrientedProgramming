
package dailyneed;

public class Spor {
    public String sporId;
    public String nameOfSport;
    public int calorieBurned;
    Spor(String a, String b, String c){
        sporId = a;
        nameOfSport = b;
        calorieBurned = Integer.parseInt(c);
    }
}
