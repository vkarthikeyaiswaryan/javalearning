@FunctionalInterface
interface Calc{
    int add(int i , int j);
}

public class LambdaReturn {
    public static void main(String[] args) {

        Calc obj = (i,j) ->  i+j ;

    //     new Calc(){
    //         public int add(int i , int j)
    //         {
    //             return i+j;
    //     }
        
    // };

        int res = obj.add(8,9);
        System.out.println(res);
}

}
