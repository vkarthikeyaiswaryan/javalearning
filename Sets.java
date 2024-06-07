import java.util.Collection;
import java.util.Iterator;
//import java.util.HashSet;
//import java.util.Set;
import java.util.TreeSet;



public class Sets{
    public static void main(String[] args) {
        //Set<Integer> nums = new HashSet()<Integer>();
        Collection<Integer> nums = new TreeSet<Integer>(); // Hashset gives the VALUES NOT IN SORTED ORDER
                                                    // TreeSet gives the values in sorted order ..bcz it extends sorted class
                                                    // Collection class extends Iterable class ... we have iterator method()
        nums.add(6);
        nums.add(7);
        nums.add(8);
        nums.add(9);
        nums.add(6);

        // System.out.println(nums);

        // for(int n : nums){
        //     System.out.println(n);
        // }

        Iterator<Integer> values = nums.iterator();

        while(values.hasNext()){
            System.out.println(values.next());
        }

        

        

    }
}