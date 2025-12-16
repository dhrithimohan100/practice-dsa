package SimpleAlg;

public class LargestEvenOddNumber {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 6, 8, 7,799,1000};
        int LargestEven = Integer.MIN_VALUE;
        int LargestOdd = Integer.MIN_VALUE;

        for(int num:arr){//Take one number from arr, put it into num, and execute the loop body.
            if(num%2==0) {
                if (num > LargestEven) {
                    LargestEven = num;
                }
            }
                else{
                    if(num>LargestOdd){
                        LargestOdd=num;
                    }
                }
            }
            if (LargestEven == Integer.MIN_VALUE)
                System.out.println("No even number found");
            else
                System.out.println("Largest Even Number: " + LargestEven);

            if (LargestOdd == Integer.MIN_VALUE)
                System.out.println("No odd number found");
            else
                System.out.println("Largest Odd Number: " + LargestOdd);
        }
    }

