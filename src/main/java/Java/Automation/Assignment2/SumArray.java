package Java.Automation.Assignment2;
//Sum of Array
public class SumArray
{
        public static void main(String[] args)
        {
            int[] a= new int[]{1, 2, 3, 4, 8, 9, 14};
            int s = 0;

            for (int i = 0; i < a.length; i++)
            {
                s = s + a[i];
            }
            System.out.println(" Sum of Array :" + s);
        }
    }

