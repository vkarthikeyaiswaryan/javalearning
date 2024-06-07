@FunctionalInterface
interface Game{
    void playGame(String gameName, double version) ;
}

public class LambdaExp {
    public static void main(String[] args) {

        Game obj = (gameName, version) -> System.out.println("playing game" + gameName + version);
    
        obj.playGame("Cod",8.04);
    }
}
