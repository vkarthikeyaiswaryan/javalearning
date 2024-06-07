import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class TryWithResources {
    public static void main(String[] args) throws NumberFormatException, IOException {
        
        System.out.println("hello ");

        int i = 0;
        int j = 0;

        // try{
        //     j = 18/i;
        //     //System.out.println("bye");
        // }
        // catch(Exception e){
        //     System.out.println("something went wrong ");
        //     //System.out.println("bye");
        // }
        // finally{
        //     System.out.println("bye");
        // }

        //BufferedReader bf = null;

        try(BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));){

            System.out.println("enter a number");
            //InputStreamReader in = new InputStreamReader(System.in);
            //bf = new BufferedReader(new InputStreamReader(System.in));
            int num = Integer.parseInt(bf.readLine());
            System.out.println(num);
        }
        // finally{
        //     bf.close();
        // }
    }
}
