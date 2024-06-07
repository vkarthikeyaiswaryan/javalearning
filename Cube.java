import java.util.Scanner;
public class Cube {
    public static void main(String a[]){
        int num,cube;
        System.out.println("Enter a Number :");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        cube = num*num*num;
        System.out.println("\n The cube of a given number\s" +num+ "\s=\s" + cube);

    }
    
}
