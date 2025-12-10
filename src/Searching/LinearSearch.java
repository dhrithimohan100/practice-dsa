package Searching;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]={1,4,5,3,2};
        int target = 6;
        //int n=arr.length;
        for(int i=0;i<arr.length;i++) {

            if (arr[i] == target) {
                System.out.println("the element " + target + " is found at index " + i);
                return;
            }
        }
                System.out.println("the element "+target+" is not found");
            }

        }

