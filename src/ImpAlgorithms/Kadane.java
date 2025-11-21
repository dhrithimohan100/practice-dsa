package ImpAlgorithms;

public class Kadane {
    public static int kadane(int arr[]) {
        int res = arr[0];
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int currSum = 0;
            for (int j = i; j < n; j++) {
                currSum += arr[j];
                res = Math.max(res, currSum);
            }
        }
        return res;
    }
//        int res = arr[0];
//        int maxEnd = arr[0];
//        for (int i = 1; i < arr.length; i++) {
//            maxEnd = Math.max(maxEnd + arr[i], arr[i]);
//            res=Math.max(res,maxEnd);
//        }
//
//        return res;
//    }

    public static void main(String[] args) {
        int arr[] = {2, 3, -8, 7, -1, 2, 3};
        System.out.println(kadane(arr));
    }
}
