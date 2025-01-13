//assignment 18 - java program to show the use of labelled continue
public class assignment18
{
    public static void main( String args[] )
    {  
        {   
            label:
                for(int i=1; i<=5; i++){
                    System.out.println("");
                    for(int j=1; j<=10; j++){
                        if(j > i){
                            continue label;
                        }
                        System.out.print("* ");
                    }
                }
        } 
    }
}
