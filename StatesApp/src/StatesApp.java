import java.util.Scanner;

public class StatesApp {

    static Scanner scan = new Scanner(System.in);
    final public static int totalSC = 50;

    public static void main(String[] args) throws Exception {

      String[][] statesAndCapitals = getStatesCapitalData();
         int score = 0;
        
        //ask user to enter capital using a and Traverse the [][]Array,then return a state from getStatesAndCapitalData() 
        System.out.println("Lets play a game!");
        for(int i = 0; i <= totalSC; i++) {
            System.out.println("What will the capital of " + statesAndCapitals[i][0] + " be ?\n");
            //0 because we will be inquiring for the 1st index of the array
            String capitals = scan.nextLine().toLowerCase();
            //Lets verify the user input now using isequalTo() method
            if(isEqualTo(statesAndCapitals[i][1], capitals)) {
                System.out.println("way to go! Your answer is correct! ");
                score++; //add to initializes score variable 
            }else{System.out.print("The correct answer should be " + statesAndCapitals[i][1]);} 
        }
        // Displays the score of the state capital game portion
        if(score == 50){
            System.out.println("\n You are an All star you scored " + score + "\50");
        }else if(score < 50 && score >=30){
            System.out.println("\n Great Job you scored " + score + "\50");
        }else if(score < 30 && score >=25){
            System.out.println("\n Awesome work! you scored " + score + "\50");
        }else if(score < 25 && score >=10){
            System.out.println("\n WoW you scored" + score + "\50");
        }else{System.out.println("\n Please Study,  you scored " + score + "\50");}
        
        for(int i = 0; i<totalSC; i++){
            System.out.println();
            for(int j = 0; j < totalSC; j++){
                System.out.print(statesAndCapitals[i][j]);
            }
        }
        scan.close();
    }

//method section

//A method to verify the states the user enter and valid
public static boolean isEqualTo(String arrayCapitals, String userCapitals){
if (arrayCapitals.length() != arrayCapitals.length())
return false;

for (int i =0; i < arrayCapitals.length(); i++) {
    if (arrayCapitals.charAt(i) != userCapitals.charAt(i)){
    return false;}
    }
    return true;
}
//initialization of a two-dimensional Array method 
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
static String[][] capitals = BubbuleSort.getStatesCapitalData();
}





    


        
