package interfaces;

public class BaseBall implements Game{
    @Override
    public String playGame(String team1, String team2) {
        return Math.random()>0.5?team1:team2 ;
    }
}
