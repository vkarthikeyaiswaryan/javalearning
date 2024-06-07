@FunctionalInterface
interface Speaker{
    void music();
    //void game();
}

// class MusicPLayer implements Speaker{

//     public void music(){
//         System.out.println("playing music......");
//     }
// }

public class FunctionInterface {
    public static void main(String[] args) {

        Speaker obj = new Speaker(){
            public void music(){
                System.out.println("playing music."); // anonymous class concept
            }
        };
        obj.music();
    }
    
}
