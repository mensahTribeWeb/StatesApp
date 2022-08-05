/**
 * Hash Map 
 * Collection of key(k), value(v) pairs call entry
 *  Runtime complexity: Best Case O(1)
 *  Worst Case O(n)
 * 
 * */

import java.util.HashMap;
import java.util.Scanner;
import java.util.TreeMap;

public class HashMapMain extends binarySearchTree  {
  public static void main(String[] args){
    //Declaration of the a HashTable
    // Key value pairs
    //Dynamically expands
    HashMap<String, String> hMap = new HashMap<>();
    String[][] statesAndCapitals = getStatesCapitalData();
    
    //bST variable for binarySearchTree removes chances of error
    //binary search tree for storage
  binarySearchTree bST = new binarySearchTree();

    //add key value pairs using the .put() method
    for(int i = 0; i < statesAndCapitals.length; i++ ) {
      hMap.put(statesAndCapitals[i][0], statesAndCapitals[i][1]);
    }

    // Display the content of the Map
    System.out.println("Content of the Map:\n");
    // Place keys into set and iterate over the set
    for(String kv : hMap.keySet()) {
      bST.insert(kv, hMap.get(kv));
      System.out.println("States: " + kv + "\t " + "Capital: " + hMap.get(kv));
    }

      TreeMap<String, String> treeMap = new TreeMap<>();
      treeMap.putAll(hMap);

      //search section
      Scanner scan = new Scanner(System.in);

      String state = "";
      String invalidResponse = state + " does not exist. Please Enter a Valid State.";

      System.out.print("\n Please Enter a State: ");
      state = scan.nextLine();
      binarySearchTree.Node searchedElement =  bST.search(bST.root, state);
        if(searchedElement != null) {
        System.out.println("The capital of " + state + " is: " + ((binarySearchTree.Node) searchedElement).value);
      }else{System.out.println(invalidResponse);}
     
      scan.close();
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

  