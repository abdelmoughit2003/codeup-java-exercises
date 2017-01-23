/**
 * Created by sim on 1/18/17.
 */
public enum Roshambo  {
    ROCK,PAPER,SCISSORS;

    public String toString(){
        return super.toString();
    }

}
//other method
//public enum Roshambo {
//    PAPER(1), SCISSORS(2), ROCK(0);
//
//    private int beatenBy;
//
//    Roshambo(int beatenBy) {
//        this.beatenBy = beatenBy;
//    }
//
//    public boolean beats(Roshambo opponentsChoice) {
//        return opponentsChoice.ordinal() != beatenBy;
//    }
//}
