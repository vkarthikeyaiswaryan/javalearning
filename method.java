

class simplops{
    public void playMusic(){
        System.out.println("playing a music....lalaa");
    }
    public String getMeAPen(int Rs){
        if(Rs>=10)
            return "pen";
        return "no pen for this Rs";
    }
}

public class method {
    public static void main(String[]args){
        int Rs = 7;
        simplops task = new simplops();
        task.playMusic();
        String res = task.getMeAPen(Rs);
        System.out.println(res);

    }
    
}
