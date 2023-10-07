import java.util.*;
public class Selection_Sort {

    static void selectionSort(int arr[])
    {
        int n=arr.length;

        for(int i=0;i<n-1;i++)
        {
            int min=i;
            for(int j= i+1 ;j<n;j++)
            {
                if(arr[j] < arr[min])
                {
                    min=j;
                }
            }

            int temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
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

        selectionSort(arr);
        printArray(arr);
    }
}
