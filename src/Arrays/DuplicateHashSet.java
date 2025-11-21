package Arrays;
import java.util.HashSet;

public class DuplicateHashSet {
    public static void main(String[] args) {
        int [] arr={1,2,3,4,3,2,5};
        HashSet<Integer> set=new HashSet<>();

        System.out.println("the duplicates are");
        for(int num:arr){
            if(!set.add(num)){
                System.out.println(num);
            }
        }
    }
}
