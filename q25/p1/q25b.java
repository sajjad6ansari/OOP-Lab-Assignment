package p1;
public class assignment25b extends assignment25a{
    public static void printresults(){
        assignment25b ob = new assignment25b();
        System.out.println("for different package and subclass");
        System.out.println("default access is " + ob.a);
        System.out.println("public access is " + ob.b);
        System.out.println("private access fails");
        System.out.println("protected access is " + ob.d);
        System.out.println("");
    }

}
