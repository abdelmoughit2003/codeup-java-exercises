package clones;



/**
 * Created by sim on 1/20/17.
 */
public class CountTestApp extends CountUtil {
    public static void main(String[] args) throws CloneNotSupportedException{
        //count alligators
        System.out.println("Counting alligators");
        // create a new clones.Alligator object called "alligator
        Countable alligator =new Alligator();
        CountUtil.count(alligator,3);

        // count sheep
        Sheep s1 =new Sheep();
        //reset the count to 0
        s1.resetCount();
        //sets sheep name to "Blackie"
        s1.setSheepName("Blackie");
        //counts the first sheep two times
        CountUtil.count(s1,2);

        System.out.println();

        //clone sheep object

        //clones the first sheep object
        Sheep s2 = (Sheep) s1.clone();
        //resets the count to 0
        s2.resetCount();
        //changes and sets the sheep name to "Dolly"
        s2.setSheepName("Dolly");
        //counts the second sheep three times
        CountUtil.count(s2,3);

        System.out.println();

        //resets the first sheep object count to 0
        s1.resetCount();
        //sets first sheep object name to "Blackie"
        s1.setSheepName("Blackie");
        //counts the first sheep object one time
        CountUtil.count(s1,1);

        }
    }

