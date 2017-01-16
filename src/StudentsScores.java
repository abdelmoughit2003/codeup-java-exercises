import java.util.*;

/**
 *
 */
public class StudentsScores {
    public static void main(String[] args) {
        int numberOfStudents;
        Scanner scan=new Scanner(System.in);


        System.out.println("Please enter number of students");
        numberOfStudents=scan.nextInt();

        //Creating simple array
//        StudentsTest[] stud = new StudentsTest[numberOfStudents];
        //Creating ArrayList
        ArrayList<StudentsTest> students = new ArrayList<StudentsTest>();
        //code that prints an array of students name and score to the console


        for(int i=0;i<numberOfStudents;i++){

            String firstName = firstName("First name: ", scan);
            String lastName = lastName("Last name: ", scan);
            int  score = score("score? ", scan);
            //create a student object to use the element of StudentsTest class
            StudentsTest student =new StudentsTest( firstName,  lastName,  score);
            //stores student information in an array
            //using the normal array
//            stud[i] = student;
            //using the ArrayList
            students.add(student);
        }
        System.out.println("");
        // Sorting using the normal array
//        Arrays.sort(students);
        //Sorting using the ArrayList
        Collections.sort(students);
        System.out.println("------------Students-------------");
        System.out.println("");
        System.out.println("---------------------------------");
        System.out.println("Last Name      FirstName    Score");

        for(StudentsTest i: students) {
            System.out.printf("%-15s %-12s %-13s ",i.getLastName() , i.getFirstName() , i.getScore());
            System.out.println();
        }
     }






    public static String firstName (String prompt,Scanner scan){
        String firstName;
        System.out.println(prompt);

        try {
            firstName=scan.next();
            if(firstName.equals("")){
                throw new IllegalArgumentException("Empty value !Please enter the first name ");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            return firstName(prompt,scan);
        }
        return firstName;
    }


    public static String lastName(String prompt,Scanner scan){
        String lastName;
        System.out.println(prompt);
        try {
            lastName=scan.next();
            if(lastName.equals("") || (lastName.equals(" "))){
                throw new IllegalArgumentException("Empty value !Please enter the first name ");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
            return lastName(prompt,scan);
        }
        return lastName;
    }

    public static int score(String prompt,Scanner scan){
        int score;
        System.out.println(prompt);
        try {
            score=scan.nextInt();
            if(score>100){
                throw new IllegalArgumentException(" The score you entered is > 100 !Please enter number between 0 and 100 ");
            }
            if(score<0){
                throw new IllegalArgumentException("The score you entered is < 0 !Please enter number between 0 and 100 ");
            }

        }catch (Exception e){
            System.out.println(e.getMessage());
                return score(prompt,scan);
        }
    return score;
    }

}
