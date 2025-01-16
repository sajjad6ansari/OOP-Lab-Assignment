//assignment 27 - java program to show the use of static variable
public class assignment27
{
    static int count = 0;
    assignment27(){
        count++;
        System.out.println("the static variable after increment is " + count);
    }
    public static void main(String args[])
    {
        assignment27 ob1 = new assignment27();
        assignment27 ob2 = new assignment27();
        assignment27 ob3 = new assignment27();
    }
}
