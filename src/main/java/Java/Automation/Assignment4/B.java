package Java.Automation.Assignment4;

public class B implements A
{
    @Override
    public void sum()
    {
        int c  = a + b;
        System.out.println("Sum of 2 numbers is : " +c);

    }

    public static void main(String[] args)
    {
        B total = new B();
        total.sum();

    }
}


