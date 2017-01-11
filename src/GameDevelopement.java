import java.util.Random;
import java.util.Scanner;

/**
 *
 */
public class GameDevelopement {
    public static void main(String[] args) {
        int randomnumber;
        //Generate the random number
        System.out.println("Generating a random number");

        randomnumber=Random();

        System.out.println(randomnumber);

        //Comparison
        Comparison(randomnumber);



    }

    public static int Random(){
    //import Random class from java package
    Random random=new Random();
    //Generating random number between 1 and 6
    return 1+random.nextInt(100);

    }


    public static  int Comparison(int randomnumber){
        Scanner scan = new Scanner(System.in);
        Validator valid= new Validator(scan);
        int numberToChoose;
        int counter=1;



    do{
        counter++;


    //ask the user to choose number between 1 and 100
    numberToChoose=valid.getInt(" Guess a number between 1 and 100");


    if(randomnumber==numberToChoose){
        System.out.println("GOOD GUESS");

    }
    else if(randomnumber<numberToChoose){
        System.out.println("LOWER");


    }
    else{
        System.out.println("HIGHER");
    }

    }while (counter<8 && randomnumber !=numberToChoose);

       return numberToChoose;

    }

}
