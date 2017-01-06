import java.util.Scanner;
import java.util.Random;
/**
 * Ask the user to enter the number of sides for a pair of dice.
 *Prompt the user to roll the dice.
 *“Roll” two n-sided dice, display the results of each, and then ask the user if he/she wants to roll the dice again.
 *Use static methods to implement the method(s) that generate the random numbers.
 *Experiment with different Random number generators –start with the random() method of the Math class but also explore Java’s Random class.
 */
public class Dicerolling {

    public static void main(String[] args) {
        //Declarig variables
        int dieOne;
        int dieTwo;
        String userinput;
        int numberOfdSidesPerDie;
        //Using do while to ask user if he wants to continue
        do{
        //Creating an object to prompt user for inputs
        Scanner sc=new Scanner(System.in);

         //printing results
        System.out.println("Please enter the number of sides for a pair of dice: ");
        numberOfdSidesPerDie= sc.nextInt();
        System.out.println("Please roll the dice: ");

        //calling our method that generate random number
         dieOne=Random(numberOfdSidesPerDie);
         dieTwo=Random(numberOfdSidesPerDie);

         System.out.println("you rolled "+ dieOne + " and " + dieTwo);
         System.out.println("Your total is "+(dieOne + dieTwo));

        //Asking to continue
        System.out.println("Would you continue ? ");
        userinput= sc.next();

        }while(userinput.equals("yes"));

        if(userinput.equals("no")){
            System.out.println("ok let's do it next time");
        }

    }
    //Creating random method
    public static int Random(int numberOfdSidesPerDie){

        //import Random class from java package
        Random dice=new Random();
        //Generating random number between 1 and 6
        dice.nextInt(numberOfdSidesPerDie);

        return dice.nextInt(numberOfdSidesPerDie);

    }
}
