package p1;
public class assignment25a{
    int a = 10;
    public int b = 20;
    private int c = 30;
    protected int d = 40;
    public static void printresults(){
        assignment25a ob = new assignment25a();
        System.out.println("for same package and subclass");
        System.out.println("default access is " + ob.a);
        System.out.println("public access is " + ob.b);
        System.out.println("private access is " + ob.c);
        System.out.println("protected access is " + ob.d);
        System.out.println("");
    }
}
