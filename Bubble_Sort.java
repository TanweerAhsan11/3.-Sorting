import java.util.*;
public class Bubble_Sort {

    public static void bubbleSort(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=0;j<n-i-1;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    //swap
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        
    }

    static void printArray(int arr[])
    {
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            System.out.print(arr[i] + " ");
        }
    }
  public static void main(String args[])
  {
    Scanner s=new Scanner(System.in);
    int n=s.nextInt();
    int arr[]=new int[n];
    n=arr.length;
    for(int i=0;i<n;i++)
    {
        arr[i]=s.nextInt();
    }
    bubbleSort(arr);
    printArray(arr);
  }  
}
