/**
 *
 */
public enum TrafficLightColor {

    RED,YELLOW,GREEN;

    public static TrafficLightColor getRandomLight(){
        return values()[(int) (Math.random() * values().length)];
    }
}
//another method
//public enum TrafficLightColor {
//    RED, YELLOW, GREEN, ORANGE;
//
//    public static TrafficLightColor getRandomLight() {
//        int randomInt = (int) Math.floor(Math.random() * TrafficLightColor.values().length);
//
//        if(randomInt == 0) {
//            return TrafficLightColor.GREEN;
//        } else if(randomInt == 1) {
//            return TrafficLightColor.YELLOW;
//        } else {
//            return TrafficLightColor.RED;
//        }
//    }
//
//    public static TrafficLightColor getTrafficLightColor() {
//        Scanner scan = new Scanner(System.in);
//        Validator validator = new Validator(scan);
//        System.out.println("Color must be in the following range: ");
//        for (int i = 0; i < TrafficLightColor.values().length; i++) {
//            System.out.print(TrafficLightColor.values()[i]);
//            System.out.println();
//        }
//
//        String colorString = validator.getString("Please input a color for the light").toUpperCase();
//
//        try {
//            return TrafficLightColor.valueOf(colorString);
//
//        } catch(IllegalArgumentException e) {
//            System.out.println("The color you typed is not a valid traffic light color");
//            return getTrafficLightColor();
//        }
//    }
//
//
//    public static void makeDrivingDecision(TrafficLightColor color) {
//        if(color.equals(TrafficLightColor.GREEN)) {
//            System.out.println("Vroom vroom");
//        } else if(color.equals(TrafficLightColor.YELLOW)) {
//            System.out.println("HURRY QUICK");
//        } else if(color.equals(TrafficLightColor.RED)) {
//            System.out.println("Full and complete stop");
//        }
//    }
//}