import java.util.Arrays;
import java.util.List;

public class StreamApi{
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7);

        // int sum = 0;
        // for(int n : nums){
        //     if(n%2==0){
        //         n = n*2;
        //         sum = sum+n;
        //     }
        // }

        //System.out.println(sum);

        for(int i=0;i<nums.size();i++){
            System.out.println(nums.get(i));
        }

        for(int n : nums){
            System.out.println(n);
        }

        nums.forEach(n->System.out.println(n));
    }
}