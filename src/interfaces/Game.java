package interfaces;
 // Functional Programming  // lambdas / stream

public interface Game {
    int count = 0; //static final
    String playGame(String team1, String team2);

    static void startCeremony(){
        System.out.println("Starting super bowl ceremony");
    }
}
