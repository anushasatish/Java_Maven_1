public class Fibonacci {
    public static void main(String[] args) {
       int n = 10;
        int first = 0;
        int second = 1;

        //Prints 10 Fibonacci series till 50 using For loop

        System.out.println(" Fibonacci series from 1 to 50 : " + n);

        for (int i = 1; i <= n; ++i)      // i=1, i<10 ; next i = 2 ; next i = 3 ; next i = 4
        {
            System.out.println(+first); //0 1 1 2
            int x = first + second;     // x=0+1=1 ; x = 1+1 =2; next x = 1+2 =3... and so on
            first = second;                // first =1 ; first = 1 ; first =2
            second = x;                     // second = 1 ; second = 2; second = 3

        }


    }
}