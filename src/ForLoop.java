

public class ForLoop {

    public static void main(String[] args) {
//        Create a varible i that starts at 5.
//        Create a while loop that checks i <= 15 and increment i by 1 inside the loop. Before incrementing i, output each iteration and display results.

        //for loop

        for (int m = 5; m<=15; m++) {
            System.out.println(m);
        }
        System.out.println("--------" );
        //
        for (int n = 2; n<=100; n+=2) {
            System.out.println(n);
        }
        System.out.println("--------" );

        //
        for (int o = 100; o>= -10; o-=5) {
            System.out.println(o);
        }
        System.out.println("--------" );

        //
        for (long p = 2; p<=1000000; p*=p) {
            System.out.println(p);
        }
        System.out.println("--------" );


    }
}
