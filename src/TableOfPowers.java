
import java.util.Scanner;
public class TableOfPowers {
    public static void main(String[] args) {

//        Display a table of powers.
//
//        Prompt the user to enter an integer.
//        Display a table of squares and cubes from 1 to the value entered.
//        Ask if the user wants to continue.
//        Assume that the user will enter valid data.
//        Only continue if the user agrees to.


        //Creating object
        Scanner UserInput=new Scanner(System.in);
        //Declaring variables
        int IntegerNumber;
        String User;


        do{

            //ask user to enter an integer
            System.out.println("Please enter an integer :");
            IntegerNumber = UserInput.nextInt();


            System.out.println("Number  / Square   / Cube");
            System.out.println("-------------------------");

            for (int i=1; i<= IntegerNumber; i++ ) {
                System.out.printf("%12s", i);
                System.out.printf("%12s", i*i);
                System.out.printf("%12s", i*i*i);
                System.out.println();

            }
            System.out.println("Do you want to continue?");
            User=UserInput.next();

        }while( User.equals("yes") );
        System.out.println("Thank you for using the table powers");
    }
}
