import java.util.ArrayList;
//import java.util.Collection;
import java.util.List;

public class Lists{
    public static void main(String[] args) {
        //Collection<Integer> nums = new ArrayList<Integer>();

        List<Integer> nums = new ArrayList<Integer>();

        nums.add(6);
        nums.add(4);
        nums.add(3);
        nums.add(2);
        //nums.add("7");

        System.out.println(nums.indexOf(3));

        System.out.println(nums.get(0));

        //System.out.println(nums);

        // for(Object n : nums){ // cannot convert obj into int...
        //     int num = (Integer)n;
        //     System.out.println(num);
        // }

    }
}