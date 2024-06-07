import java.util.Scanner;

public class ReverseNum {
    public static void main(String a[]){
        int num;
        int reverse=0;
        System.out.print("enter a number to be reversed :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        while(num!=0){
            int rem = num % 10;
            reverse = reverse*10+rem;
            num = num /10;
        }System.out.println("reversed number :\s"+reverse);
    }
    
}
