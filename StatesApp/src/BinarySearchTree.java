public class BinarySearchTree {
 class Node { 
   //Node object leftChild rightChild
   // key and value pairs
   String key;
   String value;
   Node left, right;

   public Node(String key, String value){ 
     //constructor to initialize a node and a value
     this.key = key;
     this.value = value;
     left = right = null;
   }
 }
 
 Node root; //Declares the root of our tree

 BinarySearchTree(){
   root = null;
 }

 //implement the inserts Methods
 void insert(String key, String value) {
   root = insertRec(root, key, value);
 }
 
 Node insertRec(Node root, String key, String value) {
   //implements conditions for an empty Node
   if(root == null) {
     root = new Node(key, value);
     return root;
   }
   //conditions to in the key values should go in the sub tree
   
     if ((key.compareToIgnoreCase(root.key))<0){
       root.left = insertRec(root.left, key, value);
     }else if ((key.compareToIgnoreCase(root.key))<0){
       root.right = insertRec(root.right, key, value);
     }
     return root;
     
   }
   
   public static Node search(Node root, String key) {
     if ((root == null || root.key.equalsIgnoreCase(key))){
       return search(root.left, key);
     }
  return search(root.right, key);
    } 
}




