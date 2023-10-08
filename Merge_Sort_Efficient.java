import java.util.*;

public class Merge_Sort_Efficient {

    static void MergeSort(int arr1[], int arr2[]) {
        int m = arr1.length;
        int n = arr2.length;

        int i = 0, j = 0;
        while (i < m && j < n) {
            if (arr1[i] <= arr2[j]) {
                System.out.print(arr1[i] + " ");
                i++;
            } else {
                System.out.print(arr2[j] + " ");
                j++;
            }
        }
        while (i < m) {
            System.out.print(arr1[i] + " ");
            i++;
        }
        while (j < n) {
            System.out.println(arr2[j] + " ");
            j++;
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
    }
}

// O(m+n) Time
