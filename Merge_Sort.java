import java.util.*;

public class Merge_Sort {

    static void MergeSort(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;
        int merged[] = new int[m + n];

        for (int i = 0; i < m; i++) {
            merged[i] = arr1[i];
        }

        for (int i = 0; i < n; i++) {
            merged[m + i] = arr2[i];
        }

        Arrays.sort(merged);

        for (int i = 0; i < m + n; i++) {
            System.out.print(merged[i] + " ");
        }

    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        int m = s.nextInt();
        int arr1[] = new int[m];
        m = arr1.length;
        for (int i = 0; i < m; i++) {
            arr1[i] = s.nextInt();
        }

        int n = s.nextInt();
        int arr2[] = new int[n];
        n = arr2.length;
        for (int i = 0; i < n; i++) {
            arr2[i] = s.nextInt();
        }

        MergeSort(arr1, arr2);
        // printArray(arr1,arr2);
    }
}
