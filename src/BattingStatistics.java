import java.util.Arrays;
import java.util.Scanner;
/**
 * Calculate batting statistics.

         Calculate the batting average and slugging percentage for one or more baseball/softball players.
         First ask for the number of at bats.
         For each at bat, ask the user for the number of bases earned by the batter.
         After all of the at-bats are entered, display the batting average and slugging percentage of the batter.
         Use an Array to store the at-bat results for each player.
         Validate the input so that the user can only enter positive integers. For the at-bat results, the user can only enter 0, 1, 2, 3, or 4.
         Validate the user’s response to the question "Another batter?" so that the user can only enter Y, y, N, or n. If the user chooses N or n, end the program.
         Format the batting average and slugging percentages such that three decimal places are shown.
         Batting average is total number of at-bats for which the player earned at least one base divided by the total number of at-bats.
         Slugging percentage is the total number of bases earned divided by the total number of at-bats.

 Bonus

 At the start of the program, prompt the user for the number of batters to enter, then save the statistics in a two-dimensional array. The program won’t have to prompt the user whether to enter data for another batter since it will know how many batters are to be entered. After all batters have been entered, print a one line summary for each batter.

 Batter 1 average: 0.357    slugging percentage: 0.650
 Batter 2 average: 0.238    slugging percentage: 0.540
 Instead of storing an Array of integers, create a class named AtBat and store instances of this class in the array. This class should define an enumeration named Result with members OUT, SINGLE, DOUBLE, TRIPLE, and HOMERUN. The class should have a constructor that accepts a Result parameter and a method named basesEarned that returns an int representing the number of bases earned for the at bat.
 */

public class BattingStatistics {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        int numberOfBats;
//        int baseEarned;
//        int atLeastOneBat;
        boolean askUser =true;
        String userInput;
        int testNumber;

        do {
            //printing numbers of bats
            System.out.println("Numbers of bats");
            numberOfBats = scan.nextInt();


            //creating multidimension array with indentifier array
            int array[][] = new int[numberOfBats][numberOfBats];

            //Initialized base earned variable
            //baseEarned = 0;

            //Using for loop ask user to enter an integer between 0 and 4 many times as i want

            int sume[] = new int[numberOfBats];
            for(int i=0;i<numberOfBats;i++){

                sume[i]=array.length;
                 for(int j=0;j<numberOfBats;j++){
                     //call getIntWithinRange method to ask user
                     testNumber=getIntWithinRange(scan,"Please enter an integer between 0 and 4");
                     array[i][j]=testNumber;
                     //calculate the total base earned for one array
//                     baseEarned+=testNumber;
                     //Calculate the batting by using atLeastOneBase variable
                             if (testNumber==0) {
                                 sume[i]--;
                             }
                     }

                System.out.println("Total of bats for at least one " + sume[i] );

                 }

           //for loop for one array
//        for(int i=0;i<numberOfBats;i++){
//
//            testNumber=getIntWithinRange(scan,"Please enter an integer between 0 and 4");
//            array[i]=testNumber;
//            if (testNumber==0){
//                numberOfBats--;
//            }
//            baseEarned+=testNumber;
//        }

       //printing what we have on the multidmension array by using Arrays.deepToString method
        System.out.println("Array number is"+ Arrays.deepToString(array));

            //Creating another array to display the total of earned base for each player
            int sum[] = new int[numberOfBats];

            for (int i = 0; i < numberOfBats; i++){
                int total = 0;
                for (int j = 0; j < numberOfBats; j++){
                    total += array[i][j];
                }
                    sum[i] = total;
            }

            //printing the total of earned base for each player
        System.out.println("the total inside of each array "+ Arrays.toString(sum));

            //Setting a for loop do display the slugging and bating result for each player
            for(int i=0;i<numberOfBats;i++){

                System.out.printf("batter " + (i+1) + " average : " + (double)(sum[i]/numberOfBats) +"            "+" Slugging percentage : " +(double)(sume[i]/numberOfBats));
            }
        //printing results for one array
//        System.out.println("Total Based earned :" + baseEarned);
//        System.out.println("total number of at bats for which the player earned at least one base which equals to : "+ numberOfBats );
//        System.out.println("Slugging is :"+((double)baseEarned/numberOfBats));
//        System.out.println("bating is :"+ ((double)numberOfBats/numberOfBats));
            //asking player for another battle

            System.out.println("Another battle!");
            userInput=scan.next();

            if(!userInput.equalsIgnoreCase("Y")||userInput.equalsIgnoreCase("N")){
                askUser=false;
            }
            if (userInput.equalsIgnoreCase("Y")){
                askUser=true;
            }

        }while(askUser);
    }

    //set a getIntWithinRange method to do exception
    public static int  getIntWithinRange(Scanner scan ,String prompt) {

        System.out.println(prompt);
        int userInt = scan.nextInt();
        try {

            if(userInt <0|| userInt >4) {
                throw new IllegalArgumentException("Your input must be an integer between 0  and 4");
            }
        } catch(Exception e) {
            System.out.println("Must be an integer");
            System.out.println(e.getMessage());
            return getIntWithinRange(scan,prompt);
        }

        return userInt;
    }







}



