import java.util.Scanner;

/**
 * Playing in Traffic

         create an enum named TrafficLightColor that contains a list of the colors that are on a stoplight
         create a method named with the following signature
         public static void makeDrivingDecision(TrafficLightColor color)
         inside of the method, print out a message that tells what to do at each color light.
 */
public class MakeDrivingDecision {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//ask user to enter TrafficLightColor;
        System.out.println("Please enter a TrafficLightColor :");
        String user = scan.next().toUpperCase();
        //defining which color to store in lightColor
        TrafficLightColor lightColor =TrafficLightColor.valueOf(user);

        //Using TrafficLightColor randomly
//TrafficLightColor lightColor =TrafficLightColor.getRandomLight();

        //calling makeDrivingDecision to display the cases
        makeDrivingDecision(lightColor);
    }

    public static void makeDrivingDecision(TrafficLightColor color){
switch (color){
    case RED:
        System.out.println("Please stop!");
        break;
    case YELLOW:
        System.out.println("Please be prepared to stop");
        break;
    case GREEN:
        System.out.println("Go Go Go move!");
        break;
        }
    }

}
// Another method
////public class TrafficLightApp {
//public static void main(String[] args) {
//
//    System.out.println("Let's play in traffic! ");
//
//    System.out.println("You will be asked to provide a color for the light...");
//    TrafficLightColor randomLightColor = TrafficLightColor.getTrafficLightColor();
//    TrafficLightColor.makeDrivingDecision(randomLightColor);
//
//    System.out.println("Now, the light will randomly select");
//    randomLightColor = TrafficLightColor.getRandomLight();
//    TrafficLightColor.makeDrivingDecision(randomLightColor);
//
//}