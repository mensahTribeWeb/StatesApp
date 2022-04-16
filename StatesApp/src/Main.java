import java.util.Scanner;
import java.util.HashMap;
import java.util.TreeMap;

public class Main {
  public static void main(String[] args){
    HashMap<String, String> map = new HashMap<>();
    String[][] statesAndCapitals = getStatesCapitalData();

    BinarySearchTree binarySearchTree =new BinarySearchTree();

    for(int i = 0; i < statesAndCapitals.length; i++ ) {
      map.put(statesAndCapitals[i][0], statesAndCapitals[i][1]);
    }
    System.out.println("State and Capital before Map sort:");
    for(String kv : map.keySet()) {
      binarySearchTree.insert(kv, map.get(kv));
      System.out.println("States: " + kv + " Capital :" + map.get(kv));
    }

  }
  public static String[][] getStatesCapitalData(){
    String[][] s = {
        {"alabama", "montgomery"},
        {"alaska", "juneau"},
        {"arizona", "phoenix"},
        {"arkansas", "little rock"},
        {"california", "sacramento"},
        {"colorado", "denver"},
        {"connecticut", "hartford"},
        {"delaware", "dover"},
        {"florida", "tallahasse"},
        {"georgia", "atlanta"},
        {"hawaii", "honolulu"},
        {"idaho", "boise"},
        {"illinois", "springfield"},
        {"indiana", "indianapolis"},
        {"iowa", "des moines"},
        {"kansas", "topeka"},
        {"kentucky", "frankfort"},
        {"louisiana", "baton rouge"},
        {"maine", "augusta"},
        {"maryland", "annapolis"},
        {"massachusettes", "boston"},
        {"michigan", "lansing"},
        {"minnesota", "saint paul"},
        {"mississippi", "jackson"},
        {"missouri", "jefferson city"},
        {"montana", "helena"},
        {"nebraska", "lincoln"},
        {"nevada", "carson city"},
        {"new hampshire", "concord"},
        {"new jersey", "trenton"},
        {"new york", "albany"},
        {"new mexico", "santa fe"},
        {"north carolina", "raleigh"},
        {"north dakota", "bismark"},
        {"ohio", "columbus"},
        {"oklahoma", "oklahoma city"},
        {"oregon", "salem"},
        {"pennslyvania", "harrisburg"},
        {"rhode island", "providence"},
        {"south carolina", "columbia"},
        {"south dakota", "pierre"},
        {"tennessee", "nashville"},
        {"texas", "austin"},
        {"utah", "salt lake city"},
        {"vermont", "montpelier"},
        {"virginia", "richmond"},
        {"washington", "olympia"},
        {"west virginia", "charleston"},
        {"wisconsin", "madison"},
        {"wyoming", "cheyenne"}};
    return s;
}
  
}
