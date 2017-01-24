package clones;


/**
 * .
 */
public class Sheep implements Countable,Cloneable{
    //instance variables that store the count and the name of the sheep
    private int countSheep=0;
    private String sheepName;
    //method to set sheep name
    public String setSheepName(String sheep){
        return sheepName=sheep;
    }
    //method to get sheep name
    public String getSheepNames(){
        return sheepName;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();

    }
    //overrides the clones.Countable interface method
    //method increments count of sheep +1
    @Override
    public void incrementCount()
    {
        countSheep++;
    }

    //overrides the clones.Countable interface method
    //method resets the count to 0
    @Override
    public void resetCount()
    {
        countSheep = 0;
    }

    @Override
    public int getCount()
    {
        return countSheep;
    }

    @Override
    public String getCountString()
    {
        return getCount() + "" + getSheepNames();
    }
}
