package main;

public class Game {

    private GamePanel gamePanel;
    private GameWindow gameWindow;

    //constructor to call methods
    public Game(){
        //objects
        gamePanel= new GamePanel();
        gameWindow = new GameWindow(gamePanel);



    }
}
