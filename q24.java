//assignment 24 - java program to show recursion
public class assignment24
{
    public static int factorial(int x){
        if(x == 0){
            return 1;
        }
        else{
            return x * factorial(x-1);
        }
    }
    public static void main( String args[] )
    {  
        System.out.println("the factorial of 5 is " + factorial(5)); 
    }
}
