package Java.Automation.Assignment5;

/*Exception Handling
1. Write a java program for the following and handle exceptions by using try..catch and finally blocks.
a) Any number divide by zero.
b) int a[]=null; a.length
c) arrayindexoutofbounds example*/

public class ExceptionHandling
{
    public static void main(String[] args)
    {
    int i = 20;
    int j = 0;
    int[] arr = {80,90,100};

    int a[] = null;

    //any number divide by zero
    try
    {
        int k = i / j;
        System.out.println(k);
    }
    catch (ArithmeticException arit)
    {
        System.out.println ("Arithmetic Exception ! ");
        System.out.println(i/2);
    }

    //Null pointer exception
    try
    {
        System.out.println (a.length);
    }
    catch (NullPointerException n)
    {
        System.out.println ("NullPointer Exception Found !");
    }

    //array index out of bound
    try
    {
        System.out.println( arr[6]);
    }
    catch (ArrayIndexOutOfBoundsException ary)
    {
        System.out.println( "Array index incorrect !");
    }

    //finally block
    finally
    {
        System.out.println("Exit from code !");
    }

    }

}