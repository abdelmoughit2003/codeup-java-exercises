import java.util.Scanner;

public class ConvertNumToLetter {
    public static void main(String[] args) {


//        Accept a numerical grade from 0 to 100.
//        Display the corresponding letter grade.
//                Prompt the user to continue.
//        Assume that the user will enter valid integers for the grades.
//        The application should only continue if the user agrees to.
//        Grade Ranges:
//
//        A : 100 - 88
//        B : 87 - 80
//        C : 79 - 67
//        D : 66 - 60
//        F : 60 - 0
        Scanner sc = new Scanner(System.in);
        //Declaring variables
        String UserInput;
        String Message;
        int grade;

        System.out.println("Welcome to the student grading application!");

        do{
            System.out.println("Whats is the student's numerical grade?");
            grade=sc.nextInt();
            if(grade>=88){
                Message= "Student made an A";

            }else if(grade>=80){
                Message= "Student made an B";
            }
            else if (grade>=67){
                Message= "Student made an C";
            }
            else if (grade>= 60){
                Message= "Student made an D";
            }else {
                Message= "Student made an F. Try again";
            }
            System.out.println(Message);
            System.out.println("do you want to grade/ judge another student?");
            UserInput=sc.next();

        }while (UserInput.equals("yes"));
    }
}
