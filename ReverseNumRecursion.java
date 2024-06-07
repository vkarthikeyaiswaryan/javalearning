import java.util.Scanner;
public class ReverseNumRecursion {
    public static void reverse(int num){
        if(num<10){
            System.out.print(num);
            return;
        }else{
            System.out.print(num%10);
            reverse(num/10);
        }
    }
    public static void main(String[] args) {
        int num;
        System.out.print("enter a number to be reversed :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.out.print("the reverse number :\s");
        reverse(num);
        
    }
    
}
