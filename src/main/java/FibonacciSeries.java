
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args)
    {
        int i = 0 ;
        int j = 1;
        int x = 0;

        // getting end range value from user

        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter the value until which fibonacci series needs to be generated : ");
        int n = sc.nextInt();

        System.out.println ("Fibonacci series until " +n);

        while (x<n)                         // x=0, while 0 < 50 ; next x=1 < 50; next x=1; next x = 2 and so on
        {
            System.out.println (+x+ " "); //0 1 1 2
            i=j;                            //  i= 1             ; next   i=0 ; next i =1 ; next i = 1
            j=x;                           // j= 0              ; next j=1 ; next j=1  ; next j = 2
            x=i+j;                         // x =1+0 =1    ; next x =0+1=1; next x= 1+1 = 2 ; next x = 1+2 =3...
        }

    }
}