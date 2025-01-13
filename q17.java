//assignment 17 - java program to show the use of labelled break
public class assignment17
{
    public static void main( String args[] )
    {   
        label:{
            for(int i=1; i<=10; i++){
                for(int j=1; j<=5; j++){
                    if(i == 5){
                        break label;
                    }
                    System.out.print("* ");
                }
                System.out.println("");
            }
        }   
    }
}
