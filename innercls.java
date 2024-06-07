class A3{
    int a;
    public void show(){
        System.out.println("in A show");   //inner class
    }
    //static 
    class B3{
        public void config(){
            System.out.println("in B config");

        }
    }
}

public class innercls {
    public static void main(String[] args) {
        A3 obj = new A3();
        obj.show();
        //obj.config(); throws an error
        // B3 obj1 = new B3(); error
        A3.B3 obj1 = obj.new B3();
        //A3.B3 obj1 = new A3.B3(); // inner class is static 
        obj1.config();

        
    }
}
