import java.util.Scanner;

public class price1 {
    
    public static void main(String[] args) {
        
        Scanner n = new Scanner(System.in);
        System.out.println("enter 'n' value");

        int num = n.nextInt();
        System.out.println("num =" +n);
        int res = 1;


        while(num>0){
            res *= (num%10);
            num = num/10;



        }System.out.println(res);
    }
        
}
