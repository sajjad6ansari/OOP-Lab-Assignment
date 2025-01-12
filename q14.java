//assignment 14 - java program to show the use of switch-case
import java.util.*;
public class assignment14
{
    public static void main( String args[] )
    {
        Scanner sc = new Scanner(System.in); 
        System.out.println("ENTER FIRST NUMBER");
        float number1 = sc.nextFloat();
        System.out.println("ENTER SECOND NUMBER");
        float number2 = sc.nextFloat();
        System.out.println("ENTER OPERATOR (+,-,*,/)");
        char operator = sc.next().charAt(0);
        sc.close();
        switch(operator)
        {
            case '+' :
            {
                System.out.println("THE ADDITION YIELDS " + (number1 + number2));
                break;
            }
            case '-' :
            {
                System.out.println("THE SUBTRACTION YIELDS " + (number1 - number2));
                break;
            }
            case '*' :
            {
                System.out.println("THE MULTIPLICATION YIELDS " + (number1 * number2));
                break;
            }
            case '/' :
            {
                System.out.println("THE DIVISION YIELDS " + (number1 / number2));
                break;
            }
            default :
            {
                System.out.println("YOU HAVE ENTERED A WRONG OPERATOR");
                break;
            }
        }
    }
}
