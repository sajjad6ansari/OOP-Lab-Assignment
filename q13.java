//assignment 13 - java program to cshow the use of while in a GUI based program
import javax.swing.JOptionPane;
public class assignment13
{
    public static void main( String args[] )
    {
        int i = 0;
        while(i<10){
            JOptionPane.showMessageDialog(null, i , "1st 10 whole numbers",JOptionPane.PLAIN_MESSAGE );
            i++;
        }
    }

}
