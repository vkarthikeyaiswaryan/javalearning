class assignops{
    public static void main(String args[]){
        int num1 = 6;
        int num2 = 2;
        // arithimeticops
        int add = num1+num2;System.out.println(add);
        int sub = num1-num2;System.out.println(sub);
        int mul = num1*num2;System.out.println(mul);
        int div = num1 / num2;System.out.println(div);
        int rem = num1 % num2;System.out.println(rem);
        // assignops
        int addassign = num1+=2;System.out.print(addassign   ); //System.out.println( num1);
        int subassign = num1-=2;System.out.println(subassign);
        int mulassign = num1*=2;System.out.println(mulassign);
        int divassign = num1/=2;System.out.println(divassign);
        // increment sss
        // num1=num1+1;
        // num1+=1;
        // num1++;//post increment
        // ++num1;// pre increment
        int res = ++num1;System.out.println(res); // increment and then fetch the value
        System.out.println(num1);
        int res1 = num1++;System.out.println(res1);// fetch the value and then increment
        System.out.println( num1);
        


    }
}