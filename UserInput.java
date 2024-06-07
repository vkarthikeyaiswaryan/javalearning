import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        
        System.out.println("hello");

        System.out.println("enter a number");

        // int num = System.in.read(); // takes a value and leaves an ascii value ,, A = 65 , A  = 97 AN 0 = 48
        // System.out.println(num); // num - 48 ... but it takes only single character .. so we have to use loop here
        
        // InputStreamReader in = new InputStreamReader(System.in);
        // BufferedReader bf = new BufferedReader(in);

        // int num1 = Integer.parseInt(bf.readLine());

        Scanner sc = new Scanner(System.in);

        int num1 = sc.nextInt();

        System.out.println(num1);

        // bf.close()
    }
    
}
