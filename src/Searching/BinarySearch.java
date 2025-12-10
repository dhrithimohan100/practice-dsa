package Searching;

public class BinarySearch {
    public static void main(String[] args) {
        int arr[]={1,3,6,7,8,9};
        int start=0;
        int end=arr.length-1;

        int target=8;

        while(start<=end) {
            int mid=(start+end)/2;
            if (arr[mid] == target) {
                System.out.println("the element " + target + " is found at index " + mid);
                return;
            }
            if (target < arr[mid]) {
                end = mid - 1;
            } else {
                start= mid + 1;
            }
            //System.out.println("the element " + target + " is found at index "+mid);
            //return;
        }
        System.out.println("the element "+target+" is not found");
    }
}
