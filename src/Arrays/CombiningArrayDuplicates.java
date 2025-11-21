package Arrays;
// combine two arrays and then find duplicates among them and then remove it
public class CombiningArrayDuplicates {
    public static void main(String[] args) {
        int a1[] = {1, 2, 3, 4, 5};
        int a2[] = {3, 4, 5, 6, 7};
        int combined[] = new int[a1.length + a2.length];
        int index = 0;
        for (int i = 0; i < a1.length; i++) {
            combined[index++] = a1[i];
        }
        for (int i = 0; i < a2.length; i++) {
            combined[index++] = a2[i];
        }
        System.out.print("the combined array is ");
        for (int num : combined) {

            System.out.print(num + " ");
        }
        System.out.println();

        int n = combined.length;
        int[] unique = new int[n];
        int uniqueCount = 0;

        for (int i = 0; i < n; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < uniqueCount; j++) {
                if (combined[i] == unique[j]) {
                    isDuplicate = true;
                    break;
                }
            }
                if (!isDuplicate) {
                    unique[uniqueCount++] = combined[i];
                }
            }

            System.out.print("the array after removing duplicates ");
            for (int i = 0; i < uniqueCount; i++) {
                System.out.print(unique[i] + " ");
            }
        }
    }
