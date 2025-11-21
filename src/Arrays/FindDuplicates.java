package Arrays;
import java.util.Arrays;

public class FindDuplicates {
    public static void main(String[] args) {
        int []arr={1,2,3,4,2,3,5};
        //Arrays.sort(arr);
        System.out.println("the duplicates are");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    System.out.println(arr[i]);
                    break;
                }
            }
        }
    }
}
