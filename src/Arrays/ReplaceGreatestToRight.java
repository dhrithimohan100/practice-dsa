package Arrays;
//Among a array of numbers replace n with largest number on the right side of array
public class ReplaceGreatestToRight {
    static void Greatest(int[] a, int n) {
        for (int i = 0; i < n; i++) {
            int max = -1;
            for (int j = i + 1; j < n; j++) {
                max = Math.max(max, a[j]);
            }
            a[i] = max;
        }
    }

    static void printArray(int a[], int size) {
        for (int i = 0; i < size; i++)
            System.out.print(a[i] + " ");
        System.out.println();
    }


    public static void main(String[] args) {
        int[] a = {16, 17, 4, 3, 5, 2};
        int size = a.length;
        Greatest(a, size);
        System.out.println("the modified array is : ");
        printArray(a, size);
    }
}

