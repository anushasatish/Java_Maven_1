package Java.Automation.Assignment2;
//Largest and smallest number in a given array
public class GreatestSmallestNumberArray
{
    public static void main(String[] args)
    {
        int[] a = new int[]{1, 2, 3, 4, 8, 9, 14};
        int great = a[0]; // great =1
        int small = a[0]; // small = 1

        for (int i =1; i < a.length; i++)
        {
            if ( a[i] > great)
                great = a[i];
            else if ( a[i] < small)
                small = a[i];
        }
        System.out.println("Greatest number is : " +great);
        System.out.println("Smallest number is : " +small);
    }

}
