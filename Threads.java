class Hi extends Thread{
    public void run(){
        for(int i = 0 ; i<=100 ; i++){
            System.out.println("hi");
        }
    }
}

class Hello extends Thread{ // thread class should contain run method to start 
    public void run(){
        for(int i = 0 ; i<=100 ; i++){
            System.out.println("hello");
        }
    }
}

public class Threads {
    public static void main(String[] args) {
        // multiple threads

        Hi obj1 = new Hi();
        Hello obj2 = new Hello();

        obj1.start(); // not show ... to run
        obj2.start();
    }
    
}
