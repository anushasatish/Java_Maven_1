package Java.Automation.Assignment2;
//Duplicate elements in an array
public class DuplicateArray {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3, 4, 4,8, 9, 9, 14,2};

        for ( int i =0 ; i< a.length; i++)              //i =0 next i =1
        {
            for ( int j = i+1; j< a.length; j++)            //j=1 next j =2
            {
                if (a[i] == a[j])            //check if(1=2), then 1=3? then 1=4? etc till end of array.. then check
                                              // if (2=3) etc.
                {
                    System.out.println(a[j]+ " is duplicated in the array");
                }
            }
        }

    }
}
