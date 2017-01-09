import java.util.Scanner;

/**
 *
 */
public class HelloObjectWorld {
    public static void main(String[] args) {
        Person firstPerson = User();
        Person secondPerson = User();
        System.out.println("hello " + firstPerson.lastName);
        System.out.println("hello " + secondPerson.lastName);

    }

    public static Person User() {
        Scanner sc = new Scanner(System.in);
        Person person = new Person();
        System.out.println("please enter your first name :");
        person.lastName = sc.next();

        System.out.println("please enter your last name :");
        person.firstName = sc.next();

        System.out.println("please enter your email address :");
        person.email = sc.next();

        System.out.println("Hello " + person.lastName + " " + person.firstName + ", we have your email as " + person.email);
        return person;
    }

}
