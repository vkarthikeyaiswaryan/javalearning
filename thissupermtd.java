class A{
    
    public A(){
        super();
        System.out.println("in A");
    }
    public A(int a){
        super();
        System.out.println("in int A");
    }
}

class B extends A{
    public B(){
        super();
        System.out.println("in B ");
    }

    public B(int b){
        //super(b);
        this();
        System.out.println("in int B");
    }
}


public class thissupermtd {
    public static void main(String[]a){
        B obj = new B(6);

    }
    
}
