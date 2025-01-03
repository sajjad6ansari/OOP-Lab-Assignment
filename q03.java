//assignment 3 - GUI based java program to display the summation of 2 decimal numbers
import javax.swing.JOptionPane;
public class assignment3
{
    public static void main( String args[] )
    {
        String firstNumber, secondNumber;
        float number1, number2, sum;
        firstNumber = JOptionPane.showInputDialog( "Enter first number" );
        secondNumber = JOptionPane.showInputDialog( "Enter second number" );
        number1 = Float.parseFloat(firstNumber);
        number2 = Float.parseFloat(secondNumber);
        sum = number1 + number2;
        JOptionPane.showMessageDialog(null, "The sum is " + sum, "Results",JOptionPane.PLAIN_MESSAGE );
        System.exit( 0 );
    }
}
