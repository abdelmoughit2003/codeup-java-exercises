import java.util.Scanner;

/**
 * .
 */
public class Player {
    String name;
    int counterPlayer;
    int counterOpponent;

    public Player(String name) {
        this.name = name;

    }
    public Player() {


    }


    public String  generateRoshambo(String prompt,Scanner scan){
        String player;
        player = askPlayer( scan);
        if(player.equals("1")){
            return "scissors";

        }else if(player.equals("2")){
            return "rock";


        }else if (player.equals("3")){
            return "paper";

        }

        return player;
    }


    public  String promptPlayer (String prompt  ,Scanner scan){
        System.out.println(prompt);

        return scan.next();
    }
    public  String promptOpponent(String prompt ,Scanner scan){

        System.out.println(prompt);


        return scan.next();
    }

    public  String askPlayer( Scanner scan){

        String player;
        //statements for player and the opponent with printed result
        try{
            player = promptPlayer("Please Enter 1 scissors, 2 rock or  3 paper ", scan);

            // statements for Exception in case the user enter invalid data

            if(!player.equals("1") && !player.equals("2") && !player.equals("3")){
                throw new IllegalArgumentException("Error! Invalid Input must be scissors, rock or paper");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            return askPlayer(scan);
        }
        return player;
    }


    public  void resultOfPlayer( String opponent, String player){


        if ( player.equalsIgnoreCase("scissors") && opponent.equalsIgnoreCase("paper")){
            System.out.println( player + " won");
            counterPlayer++;


        }else if(player.equalsIgnoreCase("rock") && opponent.equalsIgnoreCase("paper")){
            System.out.println(opponent+" won");
            counterOpponent++;


        }else if (player.equalsIgnoreCase("paper") && opponent.equalsIgnoreCase("paper")){
            System.out.println("nobody wins");

        }else if(player.equalsIgnoreCase("scissors") && opponent.equalsIgnoreCase("scissors")){
            System.out.println("nobody wins");

        }else if(player.equalsIgnoreCase("rock") && opponent.equalsIgnoreCase("scissors")){
            System.out.println(player + " won");
            counterPlayer++;


        }else if(player.equalsIgnoreCase("paper") && opponent.equalsIgnoreCase("scissors")){
            System.out.println(opponent+" won");
            counterOpponent++;


        }else if(player.equalsIgnoreCase("scissors") && opponent.equalsIgnoreCase("rock")){
            System.out.println(opponent + " won");
            counterOpponent++;


        }else if(player.equalsIgnoreCase("rock") && opponent.equalsIgnoreCase("rock")){
            System.out.println("nobody wins");

        }else if(player.equalsIgnoreCase("paper") && opponent.equalsIgnoreCase("rock")){
            System.out.println(player + " won");
            counterPlayer++;

        }
    }


    public static void generateTitle() {
        System.out.println("---------------------------------------------------------------------------");
        System.out.println();
        System.out.println("Welcome to the game of...");
        System.out.println();
        System.out.println("ROCK                    PAPER                           SCISSORS!!");
        System.out.println("    _______                 _______                    _______");
        System.out.println("---'   ____)            ---'   ____)____           ---'   ____)____");
        System.out.println("      (_____)                     ______)                    ______)");
        System.out.println("      (_____)                     _______)                __________)");
        System.out.println("      (____)                    _______)                 (____)");
        System.out.println("---.__(___)             ---.__________)            ---.__(___)");
        System.out.println();
        System.out.println("----------------------------------------------------------------------------");
        System.out.println();
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
//public class Console {
//    public static String prompt(Scanner input, PrintStream output, String message) {
//        output.println(message);
//        return input.next();
//    }
//}