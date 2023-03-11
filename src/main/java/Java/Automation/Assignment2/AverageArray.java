package Java.Automation.Assignment2;
//Average of array
public class AverageArray {
    public static void main(String[] args)
    {

        int[] a = new int[]{1, 2, 3, 4, 8, 9, 14};
        double s = 0;
        double avg =0;

        for (int i = 0; i < a.length; i++)
        {
            s = s + a[i];
            avg = s / a.length;
        }
        System.out.println("Sum of Array : " +s);
        System.out.println(" Average of Array :" +avg);
    }
}

