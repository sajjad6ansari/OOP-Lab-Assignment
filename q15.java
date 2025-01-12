//assignment 15 - java program to show the use of break
public class assignment15
{
    public static void main( String args[] )
    {   
        int count = 0;
        for(int i=0; i<10; i++){
            if(count == 7){
                break;
            }
            System.out.println(i);
            count++;
        }
        System.out.println("The loop broke at counter = " + count);
    }
}
