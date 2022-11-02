
package dailyneed;

public class Commands {
    public String personId;
      public String mission;
      public int count;
      
      Commands(){}
      
      Commands(String a, String b, String c){
          personId = a;
          mission = b;
          count = Integer.parseInt(c);
      }
      Commands(String personId){
          this.personId = personId;
      }
      Commands(String mission, String personID){
    	  this.mission = mission;
          personId = personID;
      }
}
