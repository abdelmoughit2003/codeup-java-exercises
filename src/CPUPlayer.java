
import java.util.Scanner;

/**
 * .
 */
public class CPUPlayer extends Player {

        public  String generateRoshambo(String prompt,Scanner scan) {
        int randomInt = 1 + (int) Math.floor(Math.random() * Roshambo.values().length);

        if(randomInt == 0) {
            return Roshambo.ROCK.toString();
        } else if(randomInt == 1) {
            return Roshambo.PAPER.toString();
        } else {
            return Roshambo.SCISSORS.toString();
        }
     }
}

// other method
//import java.io.PrintStream;
//        import java.util.Scanner;
//
///**
// * This source file is subject to the license that is bundled with this package in the file LICENSE.
// */
//
//public class HumanPlayer {
//    public static Roshambo generateRoshambo(Scanner input, PrintStream output) {
//        String choice = Console.prompt(input, output, "Choose Rock, Paper, Scissors");
//        return Roshambo.valueOf(choice.toUpperCase());
//    }
//}

