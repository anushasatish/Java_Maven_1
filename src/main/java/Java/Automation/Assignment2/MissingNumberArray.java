package Java.Automation.Assignment2;

import java.util.Arrays;

public class MissingNumberArray {
    public static void main(String[] args)
    {

        int[] a = new int[]{1, 2, 3, 4, 8, 9, 14};
        int[] b = new int[]{1, 2, 3, 4, 9, 14};

        System.out.println (" Original Array : " +Arrays.toString(a));
        System.out.println (" Array with missing number : " +Arrays.toString(b));
        int s = 0;
        int t = 0;

        for (int i = 0; i < a.length; i++)
        {
            s = s + a[i];
        }
        System.out.println(" Sum of original array :" + s);

        for (int j = 0 ; j < b.length; j++)
        {
            t = t + b[j];
        }
        System.out.println(" Sum of array with missing number  :" +t);

        int m = s - t; //finding missing number by subtracting the 2 totals

        System.out.println(" Missing number from array is : " +m);
    }
}
