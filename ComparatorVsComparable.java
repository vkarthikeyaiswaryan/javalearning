import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorVsComparable{
    public static void main(String[] args) {

        Comparator<Integer> comp = new Comparator<Integer>(){

            public int compare(Integer i , Integer j ){

                if(i%10 > j%10)
                    return 1;
                else
                    return -1;
            }
        };
        
        List<Integer> nums = new ArrayList<Integer>();

        nums.add(78);
        nums.add(34);
        nums.add(46);
        nums.add(90);
        nums.add(22);

        Collections.sort(nums,comp);
        System.out.println(nums);

        

    }
}