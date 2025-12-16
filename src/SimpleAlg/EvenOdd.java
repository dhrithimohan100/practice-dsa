package SimpleAlg;

public class EvenOdd {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println("the even numbers");
        for (int num : arr) {
            if (num % 2 == 0) {
                System.out.print(num+ " ");
            }
        }
        System.out.println();
        System.out.println("the odd numbers");
        for (int num : arr) {
            if (num % 2 != 0) {
                System.out.print(num+ " ");
            }
        }
    }
}

