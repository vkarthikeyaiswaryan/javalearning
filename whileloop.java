class whileloop{ // while(true) -------------> block executes....
    public static void main(String[]args){
        int x=1;
        while(x<5){
            System.out.println("hi "+ x);
        // nested while
            int y=1;
            while(y<=4){
                System.out.println("hello\s"+y);
                y++;
            }
            x++;
            }System.out.println("bye"+x);
    }
}
