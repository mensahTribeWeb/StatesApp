/**
 * Bubble Sort 
 *  on^2 gets worst as the data grows
 * */
public class BubbuleSort extends StatesApp{
  public static void bubbleSort(String[][] caps){
    //Variables
    String temp[];
    int cs = caps.length;
    for(int i = 0; i < cs - 1; i++) { //outer columns
        for(int j = 0; j < (cs - i - 1); j++){ //inner rows
          //we will traverse and compare the 1st index because of[capitals]
          // compare returns a negative, positive, 0 based lexical value
          if(((caps[j][1]).compareTo(caps[j + 1][1])) > 0) {
            temp = caps[j];
            caps[j] = caps[j +1];
            caps[j+1] = temp;
          }
        } 
      }

//Display Content

    for(int c = 0; c < capitals.length; c++){
      System.out.println("\n");
      for(int j = 0; j < capitals[c].length; j++){
        System.out.print(capitals[c][j] + " ");
      }
    }
  }
    

  public static void main(String[] args){
    String[][] capitals = getStatesCapitalData();

    bubbleSort(capitals);

  }
}

