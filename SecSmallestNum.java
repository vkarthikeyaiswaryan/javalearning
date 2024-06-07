import java.util.Scanner;
public class SecSmallestNum{
    public static int getSecondSamllestNumber(int[]a,int size){
        for(int i = 0;i<size;i++){
            for(int j= i+1;j<size;j++){
                if(a[i]>a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }return a[1];
        
    }public static void main(String args[]){
        int size;
        System.out.println("enter the size of an array");
        Scanner sc = new Scanner(System.in);
        size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the elements in the array");
        for(int i = 0 ;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("The second smallest from the array =\s "+getSecondSamllestNumber(arr, size));
    }
}