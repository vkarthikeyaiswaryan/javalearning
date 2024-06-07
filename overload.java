class addop{
    // method overloading is focuses on the only parameters(inputs) and type of the input..... but not the return type
    public double add(int n1,int n2,double n3){ // int n3
        return n1+n2+n3;
    }
    public double add(int n1,int n2){
        return n1+n2;
    }
    public int add(int n1, int n2,int n3){
        return n1+n2+n3;
    }
}

public class overload {
    public static void main(String[]args){
        addop obj = new addop();
        double res = obj.add(6,7,8.9);
        int res1 = obj.add(5,5,5);
        double res2 = obj.add(5,6);
        System.out.println(res);
        System.out.println(res1);
        System.out.println(res2);

    }
    
}
