//assignment 9 - java program to show left and right shift operations
public class assignment9
{
    public static void main( String args[] )
    {
        int i = 16;
        int leftshift = i << 1;
        int rightshift = i >> 1;
        System.out.println("The value of the integer is " + i);
        System.out.println("The value of the integer after left shift is " + leftshift);
        System.out.println("The value of the integer after right shift is " + rightshift);
    }
}
