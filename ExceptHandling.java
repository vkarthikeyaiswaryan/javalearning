public class ExceptHandling{
    public static void main(String[] args) {
        
        int i = 4;
        int j = 0;
        int arr[] = new int[5];
        String str = null;


        try{
            j= 20/i;
            System.out.println(str.length());
            System.out.println(arr[1]);
            System.out.println(arr[5]);

        }

        catch(ArithmeticException e){
            System.out.println("CANNOT DIVIDE BY ZERO");
        }
        
        catch(IndexOutOfBoundsException e ){
            System.out.println("out of range");
        }

        catch(Exception e){
            System.out.println("Something went wrong" + e);
        }

        System.out.println(j);
        System.out.println("bye");
    }
} /// exception is a parent class and  should placed at last ... 
////////if it places first it tries to handle all the exceptions.....
/////// ArithmeticException -> RunTimeExcception -> Exception -> Throwable .......