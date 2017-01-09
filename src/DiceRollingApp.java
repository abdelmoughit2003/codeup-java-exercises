/**
 *4. Let's create an object-oriented dice-roller app! Following the general directions of the Methods exercise with the Dice roller,
 - Create a class called Die or Dice.java
 - Create your main class (the class with the main() method) and name id DiceRollingApp.java
 - Put all your user input on the DiceRollingApp
 - Your Die class should have the numberOfSides property and the roll() method defined on it

 */
import java.util.Random;

public  class DiceRollingApp  {
    //Declarig variables

    public int numberOfdSidesPerDie;
    public int CurrentValue;


    //Creating random method

    public  DiceRollingApp(int numberOfdSidesPerDie){
        this.numberOfdSidesPerDie=numberOfdSidesPerDie;
    }
    //Roll the die
    public int roll(){
        //import Random class from java package
        Random dice=new Random();
        //Generating random number between 1 and 6
          CurrentValue= dice.nextInt(numberOfdSidesPerDie);
        return CurrentValue;
    }




}
