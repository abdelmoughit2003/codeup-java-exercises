import java.util.Scanner;

/**
 * Prompt the user to enter an integer from 1 to 10.
 *Display the factorial of the number entered by the user.
 *Ask if the user wants to continue.
 *Use a for loop to calculate the factorial.
 *Assume that the user will enter an integer, but verify it’s between 1 and 10.
 *Use the long type to store the factorial.
 *Continue only if the user agrees to.
 *A factorial is a number multiplied by each of the numbers before it.
 *Factorials are denoted by the exclamation point (n!). Ex:.
 */
public class Calculatethefactorialofanumber {
    public static void main(String[] args) {


        //Create an object sc
        Scanner sc = new Scanner(System.in);
        //Declaring variables
        int inputuser;

         do{
             //ask user for input
             System.out.println("Please enter number between 1 and 10 :");
             inputuser = sc.nextInt();
             while (inputuser>=11){

                 System.out.println("Please enter number between 1 and 10 :");
                 inputuser = sc.nextInt();

             }


            //using the for loop to do the factorial
            for (int i = 1; i <= inputuser; i++) {

                System.out.println(i + "!= " + factorial(i));
            }


         }while (inputuser <=10);



    }

        //creating a method with factorial identifier

    public static long factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
            }
        return result;
        }


    }


