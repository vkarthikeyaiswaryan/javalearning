class A1{
    public void show(){
        System.out.println("in A show");
    }

    public void config(){
        System.out.println("in A config");
    }

    public int add(int n1, int n2){
        return n1+n2;
    }
}

class B1 extends A1{
    public void show(){
        System.out.println("in B show");
    }

    public int add1(int n1, int n2){
        return n1+n2+1;
    }

}
 // class B1 searches for the method in its own class if it founds then it executes
 // if not it will search in  the super class or parent class
 // method overiding is the concept which gives the class perference to its own features (methods)
// inheritance concept

public class overide {
    public static void main(String[]a){
        B1 obj = new B1();
        obj.show();
        obj.config();
        int res = obj.add(4,5);
        System.out.println(res);
    }
    
}
