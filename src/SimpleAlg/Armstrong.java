package SimpleAlg;

public class Armstrong {
    public static void main(String[] args) {
        int num = 370;//153
        int original = num;
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num = num / 10;
        }
        if (sum == original) {
            System.out.println("the number is an armstrong number");
        } else {
            System.out.println("the number is not an armstrong number");
        }
    }
}

