package Patterns;

public class Simple {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            //for(int i=n;i>=1;i--){^^for ulta pattern^^
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
                //System.out.print(j+" ");^^gives numbers instead of stars^^
            }
            System.out.println();
        }
    }
}