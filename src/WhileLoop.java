
public class WhileLoop {
    public static void main(String[] args) {
//        Create a varible i that starts at 5.
//        Create a while loop that checks i <= 15 and increment i by 1 inside the loop. Before incrementing i, output each iteration and display results.


        int i=5;
        while(i<=15){
            System.out.println("The number is : " + i);
            i++;
        }
        System.out.println("--------" );

        //
        int j= 0;
        do{
            System.out.println(j+=2);
        }while (j<100);
        System.out.println("--------" );
        //
        int k=100;
        do{
            System.out.println(k-=5);
        }while (k>10);
        System.out.println("--------" );

        //
        long l=2;
        do{
            System.out.println(l);
            l*=l;

        }while (l<=1000000);
        System.out.println("--------" );

    }
}
