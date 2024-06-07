class calculator{
    int r;// instance variable definition stored in heap
    public int add(int n1 , int n2){ // method definition
        r = n1+n2;
        System.out.println("processing the calculation");
        return r;
    }
}
public class oopscpt{
    public static void main(String[] args){
        int num1 = 4;// stored in stack
        int num2 = 5;
        calculator calc = new calculator();// calling the class calculator,using calc as the variable, assigning a new object /instance (device) of design(type )calculator
        int res = calc.add(num1,num2);
        System.out.println(res);

    }

}