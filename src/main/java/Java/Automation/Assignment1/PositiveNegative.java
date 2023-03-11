package Java.Automation.Assignment1;

import java.util.Scanner;
public class PositiveNegative {
        public static void main(String[] args) {
        double n;
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter a number : ");
        n=sc.nextDouble();
        if (n>0)
        {
            System.out.println(" Number is positive !");
        }
        else if (n<0)
        {
            System.out.println( " Number is negative !");
        }
        else
            System.out.println("Number is 0");
    }
}
