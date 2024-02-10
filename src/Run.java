import interfaces.BaseBall;
import interfaces.Consume;
import interfaces.Game;
import interfaces.Greeting;

import java.io.IOException;

public class Run {
    public static void main(String[] args) {
        Game basketBall = (t1,t2)-> Math.random()>0.5?t1:t2;

        Game circket = (t1,t2)-> t2.compareTo(t2)>0?t1:t2;
        Game.startCeremony();
        System.out.println(basketBall.playGame("Canada", "USA"));
        System.out.println("Winner = " + circket.playGame("India", "Canada"));

        Greeting greeting =  (n,g)->"Hello "+ n +","+g;

        System.out.println("Greeting = " + greeting.greet("Vivek", "How are you"));

        Consume consume = System.out::println;

        consume.print("Hello from Consume from Method reference");

    }


    static void doSomething(String str){
        System.out.println("str = " + str);
    }


}
