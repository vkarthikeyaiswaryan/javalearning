import java.util.Scanner;
public class Sqrt {
    public static void main(String a[]){
        double num,temp,squareroot;
        System.out.println("enter a num");
        Scanner sc = new Scanner(System.in);
        num = sc.nextDouble();
        squareroot = num/2;
        do{
            temp = squareroot;
            squareroot = (temp + (num/temp))/2;
        }while(temp-squareroot!=0);
        System.out.println("the sqrt of a num\s"+num+"\s=\s"+squareroot);
    }
}
