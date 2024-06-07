class A4{
    public void show(){
        System.out.println(" in A show");
    }
}

public class anonymouscls {
    public static void main(String[] args) {
        
        A4 obj = new A4(){
            public void show(){  // anonymous class
                System.out.println(" in new show");
            }
        };
        obj.show();
    }
    
}
