//assignment 16 - java program to show the use of continue
public class assignment16
{
    public static void main( String args[] )
    {  
        int count = 0;
        for(int i=0; i<10; i++){
            if(count == 7){
                System.out.println("The loop continued at counter = " + count); 
                count++;
                continue;
            }
            System.out.println(i);
            count++;
        }
    }
