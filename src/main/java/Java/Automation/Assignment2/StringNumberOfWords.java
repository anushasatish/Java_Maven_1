package Java.Automation.Assignment2;

public class StringNumberOfWords
{
    public static void main(String[] args)
    {
        String s = "Today is a great day";

        int count = 1;
        int l = s.length();
        System.out.println("Length of string : " +l);

        for (int i = 0 ; i < l - 1 ; i ++)                          //i =0
        {
            if ((s.charAt(i) == ' ') && (s.charAt(i + 1) != ' '))  //charAt(0) = T & charAt(1)=o..till charAt(5)=' '
                                                                    // & charAt(6)=i and not equal to' '
            {
                count = count + 1; //count 2
            }

        }
        System.out.println("Number of words in string : " +count);
    }
}
