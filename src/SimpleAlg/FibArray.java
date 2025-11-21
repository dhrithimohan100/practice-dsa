package SimpleAlg;
import java.util.*;

public class FibArray {
    public static void main(String[] args) {
        int n=10;
        int fib[]=new int[n];
        fib[0]=0;
        fib[1]=1;
        for(int i=2;i<n;i++){
            fib[i]=fib[i-1]+fib[i-2];
        }
        System.out.println("the fibonacci series are: "+Arrays.toString(fib));
    }
}
