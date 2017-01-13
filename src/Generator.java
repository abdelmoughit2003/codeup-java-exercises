import java.util.Arrays;
import java.util.Random;

/**
 * We are going to build a server name generator. To do this, we will need to follow the specs below.

    Create two arrays.
    One with at least 10 adjectives.
    Another with at least 10 nouns.
    Create a function that will return a random element from an array.
    Display to the user their generated server name (that is, a randomly generated adjective + noun).
 */
public class Generator {
    public static void main(String[] args) {
        String adjectives[] = {"beautiful", "sleeveless", "edible", "amazing", "nicer", "adorable", "gorgeous", "breakable", "homeless", "meaningless"};
        String nouns[] = {"lora", "james", "tarek", "hamid", "abdou", "john", "jesse", "lina", "ronaldo", "jonathan"};
        System.out.println((adjectives[Random(adjectives.length)]));
        System.out.println(nouns[Random(nouns.length)]);

    }

    public static int Random(int lastNumber) {
        //import Random class from java package
        Random random = new Random();
        //Generating random number between 1 and 6
        return random.nextInt(lastNumber);
    }
}