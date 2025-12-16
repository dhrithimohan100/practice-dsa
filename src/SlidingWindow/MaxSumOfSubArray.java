//Maximum Sum of a Subarray with K Elements
//Given an array arr[] and an integer k, we need to calculate the maximum sum of a subarray having size exactly k.
//O(n) Time and O(1) Space
package SlidingWindow;
public class MaxSumOfSubArray {
    static int MaxOfSum(int[]arr,int k,int n){ // n is no. of elements in array , k is the no. elements of subarray
        if(n<=k) {
            System.out.println("Invalid");
            return -1;
        }
        // calculating the sum of first window of first k elements
        int maxSum=0;
        for(int i=0;i<k;i++){
            maxSum += arr[i];
        }
        int windowSum=maxSum;
        for(int i=k;i<n;i++){
            windowSum+=arr[i]-arr[i-k];
            maxSum=Math.max(maxSum,windowSum);
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int arr[]={1,4,2,23,10,3,1,0,20};
        int k=4;
        int n=arr.length;
        int result=MaxOfSum(arr,k,n);
        System.out.println("The maximum sum of the subarray is "+result);
    }
}
