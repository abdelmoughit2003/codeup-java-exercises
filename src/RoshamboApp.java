import java.util.Scanner;

/**
     * Prompt the player to enter a name and select an opponent.
     Prompt the player to select rock, paper, or scissors. Then display the player’s choice, the opponent’s choice, and the result of the match.
     Continue until the user doesn’t want to play anymore.
     If the user makes an invalid selection, display an appropriate error message and prompt the user again until the user makes a valid selection.
     Create an enumeration called Roshambo that stores three values: rock, paper, and scissors. This enumeration should include a toString method that can convert the selected value to a String.
     Create an abstract class named RoshamboApp that stores a name and a Roshambo value. This class should include an abstract method named generateRoshambo that allows an inheriting class to generate and return a Roshambo value.
     Create and name two player classes (subclasses of RoshamboApp).
     One of these players should always select rock.
     The other player should randomly select rock, paper, or scissors (a 1 in 3 chance of selecting each).
     Create a third player class that extends RoshamboApp and implements the generateRoshambo method. For this class, generateRoshambo gets input from the human player and returns the value chosen.
     Create a class called RoshamboApp that allows the user to play against either of your first two player classes.
     Use a Validator class to validate the user’s entries.
 */
public class RoshamboApp {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);


        //Declaring variables
        String player;
        String opponent;
        String userInput;
        String name;
        //Printing design rock,scissors and paper game
        Player.generateTitle();

        //Prompting user for his name
        name=promptPlayer("Please enter your name ",scan);
        //Create two objects to get access to element in different class
        Player playerOne =new Player(name);
        Player playerTwo =new RockPlayer();

        //Prompting user to choose between between Computer and rock
        opponent=playerOne.promptOpponent("Please choose the opponent :CPU / rock  ",scan);
        //Statements for (CPU =computer) or rock
        if(opponent.equalsIgnoreCase("rock")) {

            playerTwo = new RockPlayer();
        } else if(opponent.equalsIgnoreCase("cpu")) {

            playerTwo= new CPUPlayer();
        }

            do {
                //assigning an identifier for each prompt user
                player=playerOne.generateRoshambo("", scan);
                opponent=playerTwo.generateRoshambo("", scan);


                // Displaying results of the game
                playerOne.resultOfPlayer( opponent, player);
                System.out.println( name + playerOne.counterPlayer +"       Opponent: "+ playerOne.counterOpponent);

                //asking user to continue
                System.out.println("would you like to continue ?");
                userInput=scan.next();

            }while (userInput.equalsIgnoreCase("yes")||userInput.equalsIgnoreCase("y") );

        }
    //method return a prompt user
    public static String promptPlayer (String prompt  ,Scanner scan){
        System.out.println(prompt);

        return scan.next();
    }

}
//other method
//import java.io.PrintStream;
//        import java.util.Scanner;
//
///**
// * This source file is subject to the license that is bundled with this package in the file LICENSE.
// */
//
//public class RockPaperScissors {
//    public static void main(String[] bananas) {
//        Scanner input = new Scanner(System.in);
//        PrintStream output = System.out;
//
///*
//        // draw
//        System.out.println(Roshambo.SCISSORS == Roshambo.SCISSORS);
//
//        // not a draw
//        System.out.println(Roshambo.SCISSORS.beats(Roshambo.PAPER));
//
//
//        Roshambo choiceFromString = Roshambo.valueOf("scissors".toUpperCase());
//        System.out.println(choiceFromString.toString());
//*/
//
//        // Input
//        String name = Console.prompt(input, output, "Enter your name");
//        Roshambo choice = HumanPlayer.generateRoshambo(input, output);
//        String opponent = Console.prompt(input, output, "Choose an opponent (Computer/Rocks)");
//
//        Roshambo opponentsChoice = RockPlayer.generateRoshambo();
//
//        // Process
//        output.println(
//                "Your choice was: " + choice
//                        + " your opponent's choice was " + opponentsChoice
//        );
//
//        // Output
//        if (choice == opponentsChoice) {
//            output.println("It's a draw");
//        } else if (choice.beats(opponentsChoice)) {
//            output.println("You won!");
//        } else {
//            output.println("You lose!");
//        }
//    }
//}