abstract class A5{
    public abstract void show();
    public abstract void config();
}


public class abstractinnercls {
    public static void main(String[] args) {
        A5 obj = new A5(){
            public void show(){
                System.out.println(" in new show");
            }
            public void config(){
                System.out.println(" in config");
            }
        };
        obj.show();
        obj.config();
    }
    
}
