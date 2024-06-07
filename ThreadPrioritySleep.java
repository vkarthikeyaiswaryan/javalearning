class Hai extends Thread{
    public void run(){
        for(int i = 1 ; i<= 100; i++){
            System.out.println("Hai");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }
}

class Bye extends Thread{
    public void run(){
        for(int i =1 ; i<=100; i++){
            System.out.println("Bye");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }

        }
    }
}
public class ThreadPrioritySleep {
    public static void main(String[] args) {

        Hai obj1 = new Hai();
        Bye obj2 = new Bye();

        System.out.println(obj1.getPriority());

        //obj1.setPriority(10);// min = 1 , max = 10, we can use 1 to 10
    
        obj1.setPriority(Thread.MAX_PRIORITY);

        obj1.start();
        try {
            Thread.sleep(5);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        obj2.start();

        
    }
    
}
