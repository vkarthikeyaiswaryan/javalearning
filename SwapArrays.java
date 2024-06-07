import java.util.Scanner;
public class SwapArrays {
    public static void main(String a[]){
        int size;
        System.out.println(" enter a size of an array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int[] arr1 = new int[size];
        int[] arr2 = new int[size];
        
        System.out.println("ENTER THE VALUES FOR ARR1");
        for(int i = 0;i<size;i++ ){
            arr1[i] = sc.nextInt();
        }

        

        System.out.println("ENTER THE VALUES FOR ARR2");
        for(int i = 0;i<size;i++ ){
            arr2[i] = sc.nextInt();
        }

        for(int i =0;i<size;i++){
            arr1[i] = arr1[i] ^ arr2[i];
            arr2[i] = arr1[i] ^ arr2[i];
            arr1[i] = arr1[i] ^ arr2[i];
        }
        
        System.out.print("ARR1 AFTER SWAPPING:");
        printArray(arr1, size);
        // for(int n : arr1){
        //     System.out.print(n+ " ");
        // }System.out.println();

        System.out.print("ARR2 AFTER SWAPPING:");
        printArray(arr2, size);

        // for(int n : arr2){
        //     System.out.print(n+" ");
        // }
    }
    
    public static void printArray(int[] arr, int size){
        for(int n:arr){
            System.out.print(n+" ");
        }System.out.println();
    }
}
