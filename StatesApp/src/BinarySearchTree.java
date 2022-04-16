import java.util.Scanner;
import java.util.TreeMap;

public class BinarySearchTree {
 class Node {
   String key;
   String value;
   Node left, right;

   public Node(String key, String value){
     this.key = key;
     this.value = value;
     left = right =null;
   }
 }
 // setting up root for BST
 static Node root;

 BinarySearchTree(){
   root = null;
 }
 //inserts into the tree
 void insert(String key, String value) {
   root = insertREC(root, key, value);
 }
 Node insertREC(Node root, String key, String value) {
   if(root == null) {
     root = new Node(key, value);
     return root;
   }
   TreeMap<String, String> treeMap = new TreeMap<>();
   treeMap.putAll(treeMap);

   Scanner scan = new Scanner(System.in);
   String state = "";
   state = scan.nextLine();
   Node searchedElement =  BinarySearchTree.search(BinarySearchTree.root, state);

   if(searchedElement != null) {
     System.out.print("The Capital of " + state + " will be " + searchedElement.value);
   }else{
     System.out.println("This " + state + " is invalid and does not exist in the U.S");
   }
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
  if ((key.compareToIgnoreCase(root.key))<0){
    root.left = insertREC(root.left, key, value);
  }else if ((key.compareToIgnoreCase(root.key))<0){
    root.right = insertREC(root.right, key, value);
  }
  return root;
}

public static Node search(Node root, String key){
  if ((root == null || root.key.equalsIgnoreCase(key))){
    return search(root.left, key);
  }
  return search(root.right, key);
 }
}
