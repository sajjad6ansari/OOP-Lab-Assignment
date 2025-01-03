//assignment 4 - GUI based java program to perform addition, subtraction, multiplication and division of 2 decimal numbers repetitively until (-99) is used to exit
import javax.swing.JOptionPane;
public class assignment4
{
    public static void main( String args[] )
    {
        String firstNumber, exitchoice, operator, secondNumber;
        float number1, number2, result;
        while(true)
        {
            firstNumber = JOptionPane.showInputDialog( "Enter first number" );
            operator = JOptionPane.showInputDialog( "Enter operator(+,-,*,/)" );
            secondNumber = JOptionPane.showInputDialog( "Enter second number" );
            number1 = Float.parseFloat(firstNumber);
            number2 = Float.parseFloat(secondNumber);
            char choice = operator.charAt(0);
            switch(choice)
            {
                case '+' :
                {
                    result = number1 + number2;
                    JOptionPane.showMessageDialog(null, "The addition is " + result , "Results",JOptionPane.PLAIN_MESSAGE );
                    break;
                }
                case '-' :
                {
                    result = number1 - number2;
                    JOptionPane.showMessageDialog(null, "The subtraction is " + result , "Results",JOptionPane.PLAIN_MESSAGE );
                    break;
                }
                case '*' :
                {
                    result = number1 * number2;
                    JOptionPane.showMessageDialog(null, "The multiplication is " + result , "Results",JOptionPane.PLAIN_MESSAGE );
                    break;
                }
                case '/' :
                {
                    result = number1 / number2;
                    JOptionPane.showMessageDialog(null, "The division is " + result , "Results",JOptionPane.PLAIN_MESSAGE );
                    break;
                }
                default :
                {
                    JOptionPane.showMessageDialog(null, "You have entered a wrong operator" , "Results",JOptionPane.ERROR_MESSAGE );
                    break;
                }
            }
            exitchoice = JOptionPane.showInputDialog( "Enter any integer to repeat or enter (-99) to exit" );
            int exitchoiceint = Integer.parseInt(exitchoice);
            if(exitchoiceint == -99){
                System.exit( 0 );
            }
        }
    }
}
