import java.util.Scanner;

public class StatesApp {

    static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        String[][] statesAndCapitals = getStatesCapitalData();
         int score = 0;
        
        //ask user to enter capital using a for loop and return a state from getStatesAndCapitalData() 
        for(int i = 0; i <= statesAndCapitals.length; i++) {
            System.out.println("Lets play a game!");
            System.out.println("What will the capital of " + statesAndCapitals[i][0] + " be ?");
            //0 because we will be inquiring for the 1st index of the array
            String capitals = scan.nextLine();
            //Lets verify the user input now using isequalTo() method
            if(isEqualTo(statesAndCapitals[i][1], capitals)) {
                System.out.println("way to go! Your answer is correct! ");
                score++; //add to initializes score variable 
            }else{System.out.print("The correct answer should be " + statesAndCapitals[i][1]);} 
        }
        // Display the score of the state capital game portion
        if(score == 50){
        System.out.println("\n You are an All star you score" + score + "\50" );
    }
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
        {"Alabama", "Montgomery"},
        {"Alaska", "Juneau"},
        {"Arizona", "Phoenix"},
        {"Arkansas", "Little Rock"},
        {"California", "Sacramento"},
        {"Colorado", "Denver"},
        {"Connecticut", "Hartford"},
        {"Delaware", "Dover"},
        {"Florida", "Tallahasse"},
        {"Georgia", "Atlanta"},
        {"Hawaii", "Honolulu"},
        {"Idaho", "Boise"},
        {"Illinois", "Springfield"},
        {"Indiana", "Indianapolis"},
        {"Iowa", "Des Moines"},
        {"Kansas", "Topeka"},
        {"Kentucky", "Frankfort"},
        {"Louisiana", "Baton Rouge"},
        {"Maine", "Augusta"},
        {"Maryland", "Annapolis"},
        {"Massachusettes", "Boston"},
        {"Michigan", "Lansing"},
        {"Minnesota", "Saint Paul"},
        {"Mississippi", "Jackson"},
        {"Missouri", "Jefferson City"},
        {"Montana", "Helena"},
        {"Nebraska", "Lincoln"},
        {"Nevada", "Carson City"},
        {"New Hampshire", "Concord"},
        {"New Jersey", "Trenton"},
        {"New York", "Albany"},
        {"New Mexico", "Santa Fe"},
        {"North Carolina", "Raleigh"},
        {"North Dakota", "Bismark"},
        {"Ohio", "Columbus"},
        {"Oklahoma", "Oklahoma City"},
        {"Oregon", "Salem"},
        {"Pennslyvania", "Harrisburg"},
        {"Rhode Island", "Providence"},
        {"South Carolina", "Columbia"},
        {"South Dakota", "Pierre"},
        {"Tennessee", "Nashville"},
        {"Texas", "Austin"},
        {"Utah", "Salt Lake City"},
        {"Vermont", "Montpelier"},
        {"Virginia", "Richmond"},
        {"Washington", "Olympia"},
        {"West Virginia", "Charleston"},
        {"Wisconsin", "Madison"},
        {"Wyoming", "Cheyenne"}};
    return s;
}
}





    


        
