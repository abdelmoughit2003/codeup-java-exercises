
import java.text.DecimalFormat;

import static java.lang.Math.PI;

/**
 * Prompt the user to enter a radius.
     Display an error if the user enters invalid data.
     When the user enters valid data, calculate the area and circumference of the circle and rounds to the nearest 2 decimal places.
     Ask if the user wants to continue.
     When the user quits, display a “goodbye” message that also indicates the number of circles the user built..
 */
public class Circle {
    double radius;
    private static int objectCount;


    public Circle(double radius) {
        this.radius = radius;
        objectCount++;
    }

    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

    public double getCircumference() {

        return  2 *PI * radius;

    }

    public String getFormattedCircumference() {
// other method
//        DecimalFormat decimalFormat = new DecimalFormat("#.00");
//        return decimalFormat.format(getCircumference());
        double circumference = getCircumference();
        return formatNumber(circumference);

    }

    public String getFormattedArea(){
//other method
        //        DecimalFormat decimalFormat = new DecimalFormat("#.00");
//        return decimalFormat.format(getArea());
        double area = getArea();
        return formatNumber(area);

    }

    public static int  getObjectCount(){
        return objectCount;
    }


    private String formatNumber(double x){

//        other method
//        DecimalFormat decimalFormat = new DecimalFormat("#.00");
//        return  decimalFormat.format(x);
        return String.format("%.2f",x);
    }



}
