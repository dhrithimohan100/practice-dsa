package Arrays;
import java.util.Arrays;

public class MedianOfEqualArr {
    static double MedianEqual(int []a,int[]b) {
        int[] c = new int[a.length + b.length];
        System.arraycopy(a, 0, c, 0, a.length);
        System.arraycopy(b, 0, c, a.length, b.length);
        Arrays.sort(c);
        int n = c.length;
        int mid1 = n / 2;
        int mid2 = mid1 - 1;
        return ((c[mid1] + c[mid2]) / 2.0);
    }
    public static void main(String[] args){
        int [] a={1,2,3};
        int [] b={4,5,6};
        System.out.println(MedianEqual(a,b));
    }
}
