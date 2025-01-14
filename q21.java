//assignment 21 - java program to show the passing of object as method argument
class object {
    int length, breadth;
    object(int i, int j)
    {
        length = i;
        breadth = j;
    }
    int maxarea(object o)
    {
        return (length*breadth > o.length*o.breadth)? (length*breadth) : (o.length*o.breadth);
    }
}
public class assignment21
{
    public static void main(String args[])
    {
        object ob1 = new object(40, 60);
        object ob2 = new object(30, 70);
        System.out.println("the maximum area is " + ob1.maxarea(ob2));
    }
}
