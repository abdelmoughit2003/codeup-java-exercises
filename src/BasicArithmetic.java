
/**
 * Create four separate methods. Each will perform an arithmetic operation:

     Addition
     Substraction
     Multiplication
     Division
 *Each function needs to take two parameters/arguments so that the operation can be performed.

 *Test your functions and verify the output.

 *Add a modulus function that finds the modulus of two numbers.

 .
 */
import java.util.Scanner;
public class BasicArithmetic {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("please enter your first number :");
        int num1=sc.nextInt();
        System.out.println("please enter your second number :");
        int num2=sc.nextInt();

        //Declaring variables
        int addition=addition(num1,num2);
        int substraction=substraction(num1,num2);
        int multiplication=multiplication(num1,num2);
        double division=division(num1,num2);
        int modulus=modulus(num1,num2);

        //displaying arithmetic operations
        System.out.println("The addition is / The substraction  / The multiplication  / The division  / The modulus ");
        System.out.println("----------------------------------------------------------------------------------------");
        System.out.printf("%16s" , addition);
        System.out.printf("%18s" , substraction);
        System.out.printf("%22s" , multiplication);
        System.out.printf("%19s" , division);
        System.out.printf("%12s" , modulus);


    }
    //function for Addition
    public static int addition(int num1,int num2){
        return  num1 +num2 ;

    }
    //function for Substraction
    public static int substraction(int num1,int num2){
        return  num1 -num2 ;

    }
    //function for Multiplication
    public static int multiplication(int num1,int num2){
        return  num1 *num2 ;

    }
    //function for Division
    public static double division(double num1,double num2){
        if(num2==0){
            System.out.println("cannot divide by zero");
        }
        return num1 /num2 ;

    }
    //function for modulus
    public static int modulus(int num1,int num2){
        return num1%num2 ;

    }

}
