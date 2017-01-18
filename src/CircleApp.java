
import java.util.Scanner;



/**
 * .
 */
public class CircleApp {
    public static void main(String[] args) throws Exception {
        double radius;
        String userInput;
        boolean askUser;

        Scanner scan =new Scanner(System.in);
        Validator valid=new Validator(scan);
        do{


            //prompt user for a radius
            radius=valid.getDouble("Please enter a radius : ");
            //instantiate a new circle
            Circle circle=new Circle(radius);


            System.out.println("-----------------Results--------------");
            System.out.println("");
            System.out.println("--------------------------------------");
            System.out.println("The area is:   /  The circumference is:");
            System.out.println( circle.getFormattedArea()+"            " +circle.getFormattedCircumference());
            System.out.println("");
            System.out.println("Would you continue ?");
            userInput=scan.next();


            if (userInput.equals("yes")){
                askUser=true;

            }else{
                askUser=false;
                System.out.println("GoodBye! And remember you have used  " + Circle.getObjectCount() + " circle" );

            }
        }while (askUser);

    }


}
