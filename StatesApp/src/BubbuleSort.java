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
  }
    

  public static void main(String[] args){
    String[][] capitals = getStatesCapitalData();

    bubbleSort(capitals);

    for(int c = 0; c < capitals.length; c++){
      System.out.println("\n");
      for(int j = 0; j < capitals[c].length; j++){
        System.out.print(capitals[c][j] + " ");
      }
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

