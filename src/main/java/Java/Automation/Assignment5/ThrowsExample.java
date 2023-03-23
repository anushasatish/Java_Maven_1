package Java.Automation.Assignment5;

/*2.Write a java program to throw any checked exception using throw. Use the concept of
        throws i.e., handle the exception in a different method/part of the class.*/

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ThrowsExample
{

    static FileReader f;

    static void exampleFile() throws IOException
    {
        f = new FileReader("/Users/dank/Desktop/Java/JavaTest.txt");
        BufferedReader bf = new BufferedReader(f);
        System.out.println(bf.readLine());
    }

    public static void main(String[] args) throws IOException
    {
    exampleFile();
    }
}
