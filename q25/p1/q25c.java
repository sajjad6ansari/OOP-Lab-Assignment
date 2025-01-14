package p2;
public class assignment25c extends p1.assignment25a {
    public static void printresults(){
        assignment25c ob = new assignment25c();
            System.out.println("for same package and same class");
            System.out.println("default access fails");
            System.out.println("public access is " + ob.b);
            System.out.println("private access fails");
            System.out.println("protected access is " + ob.d);
            System.out.println("");
    }
}
