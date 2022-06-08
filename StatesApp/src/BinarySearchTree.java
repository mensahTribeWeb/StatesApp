/**
 * Binary Tree 
 * Tree where no node has more than two children
 *  Runtime complexity: Best Case O(1)
 *  Worst Case O(n)
 * 
 * */
 class binarySearchTree extends StatesApp {
 public class Node { 
   //Node object leftChild rightChild
   // key: States(String)  value: Capitals(String)
   String key;
   String value;
   Node left;
   Node right;

   public Node(String key, String value){ 
     //constructor to initialize a node and a value
     this.key = key;
     this.value = value;
     left = right = null;
   }
 }
 
 Node root; //Declares the root of our tree
 
 
 public binarySearchTree() {
   root = null;
 }

 //implement the inserts Methods a helper method
 // use this helper method because we will use recursion
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
   
    if ((key.compareToIgnoreCase(root.key)) < 0)
     root.left = insertRec(root.left, key, value);
    else if ((key.compareToIgnoreCase(root.key)) >= 0)
      root.right = insertRec(root.right, key, value);
    return root;
  }
    
    public Node search(Node root, String key) {
  
     if ((root == null || root.key.equalsIgnoreCase(key))){return search(root.left, key);}
      
      else if (( root.key.compareTo(key)) > 0){return search(root.left, key);}
      
     else{return search(root.right, key);}
     }    
}




