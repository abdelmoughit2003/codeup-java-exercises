package Countries;
import java.io.*;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;



/**
 * .
 */

public class CountriesApp {
    public static void main(String[] args) throws IOException {
        int choiceUser;
        String countryChoosed;
        String askUser;
        Scanner scan =new Scanner(System.in);


        String directory = "Countries.CountriesTextFile";
        // Create a Path object from a string using the Paths factory
        Path directoryPath = Paths.get(directory);

        // If the directory doesn't exist create it
        if (Files.notExists(directoryPath)) {
            Files.createDirectories(directoryPath);
        }

        String file = "countries.txt";
        // If you want to create a path to a file you'll need the path to the directory

        // plus the path to the file
        Path filePath = Paths.get(directory, file);



do{


        System.out.println("Choose option 1 ,option 2, option 3");
        choiceUser=scan.nextInt();
        if (choiceUser==1){

            CountriesTextFile.readListOfCountries(filePath);


        }
        else if(choiceUser==2){
            System.out.println("Please enter a name of any country ");
            countryChoosed=scan.next();
            System.out.println("");


            FileWriter fileWriter = new FileWriter(filePath.toFile());
            PrintWriter writer = new PrintWriter(fileWriter);

            writer.println(countryChoosed);

            writer.close();
            fileWriter.close();


            CountriesTextFile.readListOfCountries(filePath);
            CountriesTextFile.writeListOfCountries(filePath);
            CountriesTextFile.readListOfCountries(filePath);





        }
        else if(choiceUser==3){
            System.out.println("Goodbye! See you next year");
        }
        System.out.println("would you continue ?");
        askUser=scan.next();
}while (askUser.equalsIgnoreCase("yes"));



    }
}
