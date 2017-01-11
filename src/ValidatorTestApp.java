import java.util.Scanner;

/**
 *
 */
public class ValidatorTestApp {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Validator valid= new Validator(scan);
        System.out.println("Welcome to the Validation Tester application!");
        valid.getInt("Int test");
        valid.getIntWithinRange(scan,"Please Enter an integer between -100 and 100:",-100, 100);
        valid.getDouble("double test");
        valid.getDoubleWithinRange( "Please Enter an double between -100 and 100:", -100,100);


    }
}
