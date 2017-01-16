/**
 * .
 */
public class StudentsTest implements Comparable  {


    public String firstName;
    public String lastName;
    public int score;



    public StudentsTest(String firstName, String lastName, int score) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.score = score;
    }


    @Override
    public int compareTo(Object t )  {
        StudentsTest s =(StudentsTest) t;

        // compares the array  and return the result
        if(lastName.equals(s.lastName)) {
            return firstName.compareToIgnoreCase(s.firstName);
        }

            if (lastName.equals(s.lastName) && firstName.equals(s.lastName)){

                return Integer.valueOf(score).compareTo(s.score);
            }
        return   lastName.compareTo(s.lastName);
        }





    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public int getScore() {
        return score;
    }

}
