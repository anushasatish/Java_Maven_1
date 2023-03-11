package Java.Automation.Assignment1;

import java.util.Scanner;
public class SwapUserInput
    {
        public static void main(String[] args) {
            int i, j, s;
            Scanner sc = new Scanner(System.in);
            System.out.println(" Enter the value of i");
            i=sc.nextInt();
            System.out.println(" Enter the value of j");
            j=sc.nextInt();
            System.out.println("Before swapping numbers are : " +i+ " " +j);

            //Swapping
            s=i;
            i=j;
            j=s;

            System.out.println("After swapping numbers are : " +i+ " " +j);
        }
    }

