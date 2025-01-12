//assignment 12 - java program to show the use of nested if-else selection structure
public class assignment12
{
    public static void main( String args[] )
    {
        int a = 10, b = 20, c = 30, max;
        if(a>b){
            if(a>c){
                max = a;
            }
            else{
                max = c;
            }
        }
        else{
            if(b>c){
                max = b;
            }
            else{
                max = c;
            }
        }
        System.out.println("The largest integer is " + max);
    }
}
