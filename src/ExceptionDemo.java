import java.util.Scanner;

/**
 * 1. ExceptionDemo
 Write a program that will recognize invalid inputs when the user sets information about student
 - Write a student class with firstName, lastName, age (Student.java)
 - The Main class should be called ExceptionDemo.java
 - Prompt the user to ask about a particular student (first, last, age)
 - Give proper responses according to user-submitted information
 - If data is invalid, then use exception handling the re-prompt the user for valid data
 - Try to catch as many exceptions as possible
 - Make the app as user friendly as possible.
 */
//First method
//public class ExceptionDemo {
//    public static void main(String[] args) {
//        //Creating objects
//        Scanner scan =new Scanner(System.in);
//        Student student=new Student();
//        //Declaring variables
//        String firstName;
//        String lastName;
//        int age;
//
//        try{
//        //Asking user for first name
//        System.out.println("Please enter your first name: " );
//        firstName=scan.next();
//        student.setFirstName(firstName);
//
//        //Asking user for last name
//        System.out.println("Please enter your last name: " );
//        lastName=scan.next();
//        student.setLastName( lastName);
//
//        //Asking user for age
//        System.out.println("Please enter your age: " );
//        age=scan.nextInt();
//        student.setAge(age);
//
//            if (age >150){
//                throw new IllegalArgumentException("No Way! are you a ghost ?");
//            }
//        }catch (Exception e){
//            System.out.println(e.getMessage());
//            System.out.println("Error! is not a valid entry");
//            }
//        System.out.println("Please enter valid age");
//        age=scan.nextInt();
//        while (age>150){
//            System.out.println("Please enter valid age");
//            age=scan.nextInt();
//        }
//
//
//    }
//}
//Second method

import java.util.InputMismatchException;
public class ExceptionDemo {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.println("Welcome to the Student Records App");

    System.out.println("Please input a new student: ");

    String firstName = getString("First name: ", scan);
    String lastName = getString("Last name: ", scan);
    int age = getInt("Age? ", scan);

    Student newStudent = new Student(firstName, lastName, age);
    System.out.println("Howdy there, " + newStudent.getFirstName() + " " + newStudent.getLastName() + ". You are " + newStudent.getAge() + " years old.");

}

    private static int getInt(String prompt, Scanner scan) {

        int userInteger;
        System.out.print(prompt);
        try {
            userInteger = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Your input must be an integer, nothing else!");

            // Keeps the scanner from "skipping" the next input
            scan.next();
            return getInt(prompt, scan);
        }

        return userInteger;
    }


    public static String getString(String prompt, Scanner scan) {
        String inputString;

        System.out.print(prompt);
        try {
            inputString = scan.nextLine();

        } catch(Exception e) {
            System.out.println("Whoops, something went wrong...");

            // Keeps the scanner from "skipping" the next input
            scan.next();
            return getString(prompt, scan);
        }

        return inputString;
    }
}
