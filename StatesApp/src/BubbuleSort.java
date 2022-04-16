import java.lang.reflect.Array;

public class BubbuleSort extends StatesApp{
    public static void bubbleSort(String[][] str){
    //Variables
    String temp[];
    int totalSC = 50;
    String[][] statesAndCapitals = getStatesCapitalData();
    
    for(int i = 0; i < totalSC - 1; i++) { //
        for(int j = 0; j < (totalSC - 1 - j); j++){ //
          //we will traverse and compare the 1st index because of[capitals]
          // compare returns a negative, positive, 0 based lexical value
          
          if(((statesAndCapitals[j][1]).compareTo(statesAndCapitals[j + 1]))>0){
            temp = statesAndCapitals[j + 1];
            statesAndCapitals[j + 1] = statesAndCapitals[j];
            statesAndCapitals[j] = temp;
          }
        } 
      } 
    

      String[][] capitals = BubbuleSort.getStatesCapitalData();
      for(int c = 0; c<totalSC; c++){
        System.out.println();
        for(int j = 0; j < totalSC; j++){
            System.out.print(capitals[c][j]);
      }
    }
  }
}



