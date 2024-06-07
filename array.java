class array{
    public static void main(String[] args){
        //int nums[] = {3,4,5,6};
        int nums[] = new int[4];
        nums[0]=10;
        nums[2]=12;
        nums[1]=1;
        // for(int i=0;i<4;i++){
        //     System.out.println(nums[i]);

        // }
        for(int n :nums){
            System.out.println(n);
        }
        
    }
}