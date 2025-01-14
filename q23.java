//assignment 23 - java program to show call by reference
class object {
    int a, b ;
    object(int i, int j){
        a = i;
        b = j;
    }
    void doubleanddivide(object o){
        o.a*=2;
        o.b/=2;
    }
}
public class assignment23
{
    public static void main(String args[])
    {
        int a = 15, b = 20;
        object ob = new object(a,b);
        System.out.println("ob.a and ob.b before reference call is " + ob.a + " and " + ob.b);
        ob.doubleanddivide(ob);
        System.out.println("ob.a and ob.b after a reference call is " + ob.a + " and " + ob.b);
    }
}
