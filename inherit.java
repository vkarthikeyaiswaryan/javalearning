import tools.mathops.veryadvcalc;

public class inherit {
    public static void main(String[]a){
        veryadvcalc op = new veryadvcalc();
        int res = op.add(4, 5);
        int res1 = op.sub(8,4);
        int res2 = op.mul(2,3);
        int res3 = op.div(6,3);
        int res4 = op.pow(2,2);
        int res5 = op.rem(7,4);

        // int arr[] = new int[6];
        // arr[0]=res;
        // arr[1]=res1;
        // arr[2]=res2;
        // arr[3]=res3;
        // arr[4]=res4;
        // arr[5]=res5;

        int arr[]= {res,res1,res2,res3,res4,res5};

        for(int x:arr){
            System.out.println(x);
        }

    }
    
}
