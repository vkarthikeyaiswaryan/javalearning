public class RunnablevsThread {
    public static void main(String[] args) {
         Runnable obj1 = new Runnable(){
            public void run(){
                for(int i = 1 ; i<=5;i++){
                    System.out.println("hi");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
         };

         Runnable obj2 =() -> {
                for(int i = 1;i<=5;i++){
                    System.out.println("bye");
                    try {
                        Thread.sleep(10);
                    } catch (InterruptedException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            
         };

         Thread t1 = new Thread(obj1);
         Thread t2 = new Thread(obj2);
         
         t1.start();
         t2.start();

         
    }
    
}
