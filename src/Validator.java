import javax.print.DocFlavor;
import java.util.Scanner;

/**
 * Create a validator class and a ValidatorTestApp (w/ main method) to test

 Create a class called Validator with the following methods

 public Validator(Scanner sc)

 public int getInt(String prompt)
 public int getIntWithinRange(String prompt, int min, int max)
 // if input is out of the range
 // throw new exception (find a good exception name to throw)
 // specify the message
 // prompt the user again
 public double getDouble(String prompt)
 public double getDoubleWithinRange(String prompt, double min, double max)

 public String getRequiredString(String prompt)
 // make sure it aint empty or just spaces
 */
public class Validator {
    Scanner scan;
    public Validator(Scanner scan){

        this.scan=scan;
    }

    //get double method
    int getInt(String prompt){
        Scanner scan = new Scanner(System.in);
        int input;
        System.out.println(prompt);
        try{
            input=scan.nextInt();

        }catch(Exception e){
            System.out.println("Error! Invalid integer value. Try again.");
            System.out.println(e.getMessage());
            return getInt(prompt);
        }
        return input;
    }



    //get double method
    int getIntWithinRange(Scanner scan, String Prompt, int min, int max){

        int integer;
        System.out.println(Prompt);


        try{
            integer=scan.nextInt();


            if (integer<min ){
                throw new IllegalArgumentException("Error! Number must be greater than " + integer);
            }
            if (integer>max){
                throw new IllegalArgumentException("Error! Number must be less than " + integer);
            }


        }catch(Exception e){
            System.out.println("Error! Invalid integer value. Try again.");
            System.out.println(e.getMessage());
            return getIntWithinRange(scan,Prompt, min ,max);
        }
        return integer;
    }


    //get double method
    double getDouble(String prompt){
        Scanner scan = new Scanner(System.in);
        System.out.println(prompt);
        return scan.nextDouble();
    }


    //get double method
     double getDoubleWithinRange(String prompt, double min, double max){
        double decimal;
        System.out.println(prompt);
        Scanner scan = new Scanner(System.in);

        try{
            decimal=scan.nextDouble();

            if (decimal<min){
                throw new IllegalArgumentException("Error! Number must be greater than " + decimal);
            }
            if (decimal>max){
                throw new IllegalArgumentException("Error! Number must be less than " +  decimal);
            }

    }catch (Exception e){
            System.out.println("Error! Invalid decimal value. Try again.");
            System.out.println(e.getMessage());
            return getDoubleWithinRange(prompt, min, max);
        }
            return decimal;

    }
}
