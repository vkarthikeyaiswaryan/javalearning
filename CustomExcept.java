class MyException extends RuntimeException{
    public MyException(String str){
        super(str);
    }
}

public class CustomExcept {
    public static void main(String[] args) {
        
        int i = 20 ;
        int j = 0;

        try{
            j = 18/i;
            if(j == 0)
            throw new MyException(" i dont want a zero");
        }

        catch(MyException m){
            j = 18/1;
            System.out.println("default  output "+ m);
        }

        catch(Exception e ){
            System.out.println("something went wrong " + e);
        }

        System.out.println(j);

        System.out.println("bye");
    }
    
}
