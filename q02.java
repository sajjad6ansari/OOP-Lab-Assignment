//assignment 2 - java program to add last 4 digits of your roll number and show the summation of it
public class assignment2
{
    public static void main( String args[] )
    {   
        String roll = "20221033";
        int rollno = Integer.parseInt(roll);
        int sum = 0;
        int temp;
        for(int i=0; i<4; i++){
            temp = rollno % 10;
            sum = sum + temp;
            rollno = rollno /10;
        }
        System.out.print("THE REQUIRED SUM IS ");
        System.out.println(sum);
    }
}
