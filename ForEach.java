import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {
    public static void main(String[] args) {
        
        List<Integer> nums = Arrays.asList(2,3,4,5,6,7);

        //nums.forEach(n -> System.out.println(n));

        Consumer<Integer> con = new Consumer<Integer>() {

            public void accept(Integer n){
                System.out.println(n);
            }
        };

        nums.forEach(con);
    }
    
}
