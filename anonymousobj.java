class A{
     
    public A(){
        System.out.println("Object created");
    }

    public void show(){
        System.out.println("in A show");
     }
}

public class anonymousobj {
    public static void main(String[]a){

        // int marks;
        // marks = 99;

        //A obj ;
        //obj = new A();

        // A obj = new A(); -------> here obj is a refernced variable and is called a referenced obj
        new A().show();  // new A(); ---------> this is an anonymoous obj and it can be used only once 
        //if we try to use a new obj will  be created...... 
        //obj.show();
        new A().show();

    }
    
}
