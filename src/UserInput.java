//java package which allows us to use the Scanner class

import java.util.Scanner;

//Creating a public class
public class UserInput {

    public static void main(String[] args) {


//        String Sentence;
//        String FirstWord;
//        String SecondWord;
//        String ThirdWord;


        //Creating an object which has an identifier UserInput
        Scanner UserInput = new Scanner(System.in);

//        System.out.println("Please enter the sentence :");
//        Sentence = UserInput.nextLine();
//
//        System.out.println("Please enter the first word :");
//        FirstWord = UserInput.nextLine();
//
//        System.out.println("Please enter the second word :");
//        SecondWord = UserInput.nextLine();
//
//        System.out.println("Please enter the third word :");
//        ThirdWord = UserInput.nextLine();

        //Declaring all variables
        double LengthOfClass;
        double WidthOfClass;
        double HeightOfClass;
        double AreaOfClass;
        double PerimeterOfClass;
        double VolumeOfTheRoom;
        String ChoiceOfUser;
        boolean x=true;




        while (x) {

            //Use the nextInt method to return the value stored in the Scanner class in the LengthOfClass name
            System.out.println("Please enter the length of the classroom :");
            LengthOfClass = UserInput.nextDouble();

            //Use the nextInt method to return the value stored in the Scanner class in the WidthOfClass name
            System.out.println("Please enter the width of the classroom :");
            WidthOfClass = UserInput.nextDouble();

            //Use the nextInt method to return the value stored in the Scanner class in the WidthOfClass name
            System.out.println("Please enter the height of the classroom :");
            HeightOfClass = UserInput.nextDouble();


            //Store the value of the area class  in the AreaOfClass
            AreaOfClass = LengthOfClass * WidthOfClass;

            //Store the value of the perimeter class in the PerimeterOfClass
            PerimeterOfClass = 2 * (LengthOfClass + WidthOfClass);
            //Store the value of the volume class in the VolumeOfClass
            VolumeOfTheRoom = LengthOfClass * WidthOfClass * HeightOfClass;


            //print all values stored in each variable
//        System.out.println(" The sentence is :" + Sentence );
//        System.out.println(" The first word is :" + FirstWord);
//        System.out.println(" The second word is :" + SecondWord);
//        System.out.println(" The third word is :" + ThirdWord);
            System.out.println(" The length of the classroom is :" + LengthOfClass);
            System.out.println(" The width of the classroom is :" + WidthOfClass);
            System.out.println(" The width of the classroom is :" + HeightOfClass);
            System.out.println(" The area  of the classroom is :" + AreaOfClass);
            System.out.println(" The perimeter of the classroom is :" + PerimeterOfClass);
            System.out.println(" The perimeter of the classroom is :" + VolumeOfTheRoom);


            System.out.println("Do you want to want to start calculating ?");
            ChoiceOfUser = UserInput.next();
        //Asking User for yes or no
        if (ChoiceOfUser.equals("yes")) {
            x=true;
        } else {

            System.out.println("ok, let's do it until next time!");
        }



    }


}
}
