package Arrays;
import java.util.*;
public class MaxDistanceMemoryLine {
    public static int[] maxValues(int n,int[] pos){
        int leftMin=Integer.MAX_VALUE;
        int rightMax=Integer.MIN_VALUE;

        for(int p:pos){
            leftMin=Math.min(leftMin,p);
            rightMax=Math.max(rightMax,p);
        }
        int [] result=new int[n];
        for(int i=0;i<n;i++){
            result[i]=Math.max(Math.abs(i-leftMin),Math.abs(i-rightMax));
        }
        return result;
    }

    public static void main(String[] args) {
        int n=5;
        int [] pos={2,0,3};
        int [] ans=maxValues(n,pos);
        for(int val:ans){
            System.out.println((val));
        }
    }
}
