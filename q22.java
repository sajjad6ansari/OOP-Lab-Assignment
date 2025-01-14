//assignment 22 - java program to show call by value
class object {
    void doubleanddivide(int i, int j){
        i*=2;
        j/=2;
    }
}
public class assignment22
{
    public static void main(String args[])
    {
        object ob = new object();
        int a = 15, b = 20;
        System.out.println("a and b before call is " + a + " and " + b);
        ob.doubleanddivide(a,b);
        System.out.println("a and b after call is " + a + " and " + b);
    }
}
