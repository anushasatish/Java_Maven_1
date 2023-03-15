package Java.Automation.Assignment4;

public class Calculation implements AddA, MulB
{
    public static void main(String[] args)
    {
        Calculation cal = new Calculation();
        cal.sum();
        cal.mul();
    }

    // implementations sum & mul
    @Override
    public void sum()
    {
        int c = a + b;
        System.out.println(" Sum is : " +c);
    }

    @Override
    public void mul()
    {
        int z = x * y ;
        System.out.println(" Product is : " +z);

    }
}
