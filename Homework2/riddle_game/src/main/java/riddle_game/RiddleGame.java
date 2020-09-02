package riddle_game;

import javax.swing.*;
import java.util.concurrent.ThreadLocalRandom;

public class RiddleGame implements Game {

    //todo

    private final int maxLimit;
    private final int numberToGuess;
    private int scores = 100;

    public RiddleGame(){
        maxLimit = 10;
        numberToGuess = ThreadLocalRandom.current().nextInt(0, 10) + 1;
    }

    public RiddleGame(int max) {
        this.maxLimit = max;
        numberToGuess = ThreadLocalRandom.current().nextInt(0, 10) + 1;
    }

    
    /*public static void main(String[] args) {

        int s = Integer.parseInt(JOptionPane.showInputDialog("input your number"));
        System.out.println(s);
    }*/

    

    @Override
    public void play() {
        boolean gameOn = true;
        start(gameOn);
    }
    
    private void start(boolean gameOn){
        while(gameOn){
            int s = Integer.parseInt(JOptionPane.showInputDialog("Guess number from 1 to " + maxLimit));
            if (s == numberToGuess){
                scores+=100;
                System.out.println("You won! Number of scores is " + scores);
                gameOn = false;
            } else{
                System.out.println("Wrong number! Try again!");
                --scores;
            }
        }
    }
    
}
