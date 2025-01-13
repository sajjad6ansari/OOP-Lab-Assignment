//assignment 20 - java program to show the use of method overloading
public class assignment20
{
    public static int cube(int x){
        return x*x*x;
    }
    public static double cube(double x){
        return x*x*x;
    }
    public static void main( String args[] )
    {   
        System.out.println("the cube of 9 is " + cube(9));
        System.out.println("the cube of 9.8 is " + cube(9.8));
    }
}
