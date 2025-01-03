//assignment 7 - java program to show the narrowing conversion from a) double to integer b) integer to byte
public class assignment7
{
    public static void main( String args[] )
    {
        double d = 166.53;
        int i = (int)d;
        byte b = (byte)i;
        System.out.println("the value of the double variable is " + d);
        System.out.println("the value of the integer variable after narrowing conversion is " + i);
        System.out.println("the value of the byte variable after narrowing conversion is" + b);
    }
}
