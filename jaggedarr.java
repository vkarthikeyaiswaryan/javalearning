public class jaggedarr {
    public static void main(String[]args){
        // jagged array row have to be specified but columns can be specified later and they can have differnt size or length
        int arr[][] = new int[3][];
        arr[0]=new int[3];
        arr[1]=new int [4];
        arr[2]=new int [2];

        for(int i=0; i<arr.length;i++){
            for(int j =0;j<arr[i].length;j++){
                arr[i][j] = (int)(Math.random()*100);
            }
        }
        for(int n[]:arr){
            for(int m:n){
                System.out.print(m+" ");
            }System.out.println();

        }
    }
    
}
