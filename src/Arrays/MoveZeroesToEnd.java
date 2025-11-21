package Arrays;
import java.util.Arrays;
public class MoveZeroesToEnd {
    public static void main(String args[]){
        int [] arr={1,2,0,7,6,0};
        int n=arr.length;
        int count=0;//this will keep the count of nonzero elements

        for(int i=0;i<n;i++){
            if(arr[i]!=0){
                arr[count++] = arr[i];
            }
        }
        while(count<n){
            arr[count++]=0;
        }
        System.out.println("the array after moving string towards end is "+ Arrays.toString(arr));
    }
}
