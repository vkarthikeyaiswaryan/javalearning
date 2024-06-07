import java.util.Scanner;
public class LinearSearchArray {
    public static void main(String[] args) {
        int i,len,arr[],key;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the length of the array");
        len = sc.nextInt();
        arr[] = new int[len];
        System.out.println("enter\s"+len+"\s elements in the array");
        for(i=0;i<len;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter the value to be searched in the array");
        key = sc.nextInt();
        for(i=0;i<arr.length();i++){
            if(arr[i]==key){
                return i;
            }
            
        }

    }
    
}
