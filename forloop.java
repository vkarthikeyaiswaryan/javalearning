public class forloop {
    public static void main(String args[]){ 
        for(int i = 1;i<=5;i++){
            System.out.println("day\s"+i);
            // nested forloop
            int j=1;
            for(;j<=9;){
                System.out.println(" "+(j+8)+"\s-\s"+(j+9));
                j++;
            }
        }
    }
}
