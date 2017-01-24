package Countries;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;


/**
 * .
 */



public class CountriesTextFile {


    public static void  writeListOfCountries(Path filePath) throws IOException  {

        FileWriter fileWriter = new FileWriter(filePath.toFile());
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        PrintWriter writer = new PrintWriter(bufferedWriter);

        String[] countries = {"Germany","Italy","Finland"};

        for (String country :countries ) {
            writer.println(country);
        }


        // Do not forget to close your writers!!!!!
        // Writers write on close...
        writer.close();
        bufferedWriter.close();
        fileWriter.close();

    }
    public static void  readListOfCountries(Path filePath) throws IOException{


        FileReader fileReader = new FileReader(filePath.toFile());
        BufferedReader reader = new BufferedReader(fileReader);

        // readLine will return null if there's no line to read
        String line = reader.readLine();
        while (null != line) { // If line is null, it is the end of the file
            System.out.println(line);
            // read the next line
            line = reader.readLine();
        }

        // close your readers!
        fileReader.close();
        reader.close();

    }
}
