//assignment 26 - java program to show the use of static method
public class assignment26
{
    public static int arraysum(int arr[]){
        int sum = 0;
        for(int i = 0; i< 5; i++){
            sum = sum + arr[i];
        }
        return sum;
    }
    public static void main(String args[])
    {
        int arr[] = {1,2,3,4,5};
        System.out.println(arraysum(arr));
    }    
}
