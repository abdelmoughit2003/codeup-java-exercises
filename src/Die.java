/**
 *
 */

import java.util.Scanner;
public class Die {
    public static void main(String[] args) {

        int f=1;
        int g=2;
        int numberOfdSidesPerDie;
        String userinput;
        //Using do while to ask user if he wants to continue
        do{
            //Creating an object to prompt user for inputs
            Scanner sc=new Scanner(System.in);

            //printing results
            System.out.println("Please enter the number of sides for a pair of dice: ");
            numberOfdSidesPerDie= sc.nextInt();
            System.out.println("Please roll the dice: ");

            //calling our method that generate random number
            DiceRollingApp  dieOne= new DiceRollingApp(numberOfdSidesPerDie);
            dieOne.roll();
            DiceRollingApp  dieTwo= new DiceRollingApp(numberOfdSidesPerDie);
            dieTwo.roll();

            System.out.println("you rolled "+ dieOne.CurrentValue + " and " + dieTwo.CurrentValue);
            System.out.println("Your total is "+ (dieOne.CurrentValue + dieTwo.CurrentValue));
            System.out.println(f+g);

            //Asking to continue
            System.out.println("Would you continue ? ");
            userinput= sc.next();

        }while(userinput.equals("yes"));
        if(userinput.equals("no")){
            System.out.println("ok let's do it next time");
        }

    }

    }

