import java.util.*;
public class SortingInJava
{
    public static void main(String args[])
    {
        int arr1[]={5,20,12,30,2,4,1,10};
        char arr2[]={'B','B','A','C','A'};
        Arrays.sort(arr1);
        Arrays.sort(arr1,1,3);
        System.out.println(Arrays.toString(arr1)); 
        System.out.println(Arrays.toString(arr1));
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr2));
        
    }
}